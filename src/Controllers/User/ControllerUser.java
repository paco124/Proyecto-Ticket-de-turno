package Controllers.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.ConnectionDataBase;
import Models.Admin.getGrafica;
import Models.Login.GetCita;
import Models.User.MAgendar;
import Models.User.ModificarCita;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerUser {

    public void InsertCita(MAgendar agendar) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "INSERT INTO CITAS (CURP, NOMBRE, PATERNO, MATERNO, TELEFONO, NIVEL, MUNICIPIO, ASUNTO,STATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?,'PENDIENTE')";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, agendar.getCurp());
            preparedStatement.setString(2, agendar.getNombre());
            preparedStatement.setString(3, agendar.getPaterno());
            preparedStatement.setString(4, agendar.getMaterno());
            preparedStatement.setInt(5, agendar.getTelefono());
            preparedStatement.setInt(6, agendar.getNivel());
            preparedStatement.setString(7, agendar.getMunicipio());
            preparedStatement.setString(8, agendar.getAsunto());

            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Cita Agendada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateCita(ModificarCita agendar) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "UPDATE CITAS SET CURP = ?, NOMBRE = ?, PATERNO = ?,MATERNO = ?, TELEFONO = ?, NIVEL = ?, MUNICIPIO =?, ASUNTO = ? WHERE CURP = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, agendar.getCurp());
            preparedStatement.setString(2, agendar.getNombre());
            preparedStatement.setString(3, agendar.getPaterno());
            preparedStatement.setString(4, agendar.getMaterno());
            preparedStatement.setInt(5, agendar.getTelefono());
            preparedStatement.setInt(6, agendar.getNivel());
            preparedStatement.setString(7, agendar.getMunicipio());
            preparedStatement.setString(8, agendar.getAsunto());
            preparedStatement.setString(9, agendar.getCurp2());
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Cita Actualizada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteCita(String curp) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "DELETE FROM CITAS WHERE CURP = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, curp);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Cita Eliminada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<GetCita> SelectAllCitas(String curp) {
        List<GetCita> citaList = new ArrayList<>();
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "SELECT  CURP, NOMBRE, PATERNO, MATERNO, TELEFONO,"
                    + " NIVEL, MUNICIPIO, ASUNTO, STATUS FROM citas WHERE CURP = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, curp);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String curpr = resultSet.getString("CURP");
                String nombre = resultSet.getString("NOMBRE");
                String paterno = resultSet.getString("PATERNO");
                String materno = resultSet.getString("MATERNO");
                int telefono = resultSet.getInt("TELEFONO");
                int nivel = resultSet.getInt("NIVEL");
                String municipio = resultSet.getString("MUNICIPIO");
                String asunto = resultSet.getString("ASUNTO");
                String status = resultSet.getString("STATUS");

                GetCita cita = new GetCita(curpr, nombre, paterno, materno, telefono, nivel, municipio, asunto, status);
                citaList.add(cita);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return citaList;
    }

    public GetCita SelectCita(String curp) {
        GetCita cita = null;
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "SELECT CURP, NOMBRE, PATERNO, MATERNO, TELEFONO, NIVEL, MUNICIPIO, ASUNTO, STATUS FROM citas WHERE CURP = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, curp);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String curpr = resultSet.getString("CURP");
                String nombre = resultSet.getString("NOMBRE");
                String paterno = resultSet.getString("PATERNO");
                String materno = resultSet.getString("MATERNO");
                int telefono = resultSet.getInt("TELEFONO");
                int nivel = resultSet.getInt("NIVEL");
                String municipio = resultSet.getString("MUNICIPIO");
                String asunto = resultSet.getString("ASUNTO");
                String status = resultSet.getString("STATUS");

                cita = new GetCita(curpr, nombre, paterno, materno, telefono, nivel, municipio, asunto, status);
            } else {
                cita = null;
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return cita;
    }
}
