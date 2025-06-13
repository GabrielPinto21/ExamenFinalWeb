package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCTO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTO_ID_GENERATOR")
	private Integer id;

	private Integer cantidad;

	private String descripcion;

	private String nombre;

	private BigDecimal precio;

	private String referencia;

	@JsonIgnore
	@OneToMany(mappedBy="producto")
	private List<DetallesCompra> detallesCompras;

	@ManyToOne
	@JoinColumn(name="tipo_producto_id")
	private TipoProducto tipoProducto;

}