
package productosdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Consultas {
    
    Statement stmt;
    Conection conexion= new Conection();
    
    Productos prod= new Productos();

    public void consultas() {
    
        String codigo = prod.getCodigo();
        String nombre = prod.getNombre();
        String marca = prod.getMarca();
        double precio = prod.getPrecio();
        int stock = prod.getStock();

        Connection con= conexion.conectar();

        //String exec = "INSERT INTO productos (codigo, nombre, marca, precio, stock) VALUES ('" + codigo + "', '" + nombre + "', '" + marca + "', " + precio + ", " + stock + ")";
        try{
            //String exec = "INSERT INTO productos (codigo, nombre, marca, precio, stock) VALUES ('2223', 'mouse', 'genius', 12.3, 3)";
            // Querys
            stmt = con.createStatement();
        //    stmt.executeUpdate(exec);
        //    stmt.executeUpdate("UPDATE productos SET precio= 55.5 WHERE id=6");
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM productos")) {
                while(rs.next()){
                    System.out.println("Código: " + rs.getString("codigo")
                            + " | Nombre: " + rs.getString("Nombre")
                            + " | Marca: " + rs.getString("marca")
                            + " | Precio: " + rs.getString("precio")
                            + " | Stock: " + rs.getString("stock"));
                }
            rs.close();
            }
            stmt.close();
        }
        catch(SQLException e){
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, e);
        }
            
        conexion.desconectar(con);
    }
}