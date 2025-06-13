package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TipoProducto;
import com.example.demo.repository.TipoProductoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-productos")
public class TipoProductoController {

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    @GetMapping
    public List<TipoProducto> findAll() {
        return tipoProductoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoProducto> findById(@PathVariable Long id) {
        return tipoProductoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoProducto save(@RequestBody TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (tipoProductoRepository.existsById(id)) {
            tipoProductoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
