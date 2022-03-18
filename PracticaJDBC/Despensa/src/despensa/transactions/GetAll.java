package despensa.transactions;

import dao.DAOException;
import dao.ProductoDAO;
import dao.mysql.Conection;
import dao.mysql.ProductoDAOMysql;
import despensa.Despensa;
import despensa.Producto;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetAll {
    
    public List getAll(){
        List<Producto> productos;
        productos = null;
        Connection conn = null;
        ProductoDAO dao = new ProductoDAOMysql((Conection) conn);
        try {
            productos = dao.getAll();
            //for(Producto producto: productos){
            //    System.out.println(producto);
            //}
        } catch (DAOException ex) {
            Logger.getLogger(Despensa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productos;
    }
    
}
