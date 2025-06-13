package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Tienda;
import com.example.demo.repository.TiendaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tiendas")
public class TiendaController {

    @Autowired
    private TiendaRepository tiendaRepository;

    @GetMapping
    public List<Tienda> findAll() {
        return tiendaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tienda> findById(@PathVariable Long id) {
        return tiendaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tienda save(@RequestBody Tienda tienda) {
        return tiendaRepository.save(tienda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (tiendaRepository.existsById(id)) {
            tiendaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
