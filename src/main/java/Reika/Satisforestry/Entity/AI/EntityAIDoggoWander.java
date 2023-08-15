package Reika.Satisforestry.Entity.AI;

import Reika.Satisforestry.Entity.EntityLizardDoggo;
import net.minecraft.entity.ai.EntityAIWander;

public class EntityAIDoggoWander extends EntityAIWander {
    private final EntityLizardDoggo doggo;

    public EntityAIDoggoWander(EntityLizardDoggo e, double sp) {
        super(e, sp);
        doggo = e;
    }

    @Override
    public boolean shouldExecute() {
        return super.shouldExecute() && !doggo.isSitting() && !doggo.isTamed();
    }
}
