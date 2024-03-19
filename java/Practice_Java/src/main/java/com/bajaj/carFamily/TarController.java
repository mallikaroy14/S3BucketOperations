package com.bajaj.carFamily;

import java.util.Scanner;

public class TarController {

    TarGateway tarGateway;
    public TarController(TarGateway tarGateway){
        this.tarGateway = tarGateway;
    }

    public void create(){
        System.out.println("Enter CAR make, model, year");
        Scanner scanner = new Scanner(System.in);
        String make = scanner.next();
        String model = scanner.next();
        int year = scanner.nextInt();
        Car car = new Car(make, model, year);
        tarGateway.create(car);
    }

    public void sortByYear(){
        tarGateway.sortByYear();
    }
}
