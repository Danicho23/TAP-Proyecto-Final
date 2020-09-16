package com.shoplite.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//anotacion lombox
@Data
//crea en Mongodb la collection
@Document
public class Usuario {
	@Id
	public String idUser;
	public String IdPersona;
	public String userName;
	public String password;
	public String userType;
}
