package Reika.Satisforestry.Entity.AI;

import Reika.Satisforestry.Entity.EntityLizardDoggo;
import net.minecraft.entity.ai.EntityAIFollowOwner;

public class EntityAIDoggoFollow extends EntityAIFollowOwner {
    private final EntityLizardDoggo doggo;

    public EntityAIDoggoFollow(
        EntityLizardDoggo e, double speed, float mind, float maxd
    ) {
        super(e, speed, mind, maxd);
        doggo = e;
    }

    @Override
    public boolean shouldExecute() {
        return super.shouldExecute() && !doggo.justDepositedItem(false);
    }

    @Override
    public boolean continueExecuting() {
        return super.continueExecuting() && !doggo.justDepositedItem(false);
    }
}
