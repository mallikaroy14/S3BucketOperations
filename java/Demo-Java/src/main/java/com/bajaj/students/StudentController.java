package com.bajaj.students;

import com.bajaj.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentController implements Controller {

    Scanner scanner = new Scanner(System.in);
    Students student;
    StudentGateway studentGateway;

    public StudentController(StudentGateway studentGateway) {
        this.studentGateway = studentGateway;
    }

    @Override
    public void create() throws SQLException {
        String name = scanner.next();
        int age = scanner.nextInt();
        String city = scanner.next();
        int rollNo = scanner.nextInt();
        String subject = scanner.next();

        student = new Students(name, age, city, rollNo, subject);
        studentGateway.create(student);
    }

    public void getAll() {
        ArrayList<Students> students = studentGateway.get();
        this.display(students);
    }


    @Override
    public void display(ArrayList<Students> students) {

        AtomicInteger counter = new AtomicInteger(1);
        students.forEach(student -> {
            System.out.println(counter + " name: " + student.getName() + " rollNo: " + student.getRollNo() + " city: " +
                    student.getCity()+ " Age: " + student.getAge());
            counter.getAndIncrement();
        });
    }

    public void delete() {
        ArrayList<Students> students = studentGateway.get();
        this.display(students);

        System.out.println("choose serial no to delete");
        int sro = scanner.nextInt();

        Students student = students.get(sro - 1);
        if (studentGateway.delete(student.getId()) == 1) {
            System.out.println("Student deleted");
        } else {
            System.out.println("Their is some problem");
        }
    }

    public void SortByAge() {
        ArrayList<Students> students = studentGateway.get();
        this.display(students);

        studentGateway.sortByAge();
        System.out.println("Student Sorted");
    }

    public void SearchByName(){
        ArrayList<Students> students = studentGateway.get();
        this.display(students);
        System.out.println("Enter Name you want to search");
        String name = scanner.next();
        studentGateway.search(name);
    }

    public void update() {
        ArrayList<Students> students = studentGateway.get();
        this.display(students);

        System.out.println("choose serial no to Update");
        int sro = scanner.nextInt();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        Students student = students.get(sro - 1);
        studentGateway.update(student.getId(), student, age);
        System.out.println("Student Updated");
    }

}
