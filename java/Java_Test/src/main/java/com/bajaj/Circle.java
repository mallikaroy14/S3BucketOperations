package com.bajaj;

public class Circle implements Shape {
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    @Override
    public void area() {
        setRadius(2);
        System.out.println("Radius: "+ 2);
        System.out.println("Area of the Circle"+2 * 3.14 * radius * radius);
    }

    @Override
    public void displayInfo() {
        System.out.println("Information of the circle: radius:"+ getRadius());
    }
}
