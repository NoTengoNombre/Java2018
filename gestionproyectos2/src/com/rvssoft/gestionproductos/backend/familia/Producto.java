package com.rvssoft.gestionproductos.backend.familia;

import java.util.Date;

/**
 * !!!!!!! POJO Perfecto !!!!!!!!!
 * 
 * @see
 * @since 11 sept. 2018 : 22:21:17
 * @author Android
 *
 */
public class Producto {

	// Atributos
	private int codigo;
	private double precio;
	private boolean descatalogado;

	// Atributos de Instancia de otras CLASES
	private String nombre;
	private Date fechaAlta;

	// Atributos de tipo ENUM : Mando a distancia para invocar los valores
	private Familia familia;

	/**
	 * Constructor
	 */
	public Producto() {
		this(0, null, null, null, 0);
	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param familia
	 * @param fechaAlta
	 * @param precio
	 */
	public Producto(int codigo, String nombre, Familia familia, Date fechaAlta, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.familia = familia;
		this.fechaAlta = fechaAlta;
	}

	/**
	 * 
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return familia : Devuelve un tipo ENUM : dentro del objeto 'familia
	 */
	public Familia getFamilia() {
		return familia;
	}

	/**
	 * 
	 * @param familia : Establece un tipo ENUM 'familia'
	 */
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	/**
	 * 
	 * @return fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaAlta(Date fecha) {
		this.fechaAlta = fecha;
	}

	/**
	 * 
	 * @return precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * 
	 * @return descatalogado
	 */
	public boolean isDescatalogado() {
		return descatalogado;
	}

	/**
	 * 
	 * @param descatalogado
	 */
	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	/**
	 * Mostrar todos los valores
	 */
	@Override
	public String toString() {
		return "Codigo : " + getCodigo() + " \n -Precio : " + getPrecio() + " \n -Nombre : " + getNombre()
				+ " \n -Fecha : " + getFechaAlta() + " \n -Familia : " + getFamilia() + " \n -Descatalogado : "
				+ isDescatalogado();
	}

}
