package com.codegym;

import org.testng.annotations.Test;

public class Cylinder extends Circle {
    private double radius;
    private String color;
    private double area;
    private double height;

    @Test
    public double getRadius() {
        return radius;
    }

    @Test
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Test
    public String getColor() {
        return color;
    }

    @Test
    public void setColor(String color) {
        this.color = color;
    }

    @Test
    public double getArea() {
        return radius * radius * height * Math.PI;
    }

    @Test
    public void setArea(double area) {
        this.area = area;
    }

    @Test
    public double getHeight() {
        return height;
    }

    @Test
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                ", height=" + height +
                '}';
    }
}
