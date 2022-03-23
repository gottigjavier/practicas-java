package despensa.transactions;

import dao.mysql.Conection;
import dao.mysql.ProductoDAOMysql;
import despensa.Producto;
import java.sql.Connection;

public class GetOne {
    public Producto getOne(String codigo){
        Connection conn = null;
        ProductoDAOMysql dao = new ProductoDAOMysql((Conection) conn);
        Producto producto = dao.getOne(codigo);
        //System.out.println(producto);
        return producto;
    }
}
