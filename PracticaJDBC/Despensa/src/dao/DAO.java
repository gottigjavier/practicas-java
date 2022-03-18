package dao;

import java.util.List;

public interface DAO <T, K>{
    
    void insert(T a) throws DAOException;
    
    void delete(T a) throws DAOException;
    
    void update(T a) throws DAOException;
    
    List<T> getAll() throws DAOException;
    
    T getOne(K codigo) throws DAOException;
}
