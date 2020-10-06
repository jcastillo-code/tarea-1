package com.escalab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compra_producto")
public class CompraProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompraProducto;
}
