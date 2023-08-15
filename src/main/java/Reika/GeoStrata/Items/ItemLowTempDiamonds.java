package Reika.GeoStrata.Items;

import Reika.GeoStrata.GeoStrata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

public class ItemLowTempDiamonds extends Item {
    public ItemLowTempDiamonds() {
        this.setMaxStackSize(64);
        this.setCreativeTab(GeoStrata.tabGeo);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected String getIconString() {
        return "geostrata:lowtempdiamonds";
    }
}
