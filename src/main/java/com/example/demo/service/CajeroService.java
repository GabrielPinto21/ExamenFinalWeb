package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.CajeroController;
import com.example.demo.entity.Cajero;

@Service
public class CajeroService {

    @Autowired
    private CajeroController cajeroController;

    public Object findAllCajeros() {
        return cajeroController.findAll();
    }

    public Object findCajeroById(Long id) {
        return cajeroController.findById(id);
    }

    public Object saveCajero(Cajero cajero) {
        return cajeroController.save(cajero);
    }

    public void deleteCajero(Long id) {
        cajeroController.delete(id);
    }
}
