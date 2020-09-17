/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.repository;

import com.shoplite.model.Empresa;
import com.shoplite.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public interface IEmpresa extends MongoRepository<Empresa, Integer>{
    
}
