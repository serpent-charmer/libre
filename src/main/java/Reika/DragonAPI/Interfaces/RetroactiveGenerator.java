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

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;

public interface RetroactiveGenerator extends IWorldGenerator {
    public boolean canGenerateAt(World world, int chunkX, int chunkZ);

    /**
     * It would be a good idea to prefix this with your mod's name; eg
     * ReactorCraft_PitchblendeGen
     */
    public String getIDString();
}
