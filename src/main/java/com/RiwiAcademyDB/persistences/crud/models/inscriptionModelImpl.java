package com.RiwiAcademyDB.persistences.crud.models;

import com.RiwiAcademyDB.persistences.ConnectionDB;
import com.RiwiAcademyDB.persistences.crud.Entities.inscriptionsEntity;
import com.RiwiAcademyDB.persistences.crud.models.Interface.IInscriptionModel;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.SQLException;

public class inscriptionModelImpl implements IInscriptionModel {
    @Override
    public inscriptionsEntity edit(inscriptionsEntity request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "UPDATE courses SET student_id = ? WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, request.getId());
            preparedStatement.setString(2, request.getId_student());
            preparedStatement.setInt(3, request.getId_course());
            preparedStatement.execute();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public inscriptionsEntity create(inscriptionsEntity request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "INSERT INTO inscriptions (id, id_student, id_course) VALUES (?, ?, ?)";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, request.getId());
            preparedStatement.setString(2, request.getId_student());
            preparedStatement.setInt(3, request.getId_course());
            preparedStatement.execute();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(String request) {

        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "DELETE FROM inscriptions WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public inscriptionsEntity search(String request) {
        Connection connection = ConnectionDB.openConnection();
        String sqlQuery = "SELECT * FROM inscriptions WHERE id = ?";
        try {
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, request);
            preparedStatement.execute();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
