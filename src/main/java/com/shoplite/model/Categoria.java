package com.shoplite.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//anotacion lombox
@Data
//crea en Mongodb la collection
@Document
public class Categoria {
	@Id
	public String id;
	public String idProductos;
	public String nombreCategoria;
}
