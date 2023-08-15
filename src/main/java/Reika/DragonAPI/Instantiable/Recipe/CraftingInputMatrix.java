package Reika.DragonAPI.Instantiable.Recipe;

import Reika.DragonAPI.Interfaces.TileEntity.CraftingTile;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;

public class CraftingInputMatrix extends InventoryCrafting {
    private final CraftingTile tile;

    private boolean hasItems;

    public CraftingInputMatrix(CraftingTile te) {
        super(null, 3, 3);
        tile = te;
    }

    public void update() {
        this.update(0);
    }

    public void update(int gridSlotOffset) {
        eventHandler = tile.constructContainer();
        hasItems = false;
        for (int i = 0; i < 9; i++) {
            ItemStack in = tile.getStackInSlot(i + gridSlotOffset);
            ItemStack has = this.getStackInSlot(i);
            if (!ItemStack.areItemStacksEqual(in, has)) {
                this.setInventorySlotContents(i, in);
            }
            hasItems |= in != null;
        }
    }

    public boolean isEmpty() {
        return !hasItems;
    }
}
