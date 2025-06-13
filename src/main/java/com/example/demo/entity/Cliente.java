package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENTE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTE_ID_GENERATOR")
	private Integer id;

	private String documento;

	private String nombre;

	
	@ManyToOne
	@JoinColumn(name="tipo_documento_id")
	private TipoDocumento tipoDocumento;

	
	@OneToMany(mappedBy="cliente")
	private List<Compra> compras;

}