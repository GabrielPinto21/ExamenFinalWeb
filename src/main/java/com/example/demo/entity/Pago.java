package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGO_ID_GENERATOR")
	private Integer id;

	private Integer cuotas;

	@Column(name="tarjeta_tipo")
	private String tarjetaTipo;

	private BigDecimal valor;

	@ManyToOne
	private Compra compra;

	@ManyToOne
	@JoinColumn(name="tipo_pago_id")
	private TipoPago tipoPago;
}