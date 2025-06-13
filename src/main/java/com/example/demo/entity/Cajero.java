package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@NamedQuery(name="Cajero.findAll", query="SELECT c FROM Cajero c")
public class Cajero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CAJERO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAJERO_ID_GENERATOR")
	private Integer id;

	private String documento;

	private String email;

	private String nombre;

	private String token;

	@ManyToOne
	private Tienda tienda;

	@JsonIgnore
	@OneToMany(mappedBy="cajero")
	private List<Compra> compras;

	
}