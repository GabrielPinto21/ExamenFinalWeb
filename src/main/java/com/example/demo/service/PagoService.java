package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.PagoController;
import com.example.demo.entity.Pago;

@Service
public class PagoService {

    @Autowired
    private PagoController pagoController;

    public Object findAllPagos() {
        return pagoController.findAll();
    }

    public Object findPagoById(Long id) {
        return pagoController.findById(id);
    }

    public Object savePago(Pago pago) {
        return pagoController.save(pago);
    }

    public void deletePago(Long id) {
        pagoController.delete(id);
    }
}
