/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.ModInterface.Lua;

import Reika.ChromatiCraft.TileEntity.Storage.TileEntityCrystalTank;
import Reika.DragonAPI.ModInteract.Lua.LuaMethod;
import net.minecraft.tileentity.TileEntity;

public class LuaGetTankFraction extends LuaMethod {
    public LuaGetTankFraction() {
        super("getTankFraction", TileEntityCrystalTank.class);
    }

    @Override
    protected Object[] invoke(TileEntity te, Object[] args)
        throws LuaMethodException, InterruptedException {
        TileEntityCrystalTank tk = (TileEntityCrystalTank) te;
        return new Object[] { tk.getCurrentFluidLevel() / (double) tk.getCapacity() };
    }

    @Override
    public String getDocumentation() {
        return "Returns the fill fraction of the crystal tank.\nArgs: None\nReturns: Fraction Full";
    }

    @Override
    public String getArgsAsString() {
        return "";
    }

    @Override
    public ReturnType getReturnType() {
        return ReturnType.FLOAT;
    }
}
