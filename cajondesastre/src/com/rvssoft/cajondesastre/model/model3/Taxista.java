package com.rvssoft.cajondesastre.model.model3;

public class Taxista extends Persona {

	private String licenciaDeTaxis;

	public Taxista() {
	 
	}
	
	public Taxista(String dni , String nombre , String apellido1,String licencia) {
		super(dni, nombre, apellido1);
		this.licenciaDeTaxis = licencia;
	}

	public String getLicenciaDeTaxis() {
		return licenciaDeTaxis;
	}

	public void setLicenciaDeTaxis(String licenciaDeTaxis) {
		this.licenciaDeTaxis = licenciaDeTaxis;
	}

	@Override
	public String toString() {
		return "Taxista [licenciaDeTaxis=" + licenciaDeTaxis + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
				+ ", getApellido1()=" + getApellido1() + ", getApellido2()=" + getApellido2() + ", toString()="
				+ super.toString() + "]";
	}
	 
	
	
	
	
	
	
}
