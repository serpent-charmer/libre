package Reika.ChromatiCraft.Base.TileEntity;

import java.util.List;

import Reika.ChromatiCraft.Auxiliary.Interfaces.OwnedTile;
import Reika.DragonAPI.Interfaces.TileEntity.BreakAction;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract class TileEntityPylonEnhancer
    extends TileEntityChromaticBase implements OwnedTile, BreakAction {
    @Override
    public void getTagsToWriteToStack(NBTTagCompound NBT) {
        this.writeOwnerData(NBT);
    }

    @Override
    public void setDataFromItemStackTag(ItemStack is) {
        this.readOwnerData(is);
    }

    @Override
    public void addTooltipInfo(List li, boolean shift) {}
}
