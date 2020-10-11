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

    public List<Productos> buscarPorNombre(String name) {
        return repoProduct.findBynombreProducto(name);
    }

    public List<Productos> findByQuery(String nombreProdcuto) {
        return repoProduct.findByQuery(nombreProdcuto);
    }

    public String deleteProduct(String id) {
        repoProduct.deleteById(id);
        return " removed product : " + id;
    }
 
    public void update(Productos productos) {
        repoProduct.save(productos);
    }
}
