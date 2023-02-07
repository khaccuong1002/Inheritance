package com.codegym;

import org.testng.annotations.Test;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arraySpeed = new float[2];
        arraySpeed[0] = this.xSpeed;
        arraySpeed[1] = this.ySpeed;
        return arraySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + xSpeed + ySpeed ;
    }

    @Test
    public MovablePoint move(){
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
