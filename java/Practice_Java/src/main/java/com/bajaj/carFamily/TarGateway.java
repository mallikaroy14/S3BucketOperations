package com.bajaj.carFamily;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TarGateway {

    private DBConnection dbConnection;

    public TarGateway(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public int create(Car car) {
        String query = "INSERT into tars(make, model,year)values(?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(query);
            preparedStatement.setString(1, car.getMake());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setInt(3, car.getYear());
            System.out.println("New car created");
            return preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void sortByYear() {
        String query = "Select * from tars ORDER by year";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = dbConnection.getConnection().prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String make = rs.getString("make");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                System.out.println(make + " " + model + " " + year + " ");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
