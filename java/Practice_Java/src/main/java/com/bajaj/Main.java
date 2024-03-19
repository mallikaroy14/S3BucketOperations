package com.bajaj;

import com.bajaj.carFamily.DBConnection;
import com.bajaj.carFamily.TarController;
import com.bajaj.carFamily.TarGateway;

import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.setMake("TATA");
//        car.setModel("Model 1");
//        car.setYear(2024);
//        car.display();

//        Rectangular rectangular = new Rectangular();
//        Circle circle = new Circle();
//
//        rectangular.setHeight(4);
//        rectangular.setLength(2);
//        rectangular.displayInfo();
//
//        circle.setRadius(4);
//        circle.displayInfo();


//        RectangleController rectangleController = new RectangleController();
//        rectangleController.area();
//
//        CircleController circleController = new CircleController();
//        circleController.area();

//        Calculator calculator = new Calculator();
//        calculator.sum();
//        calculator.average();

        DBConnection dbConnection = new DBConnection();
        TarGateway tarGateway = new TarGateway(dbConnection);
        TarController tarController = new TarController(tarGateway);
//        tarController.create();

        tarController.sortByYear();


    }
}