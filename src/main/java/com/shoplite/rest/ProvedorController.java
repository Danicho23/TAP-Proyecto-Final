/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.rest;

import com.shoplite.model.Persona;
import com.shoplite.model.Proveedor;
import com.shoplite.service.PersonaService;
import com.shoplite.service.ProvedorService;
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
@RequestMapping("/proveedor")
@CrossOrigin(origins = "http://localhost:4200")
public class ProvedorController {
     @Autowired
    ProvedorService servicio;
    // POST http://localhost:8080/persona

    @PostMapping(value = "/create")
    public ResponseEntity saveProveedor(@RequestBody Proveedor proveedor) {
        servicio.createProvedor(proveedor);
        return ResponseEntity.ok("OK");
    }

    //////* Listar Personas *//////
    @GetMapping(value = "/list", produces = "application/json")
    public List<Proveedor> listarProvedor() {
        return servicio.listarProvedor();
    }
     @GetMapping(path = "/buscarQuery/{nombre}", produces = "application/json")
    public List<Proveedor> findByQueryProve(String nombre) {
        return servicio.findByQueryProve(nombre);
    }
}
