/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.API.Event;

import Reika.DragonAPI.Instantiable.Event.TileEntityEvent;
import net.minecraft.tileentity.TileEntity;

public class VacuumXPAbsorbEvent extends TileEntityEvent {
    public final int amount;

    public VacuumXPAbsorbEvent(TileEntity te, int xp) {
        super(te);
        amount = xp;
    }
}
