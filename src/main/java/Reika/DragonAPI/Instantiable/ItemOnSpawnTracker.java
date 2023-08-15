package Reika.DragonAPI.Instantiable;

import Reika.DragonAPI.Auxiliary.Trackers.PlayerFirstTimeTracker.PlayerTracker;
import Reika.DragonAPI.Libraries.ReikaInventoryHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public abstract class ItemOnSpawnTracker implements PlayerTracker {
    @Override
    public final void onNewPlayer(EntityPlayer ep) {
        if (ReikaInventoryHelper.checkForItemStack(this.getItem(), ep.inventory, false))
            return;
        if (!ep.inventory.addItemStackToInventory(this.getItem()))
            ep.dropPlayerItemWithRandomChoice(this.getItem(), true);
    }

    public abstract ItemStack getItem();
}
