package com.bajaj;


import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);
   private String name;
   private int age;
    private String city;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName(){
       return name;
   }

   public void setName( String name){
       this.name = name;
   }

//    public void printDetails() {
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(city);
//    }

//    public void getDetails() {
//        User user1 = new User();
//        user1.name = scanner.next();
//        user1.age = scanner.nextInt();
//        user1.city = scanner.next();
//    }
}


