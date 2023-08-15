/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 23/09/2016 10:03:15 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import net.minecraft.tileentity.TileEntity;

public class ModelRouter extends ChromaModelBase {
    //fields
    LODModelPart Shape1;
    LODModelPart Shape2a;
    LODModelPart Shape3a;
    LODModelPart Shape4e;
    LODModelPart Shape5a;
    LODModelPart Shape6c;
    LODModelPart Shape6f;
    LODModelPart Shape6g;
    LODModelPart Shape6h;
    LODModelPart Shape6i;
    LODModelPart Shape6f2;
    LODModelPart Shape6f3;
    LODModelPart Shape6ff;
    LODModelPart Shape2a2;
    LODModelPart Shape2a3;

    public ModelRouter() {
        textureWidth = 128;
        textureHeight = 128;

        Shape1 = new LODModelPart(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 16, 2, 16);
        Shape1.setRotationPoint(-8F, 22F, -8F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0F, 0F, 0F);
        Shape2a = new LODModelPart(this, 0, 77);
        Shape2a.addBox(-5F, 0F, -5F, 12, 1, 12);
        Shape2a.setRotationPoint(-1F, 20F, -1F);
        Shape2a.setTextureSize(128, 128);
        Shape2a.mirror = true;
        this.setRotation(Shape2a, 0F, 0F, 0F);
        Shape3a = new LODModelPart(this, 0, 34);
        Shape3a.addBox(-4F, 0F, -4F, 8, 2, 8);
        Shape3a.setRotationPoint(0F, 15F, 0F);
        Shape3a.setTextureSize(128, 128);
        Shape3a.mirror = true;
        this.setRotation(Shape3a, 0F, 0F, 0F);
        Shape4e = new LODModelPart(this, 0, 45);
        Shape4e.addBox(-3F, 0F, -3F, 6, 1, 6);
        Shape4e.setRotationPoint(0F, 14F, 0F);
        Shape4e.setTextureSize(128, 128);
        Shape4e.mirror = true;
        this.setRotation(Shape4e, 0F, 0F, 0F);
        Shape5a = new LODModelPart(this, 0, 54);
        Shape5a.addBox(-1.5F, 0F, -1.5F, 3, 4, 3);
        Shape5a.setRotationPoint(0F, 10F, 0F);
        Shape5a.setTextureSize(128, 128);
        Shape5a.mirror = true;
        this.setRotation(Shape5a, 0F, 0F, 0F); /*
         Shape6c = new LODModelPart(this, 65, 7);
         Shape6c.addBox(0.5F, -9F, -0.5F, 1, 6, 1);
         Shape6c.setRotationPoint(0F, 17F, 0F);
         Shape6c.setTextureSize(128, 128);
         Shape6c.mirror = true;
         setRotation(Shape6c, 0F, -0.7853982F, 0.5235988F);
         Shape6f = new LODModelPart(this, 65, 0);
         Shape6f.addBox(3F, -7F, -0.5F, 1, 5, 1);
         Shape6f.setRotationPoint(0F, 17F, 0F);
         Shape6f.setTextureSize(128, 128);
         Shape6f.mirror = true;
         setRotation(Shape6f, 0F, 3.141593F, 0.5235988F);
         Shape6g = new LODModelPart(this, 65, 7);
         Shape6g.addBox(0.5F, -9F, -0.5F, 1, 6, 1);
         Shape6g.setRotationPoint(0F, 17F, 0F);
         Shape6g.setTextureSize(128, 128);
         Shape6g.mirror = true;
         setRotation(Shape6g, 0F, 0.7853982F, 0.5235988F);
         Shape6h = new LODModelPart(this, 65, 7);
         Shape6h.addBox(0.5F, -9F, -0.5F, 1, 6, 1);
         Shape6h.setRotationPoint(0F, 17F, 0F);
         Shape6h.setTextureSize(128, 128);
         Shape6h.mirror = true;
         setRotation(Shape6h, 0F, -2.356194F, 0.5235988F);
         Shape6i = new LODModelPart(this, 65, 7);
         Shape6i.addBox(0.5F, -9F, -0.5F, 1, 6, 1);
         Shape6i.setRotationPoint(0F, 17F, 0F);
         Shape6i.setTextureSize(128, 128);
         Shape6i.mirror = true;
         setRotation(Shape6i, 0F, 2.356194F, 0.5235988F);
         Shape6f2 = new LODModelPart(this, 65, 0);
         Shape6f2.addBox(3F, -7F, -0.5F, 1, 5, 1);
         Shape6f2.setRotationPoint(0F, 17F, 0F);
         Shape6f2.setTextureSize(128, 128);
         Shape6f2.mirror = true;
         setRotation(Shape6f2, 0F, 0F, 0.5235988F);
         Shape6f3 = new LODModelPart(this, 65, 0);
         Shape6f3.addBox(3F, -7F, -0.5F, 1, 5, 1);
         Shape6f3.setRotationPoint(0F, 17F, 0F);
         Shape6f3.setTextureSize(128, 128);
         Shape6f3.mirror = true;
         setRotation(Shape6f3, 0F, 1.570796F, 0.5235988F);
         Shape6ff = new LODModelPart(this, 65, 0);
         Shape6ff.addBox(3F, -7F, -0.5F, 1, 5, 1);
         Shape6ff.setRotationPoint(0F, 17F, 0F);
         Shape6ff.setTextureSize(128, 128);
         Shape6ff.mirror = true;
         setRotation(Shape6ff, 0F, -1.570796F, 0.5235988F);*/
        Shape2a2 = new LODModelPart(this, 0, 19);
        Shape2a2.addBox(-5F, 0F, -5F, 10, 5, 10);
        Shape2a2.setRotationPoint(0F, 17F, 0F);
        Shape2a2.setTextureSize(128, 128);
        Shape2a2.mirror = true;
        this.setRotation(Shape2a2, 0F, 0F, 0F);
        Shape2a3 = new LODModelPart(this, 0, 62);
        Shape2a3.addBox(-5F, 0F, -5F, 12, 1, 12);
        Shape2a3.setRotationPoint(-1F, 18F, -1F);
        Shape2a3.setTextureSize(128, 128);
        Shape2a3.mirror = true;
        this.setRotation(Shape2a3, 0F, 0F, 0F);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList li) {
        Shape1.render(te, f5);
        Shape2a.render(te, f5);
        Shape3a.render(te, f5);
        Shape4e.render(te, f5);
        Shape5a.render(te, f5);
        /*
        Shape6c.render(te, f5);
        Shape6f.render(te, f5);
        Shape6g.render(te, f5);
        Shape6h.render(te, f5);
        Shape6i.render(te, f5);
        Shape6f2.render(te, f5);
        Shape6f3.render(te, f5);
        Shape6ff.render(te, f5);
         */

        Shape2a2.render(te, f5);
        Shape2a3.render(te, f5);
    }
}
