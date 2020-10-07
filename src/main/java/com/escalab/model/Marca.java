package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	
	@Column(name = "descripcion", nullable = false, length = 70)
	private String descripcion;
	
	@Column(name = "direccion", nullable = false, length = 50)
	private String direccion;
	
	@Column(name = "ciudad", nullable = false, length = 30)
	private String ciudad;

}
