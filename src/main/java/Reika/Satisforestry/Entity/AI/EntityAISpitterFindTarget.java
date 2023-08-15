package Reika.Satisforestry.Entity.AI;

import Reika.Satisforestry.Entity.EntitySpitter;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAISpitterFindTarget extends EntityAINearestAttackableTarget {
    private final EntitySpitter spitter;

    public EntityAISpitterFindTarget(EntitySpitter e) {
        super(e, EntityPlayer.class, 0, true);
        spitter = e;
        targetEntitySelector = new SpitterTargetSelector();
    }

    private class SpitterTargetSelector implements IEntitySelector {
        @Override
        public boolean isEntityApplicable(Entity e) {
            return e instanceof EntityPlayer
                && EntityAISpitterFindTarget.this.isSuitableTarget(
                    (EntityLivingBase) e, false
                );
        }
    }
}