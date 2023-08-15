package Reika.DragonAPI.Interfaces.Block;

import Reika.DragonAPI.Instantiable.Data.Immutable.Coordinate;
import net.minecraft.world.World;

public interface CollisionDelegate {
    Coordinate getDelegatedCollision(World world, int x, int y, int z);
}
