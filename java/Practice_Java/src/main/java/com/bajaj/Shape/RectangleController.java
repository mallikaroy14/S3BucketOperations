package com.bajaj.Shape;

import com.bajaj.Controller;

import java.util.Scanner;

public class RectangleController implements Controller {

    Rectangular rectangular;
    int length;
    int height;


    public void area() {
        System.out.println("Enter height and length");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        height = scanner.nextInt();
        rectangular = new Rectangular(length, height);
        double area = height * length;
        System.out.println("Area of rectangle : " + area);
    }

    public void displayInfo() {

    }
}
