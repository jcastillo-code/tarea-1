package com.escalab.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca marca;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "descripcion", nullable = false, length = 70)
	private String descripcion;
	
	@Column(name = "valor", nullable = false)
	private Integer valor;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "compra_producto", joinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "idProducto"), inverseJoinColumns = @JoinColumn(name = "id_venta", referencedColumnName = "idVenta"))
	private List<Venta> ventas;
}
