package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@NamedQuery(name="Tienda.findAll", query="SELECT t FROM Tienda t")
public class Tienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIENDA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIENDA_ID_GENERATOR")
	private Integer id;

	private String direccion;

	private String nombre;

	private String uuid;

	@OneToMany(mappedBy="tienda")
	private List<Cajero> cajeros;

	@OneToMany(mappedBy="tienda")
	private List<Compra> compras;

}