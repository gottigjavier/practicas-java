/*

1. Una despensa de un barrio desea realizar el alta de sus diferentes productos 
a una base de datos. Para ello, tiene una tabla creada en su base de datos, 
llamada productos. A partir de esto desea poder solicitar por teclado cada uno 
de los elementos de un producto: código, nombre, marca, precio, cantidad_stock y 
guardarlos en la correspondiente tabla. Utilizar para ello la tecnología JDBC y 
la correspondiente consulta SQL.

*/
package despensa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Despensa {


    public static void main(String[] args) {
        
        conectar();
       
    }
    
    public static void conectar(){
        
    Statement stmt;
    
    String db = "productosdb";
    String user = "gottig";
    String pass = "stegmann";
    String url = "jdbc:mysql://localhost:3306/";
    //String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection conect = null;
        
        //try{
            
            //Class.forName(driver); // Obsoleta a partir de java > 4
            try{
                String execInsert = "INSERT INTO productos (codigo, nombre, marca, precio, stock) VALUES ('4223', 'mouse', 'genius', 12.3, 3)";
                String execUpdate= "UPDATE productos SET precio= 55.5 WHERE id=6"; 
            
                //Conexion
                conect = DriverManager.getConnection(url+db, user, pass);
                System.out.println("Conectado a " + db);
                System.out.println("");
                
                // Querys
                stmt = conect.createStatement();
                
                stmt.executeUpdate(execInsert);
                stmt.executeUpdate(execUpdate);
                
                ResultSet rs = stmt.executeQuery("SELECT * FROM productos");
                rs.next();
            
                do{
                    System.out.println("Código: " + rs.getString("codigo") 
                            + " | Nombre: " + rs.getString("Nombre") 
                            + " | Marca: " + rs.getString("marca") 
                            + " | Precio: " + rs.getString("precio") 
                            + " | Stock: " + rs.getString("stock"));
                }while(rs.next());
                
                rs.close(); // Cerrar siempre
                stmt.close(); // Cerrar siempre

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
            
        //}
        //catch(ClassNotFoundException ex){
          //  Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        //}       
    }
}
