package com.bajaj.students;

import com.bajaj.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGateway {

    private DBConnection dbConnection;
    Scanner scanner = new Scanner(System.in);

    public StudentGateway(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public int create(Students students) {

        String query = "INSERT into students(name, age, city, rollno, subject)values(?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, students.getName());
            preparedStatement.setInt(2, students.getAge());
            preparedStatement.setString(3, students.getCity());
            preparedStatement.setInt(4, students.getRollNo());
            preparedStatement.setString(5, students.getSubject());

            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int delete(int id) {
        {
            PreparedStatement preparedStatement = null;
            String query = "delete from students where id = ?";
            try {
                preparedStatement = dbConnection.getConnection().prepareStatement(query);
                preparedStatement.setInt(1, id);
                return preparedStatement.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void sortByAge() {
        PreparedStatement preparedStatement = null;
        String query = "select * from students ORDER by age";
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String city = rs.getString("city");
                int age = rs.getInt("age");
                System.out.println(name + " " + city + " " + age + " ");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(int id, Students students, int age) {
        PreparedStatement preparedStatement = null;

        String query = "update students set age =? where id =?";
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(2, id);
            preparedStatement.setInt(1, age);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void search(String name) {
        PreparedStatement preparedStatement = null;
        String query = "select * from students WHERE name = ?";
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                name = rs.getString("name");
                String city = rs.getString("city");
                int age = rs.getInt("age");
                System.out.println(name + " " + city + " " + age + " ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Students> get() {
        String query = "SELECT * from students";

        ArrayList<Students> student = new ArrayList();

        try {
            PreparedStatement preparedStatement = dbConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    Students students = new Students();
                    students.setId(resultSet.getInt("id"));
                    students.setName(resultSet.getString("name"));
                    students.setAge(resultSet.getInt("age"));
                    students.setRollNo(resultSet.getInt("rollno"));
                    students.setCity(resultSet.getString("city"));
                    students.setSubject(resultSet.getString("subject"));
                    student.add(students);

                }
                return student;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
