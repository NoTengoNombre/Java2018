package com.rvssoft.cajondesastre.model.model2;

import java.util.Date;

/**
 * POJO Perfecto
 * 
 * @author Formacion
 *
 */
public class Persona {
	
	// 1.- Atributos 
	private int codigo;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Date fechaNacimiento;
	
	/**
	 * 2.- Constructores
	 * Este metodo constructor no invoca al super
	 * 
	 * Hereda de la clase Padre 'Object'
	 */
	public Persona() {
		this(434343, "fdfd");
	}
	
	/**
	 * 
	 * @param codigo
	 * @param nombre
	 */
	public Persona(int codigo,String nombre){
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	/**
	 * 3.- Metodos
	 * @return
	 */
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
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * 4.- Metodos po defectos
	 */
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	

	
	
}
