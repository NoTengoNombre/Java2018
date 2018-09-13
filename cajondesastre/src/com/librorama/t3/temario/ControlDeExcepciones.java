package com.librorama.t3.temario;

public class ControlDeExcepciones {

	public static void main(String[] args) {

		int a = 0, b = 10 , c;
		
		try {
			c= b / a ; 
		}catch(ArithmeticException ae) {
			System.out.println("Error : " + ae.getMessage());
		}finally {
			System.exit(0);
		}
	}
}
