/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Auxiliary.Interfaces;

import Reika.DragonAPI.Interfaces.TileEntity.BreakAction;
import net.minecraft.item.ItemStack;

public interface IntegratedGearboxable extends BreakAction {
    public boolean applyIntegratedGear(ItemStack is);

    /** Return positive for torque gearing, and either 0 for no gearing */
    public int getIntegratedGear();
}
