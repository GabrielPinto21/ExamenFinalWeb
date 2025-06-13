package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
