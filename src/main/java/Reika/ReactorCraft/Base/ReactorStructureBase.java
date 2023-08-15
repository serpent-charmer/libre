package Reika.ReactorCraft.Base;

import Reika.DragonAPI.Base.StructureBase;
import net.minecraftforge.common.util.ForgeDirection;

public abstract class ReactorStructureBase extends StructureBase {
    public ForgeDirection dir;

    @Override
    protected void initDisplayData() {
        dir = ForgeDirection.EAST;
    }

    @Override
    protected void finishDisplayCall() {
        dir = null;
    }
}
