package dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conection {
    
    Statement stmt;
    Connection conect;
    
    String db = "productosdb";
    String user = "gottig";
    String pass = "stegmann";
    String url = "jdbc:mysql://localhost:3306/";
    String driver = "com.mysql.cj.jdbc.Driver";

    public Conection() {
    }

    public Conection(Connection conect) {
        this.conect = conect;
    }
    
    
    public Connection conectar(){
        
        try{
            //Conexion
            conect = DriverManager.getConnection(url+db, user, pass);
            System.out.println("Conectado a " + db);
            System.out.println("");
        }
        catch(SQLException e){
            System.out.println("Falló la conexión a " + db);
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, e);
        }        
        return conect;
    }
    
    public void desconectar(Connection conect){
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
