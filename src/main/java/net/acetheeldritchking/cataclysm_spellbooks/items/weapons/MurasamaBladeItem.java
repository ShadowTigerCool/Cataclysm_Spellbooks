package net.acetheeldritchking.cataclysm_spellbooks.items.weapons;

import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.item.UniqueItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MurasamaBladeItem extends MagicSwordItem implements UniqueItem {
    public MurasamaBladeItem(SpellDataRegistryHolder[] spellDataRegistryHolders) {
        super(CSWeaponTiers.MURASAMA, ItemPropertiesHelper.equipment(1).rarity(Rarity.EPIC), spellDataRegistryHolders);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> tooltip, TooltipFlag pIsAdvanced) {
        tooltip.add(Component.translatable("item.cataclysm_spellbooks.murasama_blade.desc").withStyle(ChatFormatting.DARK_RED).withStyle(ChatFormatting.ITALIC));
    }

    // Durability
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
