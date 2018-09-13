package com.rvssoft.cajondesastre.model.model3;

public class Cliente extends Persona {
	
 
	private boolean tarjetaGold;
	
	public Cliente() {
	}
	
	/**
	 * Clase Hijo hereda de la clase Padre
	 * @param dni
	 * @param nombre
	 * @param apellido1
	 * @param tarjetaGold
	 */
	public Cliente(String dni , String nombre , String apellido1 , boolean tarjetaGold) {
		super(dni,nombre,apellido1);
		this.tarjetaGold = tarjetaGold;
	}
	
	
	public boolean isTarjetaGold() {
	return tarjetaGold;
	}
	
	public void setTarjetaGold(boolean tarjetaGold)
	{
		this.tarjetaGold = tarjetaGold;
	}

	@Override
	public String toString() {
		return "Cliente [tarjetaGold=" + tarjetaGold + ", toString()=" + super.toString() + "]";
	}
}
