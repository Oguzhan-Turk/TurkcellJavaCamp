package core.dataAccess;

import java.util.List;

import core.entities.Entity;

public interface CrudRepository<T extends Entity> {     
		void add(T entity);      
		void update(T entity);      
		void delete(T entity);      
		List<T> findAll();
	
}
