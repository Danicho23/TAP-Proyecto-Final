package com.shoplite.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplite.model.Productos;
import org.springframework.data.mongodb.repository.Query;
@Repository
public interface IProductos extends MongoRepository<Productos,String>{
	List<Productos> findBynombreProducto(String name);
        
         @Query("{'nombreProducto': {$regex: ?0 }})")
         List<Productos> findByQuery(String nombreProducto);
}
