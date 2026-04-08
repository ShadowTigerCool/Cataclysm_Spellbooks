package net.acetheeldritchking.cataclysm_spellbooks.items.weapons;

import com.github.L_Ender.cataclysm.init.ModItems;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.item.weapons.IronsWeaponTier;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum CSWeaponTiers implements Tier, IronsWeaponTier {
    // Monstrous Flamberge (Flamberge + Monstrous horn)
    MONSTROUS_FLAMBERGE(3, 1561, -2.7f, 10, 15, () -> Ingredient.of(Items.NETHERITE_SCRAP),
            new AttributeContainer(() -> Attributes.ARMOR, 5, AttributeModifier.Operation.ADDITION),
            new AttributeContainer(() -> AttributeRegistry.FIRE_SPELL_POWER.get(), 0.05, AttributeModifier.Operation.MULTIPLY_TOTAL)),
    // Spellstealer (Khopesh + Spellbreaker)
    SPELLSTEALER(3, 1000, -2.6f, 5, 15, () -> Ingredient.of(ModItems.ANCIENT_METAL_INGOT.get())),
    // Lacerator (Incinerator + Tidal Claw)
    // Apparition Maw (Cursed Bow + Tidal Claw)
    // Murasama
    MURASAMA(3, 1681, -1.3f, 14.5F, 15, () -> Ingredient.of(ModItems.WITHERITE_INGOT.get()),
            new AttributeContainer(() -> CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER.get(), 0.20, AttributeModifier.Operation.MULTIPLY_TOTAL),
            new AttributeContainer(() -> AttributeRegistry.BLOOD_SPELL_POWER.get(), 0.15, AttributeModifier.Operation.MULTIPLY_TOTAL),
            new AttributeContainer(() -> AttributeRegistry.COOLDOWN_REDUCTION.get(), 0.10, AttributeModifier.Operation.MULTIPLY_TOTAL)),
    ;

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private final AttributeContainer[] additionalAttributes;

    CSWeaponTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient, AttributeContainer... additionalAttributes) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
        this.additionalAttributes = additionalAttributes;
    }

    @Override
    public AttributeContainer[] getAdditionalAttributes() {
        return additionalAttributes;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
