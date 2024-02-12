package com.bajaj.deleted;

import com.bajaj.deleted.Person;

import java.util.Scanner;

public class PersonController {
    Person person;  // reference of person
    Scanner scanner = new Scanner(System.in);

    public void createPerson(){
        System.out.println("Enter name, age, city");
        String name = scanner.next();
        int age = scanner.nextInt();
        String city = scanner.next();

        person = new Person(name, age, city);
    }

    public void displayPerson(){
        System.out.println(person);
    }

}
