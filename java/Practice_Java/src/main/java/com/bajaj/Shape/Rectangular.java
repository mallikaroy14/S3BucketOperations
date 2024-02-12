package com.bajaj.Shape;

public class Rectangular extends Shape {

    int length;
    int height;



    public Rectangular(int length, int height){
        this.height = height;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public double area(int length, int height) {
        return length * height;

    }


    public void displayInfo() {
        System.out.println("area of rectangle: " +area());
    }
}
