package net.acetheeldritchking.cataclysm_spellbooks.items.staffs;

import io.redspace.ironsspellbooks.item.weapons.StaffItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.item.Rarity;

public class GauntletOfPowerItem extends StaffItem {
    public GauntletOfPowerItem() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), CSStaffTiers.GAUNTLET_OF_POWER);
    }
}
