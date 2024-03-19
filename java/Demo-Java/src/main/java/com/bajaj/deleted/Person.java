package com.bajaj.deleted;

public class Person {


    //Default Constructor
//    public Calculator()
//    {
//        System.out.println("running a constructor");
//    }

    private String name;
    private int age;
    private String city;

    //Constructor overloading
//    public Person(int a){
//        System.out.println("running a constructor with "+ a);
//    }

    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
