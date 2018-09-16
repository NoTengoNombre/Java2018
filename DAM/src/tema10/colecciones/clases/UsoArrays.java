package tema10.colecciones.clases;

import java.util.Arrays;

public class UsoArrays {

	private int arregloInt[] = { 1, 2, 3, 4, 5, 6 };
	private double arregloDouble[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };
	private int arregloIntLleno[], copiarArregloInt[];

	/*
	 * El constructor inicializa los arreglos
	 */
	public UsoArrays() {
		arregloIntLleno = new int[10];
		copiarArregloInt = new int[arregloInt.length];

		Arrays.fill(arregloIntLleno, 7);

		Arrays.sort(arregloDouble);

		// base copia
		// .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................

		System.arraycopy(arregloInt, 0, copiarArregloInt, 0, arregloInt.length);
	}

	public void imprimirArreglos() {

		System.out.println("ArregloDouble : ");
		for (double valorDouble : arregloDouble) {
			System.out.printf("%.1f ", valorDouble);
		}

		System.out.println("ArregloInt : ");
		for (double valorInt : arregloInt) {
			System.out.printf("%.1f ", valorInt);
		}

		System.out.println("ArregloIntLleno : ");
		for (double valorInt : arregloDouble) {
			System.out.printf("%.1f ", valorInt);
		}

		System.out.println("ArregloArregloInt : ");
		for (double valorInt : arregloDouble) {
			System.out.printf("%.1f ", valorInt);
		}

		System.out.println("\n ");
	}

	public int buscarInt(int valor) {
		return Arrays.binarySearch(arregloInt, valor);
	}

	public void imprimirIgualdad() {
		boolean b = Arrays.equals(arregloInt, copiarArregloInt);

		if (b == true) {
			System.out.printf("ArregloInt es igual a CopiaArregloInt\n");
		} else {
			System.out.printf("ArregloInt es igual a CopiaArregloInt\n");
		}

		b = Arrays.equals(arregloInt, arregloIntLleno);

		if (b)
			System.out.println("arregloInt es igual a ArregloIntLleno \n");
		else
			System.out.println("ArregloInt es distinto de arregloIntLleno");
	}

	public static void main(String[] args) {

		UsoArrays usoArrays = new UsoArrays();

		usoArrays.imprimirArreglos();
		usoArrays.imprimirIgualdad();
		
		int ubicacion = usoArrays.buscarInt(5);
		
		if(ubicacion >= 0) {
			System.out.printf("Se ha encontrado el 5 en el elemento %d de arregloInt\n" , ubicacion);
		}else {
			System.out.println("No se encontro el 5 en arregloInt ");
		}
		
		ubicacion = usoArrays.buscarInt(8763);
		if(ubicacion >= 0) {
			System.out.println("el numero 8763 esta en la posicion ");
		}else {
			System.out.println("No encontrado numero 8763 esta en la posicion ");
		}
		
	}
}
