package com.andy.db;

import com.andy.model.Car;

import java.sql.*;

public class DBControl {

    /////////////////////Multy Threating !!! Pool

    public static void create(Car car) {

        try {
            Connection connection = ConnectorDB.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO car (id, brand, color, model) VALUES (?,?,?,?)");
            statement.setInt(1, car.getId());
            statement.setString(2, car.getBrand());
            statement.setString(3, car.getColor());
            statement.setString(4, car.getModel());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error creating" + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Car read(int id) {
        Car car = new Car();
        try {
            System.out.println("1");
            Connection connection = ConnectorDB.getConnection();
            System.out.println("here11111");

            Statement statement = connection.createStatement();
            System.out.println("here3");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car WHERE car.id = " + id);
            System.out.println("here4");

            if (resultSet != null) {
                while (resultSet.next()) {
                    car.setId(resultSet.getInt(1));
                    car.setBrand(resultSet.getString(2));
                    car.setColor(resultSet.getString(3));
                    car.setModel(resultSet.getString(4));
                }
            } else System.out.println("Error reading, emptyRs");

        } catch (SQLException e) {
            System.out.println("Error reading" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error reading" + e.getMessage());
        }
        return car;
    }

    public static void update(Car car) {
        try {
            Connection connection = ConnectorDB.getConnection();
            PreparedStatement statement = connection.prepareStatement("UPDATE car SET brand = ?, color = ?, model = ? WHERE id = ?");
            statement.setString(1, car.getBrand());
            statement.setString(2, car.getColor());
            statement.setString(3, car.getModel());
            statement.setInt(4, car.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error updating" + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {

        try {
            Connection connection = ConnectorDB.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM car WHERE car.id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error deleting" + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean check(int id) {
        try {
            boolean b;
            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();

            if (statement.executeQuery("SELECT car.id FROM car WHERE car.id = " + id).first()) {
                return b = true;
            } else
                return b = false;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
