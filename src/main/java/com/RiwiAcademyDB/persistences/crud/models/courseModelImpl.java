package com.RiwiAcademyDB.persistences.crud.models;

import com.RiwiAcademyDB.persistences.ConnectionDB;
import com.RiwiAcademyDB.persistences.crud.Entities.coursesEntity;
import com.RiwiAcademyDB.persistences.crud.models.Interface.ICourseModel;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.SQLException;

public class courseModelImpl implements ICourseModel {

    @Override
    public coursesEntity edit(coursesEntity request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "UPDATE courses SET name = ?, description = ?, duration = ? WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, request.getId());
            preparedStatement.setString(2, request.getTitle());
            preparedStatement.execute();
            return request;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public coursesEntity create(coursesEntity request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "INSERT INTO courses (name, description, duration) VALUES (?, ?, ?)";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request.getTitle());
            preparedStatement.setInt(2, request.getId());

            preparedStatement.execute();
            return request;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void delete(String request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "DELETE FROM courses WHERE id = ?";
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
        String sqlQuery = "SELECT * FROM courses WHERE id = ?";
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
