package Reika.ChromatiCraft.Auxiliary.Interfaces;

import Reika.ChromatiCraft.Entity.EntityLaserPulse;
import net.minecraft.world.World;

public interface LaserPulseEffect {
    public boolean onImpact(World world, int x, int y, int z, EntityLaserPulse e);
}
