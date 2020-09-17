package com.shoplite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoplite.model.Usuario;

@Repository
public interface IUsuario extends MongoRepository<Usuario,String>{

}
