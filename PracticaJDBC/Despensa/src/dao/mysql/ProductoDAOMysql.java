package dao.mysql;

import dao.DAOException;
import dao.ProductoDAO;
import despensa.Producto;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDAOMysql implements ProductoDAO{
    
    final String INSERT= "INSERT INTO productos (codigo, nombre, marca, precio, stock) VALUES (?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE productos SET nombre=? marca=? precio=? stock=? WHERE codigo=?";
    final String DELETE = "DELETE FROM productos WHERE id=?";
    final String GETALL = "SELECT * FROM productos";
    final String GETONE = "SELECT * FROM productos WHERE codigo=?";
    
    
    private Connection conn;
    
    private Conection conexion = new Conection();

    public ProductoDAOMysql(Conection conn) {
        this.conn = conexion.conectar();
    }
    
    

    @Override
    public void insert(Producto a) throws DAOException {
        
        PreparedStatement statement = null;
        try {    
            statement = conn.prepareStatement(INSERT);
            statement.setString(1, a.getCodigo());
            statement.setString(2, a.getNombre());
            statement.setString(3, a.getMarca());
            statement.setDouble(4, a.getPrecio());
            statement.setInt(5, a.getStock());
            if (statement.executeUpdate() == 0){
             throw new DAOException("Error SQL: tal vez no se guardó la información.");   
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL ", ex);
        } finally {
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error SQL ", ex);
                }
            }
        }
    }

    @Override
    public void delete(Producto a) throws DAOException {
        PreparedStatement statement = null;
            
        try {
            statement = conn.prepareStatement(DELETE);
            statement.setString(1, a.getCodigo());
            if (statement.executeUpdate() == 0){
                throw new DAOException("Tal vez no se borró ese registro");                
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL ", ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error SQL ", ex);
                }
            }
        }
    }

    @Override
    public void update(Producto a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private Producto convert(ResultSet rs) throws SQLException{
        String codigo = rs.getString("codigo");
        String nombre = rs.getString("nombre");
        String marca = rs.getString("marca");
        double precio = rs.getDouble("precio");
        int stock = rs.getInt("stock");
        Producto producto = new Producto(codigo, nombre, marca, precio, stock);
        return producto;        
    }

    @Override
    public List<Producto> getAll() throws DAOException {
        PreparedStatement statement = null;
        ResultSet rs = null;
        List<Producto> producto = new ArrayList<>();
            
        try {
            statement = conn.prepareStatement(GETALL);
            rs = statement.executeQuery();
            while(rs.next()){
                producto.add(convert(rs));
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL ", ex);
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error SQL ", ex);
                }
            }
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error SQL ", ex);
                }
            }
        }
        return producto;
    }

    //@Override
    @Override
    public Producto getOne(String codigo) {
        PreparedStatement statement = null;
        ResultSet rs = null;
        Producto producto = null;
            
        try {
            statement = conn.prepareStatement(GETONE);
            statement.setString(1, codigo);
            rs = statement.executeQuery();
            if (rs.next()){
                producto = convert(rs);
            } else {
                System.out.println("No se encontró ese registro");
            }
        } catch (SQLException ex) {
            try {
                throw new Exception("Error SQL ", ex);
            } catch (Exception ex1) {
                Logger.getLogger(ProductoDAOMysql.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductoDAOMysql.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    try {
                        throw new DAOException("Error SQL ", ex);
                    } catch (DAOException ex1) {
                        Logger.getLogger(ProductoDAOMysql.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    try {
                        throw new DAOException("Error SQL ", ex);
                    } catch (DAOException ex1) {
                        Logger.getLogger(ProductoDAOMysql.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }
        return producto;
    }
    
}
