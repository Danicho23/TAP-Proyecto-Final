package com.shoplite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplite.model.Productos;
import com.shoplite.repository.IProductos;

@Service
public class ProductoService {
	@Autowired
    private IProductos repoProduct;
	public Productos crearProductos(Productos product) {
		return repoProduct.save(product);
	}
	
	public List<Productos> listProductos() {
        return repoProduct.findAll();
    }
}
