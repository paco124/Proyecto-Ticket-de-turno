package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDataBase {
    private static Connection conn = null;
    
    private ConnectionDataBase() {
        String url ="jdbc:mysql://localhost:3306/arquitectura_software";
        String driver ="com.mysql.cj.jdbc.Driver";
        String usuario ="curriculum";
        String password="_0trgKfgrWjMgB5p";
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,usuario,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        if(conn==null){
            new ConnectionDataBase();
        }
        return conn;
    }
}
