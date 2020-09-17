/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.service;

import com.shoplite.model.Empresa;
import com.shoplite.model.Persona;
import com.shoplite.repository.IEmpresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */

@Service
public class EmpresaService {
     @Autowired
     private IEmpresa repositorio;
     
       public Empresa crearEmpresa(Empresa empresa) {
        return repositorio.save(empresa);
    }

    public List<Empresa> listarEmpresa() {
        return repositorio.findAll();
    }
}
