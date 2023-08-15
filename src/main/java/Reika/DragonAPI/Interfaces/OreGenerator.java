/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.DragonAPI.Interfaces;

import java.util.Random;

import Reika.DragonAPI.Interfaces.Registry.OreEnum;
import net.minecraft.world.World;

public interface OreGenerator {
    public void
    generateOre(OreEnum ore, Random random, World world, int chunkX, int chunkZ);
}
