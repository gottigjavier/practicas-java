package dao;

import java.util.List;

public interface DAO <T, K>{
    
    T insert(T a) throws DAOException;
    
    void delete(String a) throws DAOException;
    
    T update(T a) throws DAOException;
    
    List<T> getAll() throws DAOException;
    
    T getOne(K codigo) throws DAOException;
}
