package Reika.DragonAPI.Interfaces;

import Reika.DragonAPI.Instantiable.Data.Immutable.DecimalPosition;
import net.minecraft.entity.Entity;

public interface EntityPathfinder {
    /** Return null to indicate completion or no valid path. */
    public DecimalPosition getNextWaypoint(Entity e);

    public boolean isInRange(Entity e);
}
