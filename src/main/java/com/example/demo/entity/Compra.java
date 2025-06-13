package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPRA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPRA_ID_GENERATOR")
	private Integer id;

	private Timestamp fecha;

	private BigDecimal impuestos;

	private String observaciones;

	private BigDecimal total;

	@ManyToOne
	private Cajero cajero;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Tienda tienda;

	@ManyToOne
	private Vendedor vendedor;

	@OneToMany(mappedBy="compra")
	private List<DetallesCompra> detallesCompras;

	@OneToMany(mappedBy="compra")
	private List<Pago> pagos;

}