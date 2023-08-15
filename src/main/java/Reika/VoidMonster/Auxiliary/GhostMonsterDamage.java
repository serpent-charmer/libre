/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2018
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.VoidMonster.Auxiliary;

import Reika.DragonAPI.Instantiable.CustomStringDamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class GhostMonsterDamage extends CustomStringDamageSource {
    private final EntityLivingBase damager;

    public GhostMonsterDamage(EntityLivingBase e) {
        super(e != null ? "was expelled by " + e.getCommandSenderName() : "");
        damager = e;
    }

    @Override
    public Entity getEntity() {
        return damager;
    }
}
