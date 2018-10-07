package com.ejemplo.codigo.depurar;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Formacion
 *
 */
public class ClaseParaDepurar {
	
	/**
	 * 
	 */
	private double suma;
	
	/**
	 * Lista ordenada de tipos double
	 */
	private List<Double> lista;

	/**
	 * 
	 */
	public ClaseParaDepurar() {
		System.out.println("construyendo clase");
	}

	/**
	 * 
	 * @return
	 */
	public double echaCuentas() {
		lista = new LinkedList<Double>();
		for (int i = 0; i < 10; i++) {
			lista.add((double) i);
		}
		suma = 0.0;
		for (Double valor : lista) {
			suma += valor;
		}
		return suma;
	}

}
