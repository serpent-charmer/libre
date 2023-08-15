/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Magic.Artefact.Effects;

import Reika.ChromatiCraft.Magic.Artefact.UABombingEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;

public class LightningStrikeEffect extends UABombingEffect.EntityEffect {
    @Override
    public void trigger(Entity e) {
        e.worldObj.addWeatherEffect(
            new EntityLightningBolt(e.worldObj, e.posX, e.posY, e.posZ)
        );
    }
}
