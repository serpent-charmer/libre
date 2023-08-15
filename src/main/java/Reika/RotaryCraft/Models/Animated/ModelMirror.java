/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 13/06/2013 11:18:12 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class ModelMirror extends RotaryModelBase {
    //fields
    LODModelPart Shape1;
    LODModelPart Shape3;
    LODModelPart Shape4;
    LODModelPart Shape5;
    LODModelPart Shape5a;
    LODModelPart Shape5b;
    LODModelPart Shape5c;
    LODModelPart Shape5d;
    LODModelPart Shape3a;
    LODModelPart Shape3b;
    LODModelPart Shape3c;
    LODModelPart Shape3d;
    LODModelPart Shape3as;
    LODModelPart Shape5af;
    LODModelPart Shape5as;

    public ModelMirror() {
        textureWidth = 128;
        textureHeight = 128;

        Shape1 = new LODModelPart(this, 0, 71);
        Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
        Shape1.setRotationPoint(-8F, 23F, -8F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0F, 0F, 0F);
        Shape3 = new LODModelPart(this, 0, 0);
        Shape3.addBox(-5F, 0F, -5F, 10, 1, 10);
        Shape3.setRotationPoint(0F, 22F, 0F);
        Shape3.setTextureSize(128, 128);
        Shape3.mirror = true;
        this.setRotation(Shape3, 0F, 0.5235988F, 0F);
        Shape4 = new LODModelPart(this, 0, 19);
        Shape4.addBox(-1F, -4.1F, -4F, 2, 9, 1);
        Shape4.setRotationPoint(0F, 23F, 0F);
        Shape4.setTextureSize(128, 128);
        Shape4.mirror = true;
        this.setRotation(Shape4, -1.047198F, 0F, 0F);
        Shape5 = new LODModelPart(this, 66, 0);
        Shape5.addBox(-8F, 6.1F, 5.3F, 16, 3, 1);
        Shape5.setRotationPoint(0F, 9F, 0F);
        Shape5.setTextureSize(128, 128);
        Shape5.mirror = true;
        this.setRotation(Shape5, -0.7853982F, 0F, 0F);
        Shape5a = new LODModelPart(this, 0, 57);
        Shape5a.addBox(4F, 3F, 1.5F, 2, 11, 1);
        Shape5a.setRotationPoint(0F, 9F, 0F);
        Shape5a.setTextureSize(128, 128);
        Shape5a.mirror = true;
        this.setRotation(Shape5a, 0F, 0F, 0F);
        Shape5b = new LODModelPart(this, 66, 11);
        Shape5b.addBox(-8F, 3F, 2.1F, 16, 3, 1);
        Shape5b.setRotationPoint(0F, 9F, 0F);
        Shape5b.setTextureSize(128, 128);
        Shape5b.mirror = true;
        this.setRotation(Shape5b, -0.2617994F, 0F, 0F);
        Shape5c = new LODModelPart(this, 66, 5);
        Shape5c.addBox(-8F, 4.7F, 3.5F, 16, 3, 1);
        Shape5c.setRotationPoint(0F, 9F, 0F);
        Shape5c.setTextureSize(128, 128);
        Shape5c.mirror = true;
        this.setRotation(Shape5c, -0.5235988F, 0F, 0F);
        Shape5d = new LODModelPart(this, 66, 17);
        Shape5d.addBox(-8F, 0.6F, 1.3F, 16, 3, 1);
        Shape5d.setRotationPoint(0F, 9F, 0F);
        Shape5d.setTextureSize(128, 128);
        Shape5d.mirror = true;
        this.setRotation(Shape5d, 0F, 0F, 0F);
        Shape3a = new LODModelPart(this, 0, 0);
        Shape3a.addBox(-5F, 0F, -5F, 10, 1, 10);
        Shape3a.setRotationPoint(0F, 22F, 0F);
        Shape3a.setTextureSize(128, 128);
        Shape3a.mirror = true;
        this.setRotation(Shape3a, 0F, 0F, 0F);
        Shape3b = new LODModelPart(this, 0, 0);
        Shape3b.addBox(-5F, 0F, -5F, 10, 1, 10);
        Shape3b.setRotationPoint(0F, 22F, 0F);
        Shape3b.setTextureSize(128, 128);
        Shape3b.mirror = true;
        this.setRotation(Shape3b, 0F, 1.047198F, 0F);
        Shape3c = new LODModelPart(this, 0, 0);
        Shape3c.addBox(-5F, 0F, -5F, 10, 1, 10);
        Shape3c.setRotationPoint(0F, 22F, 0F);
        Shape3c.setTextureSize(128, 128);
        Shape3c.mirror = true;
        this.setRotation(Shape3c, 0F, 0.7853982F, 0F);
        Shape3d = new LODModelPart(this, 0, 0);
        Shape3d.addBox(-5F, 0F, -5F, 10, 1, 10);
        Shape3d.setRotationPoint(0F, 22F, 0F);
        Shape3d.setTextureSize(128, 128);
        Shape3d.mirror = true;
        this.setRotation(Shape3d, 0F, 1.308997F, 0F);
        Shape3as = new LODModelPart(this, 0, 0);
        Shape3as.addBox(-5F, 0F, -5F, 10, 1, 10);
        Shape3as.setRotationPoint(0F, 22F, 0F);
        Shape3as.setTextureSize(128, 128);
        Shape3as.mirror = true;
        this.setRotation(Shape3as, 0F, 0.2617994F, 0F);
        Shape5af = new LODModelPart(this, 0, 31);
        Shape5af.addBox(-6F, 3F, 1.5F, 2, 11, 1);
        Shape5af.setRotationPoint(0F, 9F, 0F);
        Shape5af.setTextureSize(128, 128);
        Shape5af.mirror = true;
        this.setRotation(Shape5af, 0F, 0F, 0F);
        Shape5as = new LODModelPart(this, 0, 44);
        Shape5as.addBox(-1F, 3F, 1.5F, 2, 11, 1);
        Shape5as.setRotationPoint(0F, 9F, 0F);
        Shape5as.setTextureSize(128, 128);
        Shape5as.mirror = true;
        this.setRotation(Shape5as, 0F, 0F, 0F);
    }

    @Override
    public void
    setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
        boolean broken = (Boolean) li.get(0);
        Shape1.render(te, f5);

        GL11.glTranslated(0, 1, 0);
        GL11.glRotatef(phi, 0, 1, 0);
        GL11.glTranslated(0, -1, 0);
        Shape3.render(te, f5);
        Shape4.render(te, f5);

        if (!broken) {
            GL11.glTranslated(0, 1, 0);
            GL11.glRotatef(theta, 1, 0, 0);
            GL11.glTranslated(0, -1, 0);
            Shape5.render(te, f5);
            Shape5b.render(te, f5);
            Shape5c.render(te, f5);
            Shape5d.render(te, f5);
            GL11.glTranslated(0, 1, 0);
            GL11.glRotatef(-theta, 1, 0, 0);
            GL11.glTranslated(0, -1, 0);
        }

        Shape3a.render(te, f5);
        Shape3b.render(te, f5);
        Shape3c.render(te, f5);
        Shape3d.render(te, f5);
        Shape3as.render(te, f5);

        double sc = 1
            - 0.725 * Math.cos(Math.toRadians(theta)) * Math.sin(Math.toRadians(-theta));
        double d = 1.5;
        GL11.glTranslated(0, d, 0);
        GL11.glScaled(1, sc, 1);
        GL11.glTranslated(0, -d, 0);
        Shape5a.render(te, f5);
        Shape5af.render(te, f5);
        Shape5as.render(te, f5);
        GL11.glTranslated(0, d, 0);
        GL11.glScaled(1, 1D / sc, 1);
        GL11.glTranslated(0, -d, 0);

        GL11.glTranslated(0, 1, 0);
        GL11.glRotatef(-phi, 0, 1, 0);
        GL11.glTranslated(0, -1, 0);
    }
}
