package com.rvssoft.cajondesastre.model.model1;

import java.util.Date;
import java.lang.String;

public class Persona {

	// VARIABLES DE INSTANCIA
	// PROPIEDADES
	// ATRIBUTOS
	// VARIABLE MIEMBRO
	// columnas o fields

	/**
	 * Variable de instancia
	 */
	private int codigo;

	/**
	 * 
	 */
	private int peso;

	/**
	 * Clase String
	 */
	private String nombre;

	/**
	 * 
	 */
	private String apellido1;

	/**
	 * 
	 */
	private String apellido2;

	/**
	 * 
	 */
	private char sexo;

	/**
	 * 
	 */
	private String telefono;

	/**
	 * 
	 */
	private String fax;

	/**
	 * 
	 */
	private Date fechaNacimiento;

	/**
	 * 
	 */
	private boolean casado;

	/**
	 * 
	 */
	private double altura;

	/**
	 * Getter ( metodo accesor )
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter ( metodo mutador)
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return
	 */
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {

		if (peso > 300) {
			throw new IllegalArgumentException(peso + " es un peso excesivo .. ");
		} else {
			this.peso = peso;
		}
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Solo usar para depurar codigo
	 */
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", peso=" + peso + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", sexo=" + sexo + ", telefono=" + telefono + ", fax=" + fax
				+ ", fechaNacimiento=" + fechaNacimiento + ", casado=" + casado + ", altura=" + altura + "]";
	}

	public static void main(String[] args) {

		Persona p1 = new Persona();
		new Persona();
		Persona p2 = new Persona();
		p2 = p1;
		p1 = null;

//		System.out.println(p1.apellido1);
		System.out.println(p2.apellido2);

	}
}
