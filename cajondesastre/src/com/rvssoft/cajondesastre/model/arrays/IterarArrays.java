package com.rvssoft.cajondesastre.model.arrays;

public class IterarArrays {

	public static void main(String [] args) {
		String [] nombres = {"Pepin" , "Honorario" , " Carlota"};
		
		// 1� forma - convencional
		for(int i = 0 ; i < nombres.length; i++) {
			System.out.println(i + " : " + nombres[i]);
		}
		
		// 2� forma - foreach
		for (String nombre : nombres) {
			System.out.println(nombre.trim());
		}
		
	}
}
