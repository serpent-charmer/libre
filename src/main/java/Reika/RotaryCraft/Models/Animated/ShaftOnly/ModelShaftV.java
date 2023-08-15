/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 01/06/2013 5:05:44 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated.ShaftOnly;

import java.util.ArrayList;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class ModelShaftV extends RotaryModelBase {
    //fields
    LODModelPart Shape15b;
    LODModelPart Shape1;
    LODModelPart Shape1a;
    LODModelPart Shape1b;
    LODModelPart Shape1c;
    LODModelPart Shape1d;
    LODModelPart Shape1g;
    LODModelPart Shape1f;
    LODModelPart Shape1e;
    LODModelPart Shape2;
    LODModelPart Shape2b;
    LODModelPart Shape15ba;

    public ModelShaftV() {
        textureWidth = 128;
        textureHeight = 32;

        Shape15b = new LODModelPart(this, 0, 0);
        Shape15b.addBox(0F, 0F, 0F, 14, 1, 14);
        Shape15b.setRotationPoint(-7F, 23F, -7F);
        Shape15b.setTextureSize(128, 32);
        Shape15b.mirror = true;
        this.setRotation(Shape15b, 0F, 0F, 0F);
        Shape1 = new LODModelPart(this, 62, 0);
        Shape1.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1.setRotationPoint(-6F, 8F, 7F);
        Shape1.setTextureSize(128, 32);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0F, 0F, 0F);
        Shape1a = new LODModelPart(this, 62, 0);
        Shape1a.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1a.setRotationPoint(5F, 8F, 7F);
        Shape1a.setTextureSize(128, 32);
        Shape1a.mirror = true;
        this.setRotation(Shape1a, 0F, 0F, 0F);
        Shape1b = new LODModelPart(this, 62, 0);
        Shape1b.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1b.setRotationPoint(-8F, 8F, -6F);
        Shape1b.setTextureSize(128, 32);
        Shape1b.mirror = true;
        this.setRotation(Shape1b, 0F, 0F, 0F);
        Shape1c = new LODModelPart(this, 62, 0);
        Shape1c.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1c.setRotationPoint(-6F, 8F, -8F);
        Shape1c.setTextureSize(128, 32);
        Shape1c.mirror = true;
        this.setRotation(Shape1c, 0F, 0F, 0F);
        Shape1d = new LODModelPart(this, 62, 0);
        Shape1d.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1d.setRotationPoint(5F, 8F, -8F);
        Shape1d.setTextureSize(128, 32);
        Shape1d.mirror = true;
        this.setRotation(Shape1d, 0F, 0F, 0F);
        Shape1g = new LODModelPart(this, 62, 0);
        Shape1g.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1g.setRotationPoint(7F, 8F, -6F);
        Shape1g.setTextureSize(128, 32);
        Shape1g.mirror = true;
        this.setRotation(Shape1g, 0F, 0F, 0F);
        Shape1f = new LODModelPart(this, 62, 0);
        Shape1f.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1f.setRotationPoint(7F, 8F, 5F);
        Shape1f.setTextureSize(128, 32);
        Shape1f.mirror = true;
        this.setRotation(Shape1f, 0F, 0F, 0F);
        Shape1e = new LODModelPart(this, 62, 0);
        Shape1e.addBox(0F, 0F, 0F, 1, 16, 1);
        Shape1e.setRotationPoint(-8F, 8F, 5F);
        Shape1e.setTextureSize(128, 32);
        Shape1e.mirror = true;
        this.setRotation(Shape1e, 0F, 0F, 0F);
        Shape2 = new LODModelPart(this, 120, 0);
        Shape2.addBox(0F, 0F, 0F, 2, 17, 2);
        Shape2.setRotationPoint(-1.4F, 7.5F, 0F);
        Shape2.setTextureSize(128, 32);
        Shape2.mirror = true;
        this.setRotation(Shape2, 0F, 0.7853982F, 0F);
        Shape2b = new LODModelPart(this, 120, 0);
        Shape2b.addBox(0F, 0F, 0F, 2, 17, 2);
        Shape2b.setRotationPoint(-1F, 7.5F, -1F);
        Shape2b.setTextureSize(128, 32);
        Shape2b.mirror = true;
        this.setRotation(Shape2b, 0F, 0F, 0F);
        Shape15ba = new LODModelPart(this, 0, 0);
        Shape15ba.addBox(0F, 0F, 0F, 14, 1, 14);
        Shape15ba.setRotationPoint(-7F, 8F, -7F);
        Shape15ba.setTextureSize(128, 32);
        Shape15ba.mirror = true;
        this.setRotation(Shape15ba, 0F, 0F, 0F);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
        boolean fail = (Boolean) li.get(0);
        this.renderMount(te);
        if (!fail)
            this.renderShaft(te, phi);
    }

    public void renderMount(TileEntity te) {
        Shape15b.render(te, f5);
        Shape1.render(te, f5);
        Shape1a.render(te, f5);
        Shape1b.render(te, f5);
        Shape1c.render(te, f5);
        Shape1d.render(te, f5);
        Shape1g.render(te, f5);
        Shape1f.render(te, f5);
        Shape1e.render(te, f5);
        Shape15ba.render(te, f5);
    }

    public void renderShaft(TileEntity te, float phi) {
        GL11.glRotatef(phi, 0, 1, 0);
        Shape2.render(te, f5);
        Shape2b.render(te, f5);
        GL11.glRotatef(-phi, 0, 1, 0);
    }

    @Override
    public void
    setRotationAngles(float f, float f1, float f2, float f3, float f4, float f6) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }
}
