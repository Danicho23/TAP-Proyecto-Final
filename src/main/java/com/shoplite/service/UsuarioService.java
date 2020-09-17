package com.shoplite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplite.model.Usuario;
import com.shoplite.repository.IUsuario;

@Service
public class UsuarioService {

	@Autowired
    private IUsuario repoUser;
	
	public Usuario crearUsuarios( Usuario user) {
		return repoUser.save(user);
	}
	
	public List<Usuario> listUsers() {
        return repoUser.findAll();
    }
}
