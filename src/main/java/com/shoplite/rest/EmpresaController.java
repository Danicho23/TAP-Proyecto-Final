/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.rest;

import com.shoplite.model.Empresa;
import com.shoplite.model.Persona;
import com.shoplite.service.EmpresaService;
import com.shoplite.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/empresa")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpresaController {
    
    @Autowired
    EmpresaService servicio;
    // POST http://localhost:8080/persona

    @PostMapping(value = "/create")
    public ResponseEntity saveEmpresa(@RequestBody Empresa empresa) {
        servicio.crearEmpresa(empresa);
        return ResponseEntity.ok("OK");
    }

    //////* Listar Personas *//////
    @GetMapping(value = "/list", produces = "application/json")
    public List<Empresa> listarEmpresas() {
        return servicio.listarEmpresa();
    }
}
