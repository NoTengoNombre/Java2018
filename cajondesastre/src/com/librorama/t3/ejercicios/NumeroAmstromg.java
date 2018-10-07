package com.librorama.t3.ejercicios;

public class NumeroAmstromg {

	public static int potencia(int base , int exponente) {
		int res = base;
		for (int i = 0; i < exponente - 1; i++) {
			res = res * base;
		}
		return res;
	}
	
	public static int armstrong(int numero) {
		int cifra1 = numero / 100;
		int cifra2 = (numero - 100 * cifra1 ) / 10;
		int cifra3 = numero - 100 * cifra1 - 10 * cifra2;
		int dat = potencia(cifra1,3) + potencia(cifra2,3) + potencia(cifra3,3);
		if(dat == numero) return 1;
		return 0;
	}
	
	
	public static void main(String [] args) {
		if(armstrong(371) == 1) {
			System.out.println("El numero 371 es un numero amstrong");
		}else {
			System.out.println("El numero 371 NO es un numero amstrong");
		}
		
		if(armstrong(423) == 1) {
			System.out.println("El numero 423 es un numero amstrong");
		}else {
			System.out.println("El numero 423 NO es un numero amstrong");
		}
	
	
	}
}
