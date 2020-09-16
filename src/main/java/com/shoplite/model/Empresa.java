package com.shoplite.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//crea en Mongodb la collection
@Document
public class Empresa {
    @Id
    private int id_provedor;
    private String id_cedula_persona;
    private String fecha;
    private int calificacion;
}
