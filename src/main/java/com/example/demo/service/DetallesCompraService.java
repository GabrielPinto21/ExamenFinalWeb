package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.DetallesCompraController;
import com.example.demo.entity.DetallesCompra;

@Service
public class DetallesCompraService {

    @Autowired
    private DetallesCompraController detallesCompraController;

    public Object findAllDetallesCompra() {
        return detallesCompraController.findAll();
    }

    public Object findDetallesCompraById(Long id) {
        return detallesCompraController.findById(id);
    }

    public Object saveDetallesCompra(DetallesCompra detallesCompra) {
        return detallesCompraController.save(detallesCompra);
    }

    public void deleteDetallesCompra(Long id) {
        detallesCompraController.delete(id);
    }
}
