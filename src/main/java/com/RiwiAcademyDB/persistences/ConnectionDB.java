package com.RiwiAcademyDB.persistences;

import java.nio.channels.ConnectionPendingException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDB {

    private static Connection connection = null;
    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/RiwiAcademyDB";
        String user = "root";
        String password = "Rlwl2023.";
        try {
            connection = java.sql.DriverManager.getConnection(url, user, password);
            System.out.println("Successful connection");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if(connection != null) connection.close();
            System.out.println("Connection closed");

        } catch (ConnectionPendingException | SQLException e) {
            throw new RuntimeException(e);

        }
    }

}
