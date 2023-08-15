/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Structure;

import java.util.Random;

import Reika.ChromatiCraft.Base.DimensionStructureGenerator;
import Reika.ChromatiCraft.Base.StructureData;
import net.minecraft.world.World;

public class TessellationGenerator
    extends DimensionStructureGenerator { //FIXME complete this structure

    @Override
    protected void calculate(int chunkX, int chunkZ, Random rand) {}

    @Override
    public StructureData createDataStorage() {
        return null;
    }

    @Override
    protected int getCenterXOffset() {
        return 0;
    }

    @Override
    protected int getCenterZOffset() {
        return 0;
    }

    @Override
    public boolean hasBeenSolved(World world) {
        return false;
    }

    @Override
    public void openStructure(World world) {}

    @Override
    protected void clearCaches() {}
}
