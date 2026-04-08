package net.acetheeldritchking.cataclysm_spellbooks.items.staffs;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.item.weapons.StaffTier;
import net.acetheeldritchking.cataclysm_spellbooks.registries.CSAttributeRegistry;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;

public final class CSStaffTiers {
    private CSStaffTiers() {}

    public static final StaffTier BLOOM_STONE = new StaffTier(3f, -3f,
            new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .25, Operation.MULTIPLY_BASE));

    public static final StaffTier FAKE_WADJET = new StaffTier(3f, -3f,
            new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER, .10, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.HOLY_SPELL_POWER, .20, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .25, Operation.MULTIPLY_BASE));

    public static final StaffTier GAUNTLET_OF_GATTLING = new StaffTier(10.5f, -3.2f,
            new AttributeContainer(CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .10, Operation.MULTIPLY_BASE));

    public static final StaffTier GAUNTLET_OF_POWER = new StaffTier(8f, -3.1f,
            new AttributeContainer(CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .10, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .05, Operation.MULTIPLY_BASE));

    public static final StaffTier SPIRIT_SUNDERER = new StaffTier(4f, -3f,
            new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.MANA_REGEN, .10, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .10, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .05, Operation.MULTIPLY_BASE));

    public static final StaffTier THE_BERSERKER = new StaffTier(10.5f, -3.2f,
            new AttributeContainer(CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .10, Operation.MULTIPLY_BASE));

    public static final StaffTier THE_COMBUSTER = new StaffTier(10.5f, -3.2f,
            new AttributeContainer(CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .10, Operation.MULTIPLY_BASE));

    public static final StaffTier THE_NIGHTSTALKER = new StaffTier(10.5f, -3.2f,
            new AttributeContainer(CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.BLOOD_SPELL_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.SPELL_POWER, .10, Operation.MULTIPLY_BASE));

    public static final StaffTier CORAL = new StaffTier(3f, -3f,
            new AttributeContainer(CSAttributeRegistry.ABYSSAL_MAGIC_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .25, Operation.MULTIPLY_BASE));

    public static final StaffTier VOID = new StaffTier(3f, -3f,
            new AttributeContainer(AttributeRegistry.ENDER_SPELL_POWER, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .25, Operation.MULTIPLY_BASE));

    public static final StaffTier ENGINEERS_POWER_GLOVE = new StaffTier(1.5f, -1.7f,
            new AttributeContainer(CSAttributeRegistry.TECHNOMANCY_MAGIC_POWER, .10, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .10, Operation.MULTIPLY_BASE));

    public static final StaffTier SOUL_BRAZIER = new StaffTier(4f, -3f,
            new AttributeContainer(AttributeRegistry.ICE_SPELL_POWER, .15, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.MANA_REGEN, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, .25, Operation.MULTIPLY_BASE),
            new AttributeContainer(AttributeRegistry.CAST_TIME_REDUCTION, .10, Operation.MULTIPLY_BASE));
}
