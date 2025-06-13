package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name="detalles_compra")
@NamedQuery(name="DetallesCompra.findAll", query="SELECT d FROM DetallesCompra d")
public class DetallesCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETALLES_COMPRA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETALLES_COMPRA_ID_GENERATOR")
	private Integer id;

	private Integer cantidad;

	private BigDecimal descuento;

	private BigDecimal precio;

	@ManyToOne
	private Compra compra;

	@ManyToOne
	private Producto producto;

}