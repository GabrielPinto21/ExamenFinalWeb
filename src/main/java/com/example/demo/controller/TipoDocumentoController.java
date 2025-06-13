package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TipoDocumento;
import com.example.demo.repository.TipoDocumentoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-documentos")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @GetMapping
    public List<TipoDocumento> findAll() {
        return tipoDocumentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDocumento> findById(@PathVariable Long id) {
        return tipoDocumentoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoDocumento save(@RequestBody TipoDocumento tipoDocumento) {
        return tipoDocumentoRepository.save(tipoDocumento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (tipoDocumentoRepository.existsById(id)) {
            tipoDocumentoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
