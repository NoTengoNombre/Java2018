package com.rvssoft.cajondesastre.model.tiposprimitivos;

public class TestClass {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	byte b = 127;
	System.out.print(b);
	
	byte v1 = 100;
	
	byte v2 = 100;
	
	//byte v3 = 128;
	
	byte v3 = (byte) 128; // El programara hara un casting explicito para almacenar el valor
	
	int v8 = 1_3_3_6;
	
	
	int a;	
	
	boolean descuento = true;
	
	char caracter = 'b';
	
	// Cosas Raras
	
		int v4 = 9_3____5_6;
		
		int v5 = 0xCAFE;
		
		int v6 = 06;
		
		//Numeros decimales
		
		double precio = 12.78;
		double sueldo = 24E8;
		
//		float v7 = 24.5; 
		float v7 = 24.5F;v7 = 24.5f;
		float v9 = (float)24.5; // Casting explicito
		
	
	System.out.print(v1);
	
	System.out.print(v2);
	
	System.out.print(v3);
	
	System.out.print(descuento);
	
	System.out.print(caracter);
	
	System.out.println(v4);

	System.out.println(v5);
	 
	System.out.println(v6);
	 
	System.out.println(v7);

	System.out.println(v9);


	}
}
