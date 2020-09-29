package com.shoplite.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoplite.model.Productos;
import com.shoplite.service.ProductoService;


@RestController
@RequestMapping("/productos")
@CrossOrigin({"*"})
public class ProductoController {
	@Autowired
	ProductoService productoServicio;

	@PostMapping(value = "/saveProductos")
	public ResponseEntity saveProductos(@RequestBody Productos product) {
		productoServicio.crearProductos(product);
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping(path="/list",produces = "application/json")
	public List<Productos> listarProductos(){
		return productoServicio.listProductos();
	}
	
	@GetMapping(path = "/buscar/{name}", produces = "application/json")
	public List<Productos> buscarProductsPorNombre(String name){
		return productoServicio.buscarPorNombre(name);
	}
}
