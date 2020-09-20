/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoplite.service;

import com.shoplite.model.Persona;
import com.shoplite.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repositorio;

    public Persona crearPersona(Persona persona) {
        return repositorio.save(persona);
    }

    public List<Persona> listarPersona() {
        return repositorio.findAll();
    }

  public String deleteEmpleyo(String id) {
        repositorio.deleteById(Integer.parseInt(id));
        return " removed person : " + id;

    }

}
