package Controllers.Login;

import Connection.ConnectionDataBase;
import Models.Login.ConsultarUser;
import Models.Login.GetUser;
import Models.Login.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller_Login {

    public void InsertUser(UserModel user) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "INSERT INTO users (USER_ID, USER_NAME, ID_ROL, PASS) VALUES "
                    + "(?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setInt(3, user.getRoleId());
            preparedStatement.setString(4, user.getPass());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateUser(UserModel user) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "UPDATE USERS SET USER_NAME = ?, ID_ROL = ?, PASS = ? WHERE USER_ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setInt(2, user.getRoleId());
            preparedStatement.setString(3, user.getPass());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteUser(int id) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "DELETE FROM USERS WHERE USER_ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet SelectAllUsers() {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "SELECT USER_ID, USER_NAME, ID_ROL FROM USERS";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public GetUser getUser(ConsultarUser userc) {
    try {
        Connection conexion = ConnectionDataBase.getConnection();
        String sql = "SELECT USER_NAME, ID_ROL FROM USERS WHERE USER_NAME = ? AND PASS = ?";
        PreparedStatement preparedStatement = conexion.prepareStatement(sql);
        preparedStatement.setString(1, userc.getUser());
        preparedStatement.setString(2, userc.getPass());
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String userName = resultSet.getString("USER_NAME");
            int roleId = resultSet.getInt("ID_ROL");
            GetUser user = new GetUser(userName, roleId);
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
           
            return user;
        }
        return null;
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}
}
