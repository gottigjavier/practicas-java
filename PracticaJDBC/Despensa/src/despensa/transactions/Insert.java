package despensa.transactions;

import dao.DAOException;
import dao.mysql.Conection;
import dao.mysql.ProductoDAOMysql;
import despensa.Producto;
import java.sql.Connection;

public class Insert {
    
    public Producto insert(Producto prod) throws DAOException{
        Connection conn = null;
        ProductoDAOMysql dao = new ProductoDAOMysql((Conection) conn);
        Producto producto = dao.insert(prod);
        return producto;
    }
    
}
