package despensa.transactions;

import dao.mysql.Conection;
import dao.mysql.ProductoDAOMysql;
import java.sql.Connection;


public class DeleteOne {
    public void deleteOne(String codigo){
        Connection conn = null;
        ProductoDAOMysql dao = new ProductoDAOMysql((Conection) conn);
        dao.delete(codigo);        
    }
    
}
