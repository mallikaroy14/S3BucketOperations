package com.bajaj;

import java.util.ArrayList;

public class ArrayCollection {

    ArrayList<Integer> numbers = new ArrayList<>();

    public void sum() {

        numbers.add(12);
        numbers.add(32);
        numbers.add(32);
        numbers.add(65);
        numbers.add(15);
        numbers.add(12);
        int sumOfNum = 0;

        for (int i = 0; i <= numbers.size() - 1; i++) {
            sumOfNum += numbers.get(i);
        }
        System.out.println("Sum of the numbers: " + sumOfNum);
    }

    public void average() {
        numbers.add(12);
        numbers.add(32);
        numbers.add(32);
        numbers.add(65);
        numbers.add(15);
        numbers.add(12);
        int sumOfNum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            sumOfNum += numbers.get(i);
        }

        int avg = sumOfNum / numbers.size();
        System.out.println("Average of the numbers " + avg);
    }

}
