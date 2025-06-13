package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@NamedQuery(name="Vendedor.findAll", query="SELECT v FROM Vendedor v")
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VENDEDOR_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VENDEDOR_ID_GENERATOR")
	private Integer id;

	private String documento;

	private String email;

	private String nombre;

	@OneToMany(mappedBy="vendedor")
	private List<Compra> compras;

}