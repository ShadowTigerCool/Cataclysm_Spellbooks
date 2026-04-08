package net.acetheeldritchking.cataclysm_spellbooks.items.staffs;

import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.item.UniqueItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import mod.azure.azurelib.AzureLib;
import net.acetheeldritchking.cataclysm_spellbooks.items.custom.CSItemDispatcher;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class GauntletOfGattlingItem extends ImbuableStaffItem implements UniqueItem {
    public final CSItemDispatcher dispatcher;

    public GauntletOfGattlingItem(SpellDataRegistryHolder[] spellDataRegistryHolders) {
        super(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), CSStaffTiers.GAUNTLET_OF_GATTLING, spellDataRegistryHolders);
        this.dispatcher = new CSItemDispatcher();
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (stack.getOrCreateTag().contains(AzureLib.ITEM_UUID_TAG))
        {
            if (entity instanceof Player player)
            {
                if (!level.isClientSide && stack.is(this))
                {
                    dispatcher.idle(player, stack);
                }
            }
        }
    }
}
