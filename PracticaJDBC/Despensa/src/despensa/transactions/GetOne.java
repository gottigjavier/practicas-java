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

public class GetOne {
    public void getOne(String codigo){
        Connection conn = null;
        ProductoDAO dao = new ProductoDAOMysql((Conection) conn);
        Producto producto = dao.getOne(codigo);
        System.out.println(producto);
    }
}
