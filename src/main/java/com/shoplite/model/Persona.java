package com.shoplite.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//crea en Mongodb la collection
@Document
public class Persona {

    @Id
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
