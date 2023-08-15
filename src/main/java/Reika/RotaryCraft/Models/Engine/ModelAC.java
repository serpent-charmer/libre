/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 20/02/2013 8:05:58 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Engine;

import java.util.ArrayList;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class ModelAC extends RotaryModelBase {
    //fields
    LODModelPart Shape1;
    LODModelPart Shape12;
    LODModelPart Shape13;
    LODModelPart Shape14;
    LODModelPart Shape15;
    LODModelPart Shape16;
    LODModelPart Shape17;
    LODModelPart Shape18;
    LODModelPart Shape19;
    LODModelPart Shape20;
    LODModelPart Shape4;
    LODModelPart Shape5;
    LODModelPart Shape6;
    LODModelPart Shape7;
    LODModelPart Shape2;
    LODModelPart Shape3;

    public ModelAC() {
        textureWidth = 128;
        textureHeight = 128;

        Shape1 = new LODModelPart(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 16, 2, 16);
        Shape1.setRotationPoint(-8F, 22F, -8F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0F, 0F, 0F);
        Shape12 = new LODModelPart(this, 74, 52);
        Shape12.addBox(0F, 0F, 0F, 10, 2, 16);
        Shape12.setRotationPoint(-4.5F, 18F, -7.8F);
        Shape12.setTextureSize(128, 128);
        Shape12.mirror = true;
        this.setRotation(Shape12, 0.3926991F, 0F, 0F);
        Shape13 = new LODModelPart(this, 111, 0);
        Shape13.addBox(0F, 0F, 0F, 5, 2, 2);
        Shape13.setRotationPoint(-8.5F, 16F, -1.4F);
        Shape13.setTextureSize(128, 128);
        Shape13.mirror = true;
        this.setRotation(Shape13, 0.7853982F, 0F, 0F);
        Shape14 = new LODModelPart(this, 111, 0);
        Shape14.addBox(0F, 0F, 0F, 5, 2, 2);
        Shape14.setRotationPoint(-8.5F, 15F, -1F);
        Shape14.setTextureSize(128, 128);
        Shape14.mirror = true;
        this.setRotation(Shape14, 0F, 0F, 0F);
        Shape15 = new LODModelPart(this, 64, 0);
        Shape15.addBox(0F, 0F, 0F, 15, 10, 8);
        Shape15.setRotationPoint(-7F, 11F, -4F);
        Shape15.setTextureSize(128, 128);
        Shape15.mirror = true;
        this.setRotation(Shape15, 0F, 0F, 0F);
        Shape16 = new LODModelPart(this, 0, 18);
        Shape16.addBox(0F, 0F, 0F, 15, 8, 10);
        Shape16.setRotationPoint(-6.9F, 12F, -5F);
        Shape16.setTextureSize(128, 128);
        Shape16.mirror = true;
        this.setRotation(Shape16, 0F, 0F, 0F);
        Shape17 = new LODModelPart(this, 78, 37);
        Shape17.addBox(0F, 0F, 0F, 10, 2, 13);
        Shape17.setRotationPoint(-4.5F, 18.7F, -4.2F);
        Shape17.setTextureSize(128, 128);
        Shape17.mirror = true;
        this.setRotation(Shape17, 0.7853982F, 0F, 0F);
        Shape18 = new LODModelPart(this, 52, 22);
        Shape18.addBox(0F, 0F, 0F, 10, 2, 13);
        Shape18.setRotationPoint(-4.5F, 20.2F, -2.8F);
        Shape18.setTextureSize(128, 128);
        Shape18.mirror = true;
        this.setRotation(Shape18, 1.178097F, 0F, 0F);
        Shape19 = new LODModelPart(this, 64, 70);
        Shape19.addBox(0F, 0F, 0F, 10, 13, 2);
        Shape19.setRotationPoint(-4.5F, 8F, -1F);
        Shape19.setTextureSize(128, 128);
        Shape19.mirror = true;
        this.setRotation(Shape19, 0F, 0F, 0F);
        Shape20 = new LODModelPart(this, 0, 79);
        Shape20.addBox(0F, 0F, 0F, 10, 2, 16);
        Shape20.setRotationPoint(-4.5F, 12F, -7F);
        Shape20.setTextureSize(128, 128);
        Shape20.mirror = true;
        this.setRotation(Shape20, -0.3926991F, 0F, 0F);
        Shape4 = new LODModelPart(this, 0, 97);
        Shape4.addBox(0F, 0F, 0F, 10, 2, 13);
        Shape4.setRotationPoint(-4.5F, 9.7F, -5F);
        Shape4.setTextureSize(128, 128);
        Shape4.mirror = true;
        this.setRotation(Shape4, -0.7853982F, 0F, 0F);
        Shape5 = new LODModelPart(this, 0, 64);
        Shape5.addBox(0F, 0F, 0F, 10, 2, 13);
        Shape5.setRotationPoint(-4.5F, 8.3F, -2.2F);
        Shape5.setTextureSize(128, 128);
        Shape5.mirror = true;
        this.setRotation(Shape5, -1.178097F, 0F, 0F);
        Shape6 = new LODModelPart(this, 0, 37);
        Shape6.addBox(0F, 0F, 0F, 10, 2, 16);
        Shape6.setRotationPoint(-4.5F, 15F, -8F);
        Shape6.setTextureSize(128, 128);
        Shape6.mirror = true;
        this.setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new LODModelPart(this, 50, 18);
        Shape7.addBox(0F, 0F, 0F, 14, 2, 2);
        Shape7.setRotationPoint(-6.5F, 20.5F, 3F);
        Shape7.setTextureSize(128, 128);
        Shape7.mirror = true;
        this.setRotation(Shape7, 0F, 0F, 0F);
        Shape2 = new LODModelPart(this, 50, 18);
        Shape2.addBox(0F, 0F, 0F, 14, 2, 2);
        Shape2.setRotationPoint(-6.5F, 20.5F, -5F);
        Shape2.setTextureSize(128, 128);
        Shape2.mirror = true;
        this.setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new LODModelPart(this, 111, 4);
        Shape3.addBox(0F, 0F, 0F, 1, 4, 4);
        Shape3.setRotationPoint(-7.5F, 14F, -2F);
        Shape3.setTextureSize(128, 128);
        Shape3.mirror = true;
        this.setRotation(Shape3, 0F, 0F, 0F);
    }

    @Override
    public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
        Shape1.render(te, f5);
        Shape2.render(te, f5);
        Shape3.render(te, f5);
        Shape4.render(te, f5);
        Shape5.render(te, f5);
        Shape6.render(te, f5);
        Shape7.render(te, f5);
        Shape12.render(te, f5);

        GL11.glTranslated(0, 1, 0);
        GL11.glRotatef(phi, 1, 0, 0);
        GL11.glTranslated(0, -1, 0);
        Shape13.render(te, f5);
        Shape14.render(te, f5);
        GL11.glTranslated(0, 1, 0);
        GL11.glRotatef(-phi, 1, 0, 0);
        GL11.glTranslated(0, -1, 0);

        Shape15.render(te, f5);
        Shape16.render(te, f5);
        Shape17.render(te, f5);
        Shape18.render(te, f5);
        Shape19.render(te, f5);
        Shape20.render(te, f5);
    }
}
