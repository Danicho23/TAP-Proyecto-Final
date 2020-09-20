package com.shoplite.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//crea en Mongodb la collection
@Document
public class Empresa {
    @Id
    private String id;
    private String id_persona;
    private String fecha;
    private int calificacion;
}
