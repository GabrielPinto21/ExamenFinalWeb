package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@Table(name="tipo_producto")
@NamedQuery(name="TipoProducto.findAll", query="SELECT t FROM TipoProducto t")
public class TipoProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPO_PRODUCTO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_PRODUCTO_ID_GENERATOR")
	private Integer id;

	private String nombre;

	@JsonIgnore
	@OneToMany(mappedBy="tipoProducto")
	private List<Producto> productos;

}