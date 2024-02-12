package com.bajaj;

public class Rectangule implements Shape {

    int length;
    int height;

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


    public void area() {
        setHeight(2);
        setLength(2);
        System.out.println("length : 2 and height: 2");
        System.out.println("area of the rectangle: " + length * height);

    }


    public void displayInfo() {
        System.out.println("area of rectangle: length: " +length +" height:  " + height  );
    }
}
