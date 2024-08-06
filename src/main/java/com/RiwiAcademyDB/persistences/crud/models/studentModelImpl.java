package com.RiwiAcademyDB.persistences.crud.models;

import com.RiwiAcademyDB.persistences.ConnectionDB;
import com.RiwiAcademyDB.persistences.crud.Entities.studentsEntity;
import com.RiwiAcademyDB.persistences.crud.models.Interface.IStudentModel;


import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class studentModelImpl implements IStudentModel {
    public studentsEntity edit(studentsEntity request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "UPDATE students SET name = ?, email = ?, password = ? WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request.getName());
            preparedStatement.setString(2, request.getEmail());
            preparedStatement.setString(3, request.getPassword());
            preparedStatement.setString(4, request.getId());
            preparedStatement.execute();
            return request;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public studentsEntity create(studentsEntity request) {
        Connection connection = ConnectionDB.openConnection();
        if(request.getActive() == true){

        String sqlQuery = "INSERT INTO students (name, email, password) VALUES (?, ?, ?)";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request.getName());
            preparedStatement.setString(2, request.getEmail());
            preparedStatement.setString(3, request.getPassword());
            preparedStatement.execute();
            return request;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }


        return null;
    }

    @Override
    public void delete(String request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "DELETE FROM students WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Entity search(String request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "SELECT * FROM students WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request);
            preparedStatement.execute();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Entity edit(Entity request) {
        return null;
    }

    @Override
    public Entity create(Entity request) {
        return null;
    }
}
