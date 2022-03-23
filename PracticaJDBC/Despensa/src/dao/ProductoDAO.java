package dao;

import despensa.Producto;

public interface ProductoDAO extends DAO<Producto, String> {

    //@Override
    public Producto getOne(String codigo);
    
    public void delete(String codigo);
    
}
