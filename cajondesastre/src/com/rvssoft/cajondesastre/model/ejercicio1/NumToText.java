package com.rvssoft.cajondesastre.model.ejercicio1;

import java.io.*;

public class NumToText {

	public static void main(String arg[]) throws IOException {

		N2t numero;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String res;
		System.out.print("Ingrese numero : ");
		num = Integer.parseInt(in.readLine());
		numero = new N2t(num);
		res = numero.convertirLetras(num);
		System.out.print(res);
		System.out.println("\n");

	}
}