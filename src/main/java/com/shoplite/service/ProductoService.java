package com.shoplite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplite.model.Productos;
import com.shoplite.repository.IProductos;
import java.util.Optional;

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

    public Optional<Productos> buscarPorId(String id) {
        return repoProduct.findById(id);
    }
    

    public List<Productos> findByQuery(String nombreProdcuto) {
        return repoProduct.findByQuery(nombreProdcuto);
    }
    public List<Productos> findByCategoiria(String categoria) {
        return repoProduct.findByCategoria(categoria);
    }

    public String deleteProduct(String id) {
        repoProduct.deleteById(id);
        return " removed product : " + id;
    }
 
    
}
