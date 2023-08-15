/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2018
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 25/01/2018 4:38:49 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import Reika.DragonAPI.Libraries.Rendering.ReikaRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelTunnelNuker extends ModelBase {
    //fields
    ModelRenderer Body2;
    ModelRenderer Stinger;
    ModelRenderer Wing2B;
    ModelRenderer Body3;
    ModelRenderer Wing2A;
    ModelRenderer Wing1A;
    ModelRenderer Wing1B;
    ModelRenderer LLeg2;
    ModelRenderer RLeg1;
    ModelRenderer RLeg2;
    ModelRenderer RLeg3;
    ModelRenderer LLeg3;
    ModelRenderer LLeg1;
    ModelRenderer Bomb2;
    ModelRenderer Bomb3;
    ModelRenderer Bomb4;
    ModelRenderer Bomb;
    ModelRenderer Body1;

    public ModelTunnelNuker() {
        textureWidth = 64;
        textureHeight = 32;

        Body2 = new ModelRenderer(this, 34, 0);
        Body2.addBox(-1.5F, -1.5F, -6F, 3, 3, 12);
        Body2.setRotationPoint(0F, 8F, 0F);
        Body2.setTextureSize(64, 32);
        Body2.mirror = true;
        this.setRotation(Body2, 0F, 0F, 0F);
        Stinger = new ModelRenderer(this, 44, 28);
        Stinger.addBox(-0.5F, -0.5F, 8F, 1, 1, 2);
        Stinger.setRotationPoint(0F, 8F, 0F);
        Stinger.setTextureSize(64, 32);
        Stinger.mirror = true;
        this.setRotation(Stinger, 0F, 0F, 0F);
        Wing2B = new ModelRenderer(this, 0, 21);
        Wing2B.addBox(-9F, -0.6F, 0.5F, 18, 1, 1);
        Wing2B.setRotationPoint(0F, 8F, 0F);
        Wing2B.setTextureSize(64, 32);
        Wing2B.mirror = true;
        //this.setRotation(Wing2B, 0F, 0F, -0.5235988F);
        Body3 = new ModelRenderer(this, 39, 16);
        Body3.addBox(-2F, -2F, -4F, 4, 4, 7);
        Body3.setRotationPoint(0F, 8F, 0F);
        Body3.setTextureSize(64, 32);
        Body3.mirror = true;
        this.setRotation(Body3, 0F, 0F, 0F);
        Wing2A = new ModelRenderer(this, 0, 17);
        Wing2A.addBox(-8F, -0.5F, -0.5F, 16, 1, 3);
        Wing2A.setRotationPoint(0F, 8F, 0F);
        Wing2A.setTextureSize(64, 32);
        Wing2A.mirror = true;
        //this.setRotation(Wing2A, 0F, 0F, -0.5235988F);
        Wing1A = new ModelRenderer(this, 0, 17);
        Wing1A.addBox(-8F, -0.5F, -3.5F, 16, 1, 3);
        Wing1A.setRotationPoint(0F, 8F, 0F);
        Wing1A.setTextureSize(64, 32);
        Wing1A.mirror = true;
        //this.setRotation(Wing1A, 0F, 0F, 0.5235988F);
        Wing1B = new ModelRenderer(this, 0, 21);
        Wing1B.addBox(-9F, -0.6F, -2.5F, 18, 1, 1);
        Wing1B.setRotationPoint(0F, 8F, 0F);
        Wing1B.setTextureSize(64, 32);
        Wing1B.mirror = true;
        //this.setRotation(Wing1B, 0F, 0F, 0.5235988F);
        LLeg2 = new ModelRenderer(this, 39, 28);
        LLeg2.addBox(-0.5F, 2F, 1F, 1, 2, 1);
        LLeg2.setRotationPoint(0F, 8F, 0F);
        LLeg2.setTextureSize(64, 32);
        LLeg2.mirror = true;
        this.setRotation(LLeg2, 0F, 0F, -0.5235988F);
        RLeg1 = new ModelRenderer(this, 39, 28);
        RLeg1.addBox(-0.5F, 2F, -1F, 1, 2, 1);
        RLeg1.setRotationPoint(0F, 8F, 0F);
        RLeg1.setTextureSize(64, 32);
        RLeg1.mirror = true;
        this.setRotation(RLeg1, 0F, 0F, 0.5235988F);
        RLeg2 = new ModelRenderer(this, 39, 28);
        RLeg2.addBox(-0.5F, 2F, 1F, 1, 2, 1);
        RLeg2.setRotationPoint(0F, 8F, 0F);
        RLeg2.setTextureSize(64, 32);
        RLeg2.mirror = true;
        this.setRotation(RLeg2, 0F, 0F, 0.5235988F);
        RLeg3 = new ModelRenderer(this, 39, 28);
        RLeg3.addBox(-0.5F, 2F, -3F, 1, 2, 1);
        RLeg3.setRotationPoint(0F, 8F, 0F);
        RLeg3.setTextureSize(64, 32);
        RLeg3.mirror = true;
        this.setRotation(RLeg3, 0F, 0F, 0.5235988F);
        LLeg3 = new ModelRenderer(this, 39, 28);
        LLeg3.addBox(-0.5F, 2F, -3F, 1, 2, 1);
        LLeg3.setRotationPoint(0F, 8F, 0F);
        LLeg3.setTextureSize(64, 32);
        LLeg3.mirror = true;
        this.setRotation(LLeg3, 0F, 0F, -0.5235988F);
        LLeg1 = new ModelRenderer(this, 39, 28);
        LLeg1.addBox(-0.5F, 2F, -1F, 1, 2, 1);
        LLeg1.setRotationPoint(0F, 8F, 0F);
        LLeg1.setTextureSize(64, 32);
        LLeg1.mirror = true;
        this.setRotation(LLeg1, 0F, 0F, -0.5235988F);
        Bomb2 = new ModelRenderer(this, 0, 24);
        Bomb2.addBox(-2F, -2F, -2F, 4, 4, 4);
        Bomb2.setRotationPoint(0F, 13F, -0.5F);
        Bomb2.setTextureSize(64, 32);
        Bomb2.mirror = true;
        this.setRotation(Bomb2, 0.7853982F, 0.7853982F, 0F);
        Bomb3 = new ModelRenderer(this, 0, 24);
        Bomb3.addBox(-2F, -2F, -2F, 4, 4, 4);
        Bomb3.setRotationPoint(0F, 13F, -0.5F);
        Bomb3.setTextureSize(64, 32);
        Bomb3.mirror = true;
        this.setRotation(Bomb3, 0.7853982F, 0F, 0.7853982F);
        Bomb4 = new ModelRenderer(this, 0, 24);
        Bomb4.addBox(-2F, -2F, -2F, 4, 4, 4);
        Bomb4.setRotationPoint(0F, 13F, -0.5F);
        Bomb4.setTextureSize(64, 32);
        Bomb4.mirror = true;
        this.setRotation(Bomb4, 0F, 0.7853982F, 0.7853982F);
        Bomb = new ModelRenderer(this, 0, 24);
        Bomb.addBox(-2F, -2F, -2F, 4, 4, 4);
        Bomb.setRotationPoint(0F, 13F, -0.5F);
        Bomb.setTextureSize(64, 32);
        Bomb.mirror = true;
        this.setRotation(Bomb, 0F, 0F, 0F);
        Body1 = new ModelRenderer(this, 0, 0);
        Body1.addBox(-1F, -1F, -7F, 2, 2, 15);
        Body1.setRotationPoint(0F, 8F, 0F);
        Body1.setTextureSize(64, 32);
        Body1.mirror = true;
        this.setRotation(Body1, 0F, 0F, 0F);
    }

    @Override
    public void
    render(Entity e, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glRotated(-42, 0, 1, 0);

        Body1.render(f5);
        Body2.render(f5);
        Body3.render(f5);
        Stinger.render(f5);

        RLeg1.render(f5);
        RLeg2.render(f5);
        RLeg3.render(f5);
        LLeg1.render(f5);
        LLeg2.render(f5);
        LLeg3.render(f5);

        double a = 30 * Math.sin(e.ticksExisted);
        double d = 0.5;
        GL11.glPushMatrix();
        GL11.glTranslated(0, d, 0);
        GL11.glRotated(a, 0, 0, 1);
        GL11.glTranslated(0, -d, 0);
        Wing1A.render(f5);
        Wing1B.render(f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(0, d, 0);
        GL11.glRotated(-a, 0, 0, 1);
        GL11.glTranslated(0, -d, 0);
        Wing2A.render(f5);
        Wing2B.render(f5);
        GL11.glPopMatrix();

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glDisable(GL11.GL_LIGHTING);
        ReikaRenderHelper.disableEntityLighting();
        Bomb.render(f5);
        Bomb2.render(f5);
        Bomb3.render(f5);
        Bomb4.render(f5);
        GL11.glPopAttrib();

        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(
        float limb,
        float maxSwing,
        float p_78087_3_,
        float p_78087_4_,
        float p_78087_5_,
        float p_78087_6_,
        Entity e
    ) { /*
           float f6 = (180F / (float)Math.PI);
           head.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
           head.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
           body.rotateAngleX = ((float)Math.PI / 2F);
           leg1.rotateAngleX = MathHelper.cos(limb * 0.6662F) * 1.4F * maxSwing;
           leg2.rotateAngleX = MathHelper.cos(limb * 0.6662F + (float)Math.PI) * 1.4F *
           maxSwing; leg3.rotateAngleX = MathHelper.cos(limb * 0.6662F + (float)Math.PI)
           * 1.4F * maxSwing; leg4.rotateAngleX = MathHelper.cos(limb * 0.6662F) * 1.4F *
           maxSwing;*/
    }
}