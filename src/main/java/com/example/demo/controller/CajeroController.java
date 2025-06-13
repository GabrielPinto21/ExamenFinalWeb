package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Cajero;
import com.example.demo.repository.CajeroRepository;

import java.util.List;

@RestController
@RequestMapping("/api/cajeros")
public class CajeroController {

    @Autowired
    private CajeroRepository cajeroRepository;

    @GetMapping
    public List<Cajero> findAll() {
        return cajeroRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cajero> findById(@PathVariable Long id) {
        return cajeroRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cajero save(@RequestBody Cajero cajero) {
        return cajeroRepository.save(cajero);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (cajeroRepository.existsById(id)) {
            cajeroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
