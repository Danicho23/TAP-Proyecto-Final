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

import com.shoplite.model.Categoria;
import com.shoplite.service.CategoriaService;


@RestController
@RequestMapping("/Categoria")
@CrossOrigin({"*"})
public class CategoriaController {
	@Autowired
	CategoriaService categoriaServicio;

	@PostMapping(value = "/saveCategoria")
	public ResponseEntity saveCategoria(@RequestBody Categoria categ) {
		categoriaServicio.crearCategoria(categ);
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping(path="/list",produces = "application/json")
	public List<Categoria> listarPersonas(){
		return categoriaServicio.listCategoria();
	}
}
