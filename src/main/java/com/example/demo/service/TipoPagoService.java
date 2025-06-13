package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.TipoPagoController;
import com.example.demo.entity.TipoPago;

@Service
public class TipoPagoService {

    @Autowired
    private TipoPagoController tipoPagoController;

    public Object findAllTipoPagos() {
        return tipoPagoController.findAll();
    }

    public Object findTipoPagoById(Long id) {
        return tipoPagoController.findById(id);
    }

    public Object saveTipoPago(TipoPago tipoPago) {
        return tipoPagoController.save(tipoPago);
    }

    public void deleteTipoPago(Long id) {
        tipoPagoController.delete(id);
    }
}
