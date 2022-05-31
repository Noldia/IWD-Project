package Utils;
/**
 *
 * @author ivar29
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectDB {

    public static Connection getConnect(){
        Connection con = null;
        String url = "jdbc:mysql://localhost/cimetrix?user=root&password=";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url);
            System.out.println("Conexion satisfactoria!");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro driver");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro al conectar la base de datos");
        }
        
        return con;
    }
    
    public static void main(String[] args) {
        getConnect();
    }
    
}
