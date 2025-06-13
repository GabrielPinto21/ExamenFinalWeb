package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.TipoProductoController;
import com.example.demo.entity.TipoProducto;

@Service
public class TipoProductoService {

    @Autowired
    private TipoProductoController tipoProductoController;

    public Object findAllTipoProductos() {
        return tipoProductoController.findAll();
    }

    public Object findTipoProductoById(Long id) {
        return tipoProductoController.findById(id);
    }

    public Object saveTipoProducto(TipoProducto tipoProducto) {
        return tipoProductoController.save(tipoProducto);
    }

    public void deleteTipoProducto(Long id) {
        tipoProductoController.delete(id);
    }
}
