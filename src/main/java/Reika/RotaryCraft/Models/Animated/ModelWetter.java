/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 18/06/2015 7:23:45 PM
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

public class ModelWetter extends RotaryModelBase {
    //fields
    LODModelPart Shape1;
    LODModelPart Shape1a;
    LODModelPart Shape1b;
    LODModelPart Shape1c;
    LODModelPart Shape2;
    LODModelPart Shape3;
    LODModelPart Shape3a;
    LODModelPart Shape3b;
    LODModelPart Shape3c;
    LODModelPart Shape4;
    LODModelPart Shape4a;
    LODModelPart Shape4b;
    LODModelPart Shape4c;
    LODModelPart Shape5;
    LODModelPart Shape5a;
    LODModelPart Shape5b;
    LODModelPart Shape5c;
    LODModelPart Shape5d;

    public ModelWetter() {
        textureWidth = 128;
        textureHeight = 128;

        Shape1 = new LODModelPart(this, 0, 19);
        Shape1.addBox(0F, 0F, 0F, 1, 13, 1);
        Shape1.setRotationPoint(-8F, 8F, 7F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0F, 0F, 0F);
        Shape1a = new LODModelPart(this, 0, 19);
        Shape1a.addBox(0F, 0F, 0F, 1, 13, 1);
        Shape1a.setRotationPoint(-8F, 8F, -8F);
        Shape1a.setTextureSize(128, 128);
        Shape1a.mirror = true;
        this.setRotation(Shape1a, 0F, 0F, 0F);
        Shape1b = new LODModelPart(this, 0, 19);
        Shape1b.addBox(0F, 0F, 0F, 1, 13, 1);
        Shape1b.setRotationPoint(7F, 8F, -8F);
        Shape1b.setTextureSize(128, 128);
        Shape1b.mirror = true;
        this.setRotation(Shape1b, 0F, 0F, 0F);
        Shape1c = new LODModelPart(this, 0, 19);
        Shape1c.addBox(0F, 0F, 0F, 1, 13, 1);
        Shape1c.setRotationPoint(7F, 8F, 7F);
        Shape1c.setTextureSize(128, 128);
        Shape1c.mirror = true;
        this.setRotation(Shape1c, 0F, 0F, 0F);
        Shape2 = new LODModelPart(this, 0, 0);
        Shape2.addBox(0F, 0F, 0F, 16, 1, 16);
        Shape2.setRotationPoint(-8F, 21F, -8F);
        Shape2.setTextureSize(128, 128);
        Shape2.mirror = true;
        this.setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new LODModelPart(this, 5, 19);
        Shape3.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape3.setRotationPoint(-8F, 22F, 7F);
        Shape3.setTextureSize(128, 128);
        Shape3.mirror = true;
        this.setRotation(Shape3, 0F, 0F, 0F);
        Shape3a = new LODModelPart(this, 5, 19);
        Shape3a.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape3a.setRotationPoint(-8F, 22F, -8F);
        Shape3a.setTextureSize(128, 128);
        Shape3a.mirror = true;
        this.setRotation(Shape3a, 0F, 0F, 0F);
        Shape3b = new LODModelPart(this, 5, 19);
        Shape3b.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape3b.setRotationPoint(7F, 22F, -8F);
        Shape3b.setTextureSize(128, 128);
        Shape3b.mirror = true;
        this.setRotation(Shape3b, 0F, 0F, 0F);
        Shape3c = new LODModelPart(this, 5, 19);
        Shape3c.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape3c.setRotationPoint(7F, 22F, 7F);
        Shape3c.setTextureSize(128, 128);
        Shape3c.mirror = true;
        this.setRotation(Shape3c, 0F, 0F, 0F);
        Shape4 = new LODModelPart(this, 66, 0);
        Shape4.addBox(0F, 0F, 0F, 1, 12, 14);
        Shape4.setRotationPoint(-8F, 9F, -7F);
        Shape4.setTextureSize(128, 128);
        Shape4.mirror = true;
        this.setRotation(Shape4, 0F, 0F, 0F);
        Shape4a = new LODModelPart(this, 97, 28);
        Shape4a.addBox(0F, 0F, 0F, 14, 12, 1);
        Shape4a.setRotationPoint(-7F, 9F, -8F);
        Shape4a.setTextureSize(128, 128);
        Shape4a.mirror = true;
        this.setRotation(Shape4a, 0F, 0F, 0F);
        Shape4b = new LODModelPart(this, 66, 28);
        Shape4b.addBox(0F, 0F, 0F, 14, 12, 1);
        Shape4b.setRotationPoint(-7F, 9F, 7F);
        Shape4b.setTextureSize(128, 128);
        Shape4b.mirror = true;
        this.setRotation(Shape4b, 0F, 0F, 0F);
        Shape4c = new LODModelPart(this, 97, 0);
        Shape4c.addBox(0F, 0F, 0F, 1, 12, 14);
        Shape4c.setRotationPoint(7F, 9F, -7F);
        Shape4c.setTextureSize(128, 128);
        Shape4c.mirror = true;
        this.setRotation(Shape4c, 0F, 0F, 0F);
        Shape5 = new LODModelPart(this, 0, 35);
        Shape5.addBox(-1F, 0F, -1F, 2, 9, 2);
        Shape5.setRotationPoint(0F, 15F, 0F);
        Shape5.setTextureSize(128, 128);
        Shape5.mirror = true;
        this.setRotation(Shape5, 0F, 0.7853982F, 0F);
        Shape5a = new LODModelPart(this, 0, 35);
        Shape5a.addBox(-1F, 0F, -1F, 2, 9, 2);
        Shape5a.setRotationPoint(0F, 15F, 0F);
        Shape5a.setTextureSize(128, 128);
        Shape5a.mirror = true;
        this.setRotation(Shape5a, 0F, 0F, 0F);
        Shape5b = new LODModelPart(this, 0, 35);
        Shape5b.addBox(-0.5F, 0F, -4F, 1, 4, 8);
        Shape5b.setRotationPoint(0F, 17F, 0F);
        Shape5b.setTextureSize(128, 128);
        Shape5b.mirror = true;
        this.setRotation(Shape5b, 0F, 0F, 0F);
        Shape5c = new LODModelPart(this, 0, 35);
        Shape5c.addBox(-0.5F, 0F, -4F, 1, 4, 8);
        Shape5c.setRotationPoint(0F, 17F, 0F);
        Shape5c.setTextureSize(128, 128);
        Shape5c.mirror = true;
        this.setRotation(Shape5c, 0F, 1.047198F, 0F);
        Shape5d = new LODModelPart(this, 0, 35);
        Shape5d.addBox(-0.5F, 0F, -4F, 1, 4, 8);
        Shape5d.setRotationPoint(0F, 17F, 0F);
        Shape5d.setTextureSize(128, 128);
        Shape5d.mirror = true;
        this.setRotation(Shape5d, 0F, -1.047198F, 0F);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
        Shape1.render(te, f5);
        Shape1a.render(te, f5);
        Shape1b.render(te, f5);
        Shape1c.render(te, f5);
        Shape2.render(te, f5);
        Shape3.render(te, f5);
        Shape3a.render(te, f5);
        Shape3b.render(te, f5);
        Shape3c.render(te, f5);
        Shape4.render(te, f5);
        Shape4a.render(te, f5);
        Shape4b.render(te, f5);
        Shape4c.render(te, f5);

        GL11.glPushMatrix();
        GL11.glRotated(phi, 0, 1, 0);

        Shape5.render(te, f5);
        Shape5a.render(te, f5);
        Shape5b.render(te, f5);
        Shape5c.render(te, f5);
        Shape5d.render(te, f5);

        GL11.glPopMatrix();
    }

    @Override
    public void
    setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }
}
