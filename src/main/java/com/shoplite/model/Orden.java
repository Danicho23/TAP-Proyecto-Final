package com.shoplite.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//crea en Mongodb la collection
@Document
public class Orden {
    @Id
private String id;
private String id_Persona;
private String idProductos;

}
