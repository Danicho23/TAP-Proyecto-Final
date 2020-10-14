/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.repository;

import com.shoplite.model.Persona;
import com.shoplite.model.Proveedor;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public interface IProvedor extends MongoRepository<Proveedor, Integer> {
   
         @Query("{'nombre': {$regex: ?0 }})")
         List<Proveedor> findByQueryProve(String nombre);
}
