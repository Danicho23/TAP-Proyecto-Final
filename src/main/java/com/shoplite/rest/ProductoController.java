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
import java.util.Optional;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @GetMapping(path = "/list", produces = "application/json")
    public List<Productos> listarProductos() {
        return productoServicio.listProductos();
    }

    @GetMapping(path = "/buscar/{name}", produces = "application/json")
    public List<Productos> buscarProductsPorNombre(String name) {
        return productoServicio.buscarPorNombre(name);
    }

    @GetMapping(path = "/buscarQuery/{nombreProducto}", produces = "application/json")
    public List<Productos> findByQuery(String nombreProducto) {
        return productoServicio.findByQuery(nombreProducto);
    }

    @DeleteMapping(value = "/producto/delete/{id}")
    public String delete(@PathVariable String id) {
        return productoServicio.deleteProduct(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") String id, @Valid @RequestBody Productos product) {
    product.setIdProductos(id);
    productoServicio.crearProductos(product);
  }
}
