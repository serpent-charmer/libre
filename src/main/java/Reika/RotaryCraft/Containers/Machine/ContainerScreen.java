/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Containers.Machine;

import Reika.RotaryCraft.Base.ContainerIOMachine;
import Reika.RotaryCraft.TileEntities.Auxiliary.TileEntityScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;

public class ContainerScreen extends ContainerIOMachine {
    public ContainerScreen(EntityPlayer player, TileEntityScreen te) {
        super(player, te);

        this.addSlotToContainer(new Slot(te, 0, 62, 35));
        this.addSlotToContainer(new Slot(te, 1, 80, 35));
        this.addSlotToContainer(new Slot(te, 2, 98, 35));

        this.addPlayerInventory(player);
    }
}
