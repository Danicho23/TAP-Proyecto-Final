/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.service;

import com.shoplite.model.Orden;
import com.shoplite.model.Persona;
import com.shoplite.repository.IOrden;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class OrdenService {
     @Autowired
     private IOrden repositorio;
     
       public Orden crearOrder(Orden orden) {
        return repositorio.save(orden);
    }

    public List<Orden> listOrder() {
        return repositorio.findAll();
    }
}
