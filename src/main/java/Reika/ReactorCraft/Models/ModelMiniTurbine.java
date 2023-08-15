/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 11/05/2017 4:24:36 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class ModelMiniTurbine extends ModelTurbine {
    //fields
    LODModelPart Shape1;
    LODModelPart Shape1a;
    LODModelPart Shape2a;
    LODModelPart Shape2c;
    LODModelPart Shape2e;
    LODModelPart Shape2g;
    LODModelPart Shape2i;
    LODModelPart Shape2k;
    LODModelPart Shape2m;
    LODModelPart Shape3a;
    LODModelPart Shape2q;
    LODModelPart Shape2o;
    LODModelPart Shape3i;
    LODModelPart Shape3c;
    LODModelPart Shape3d;
    LODModelPart Shape3e;
    LODModelPart Shape3f;
    LODModelPart Shape3g;
    LODModelPart Shape3h;
    LODModelPart Shape3b;
    LODModelPart Shape4a;
    LODModelPart Shape4b;
    LODModelPart Shape4c;
    LODModelPart Shape4d;
    LODModelPart Shape4e;
    LODModelPart Shape4f;
    LODModelPart Shape4g;
    LODModelPart Shape4h;
    LODModelPart Shape6;
    LODModelPart Shape5;

    public ModelMiniTurbine(int stage) {
        super(stage);

        textureWidth = 64;
        textureHeight = 64;

        Shape1 = new LODModelPart(this, 16, 0);
        Shape1.addBox(-2F, -2F, 0F, 4, 4, 16);
        Shape1.setRotationPoint(0F, 14F, -8F);
        Shape1.setTextureSize(64, 64);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0F, 0F, 0.7853982F);
        Shape1a = new LODModelPart(this, 16, 0);
        Shape1a.addBox(-2F, -2F, 0F, 4, 4, 16);
        Shape1a.setRotationPoint(0F, 14F, -8F);
        Shape1a.setTextureSize(64, 64);
        Shape1a.mirror = true;
        this.setRotation(Shape1a, 0F, 0F, 0F);
        Shape2a = new LODModelPart(this, 0, 0);
        Shape2a.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2a.setRotationPoint(0F, 14F, 0F);
        Shape2a.setTextureSize(64, 64);
        Shape2a.mirror = true;
        this.setRotation(Shape2a, 0F, 0F, 0F);
        Shape2c = new LODModelPart(this, 0, 0);
        Shape2c.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2c.setRotationPoint(0F, 14F, 0F);
        Shape2c.setTextureSize(64, 64);
        Shape2c.mirror = true;
        this.setRotation(Shape2c, 0F, 0F, 0.3490659F);
        Shape2e = new LODModelPart(this, 0, 0);
        Shape2e.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2e.setRotationPoint(0F, 14F, 0F);
        Shape2e.setTextureSize(64, 64);
        Shape2e.mirror = true;
        this.setRotation(Shape2e, 0F, 0F, 0.6981317F);
        Shape2g = new LODModelPart(this, 0, 0);
        Shape2g.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2g.setRotationPoint(0F, 14F, 0F);
        Shape2g.setTextureSize(64, 64);
        Shape2g.mirror = true;
        this.setRotation(Shape2g, 0F, 0F, 1.047198F);
        Shape2i = new LODModelPart(this, 0, 0);
        Shape2i.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2i.setRotationPoint(0F, 14F, 0F);
        Shape2i.setTextureSize(64, 64);
        Shape2i.mirror = true;
        this.setRotation(Shape2i, 0F, 0F, 1.396263F);
        Shape2k = new LODModelPart(this, 0, 0);
        Shape2k.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2k.setRotationPoint(0F, 14F, 0F);
        Shape2k.setTextureSize(64, 64);
        Shape2k.mirror = true;
        this.setRotation(Shape2k, 0F, 0F, 1.745329F);
        Shape2m = new LODModelPart(this, 0, 0);
        Shape2m.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2m.setRotationPoint(0F, 14F, 0F);
        Shape2m.setTextureSize(64, 64);
        Shape2m.mirror = true;
        this.setRotation(Shape2m, 0F, 0F, 2.094395F);
        Shape3a = new LODModelPart(this, 16, 21);
        Shape3a.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3a.setRotationPoint(0F, 14F, -3.5F);
        Shape3a.setTextureSize(64, 64);
        Shape3a.mirror = true;
        this.setRotation(Shape3a, 0F, 0F, -2.094395F);
        Shape2q = new LODModelPart(this, 0, 0);
        Shape2q.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2q.setRotationPoint(0F, 14F, 0F);
        Shape2q.setTextureSize(64, 64);
        Shape2q.mirror = true;
        this.setRotation(Shape2q, 0F, 0F, 2.792527F);
        Shape2o = new LODModelPart(this, 0, 0);
        Shape2o.addBox(-0.5F, -16F, -3F, 1, 32, 6);
        Shape2o.setRotationPoint(0F, 14F, 0F);
        Shape2o.setTextureSize(64, 64);
        Shape2o.mirror = true;
        this.setRotation(Shape2o, 0F, 0F, 2.443461F);
        Shape3i = new LODModelPart(this, 16, 21);
        Shape3i.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3i.setRotationPoint(0F, 14F, -3.5F);
        Shape3i.setTextureSize(64, 64);
        Shape3i.mirror = true;
        this.setRotation(Shape3i, 0F, 0F, -0.3490659F);
        Shape3c = new LODModelPart(this, 16, 21);
        Shape3c.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3c.setRotationPoint(0F, 14F, -3.5F);
        Shape3c.setTextureSize(64, 64);
        Shape3c.mirror = true;
        this.setRotation(Shape3c, 0F, 0F, -2.443461F);
        Shape3d = new LODModelPart(this, 16, 21);
        Shape3d.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3d.setRotationPoint(0F, 14F, -3.5F);
        Shape3d.setTextureSize(64, 64);
        Shape3d.mirror = true;
        this.setRotation(Shape3d, 0F, 0F, 1.396263F);
        Shape3e = new LODModelPart(this, 16, 21);
        Shape3e.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3e.setRotationPoint(0F, 14F, -3.5F);
        Shape3e.setTextureSize(64, 64);
        Shape3e.mirror = true;
        this.setRotation(Shape3e, 0F, 0F, -1.396263F);
        Shape3f = new LODModelPart(this, 16, 21);
        Shape3f.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3f.setRotationPoint(0F, 14F, -3.5F);
        Shape3f.setTextureSize(64, 64);
        Shape3f.mirror = true;
        this.setRotation(Shape3f, 0F, 0F, 2.094395F);
        Shape3g = new LODModelPart(this, 16, 21);
        Shape3g.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3g.setRotationPoint(0F, 14F, -3.5F);
        Shape3g.setTextureSize(64, 64);
        Shape3g.mirror = true;
        this.setRotation(Shape3g, 0F, 0F, 2.443461F);
        Shape3h = new LODModelPart(this, 16, 21);
        Shape3h.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3h.setRotationPoint(0F, 14F, -3.5F);
        Shape3h.setTextureSize(64, 64);
        Shape3h.mirror = true;
        this.setRotation(Shape3h, 0F, 0F, 0.3490659F);
        Shape3b = new LODModelPart(this, 16, 21);
        Shape3b.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape3b.setRotationPoint(0F, 14F, -3.5F);
        Shape3b.setTextureSize(64, 64);
        Shape3b.mirror = true;
        this.setRotation(Shape3b, 0F, 0F, 0F);
        Shape4a = new LODModelPart(this, 24, 21);
        Shape4a.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4a.setRotationPoint(0F, 14F, 7.5F);
        Shape4a.setTextureSize(64, 64);
        Shape4a.mirror = true;
        this.setRotation(Shape4a, 0F, 0F, 2.530727F);
        Shape4b = new LODModelPart(this, 24, 21);
        Shape4b.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4b.setRotationPoint(0F, 14F, 7.5F);
        Shape4b.setTextureSize(64, 64);
        Shape4b.mirror = true;
        this.setRotation(Shape4b, 0F, 0F, 2.923426F);
        Shape4c = new LODModelPart(this, 24, 21);
        Shape4c.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4c.setRotationPoint(0F, 14F, 7.5F);
        Shape4c.setTextureSize(64, 64);
        Shape4c.mirror = true;
        this.setRotation(Shape4c, 0F, 0F, 0.9599311F);
        Shape4d = new LODModelPart(this, 24, 21);
        Shape4d.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4d.setRotationPoint(0F, 14F, 7.5F);
        Shape4d.setTextureSize(64, 64);
        Shape4d.mirror = true;
        this.setRotation(Shape4d, 0F, 0F, 1.745329F);
        Shape4e = new LODModelPart(this, 24, 21);
        Shape4e.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4e.setRotationPoint(0F, 14F, 7.5F);
        Shape4e.setTextureSize(64, 64);
        Shape4e.mirror = true;
        this.setRotation(Shape4e, 0F, 0F, 0.1745329F);
        Shape4f = new LODModelPart(this, 24, 21);
        Shape4f.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4f.setRotationPoint(0F, 14F, 7.5F);
        Shape4f.setTextureSize(64, 64);
        Shape4f.mirror = true;
        this.setRotation(Shape4f, 0F, 0F, 0.567232F);
        Shape4g = new LODModelPart(this, 24, 21);
        Shape4g.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4g.setRotationPoint(0F, 14F, 7.5F);
        Shape4g.setTextureSize(64, 64);
        Shape4g.mirror = true;
        this.setRotation(Shape4g, 0F, 0F, 1.35263F);
        Shape4h = new LODModelPart(this, 24, 21);
        Shape4h.addBox(-0.5F, -12F, -3F, 1, 24, 2);
        Shape4h.setRotationPoint(0F, 14F, 7.5F);
        Shape4h.setTextureSize(64, 64);
        Shape4h.mirror = true;
        this.setRotation(Shape4h, 0F, 0F, 2.138028F);
        Shape6 = new LODModelPart(this, 20, 48);
        Shape6.addBox(-3F, -3F, 0F, 6, 6, 3);
        Shape6.setRotationPoint(0F, 14F, 4F);
        Shape6.setTextureSize(64, 64);
        Shape6.mirror = true;
        this.setRotation(Shape6, 0F, 0F, 0F);
        Shape5 = new LODModelPart(this, 0, 48);
        Shape5.addBox(-3F, -3F, 0F, 6, 6, 3);
        Shape5.setRotationPoint(0F, 14F, -7F);
        Shape5.setTextureSize(64, 64);
        Shape5.mirror = true;
        this.setRotation(Shape5, 0F, 0F, 0F);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
        GL11.glPushMatrix();
        super.renderAll(te, li, phi, theta);

        /*
        double vo = 0.9375;

        GL11.glPushMatrix();
        GL11.glPushMatrix();
        GL11.glTranslated(0, vo, 0);
        GL11.glRotatef(phi, 0, 0, 1);
        GL11.glTranslated(0, -vo, 0);
        Shape1.render(te, f5);
        Shape1a.render(te, f5);
        GL11.glPopMatrix();

        for (int i = 0; i < 180; i += 20) {
            GL11.glPushMatrix();
            GL11.glTranslated(0, vo, 0);
            GL11.glRotatef(i+phi, 0, 0, 1);
            GL11.glTranslated(0, -vo, 0);
            GL11.glRotatef(-this.getBladeTwist(), 0, 1, 0);
            Shape2a.render(te, f5);
            GL11.glPopMatrix();
        }

        /*
        Shape2c.render(te, f5);
        Shape2e.render(te, f5);
        Shape2g.render(te, f5);
        Shape2i.render(te, f5);
        Shape2k.render(te, f5);
        Shape2m.render(te, f5);
        Shape2q.render(te, f5);
        Shape2o.render(te, f5);
         */

        GL11.glPopMatrix();
        GL11.glTranslated(0, 0.0625, 0);

        Shape3a.render(te, f5);
        Shape3i.render(te, f5);
        Shape3c.render(te, f5);
        Shape3d.render(te, f5);
        Shape3e.render(te, f5);
        Shape3f.render(te, f5);
        Shape3g.render(te, f5);
        Shape3h.render(te, f5);
        Shape3b.render(te, f5);
        Shape4a.render(te, f5);
        Shape4b.render(te, f5);
        Shape4c.render(te, f5);
        Shape4d.render(te, f5);
        Shape4e.render(te, f5);
        Shape4f.render(te, f5);
        Shape4g.render(te, f5);
        Shape4h.render(te, f5);
        Shape6.render(te, f5);
        Shape5.render(te, f5);
    }

    @Override
    public int getBladeTwist() {
        return 45 - stage * 8;
    }

    @Override
    public int getAngularSeparation() {
        return 20;
    }

    @Override
    public int getBladeWidth() {
        return 6;
    }

    @Override
    public double getScaleFactor() {
        return 1;
    }

    @Override
    public int getBladeLength() {
        return 21;
    }

    @Override
    protected boolean renderTwoStages() {
        return false;
    }
}
