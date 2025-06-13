package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.ProductoController;
import com.example.demo.entity.Producto;

@Service
public class ProductoService {

    @Autowired
    private ProductoController productoController;

    public Object findAllProductos() {
        return productoController.findAll();
    }

    public Object findProductoById(Long id) {
        return productoController.findById(id);
    }

    public Object saveProducto(Producto producto) {
        return productoController.save(producto);
    }

    public void deleteProducto(Long id) {
        productoController.delete(id);
    }
}
