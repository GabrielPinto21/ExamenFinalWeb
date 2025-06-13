package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Cajero;

public interface CajeroRepository extends JpaRepository<Cajero, Long> {

}
