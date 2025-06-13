package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@JsonIgnore
	@OneToMany(mappedBy="tienda")
	private List<Cajero> cajeros;

	@JsonIgnore
	@OneToMany(mappedBy="tienda")
	private List<Compra> compras;

}