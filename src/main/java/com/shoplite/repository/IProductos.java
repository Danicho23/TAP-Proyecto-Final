package com.shoplite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplite.model.Productos;
@Repository
public interface IProductos extends MongoRepository<Productos,String>{

}
