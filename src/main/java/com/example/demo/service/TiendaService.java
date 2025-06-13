package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.TiendaController;
import com.example.demo.entity.Tienda;

@Service
public class TiendaService {

    @Autowired
    private TiendaController tiendaController;

    public Object findAllTiendas() {
        return tiendaController.findAll();
    }

    public Object findTiendaById(Long id) {
        return tiendaController.findById(id);
    }

    public Object saveTienda(Tienda tienda) {
        return tiendaController.save(tienda);
    }

    public void deleteTienda(Long id) {
        tiendaController.delete(id);
    }
}
