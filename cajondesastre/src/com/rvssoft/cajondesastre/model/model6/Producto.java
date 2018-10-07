package com.rvssoft.cajondesastre.model.model6;

/**
 * Negocios de una tienda Informatica 
 * 
 * @author Formacion
 *
 */
public class Producto {
	
	private int codigo;
	private String nombre;
	private double precio;
	/**
	 * Tipo Enum : familia = hardware , software
	 */
	private Familia familia;
	private boolean descatalogado;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	public boolean isDescatalogado() {
		return descatalogado;
	}
	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}
	
	
	
}
