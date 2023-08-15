/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.GeoStrata;

import Reika.DragonAPI.Interfaces.PlayerSpecificTrade;
import Reika.GeoStrata.Registry.GeoBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;

public class VoidOpalTrade extends MerchantRecipe implements PlayerSpecificTrade {
    public static final int STACK_SIZE = 24; //was 16

    public VoidOpalTrade() {
        super(
            new ItemStack(GeoBlocks.VOIDOPAL.getBlockInstance(), STACK_SIZE),
            new ItemStack(Items.emerald, 3, 0)
        );
    }

    @Override
    public void incrementToolUses() {
        //No-op to prevent expiry
    }

    @Override
    public boolean isValid(EntityPlayer ep) {
        return true;
    }

    @Override
    public boolean hasSameIDsAs(MerchantRecipe mr) {
        return mr instanceof VoidOpalTrade;
    }

    @Override
    public boolean hasSameItemsAs(MerchantRecipe mr) {
        return mr instanceof VoidOpalTrade;
    }
}
