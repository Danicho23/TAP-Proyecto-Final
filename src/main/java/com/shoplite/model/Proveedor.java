package com.shoplite.model;

import org.springframework.data.annotation.Id;

public class Proveedor {
@Id
private int id_provedor;
private String cedula;
private String fecha_entrega;
private String calificacion;

}
