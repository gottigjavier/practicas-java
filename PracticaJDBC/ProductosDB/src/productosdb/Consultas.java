
package productosdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gottig
 */
public class Consultas {
    
    Connection con;
    
    Statement stmt;
    
    Conection conn = new Conection();

    public void consultas() {
        conn.conectar();
        try {
            this.stmt = con.createStatement();
            ResultSet rs = this.stmt.executeQuery("SELECT * FROM productos");
            rs.next();
            System.out.println("pasa por aquí?");
            do{
                System.out.println("Código: " + rs.getString("codigo") 
                        + " | Nombre: " + rs.getString("Nombre") 
                        + " | Marca: " + rs.getString("marca") 
                        + " | Precio: " + rs.getString("precio") 
                        + " | Stock: " + rs.getString("stock"));
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
