package com.shoplite.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//anotacion lombox
@Data
//crea en Mongodb la collection
@Document
public class Productos {

    @Id
    public String idProductos;
    public String nombreProducto;
    public String idProveedor;
    public String descripProduct;
    public double precioProduct;
    public String imagen;
    public String catidadProduct;
}
