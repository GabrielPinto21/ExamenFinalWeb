package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.CompraController;
import com.example.demo.entity.Compra;

@Service
public class CompraService {

    @Autowired
    private CompraController compraController;

    public Object findAllCompras() {
        return compraController.findAll();
    }

    public Object findCompraById(Long id) {
        return compraController.findById(id);
    }

    public Object saveCompra(Compra compra) {
        return compraController.save(compra);
    }

    public void deleteCompra(Long id) {
        compraController.delete(id);
    }
}
