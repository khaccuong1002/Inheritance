package com.codegym;

import org.testng.annotations.Test;

public class Circle {
    private double radius;
    private String color;
    private double area;

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
        return radius * radius * Math.PI;
    }

    @Test
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
