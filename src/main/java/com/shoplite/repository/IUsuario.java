package com.shoplite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoplite.model.Usuario;

@Repository
public interface IUsuario extends MongoRepository<Usuario,String>{
	@Query(value = "{$and:[{id:?0},{password:?1}]}")
	Usuario usuarioByUseryPass(String user, String pass);

}
