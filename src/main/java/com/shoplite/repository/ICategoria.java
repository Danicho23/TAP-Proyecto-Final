package com.shoplite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplite.model.Categoria;
@Repository
public interface ICategoria extends MongoRepository<Categoria,String>{

}
