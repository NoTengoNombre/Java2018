package com.rvssoft.gestionproductos.backend.test;

import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;

public class TestBasic {

	private static Producto p;

	public static void main(String[] args) {

		p = new Producto();

		Familia familia = p.getFamilia();

		for (Familia indice : Familia.values()) {
			System.out.println(indice.toString().toLowerCase());
		}

		int c = 0;
		
		for (int i = 0; i < Familia.values().length; i++) {
			// Metodo para sacar los valores de los tipos Enum
			System.out.println(++c + " : Familia : " + Familia.values()[i]);
		}

	}
}
