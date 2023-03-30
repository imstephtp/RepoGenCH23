package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indico que mi clase Producto se convierte en una entidad JPA (persistencia de datos)
@Table(name = "Producto") //especificar e forma correcta el nombre de la tabla

public class Producto {
	
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
	
	//Atributos
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private Double precio;
	

	//Constructor vacio para el jackson (Serializar y deserealizar un objeto JAVA o JSON)
	public Producto() {
		
	}

	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripcion, String URL_Imagen, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
	}

	
	//Setter & Getters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String URL_Imagen) {
		this.URL_Imagen = URL_Imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	//toString(sobreescritura de metodos)
	@Override
	public String toString() {
	return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen=" + URL_Imagen
			+ ", precio=" + precio + "]";	
	}
	

}
