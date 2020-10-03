package com.shoplite.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
//crea en Mongodb la collection
@Document
public class Proveedor {
@Id
private String id;
private String ruc;
private String nombre;
private String fecha_entrega;

}
