package com.shoplite.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//crea en Mongodb la collection
@Document
public class Persona {
    @Id
private int id_persona;
private String cedula;
private String apellido;
private String email;
private String telefono;
}
