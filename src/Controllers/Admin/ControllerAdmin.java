package Controllers.Admin;

import Connection.ConnectionDataBase;
import Models.Admin.MAgendarAdmin;
import Models.Admin.getGrafica;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControllerAdmin {

    public void InsertCita(MAgendarAdmin agendar) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "INSERT INTO CITAS ( CURP, NOMBRE, PATERNO, MATERNO, TELEFONO, NIVEL, MUNICIPIO, ASUNTO,STATUS) VALUES"
                    + " ( ?, ?, ?, ?, ?, ?, ?, ?,'PENDIENTE');";
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateCita(MAgendarAdmin agendar) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "UPDATE CITAS SET CURP = ?, NOMBRE = ?, PATERNO = ?,"
                    + "MATERNO = ?, TELEFONO = ?, NIVEL = ?, MUNICIPIO =? "
                    + "ASUNTO = ?, ,STATUS =? WHERE CURP = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, agendar.getCurp());
            preparedStatement.setString(2, agendar.getNombre());
            preparedStatement.setString(3, agendar.getPaterno());
            preparedStatement.setString(4, agendar.getMaterno());
            preparedStatement.setInt(5, agendar.getTelefono());
            preparedStatement.setInt(6, agendar.getNivel());
            preparedStatement.setString(7, agendar.getMunicipio());
            preparedStatement.setString(8, agendar.getAsunto());
            preparedStatement.setString(9, agendar.getStatus());
            preparedStatement.execute();
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet SelectAllCitas() {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "SELECT ID, CURP, NOMBRE, PATERNO, MATERNO, TELEFONO,"
                    + " NIVEL, MUNICIPIO, ASUNTO, STATUS FROM citas";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    public List<getGrafica> GetGrafica() {
        List<getGrafica> graficaList = new ArrayList<>();
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "SELECT DISTINCT(MUNICIPIO), COUNT(*) AS CONTEO from citas";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String municipio = resultSet.getString("MUNICIPIO");
                int conteo = resultSet.getInt("CONTEO");

                getGrafica grafica = new getGrafica(municipio, conteo);
                graficaList.add(grafica);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return graficaList;
    }
    
    public void UpdateStatusCita(String status,String curp) {
        try {
            Connection conexion = ConnectionDataBase.getConnection();
            String sql = "UPDATE CITAS SET status = ? WHERE CURP = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, curp);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
