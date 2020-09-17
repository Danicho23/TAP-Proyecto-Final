/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.service;

import com.shoplite.model.Persona;
import com.shoplite.model.Proveedor;
import com.shoplite.repository.IProvedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ProvedorService {
     @Autowired
     private IProvedor repositorio;
     
       public Proveedor createProvedor(Proveedor proveedor) {
        return repositorio.save(proveedor);
    }

    public List<Proveedor> listarProvedor() {
        return repositorio.findAll();
    }
}
