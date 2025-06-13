package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Tienda;

public interface TiendaRepository extends JpaRepository<Tienda, Long> {

}
