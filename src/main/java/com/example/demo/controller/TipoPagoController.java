package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TipoPago;
import com.example.demo.repository.TipoPagoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-pagos")
public class TipoPagoController {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @GetMapping
    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoPago> findById(@PathVariable Long id) {
        return tipoPagoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoPago save(@RequestBody TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (tipoPagoRepository.existsById(id)) {
            tipoPagoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
