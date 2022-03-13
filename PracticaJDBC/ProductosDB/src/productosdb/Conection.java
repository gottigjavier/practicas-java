
package productosdb;

//import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author gottig
 */
public class Conection {
    
    String db = "productosdb";
    String user = "gottig";
    String pass = "stegmann";
    String url = "jdbc:mysql://localhost:3306/";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection conect;

    public Conection() {
    }

    public Conection(Connection conect) {
        this.conect = conect;
    }
    
    
    
    public Connection conectar(){
        
        try{
            
            Class.forName(driver);
            try{
                conect = DriverManager.getConnection(url+db, user, pass);
                System.out.println("Conectado a " + db);
            }
            catch(SQLException e){
                System.out.println("Falló la conexión a " + db);
                System.out.println(e.getMessage());
            }
            finally{
                try{
                    if(conect != null){
                        conect.close();
                    }
                }
                catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }
            
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("conection -> " + conect);
        return conect;
    }
    
    public void desconectar(){
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
