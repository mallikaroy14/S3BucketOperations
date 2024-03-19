package com.bajaj.students;

import com.bajaj.User;

import java.util.Scanner;

public class Students {

    private int id;
    private String name;
    private int age;
    private String city;
    private int rollNo;
    
    private String subject;

    public Students(){

    }

    public Students(int id, String name, int age, String city, int rollNo, String subject){
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.rollNo = rollNo;
        this.subject = subject;
    }

    public Students( String name, int age, String city, int rollNo, String subject){
        this.name = name;
        this.age = age;
        this.city = city;
        this.rollNo = rollNo;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //    public void getStudentDetails(){
//        System.out.println("Enter name, age, city, rollNo, subject");
//        getDetails();
//        rollNo = scanner.nextInt();
//        subject = scanner.next();
//
//    }

//    public void printDetails() {
//        System.out.println(name + " "+ age+ " "+ city+" "+ rollNo+ " "+ subject);
//    }


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", rollNo=" + rollNo +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
