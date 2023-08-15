/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 04/06/2016 2:38:51 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.DragonAPI.Libraries.Rendering.ReikaColorAPI;
import Reika.DragonAPI.Libraries.Rendering.ReikaRenderHelper;
import Reika.RotaryCraft.Base.RotaryModelBase;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class ModelSolarTop extends RotaryModelBase {
    //fields
    LODModelPart Shape2;
    LODModelPart Shape1;
    LODModelPart Shape1a;
    LODModelPart Shape1b;
    LODModelPart Shape1c;
    LODModelPart Shape3;
    LODModelPart Shape3a;
    LODModelPart Shape3b;
    LODModelPart Shape3c;
    LODModelPart Shape4;
    LODModelPart Shape5;
    LODModelPart Shape5a;
    LODModelPart Shape5b;
    LODModelPart Shape5c;
    LODModelPart Shape5d;
    LODModelPart Shape5e;
    LODModelPart Shape5f;
    LODModelPart Shape5g;
    LODModelPart Shape5h;
    LODModelPart Shape5i;
    LODModelPart Shape5j;
    LODModelPart Shape5k;
    LODModelPart Shape5l;
    LODModelPart Shape5m;
    LODModelPart Shape5n;
    LODModelPart Shape5o;
    LODModelPart Shape5p;
    LODModelPart Shape5q;
    LODModelPart Shape5r;
    LODModelPart Shape5s;
    LODModelPart Shape5t;
    LODModelPart Shape5u;
    LODModelPart Shape5v;
    LODModelPart Shape5w;
    LODModelPart Shape5x;
    LODModelPart Shape5y;
    LODModelPart Shape5z;
    LODModelPart Shape5aa;
    LODModelPart Shape5ab;
    LODModelPart Shape5ac;

    public ModelSolarTop() {
        textureWidth = 128;
        textureHeight = 128;

        Shape2 = new LODModelPart(this, 0, 55);
        Shape2.addBox(0F, 0F, 0F, 16, 1, 16);
        Shape2.setRotationPoint(-8F, 23F, -8F);
        Shape2.setTextureSize(128, 128);
        Shape2.mirror = true;
        this.setRotation(Shape2, 0F, 0F, 0F);
        Shape1 = new LODModelPart(this, 30, 0);
        Shape1.addBox(-1F, -8.5F, -1F, 2, 10, 2);
        Shape1.setRotationPoint(4F, 23F, 4F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        this.setRotation(Shape1, -0.3141593F, 0F, 0.3141593F);
        Shape1a = new LODModelPart(this, 0, 0);
        Shape1a.addBox(-1F, -8.5F, -1F, 2, 10, 2);
        Shape1a.setRotationPoint(4F, 23F, -4F);
        Shape1a.setTextureSize(128, 128);
        Shape1a.mirror = true;
        this.setRotation(Shape1a, 0.3141593F, 0F, 0.3141593F);
        Shape1b = new LODModelPart(this, 10, 0);
        Shape1b.addBox(-1F, -8.5F, -1F, 2, 10, 2);
        Shape1b.setRotationPoint(-4F, 23F, -4F);
        Shape1b.setTextureSize(128, 128);
        Shape1b.mirror = true;
        this.setRotation(Shape1b, 0.3141593F, 0F, -0.3141593F);
        Shape1c = new LODModelPart(this, 20, 0);
        Shape1c.addBox(-1F, -8.5F, -1F, 2, 10, 2);
        Shape1c.setRotationPoint(-4F, 23F, 4F);
        Shape1c.setTextureSize(128, 128);
        Shape1c.mirror = true;
        this.setRotation(Shape1c, -0.3141593F, 0F, -0.3141593F);
        Shape3 = new LODModelPart(this, 30, 13);
        Shape3.addBox(0F, 0F, 0F, 2, 8, 2);
        Shape3.setRotationPoint(5.5F, 8F, -7.5F);
        Shape3.setTextureSize(128, 128);
        Shape3.mirror = true;
        this.setRotation(Shape3, 0F, 0F, 0F);
        Shape3a = new LODModelPart(this, 0, 13);
        Shape3a.addBox(0F, 0F, 0F, 2, 8, 2);
        Shape3a.setRotationPoint(-7.5F, 8F, -7.5F);
        Shape3a.setTextureSize(128, 128);
        Shape3a.mirror = true;
        this.setRotation(Shape3a, 0F, 0F, 0F);
        Shape3b = new LODModelPart(this, 10, 13);
        Shape3b.addBox(0F, 0F, 0F, 2, 8, 2);
        Shape3b.setRotationPoint(-7.5F, 8F, 5.5F);
        Shape3b.setTextureSize(128, 128);
        Shape3b.mirror = true;
        this.setRotation(Shape3b, 0F, 0F, 0F);
        Shape3c = new LODModelPart(this, 20, 13);
        Shape3c.addBox(0F, 0F, 0F, 2, 8, 2);
        Shape3c.setRotationPoint(5.5F, 8F, 5.5F);
        Shape3c.setTextureSize(128, 128);
        Shape3c.mirror = true;
        this.setRotation(Shape3c, 0F, 0F, 0F);
        Shape4 = new LODModelPart(this, 40, 0);
        Shape4.addBox(0F, 0F, 0F, 8, 15, 8);
        Shape4.setRotationPoint(-4F, 8F, -4F);
        Shape4.setTextureSize(128, 128);
        Shape4.mirror = true;
        this.setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new LODModelPart(this, 0, 24);
        Shape5.addBox(0F, 0F, 0F, 1, 7, 1);
        Shape5.setRotationPoint(4F, 16F, 1F);
        Shape5.setTextureSize(128, 128);
        Shape5.mirror = true;
        this.setRotation(Shape5, 0F, 0F, 0F);
        Shape5a = new LODModelPart(this, 0, 24);
        Shape5a.addBox(0F, 0F, 0F, 1, 8, 1);
        Shape5a.setRotationPoint(4F, 11F, -3F);
        Shape5a.setTextureSize(128, 128);
        Shape5a.mirror = true;
        this.setRotation(Shape5a, 0F, 0F, 0F);
        Shape5b = new LODModelPart(this, 0, 24);
        Shape5b.addBox(0F, 0F, 0F, 1, 9, 1);
        Shape5b.setRotationPoint(4F, 8F, 2F);
        Shape5b.setTextureSize(128, 128);
        Shape5b.mirror = true;
        this.setRotation(Shape5b, 0F, 0F, 0F);
        Shape5c = new LODModelPart(this, 0, 24);
        Shape5c.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5c.setRotationPoint(4F, 20F, -1F);
        Shape5c.setTextureSize(128, 128);
        Shape5c.mirror = true;
        this.setRotation(Shape5c, 0F, 0F, 0F);
        Shape5d = new LODModelPart(this, 0, 24);
        Shape5d.addBox(0F, 0F, 0F, 2, 1, 1);
        Shape5d.setRotationPoint(-5F, 18F, 0F);
        Shape5d.setTextureSize(128, 128);
        Shape5d.mirror = true;
        this.setRotation(Shape5d, 0F, 0F, 0F);
        Shape5e = new LODModelPart(this, 0, 24);
        Shape5e.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5e.setRotationPoint(4F, 18F, -2F);
        Shape5e.setTextureSize(128, 128);
        Shape5e.mirror = true;
        this.setRotation(Shape5e, 0F, 0F, 0F);
        Shape5f = new LODModelPart(this, 0, 24);
        Shape5f.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5f.setRotationPoint(4F, 8F, -2F);
        Shape5f.setTextureSize(128, 128);
        Shape5f.mirror = true;
        this.setRotation(Shape5f, 0F, 0F, 0F);
        Shape5g = new LODModelPart(this, 0, 24);
        Shape5g.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5g.setRotationPoint(0F, 14F, -5F);
        Shape5g.setTextureSize(128, 128);
        Shape5g.mirror = true;
        this.setRotation(Shape5g, 0F, 0F, 0F);
        Shape5h = new LODModelPart(this, 0, 24);
        Shape5h.addBox(0F, 0F, 0F, 1, 10, 1);
        Shape5h.setRotationPoint(-5F, 13F, 1F);
        Shape5h.setTextureSize(128, 128);
        Shape5h.mirror = true;
        this.setRotation(Shape5h, 0F, 0F, 0F);
        Shape5i = new LODModelPart(this, 0, 24);
        Shape5i.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5i.setRotationPoint(-5F, 20F, -2F);
        Shape5i.setTextureSize(128, 128);
        Shape5i.mirror = true;
        this.setRotation(Shape5i, 0F, 0F, 0F);
        Shape5j = new LODModelPart(this, 0, 24);
        Shape5j.addBox(0F, 0F, 0F, 2, 1, 1);
        Shape5j.setRotationPoint(-5F, 13F, 0F);
        Shape5j.setTextureSize(128, 128);
        Shape5j.mirror = true;
        this.setRotation(Shape5j, 0F, 0F, 0F);
        Shape5k = new LODModelPart(this, 0, 24);
        Shape5k.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape5k.setRotationPoint(-5F, 12F, -1F);
        Shape5k.setTextureSize(128, 128);
        Shape5k.mirror = true;
        this.setRotation(Shape5k, 0F, 0F, 0F);
        Shape5l = new LODModelPart(this, 0, 24);
        Shape5l.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5l.setRotationPoint(-5F, 18F, -1F);
        Shape5l.setTextureSize(128, 128);
        Shape5l.mirror = true;
        this.setRotation(Shape5l, 0F, 0F, 0F);
        Shape5m = new LODModelPart(this, 0, 24);
        Shape5m.addBox(0F, 0F, 0F, 1, 5, 1);
        Shape5m.setRotationPoint(-5F, 8F, -2F);
        Shape5m.setTextureSize(128, 128);
        Shape5m.mirror = true;
        this.setRotation(Shape5m, 0F, 0F, 0F);
        Shape5n = new LODModelPart(this, 0, 24);
        Shape5n.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5n.setRotationPoint(-3F, 8F, -5F);
        Shape5n.setTextureSize(128, 128);
        Shape5n.mirror = true;
        this.setRotation(Shape5n, 0F, 0F, 0F);
        Shape5o = new LODModelPart(this, 0, 24);
        Shape5o.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape5o.setRotationPoint(-2F, 11F, -5F);
        Shape5o.setTextureSize(128, 128);
        Shape5o.mirror = true;
        this.setRotation(Shape5o, 0F, 0F, 0F);
        Shape5p = new LODModelPart(this, 0, 24);
        Shape5p.addBox(0F, 0F, 0F, 1, 5, 1);
        Shape5p.setRotationPoint(-1F, 15F, 4F);
        Shape5p.setTextureSize(128, 128);
        Shape5p.mirror = true;
        this.setRotation(Shape5p, 0F, 0F, 0F);
        Shape5q = new LODModelPart(this, 0, 24);
        Shape5q.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5q.setRotationPoint(-1F, 12F, -5F);
        Shape5q.setTextureSize(128, 128);
        Shape5q.mirror = true;
        this.setRotation(Shape5q, 0F, 0F, 0F);
        Shape5r = new LODModelPart(this, 0, 24);
        Shape5r.addBox(0F, 0F, 0F, 1, 5, 1);
        Shape5r.setRotationPoint(2F, 18F, -5F);
        Shape5r.setTextureSize(128, 128);
        Shape5r.mirror = true;
        this.setRotation(Shape5r, 0F, 0F, 0F);
        Shape5s = new LODModelPart(this, 0, 24);
        Shape5s.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5s.setRotationPoint(-1F, 17F, -5F);
        Shape5s.setTextureSize(128, 128);
        Shape5s.mirror = true;
        this.setRotation(Shape5s, 0F, 0F, 0F);
        Shape5t = new LODModelPart(this, 0, 24);
        Shape5t.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape5t.setRotationPoint(1F, 17F, -5F);
        Shape5t.setTextureSize(128, 128);
        Shape5t.mirror = true;
        this.setRotation(Shape5t, 0F, 0F, 0F);
        Shape5u = new LODModelPart(this, 0, 24);
        Shape5u.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5u.setRotationPoint(-2F, 19F, -5F);
        Shape5u.setTextureSize(128, 128);
        Shape5u.mirror = true;
        this.setRotation(Shape5u, 0F, 0F, 0F);
        Shape5v = new LODModelPart(this, 0, 24);
        Shape5v.addBox(0F, 0F, 0F, 1, 7, 1);
        Shape5v.setRotationPoint(-3F, 8F, 4F);
        Shape5v.setTextureSize(128, 128);
        Shape5v.mirror = true;
        this.setRotation(Shape5v, 0F, 0F, 0F);
        Shape5w = new LODModelPart(this, 0, 24);
        Shape5w.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5w.setRotationPoint(1F, 19F, 4F);
        Shape5w.setTextureSize(128, 128);
        Shape5w.mirror = true;
        this.setRotation(Shape5w, 0F, 0F, 0F);
        Shape5x = new LODModelPart(this, 0, 24);
        Shape5x.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5x.setRotationPoint(0F, 11F, 4F);
        Shape5x.setTextureSize(128, 128);
        Shape5x.mirror = true;
        this.setRotation(Shape5x, 0F, 0F, 0F);
        Shape5y = new LODModelPart(this, 0, 24);
        Shape5y.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5y.setRotationPoint(2F, 16F, 4F);
        Shape5y.setTextureSize(128, 128);
        Shape5y.mirror = true;
        this.setRotation(Shape5y, 0F, 0F, 0F);
        Shape5z = new LODModelPart(this, 0, 24);
        Shape5z.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5z.setRotationPoint(-2F, 19F, 4F);
        Shape5z.setTextureSize(128, 128);
        Shape5z.mirror = true;
        this.setRotation(Shape5z, 0F, 0F, 0F);
        Shape5aa = new LODModelPart(this, 0, 24);
        Shape5aa.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape5aa.setRotationPoint(-2F, 14F, 4F);
        Shape5aa.setTextureSize(128, 128);
        Shape5aa.mirror = true;
        this.setRotation(Shape5aa, 0F, 0F, 0F);
        Shape5ab = new LODModelPart(this, 0, 24);
        Shape5ab.addBox(0F, 0F, 0F, 1, 4, 1);
        Shape5ab.setRotationPoint(1F, 8F, 4F);
        Shape5ab.setTextureSize(128, 128);
        Shape5ab.mirror = true;
        this.setRotation(Shape5ab, 0F, 0F, 0F);
        Shape5ac = new LODModelPart(this, 0, 24);
        Shape5ac.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape5ac.setRotationPoint(1F, 14F, 4F);
        Shape5ac.setTextureSize(128, 128);
        Shape5ac.mirror = true;
        this.setRotation(Shape5ac, 0F, 0F, 0F);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList conditions, float phi, float theta) {
        Shape2.render(te, f5);
        Shape1.render(te, f5);
        Shape1a.render(te, f5);
        Shape1b.render(te, f5);
        Shape1c.render(te, f5);
        Shape3.render(te, f5);
        Shape3a.render(te, f5);
        Shape3b.render(te, f5);
        Shape3c.render(te, f5);
        Shape4.render(te, f5);

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        int c = (int) conditions.get(0);
        GL11.glColor4f(
            ReikaColorAPI.getRed(c) / 255F,
            ReikaColorAPI.getGreen(c) / 255F,
            ReikaColorAPI.getBlue(c) / 255F,
            1
        );
        ReikaRenderHelper.disableEntityLighting();

        Shape5.render(te, f5);
        Shape5a.render(te, f5);
        Shape5b.render(te, f5);
        Shape5c.render(te, f5);
        Shape5d.render(te, f5);
        Shape5e.render(te, f5);
        Shape5f.render(te, f5);
        Shape5g.render(te, f5);
        Shape5h.render(te, f5);
        Shape5i.render(te, f5);
        Shape5j.render(te, f5);
        Shape5k.render(te, f5);
        Shape5l.render(te, f5);
        Shape5m.render(te, f5);
        Shape5n.render(te, f5);
        Shape5o.render(te, f5);
        Shape5p.render(te, f5);
        Shape5q.render(te, f5);
        Shape5r.render(te, f5);
        Shape5s.render(te, f5);
        Shape5t.render(te, f5);
        Shape5u.render(te, f5);
        Shape5v.render(te, f5);
        Shape5w.render(te, f5);
        Shape5x.render(te, f5);
        Shape5y.render(te, f5);
        Shape5z.render(te, f5);
        Shape5aa.render(te, f5);
        Shape5ab.render(te, f5);
        Shape5ac.render(te, f5);

        GL11.glPopAttrib();
    }

    @Override
    public void
    setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5);
    }
}