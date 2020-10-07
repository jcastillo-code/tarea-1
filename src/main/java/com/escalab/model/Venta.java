package com.escalab.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_cliente"))
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_vendedor"))
	private Vendedor vendedor;
	
	@Column(name = "costo", nullable = false)
	private Integer costo;
	
	private LocalDateTime fecha;
}
