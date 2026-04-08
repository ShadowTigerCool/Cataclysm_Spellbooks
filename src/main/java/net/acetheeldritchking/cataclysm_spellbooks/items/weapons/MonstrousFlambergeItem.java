package net.acetheeldritchking.cataclysm_spellbooks.items.weapons;

import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.item.UniqueItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.item.Rarity;

public class MonstrousFlambergeItem extends MagicSwordItem implements UniqueItem {
    public MonstrousFlambergeItem(SpellDataRegistryHolder[] spellDataRegistryHolders) {
        super(CSWeaponTiers.MONSTROUS_FLAMBERGE, ItemPropertiesHelper.equipment(1).rarity(Rarity.EPIC), spellDataRegistryHolders);
    }
}
