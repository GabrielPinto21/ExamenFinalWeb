package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.TipoDocumentoController;
import com.example.demo.entity.TipoDocumento;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoController tipoDocumentoController;

    public Object findAllTipoDocumentos() {
        return tipoDocumentoController.findAll();
    }

    public Object findTipoDocumentoById(Long id) {
        return tipoDocumentoController.findById(id);
    }

    public Object saveTipoDocumento(TipoDocumento tipoDocumento) {
        return tipoDocumentoController.save(tipoDocumento);
    }

    public void deleteTipoDocumento(Long id) {
        tipoDocumentoController.delete(id);
    }
}
