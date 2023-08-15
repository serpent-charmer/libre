// Date: 12/08/2021 3:24:16 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.Satisforestry.Render;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.DragonAPI.Libraries.Rendering.ReikaColorAPI;
import Reika.Satisforestry.Blocks.BlockPowerSlug.TilePowerSlugInert;
import net.minecraft.client.model.ModelBase;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class ModelPowerSlug extends ModelBase {
    //fields
    LODModelPart skirtTip;
    LODModelPart mainBody;
    LODModelPart neck;
    LODModelPart skirtWide;
    LODModelPart tailEnd;
    LODModelPart ridgeF;
    LODModelPart skirtRear;
    LODModelPart tailRoot;
    LODModelPart frontBump;
    LODModelPart skirtMain;
    LODModelPart bumpR4;
    LODModelPart bumpR2;
    LODModelPart bumpR3;
    LODModelPart bumpR1;
    LODModelPart bumpRS4;
    LODModelPart bumpL2;
    LODModelPart bumpL3;
    LODModelPart bumpL4;
    LODModelPart bumpL1;
    LODModelPart bumpRS2;
    LODModelPart bumpRS3;
    LODModelPart bumpRS1;
    LODModelPart bumpLS4;
    LODModelPart ridgeRR;
    LODModelPart bumpLS2;
    LODModelPart bumpLS1;
    LODModelPart bumpLS3;
    LODModelPart ridgeRL;
    LODModelPart wideBody;
    LODModelPart antennaR;
    LODModelPart antennaL;
    LODModelPart head;
    LODModelPart tailCtr;
    LODModelPart bodyFront;

    public ModelPowerSlug() {
        textureWidth = 64;
        textureHeight = 32;

        skirtTip = new LODModelPart(this, 0, 0);
        skirtTip.addBox(0F, 0F, 0F, 4, 1, 1);
        skirtTip.setRotationPoint(-2F, 23F, 7F);
        skirtTip.setTextureSize(64, 32);
        skirtTip.mirror = true;
        this.setRotation(skirtTip, 0F, 0F, 0F);
        mainBody = new LODModelPart(this, 36, 14);
        mainBody.addBox(0F, 0F, 0F, 5, 4, 9);
        mainBody.setRotationPoint(-2.5F, 19.5F, -5.3F);
        mainBody.setTextureSize(64, 32);
        mainBody.mirror = true;
        this.setRotation(mainBody, 0F, 0F, 0F);
        neck = new LODModelPart(this, 0, 0);
        neck.addBox(0F, 0F, 0F, 4, 3, 1);
        neck.setRotationPoint(-2F, 20.5F, -7F);
        neck.setTextureSize(64, 32);
        neck.mirror = true;
        this.setRotation(neck, 0F, 0F, 0F);
        skirtWide = new LODModelPart(this, 0, 0);
        skirtWide.addBox(0F, 0F, 0F, 8, 1, 9);
        skirtWide.setRotationPoint(-4F, 23.2F, -5F);
        skirtWide.setTextureSize(64, 32);
        skirtWide.mirror = true;
        this.setRotation(skirtWide, 0F, 0F, 0F);
        tailEnd = new LODModelPart(this, 21, 26);
        tailEnd.addBox(0F, -0.3F, 0.2F, 3, 1, 3);
        tailEnd.setRotationPoint(-1.5F, 21.8F, 4.5F);
        tailEnd.setTextureSize(64, 32);
        tailEnd.mirror = true;
        this.setRotation(tailEnd, -0.2617994F, 0F, 0F);
        ridgeF = new LODModelPart(this, 0, 19);
        ridgeF.addBox(0F, 0F, 0F, 7, 1, 3);
        ridgeF.setRotationPoint(-3.5F, 21F, -3.5F);
        ridgeF.setTextureSize(64, 32);
        ridgeF.mirror = true;
        this.setRotation(ridgeF, 0F, 0F, 0F);
        skirtRear = new LODModelPart(this, 0, 0);
        skirtRear.addBox(0F, 0F, 0F, 6, 1, 2);
        skirtRear.setRotationPoint(-3F, 23F, 5F);
        skirtRear.setTextureSize(64, 32);
        skirtRear.mirror = true;
        this.setRotation(skirtRear, 0F, 0F, 0F);
        tailRoot = new LODModelPart(this, 21, 14);
        tailRoot.addBox(0F, 0F, 0F, 4, 3, 3);
        tailRoot.setRotationPoint(-2F, 20F, 2F);
        tailRoot.setTextureSize(64, 32);
        tailRoot.mirror = true;
        this.setRotation(tailRoot, -0.1396263F, 0F, 0F);
        frontBump = new LODModelPart(this, 0, 0);
        frontBump.addBox(0F, 0F, 0F, 7, 1, 2);
        frontBump.setRotationPoint(-3.5F, 22F, -6F);
        frontBump.setTextureSize(64, 32);
        frontBump.mirror = true;
        this.setRotation(frontBump, 0F, 0F, 0F);
        skirtMain = new LODModelPart(this, 12, 0);
        skirtMain.addBox(0F, 0F, 0F, 7, 1, 12);
        skirtMain.setRotationPoint(-3.5F, 23F, -6.5F);
        skirtMain.setTextureSize(64, 32);
        skirtMain.mirror = true;
        this.setRotation(skirtMain, 0F, 0F, 0F);
        bumpR4 = new LODModelPart(this, 0, 25);
        bumpR4.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpR4.setRotationPoint(-2F, 18.5F, 4F);
        bumpR4.setTextureSize(64, 32);
        bumpR4.mirror = true;
        this.setRotation(bumpR4, -0.7853982F, 0F, 0F);
        bumpR2 = new LODModelPart(this, 0, 25);
        bumpR2.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpR2.setRotationPoint(-2F, 17.5F, -1.5F);
        bumpR2.setTextureSize(64, 32);
        bumpR2.mirror = true;
        this.setRotation(bumpR2, -0.2617994F, 0F, 0F);
        bumpR3 = new LODModelPart(this, 0, 25);
        bumpR3.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpR3.setRotationPoint(-2F, 17.5F, 1F);
        bumpR3.setTextureSize(64, 32);
        bumpR3.mirror = true;
        this.setRotation(bumpR3, -0.5235988F, 0F, 0F);
        bumpR1 = new LODModelPart(this, 0, 25);
        bumpR1.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpR1.setRotationPoint(-2F, 17.5F, -4F);
        bumpR1.setTextureSize(64, 32);
        bumpR1.mirror = true;
        this.setRotation(bumpR1, 0F, 0F, 0F);
        bumpRS4 = new LODModelPart(this, 5, 29);
        bumpRS4.addBox(-1F, 0F, 0F, 1, 1, 1);
        bumpRS4.setRotationPoint(-2F, 21.5F, 4.5F);
        bumpRS4.setTextureSize(64, 32);
        bumpRS4.mirror = true;
        this.setRotation(bumpRS4, 0F, 0.7853982F, 0F);
        bumpL2 = new LODModelPart(this, 0, 25);
        bumpL2.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpL2.setRotationPoint(1F, 17.5F, -1.5F);
        bumpL2.setTextureSize(64, 32);
        bumpL2.mirror = true;
        this.setRotation(bumpL2, -0.2617994F, 0F, 0F);
        bumpL3 = new LODModelPart(this, 0, 25);
        bumpL3.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpL3.setRotationPoint(1F, 17.5F, 1F);
        bumpL3.setTextureSize(64, 32);
        bumpL3.mirror = true;
        this.setRotation(bumpL3, -0.5235988F, 0F, 0F);
        bumpL4 = new LODModelPart(this, 0, 25);
        bumpL4.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpL4.setRotationPoint(1F, 18.5F, 4F);
        bumpL4.setTextureSize(64, 32);
        bumpL4.mirror = true;
        this.setRotation(bumpL4, -0.7853982F, 0F, 0F);
        bumpL1 = new LODModelPart(this, 0, 25);
        bumpL1.addBox(0F, 0F, 0F, 1, 2, 1);
        bumpL1.setRotationPoint(1F, 17.5F, -4F);
        bumpL1.setTextureSize(64, 32);
        bumpL1.mirror = true;
        this.setRotation(bumpL1, 0F, 0F, 0F);
        bumpRS2 = new LODModelPart(this, 0, 29);
        bumpRS2.addBox(-1F, 0F, 0F, 1, 1, 1);
        bumpRS2.setRotationPoint(-3F, 19.5F, -1F);
        bumpRS2.setTextureSize(64, 32);
        bumpRS2.mirror = true;
        this.setRotation(bumpRS2, 0F, 0.2617994F, 0F);
        bumpRS3 = new LODModelPart(this, 0, 29);
        bumpRS3.addBox(-1F, 0F, 0F, 1, 1, 1);
        bumpRS3.setRotationPoint(-2.5F, 20F, 2F);
        bumpRS3.setTextureSize(64, 32);
        bumpRS3.mirror = true;
        this.setRotation(bumpRS3, 0F, 0.5235988F, 0F);
        bumpRS1 = new LODModelPart(this, 0, 29);
        bumpRS1.addBox(-1F, 0F, 0F, 1, 1, 1);
        bumpRS1.setRotationPoint(-3F, 19.5F, -4F);
        bumpRS1.setTextureSize(64, 32);
        bumpRS1.mirror = true;
        this.setRotation(bumpRS1, 0F, 0.2617994F, 0F);
        bumpLS4 = new LODModelPart(this, 5, 29);
        bumpLS4.addBox(0F, 0F, 0F, 1, 1, 1);
        bumpLS4.setRotationPoint(2F, 21.5F, 4.5F);
        bumpLS4.setTextureSize(64, 32);
        bumpLS4.mirror = true;
        this.setRotation(bumpLS4, 0F, -0.7853982F, 0F);
        ridgeRR = new LODModelPart(this, 10, 27);
        ridgeRR.addBox(-1F, 0F, 0F, 1, 1, 3);
        ridgeRR.setRotationPoint(-3F, 21.5F, 0F);
        ridgeRR.setTextureSize(64, 32);
        ridgeRR.mirror = true;
        this.setRotation(ridgeRR, 0F, 0.2617994F, 0F);
        bumpLS2 = new LODModelPart(this, 0, 29);
        bumpLS2.addBox(0F, 0F, 0F, 1, 1, 1);
        bumpLS2.setRotationPoint(3F, 19.5F, -1F);
        bumpLS2.setTextureSize(64, 32);
        bumpLS2.mirror = true;
        this.setRotation(bumpLS2, 0F, -0.2617994F, 0F);
        bumpLS1 = new LODModelPart(this, 0, 29);
        bumpLS1.addBox(0F, 0F, 0F, 1, 1, 1);
        bumpLS1.setRotationPoint(3F, 19.5F, -4F);
        bumpLS1.setTextureSize(64, 32);
        bumpLS1.mirror = true;
        this.setRotation(bumpLS1, 0F, -0.2617994F, 0F);
        bumpLS3 = new LODModelPart(this, 0, 29);
        bumpLS3.addBox(0F, 0F, 0F, 1, 1, 1);
        bumpLS3.setRotationPoint(2.5F, 20F, 2F);
        bumpLS3.setTextureSize(64, 32);
        bumpLS3.mirror = true;
        this.setRotation(bumpLS3, 0F, -0.5235988F, 0F);
        ridgeRL = new LODModelPart(this, 10, 27);
        ridgeRL.addBox(0F, 0F, 0F, 1, 1, 3);
        ridgeRL.setRotationPoint(3F, 21.5F, 0F);
        ridgeRL.setTextureSize(64, 32);
        ridgeRL.mirror = true;
        this.setRotation(ridgeRL, 0F, -0.2617994F, 0F);
        wideBody = new LODModelPart(this, 39, 0);
        wideBody.addBox(0F, 0F, 0F, 6, 4, 6);
        wideBody.setRotationPoint(-3F, 19F, -4.5F);
        wideBody.setTextureSize(64, 32);
        wideBody.mirror = true;
        this.setRotation(wideBody, 0F, 0F, 0F);
        antennaR = new LODModelPart(this, 5, 24);
        antennaR.addBox(-1F, 0.5F, 0F, 1, 3, 1);
        antennaR.setRotationPoint(-4F, 19.5F, -7.8F);
        antennaR.setTextureSize(64, 32);
        antennaR.mirror = true;
        this.setRotation(antennaR, 0F, 0F, -1.047198F);
        antennaL = new LODModelPart(this, 5, 24);
        antennaL.addBox(0F, 0.5F, 0F, 1, 3, 1);
        antennaL.setRotationPoint(4F, 19.5F, -7.8F);
        antennaL.setTextureSize(64, 32);
        antennaL.mirror = true;
        this.setRotation(antennaL, 0F, 0F, 1.047198F);
        head = new LODModelPart(this, 0, 0);
        head.addBox(0F, 0F, 0F, 3, 2, 2);
        head.setRotationPoint(-1.5F, 21F, -8F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        this.setRotation(head, 0F, 0F, 0F);
        tailCtr = new LODModelPart(this, 21, 21);
        tailCtr.addBox(0F, -0.3F, 0.2F, 3, 2, 2);
        tailCtr.setRotationPoint(-1.5F, 21F, 4.5F);
        tailCtr.setTextureSize(64, 32);
        tailCtr.mirror = true;
        this.setRotation(tailCtr, -0.2617994F, 0F, 0F);
        bodyFront = new LODModelPart(this, 0, 0);
        bodyFront.addBox(0F, 0F, 0F, 4, 3, 5);
        bodyFront.setRotationPoint(-2F, 20F, -6F);
        bodyFront.setTextureSize(64, 32);
        bodyFront.mirror = true;
        this.setRotation(bodyFront, 0F, 0F, 0F);

        mainBody.setRenderDistanceScalar(100);
        bodyFront.setRenderDistanceScalar(100);
        tailCtr.setRenderDistanceScalar(100);
        skirtMain.setRenderDistanceScalar(100);
    }

    private void setRotation(LODModelPart model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void renderAll(TileEntity te) {
        float f5 = 0.0625F;
        mainBody.render(te, f5);
        neck.render(te, f5);
        tailEnd.render(te, f5);
        ridgeF.render(te, f5);
        tailRoot.render(te, f5);
        wideBody.render(te, f5);
        antennaR.render(te, f5);
        antennaL.render(te, f5);
        head.render(te, f5);
        tailCtr.render(te, f5);
        bodyFront.render(te, f5);

        if (te instanceof TilePowerSlugInert) {
            int c = 0x4CFF6D;
            GL11.glColor4f(
                ReikaColorAPI.getRed(c) / 255F,
                ReikaColorAPI.getGreen(c) / 255F,
                ReikaColorAPI.getBlue(c) / 255F,
                0.9F
            );
        }

        skirtTip.render(te, f5);
        skirtWide.render(te, f5);
        skirtMain.render(te, f5);
        skirtRear.render(te, f5);

        frontBump.render(te, f5);
        bumpR4.render(te, f5);
        bumpR2.render(te, f5);
        bumpR3.render(te, f5);
        bumpR1.render(te, f5);
        bumpRS4.render(te, f5);
        bumpL2.render(te, f5);
        bumpL3.render(te, f5);
        bumpL4.render(te, f5);
        bumpL1.render(te, f5);
        bumpRS2.render(te, f5);
        bumpRS3.render(te, f5);
        bumpRS1.render(te, f5);
        bumpLS4.render(te, f5);
        bumpLS2.render(te, f5);
        bumpLS1.render(te, f5);
        bumpLS3.render(te, f5);

        ridgeRR.render(te, f5);
        ridgeRL.render(te, f5);
    }
}
