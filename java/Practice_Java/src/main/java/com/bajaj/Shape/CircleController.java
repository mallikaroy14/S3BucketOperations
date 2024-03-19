package com.bajaj.Shape;

import com.bajaj.Controller;

import java.util.Scanner;

public class CircleController implements Controller {

    Circle circle;
    double radius;

    @Override
    public void area() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        radius = scanner.nextDouble();
        double area = 2*radius*3.14;
        System.out.println("Area of circle :" + area);
    }

    @Override
    public void displayInfo() {

    }
}
