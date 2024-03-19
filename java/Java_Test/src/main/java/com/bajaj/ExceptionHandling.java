package com.bajaj;

import java.util.Scanner;

public class ExceptionHandling {

    Scanner scanner = new Scanner(System.in);

    public void userInput() {
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        division(num1, num2);

    }

    public void division(int num1, int num2) {

        try {
            int result = num1 / num2;
            System.out.println("After divide Result : "+ result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

