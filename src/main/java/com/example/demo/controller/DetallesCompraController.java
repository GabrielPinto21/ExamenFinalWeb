package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.DetallesCompra;
import com.example.demo.repository.DetallesCompraRepository;

import java.util.List;

@RestController
@RequestMapping("/api/detalles-compra")
public class DetallesCompraController {

    @Autowired
    private DetallesCompraRepository detallesCompraRepository;

    @GetMapping
    public List<DetallesCompra> findAll() {
        return detallesCompraRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetallesCompra> findById(@PathVariable Long id) {
        return detallesCompraRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetallesCompra save(@RequestBody DetallesCompra detallesCompra) {
        return detallesCompraRepository.save(detallesCompra);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (detallesCompraRepository.existsById(id)) {
            detallesCompraRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
