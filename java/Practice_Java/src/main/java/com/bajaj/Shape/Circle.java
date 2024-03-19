package com.bajaj.Shape;

import com.bajaj.Shape.Shape;

public class Circle extends Shape {
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("area of circle: " +area());
    }
}
