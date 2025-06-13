package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TipoProducto;

public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {

}
