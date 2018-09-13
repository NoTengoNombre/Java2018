package com.rvssoft.cajondesastre.model.model4;

public class Tapa {

	private int codigo;
	private String nombre;
	private double precio;
	
	public Tapa() {
		
	}
	
	public Tapa(int codigo,String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
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

	@Override
	public String toString() {
		return "Tapa [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
