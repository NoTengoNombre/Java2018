package com.rvssoft.gestionproductos.backend.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;
import com.rvssoft.gestionprodutos.backend.productoservicios.ProductoServicios;
import com.rvssoft.gestionprodutos.backend.productoserviciosimpl.ProductoServicesImpl;

/**
 * Clase para probar la logica de los metodos
 */
public class TestClass {

	/**
	 * * ATRIBUTO tipo 'INTERFACES'
	 * 
	 * Permite invocar todos los metodos de la Clase "Producto"
	 */
	private ProductoServicios productoServicios;
	private Producto p;
	/**
	 * 
	 */
	private static int numAleatorio = (int) (Math.random() * (1000 + 9000) + 1000);

	/**
	 * Restaura todos los valores del constructor de la clase que implementa los
	 * metodos de esta clase
	 */
	private void reset() {
		productoServicios = new ProductoServicesImpl();
	}

	/**
	 * Metodo que lee un codigo
	 */
	private void testRead() {
		reset(); // Limpia el constructor
		p = productoServicios.read(3544); // lee un codigo
//		SI: p 'no apunta a ninguna referencia'
		if (p == null) { // no tiene una referencia asignada
			throw new IllegalArgumentException("Producto no Encontrado");
		} else {
			System.out.println("Producto : \n" + p.toString());
		}
	}

	/**
	 * Metodo que devuelve todos los 'productos'
	 */
	private void testGetAll() {
		reset(); // Reinicio constructor si hay valores modificados en la clase
					// ProductoServicesImpl
		int contador = 0;
		List<Producto> producto = productoServicios.getAll(); // devuelve una lista de 'objetos=Producto'
// Recorro todos los productos 
		for (Producto p : producto) {
			System.out.println(++contador + " - Producto : \n" + p.toString());
		}
	}

	/**
	 * Muestras todos los 'productos' de una familia
	 */
	private void testGetByFamilia() {
		reset(); // Reinicio constructor si hay valores modificados en la clase
// Contador para saber el numero de valores que voy generando
		int contador = 0;
// Interface implementada por la clase ArrayList
		List<Producto> productos = productoServicios.getByFamilia(Familia.SOFTWARE);
// Recorremos todos los objetos 'productos' de la familia 'SOFTWARE'
		for (Producto producto : productos) {
			System.out.println(++contador + " - Producto : \n " + producto.toString());
		}
	}

	private void testByPriceRange() {
		reset(); // Reinicio constructor
// Creo una List<Producto> apunta a la misma posicion de memoria que un ArrayList de objetos 
//		con todos los productos entre los rangos(15.0, 150.0)
		List<Producto> productos = productoServicios.getByPriceRange(15.0, 150.0);
// Recorro el array de 'objetos' de tipo ArrayList
		for (Producto p : productos) {
			System.out.println(p.toString());
		}
	}

	private void testgetBetweenDates() {
		reset();

		String strFecha1 = "10/12/2010";
		String strFecha2 = "10/12/2014";

		Date fecha1 = null;
		Date fecha2 = null;

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		try {
			fecha1 = sdf.parse(strFecha1);
			fecha2 = sdf.parse(strFecha2);

		} catch (ParseException pa) {
			pa.printStackTrace();
			System.out.println(pa.getMessage() + " - ");
		}

		List<Producto> productos = productoServicios.getBetweenDates(fecha1, fecha2);

		System.out.println("Productos : " + productos.size());

		for (Producto prod : productos) {
			System.out.println(prod.toString());
		}

	}

	/**
	 * 
	 */
	private void testgetNumeroProductosByFamilia() {
		reset(); // Eliminar todos los valores que estuvieran asignados al constructor

		// Creo un Map para almacenar todos los valores mediante un HashMap
		HashMap<String, Integer> numeroProductos = (HashMap<String, Integer>) productoServicios
				.getNumeroProductosByFamilia();

		// Recorro 'view' del Mapa mediante el Iterador 'Entry'
		for (Map.Entry<String, Integer> entry : numeroProductos.entrySet()) {
//			Obtengo las clave , valor de cada objeto del Map implementado por HashMap
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private void testgetPrecioMedioByFamilia() {
		reset(); // Eliminar todos los valores que estuvieran asignados al constructor
		HashMap<String, Double> numeroProductos = (HashMap<String, Double>) productoServicios.getPrecioMedioByFamilia();

		for (Map.Entry<String, Double> entry : numeroProductos.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private void testIncrementarPrecioToFamilia() {
		reset();
		System.out.println(
				"Productos Actualizados : " + productoServicios.incrementarPrecioToFamilia(0.5, Familia.CONSUMIBLE));
	}

	/**
	 * 
	 */
	private void testIncrementarPrecioToProductList() {
		reset();
		ProductoServicios ps = new ProductoServicesImpl();

		int size = ps.getAll().size();

		List<Producto> all = ps.getAll();

		for (int i = 0; i < size; i++) {
			System.out.println(i + " : + Valores : " + all.get(i));
		}

		List<Producto> listaProductos = new ArrayList<>();
		String strFecha1 = "10/12/2010";
		String strFecha2 = "10/12/2015";

		Date fecha1 = null;
		Date fecha2 = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			fecha1 = sdf.parse(strFecha1);
			fecha2 = sdf.parse(strFecha2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Producto p1 = new Producto(3544, "ContaNerd", Familia.SOFTWARE, fecha1, 120.34);
		Producto p2 = new Producto(1111, "LaserJet 2P", Familia.HARDWARE, fecha2, 450.34);

		listaProductos.add(p1);
		listaProductos.add(p2);

		int productosActualizados = productoServicios.incrementarPrecioToProductList(6, listaProductos);
		
		System.out.println(productosActualizados + " productos han sido actualizados");

		for (int i = 0; i < size; i++) {
			System.out.println(i + " : - Valores : " + all.get(i));
		}

	}

	/**
	 * Metodo de Instancia para lanzar todos los metodos relacionados con la
	 * comprobación de los metodos
	 */
	private void run() {
//		testRead();
//		testGetAll();
//		testGetByFamilia();
//		testByPriceRange();
//		testgetBetweenDates();
//		testgetPrecioMedioByFamilia();
//		testgetNumeroProductosByFamilia();
//		testIncrementarPrecioToFamilia();
		testIncrementarPrecioToProductList();
		
	}

	public static void main(String[] args) {

		new TestClass().run();
	}
}
