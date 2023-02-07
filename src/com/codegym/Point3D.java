package com.codegym;

import org.testng.annotations.Test;

public class Point3D extends Point2D {
    private float z = 0.0f;


    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Test
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    @Test
    public float[] getXYZ(){
        float[] arrayXYZ = new float[3];
        arrayXYZ[0] = super.getXY()[0];
        arrayXYZ[1] =super.getXY()[1];
        arrayXYZ[2] = this.z;
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + this.getXYZ()[0] + "," + this.getXYZ()[1] + "," + this.getXYZ()[2] +
                '}';
    }
}
