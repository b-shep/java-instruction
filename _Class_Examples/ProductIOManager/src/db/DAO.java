package db;

import java.util.List;


//generic DAO interface that can do basic CRUD on anything applicable
public interface DAO<T>{
	
	T get(String code); //read method: SELECT* from table to get row
	List<T> getAll(); //read method 
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
	
	
}
