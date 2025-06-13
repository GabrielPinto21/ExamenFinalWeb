package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.VendedorController;
import com.example.demo.entity.Vendedor;

@Service
public class VendedorService {

    @Autowired
    private VendedorController vendedorController;

    public Object findAllVendedores() {
        return vendedorController.findAll();
    }

    public Object findVendedorById(Long id) {
        return vendedorController.findById(id);
    }

    public Object saveVendedor(Vendedor vendedor) {
        return vendedorController.save(vendedor);
    }

    public void deleteVendedor(Long id) {
        vendedorController.delete(id);
    }
}
