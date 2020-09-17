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

import com.shoplite.model.Usuario;
import com.shoplite.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin({"*"})
public class UsuarioController {

	@Autowired
	UsuarioService userServicio;
	@PostMapping(value = "/saveUser")
	public ResponseEntity saveCategoria(@RequestBody Usuario user) {
		userServicio.crearUsuarios(user);
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping(path="/listUser",produces = "application/json")
	public List<Usuario> listarPersonas(){
		return userServicio.listUsers();
	}
}
