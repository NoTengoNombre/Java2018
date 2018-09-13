package com.rvssoft.gestionproductos.backend.dummydb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;

/**
 * 
 * @see Carpeta de ejemplos
 * @since 10 sept. 2018 : 23:29:45
 * @author Android
 *
 */
public class DummyDB {

	/**
	 * CONSTANTE "Interface" Map : STATIC 'solo una copia'
	 * 
	 * SIN ORDEN en la Inserccion 'HashMap'
	 * 
	 * Map 'Interfaces' - HashMap 'Clase'
	 */
	private static final Map<Integer, Producto> MAPA_PRODUCTOS = new HashMap<>();

	/**
	 * Codigo para crear las fechas
	 */
	static {
		// STRING para almacenar las fechas
		String strFecha1 = "10/12/2014";
		String strFecha2 = "10/12/2014";
		String strFecha3 = "11/12/2014";
		String strFecha4 = "12/12/2014";
		String strFecha5 = "12/12/2014";
		// Objeto Date
		Date fecha1 = null;
		Date fecha2 = null;
		Date fecha3 = null;
		Date fecha4 = null;
		Date fecha5 = null;
		// Conversor de fechas----------------------FormatoDeFechas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			// Convierte la cadena 'String' a formato Fecha
			fecha1 = sdf.parse(strFecha1);
			fecha2 = sdf.parse(strFecha2);
			fecha3 = sdf.parse(strFecha3);
			fecha4 = sdf.parse(strFecha4);
			fecha5 = sdf.parse(strFecha5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 'objetos' Producto
		Producto p1 = new Producto(3544, "ContaNerd", Familia.SOFTWARE, fecha1, 120.34);
		Producto p2 = new Producto(1923, "LaserJet 2P", Familia.HARDWARE, fecha2, 450.34);
		Producto p3 = new Producto(2566, "ContaNerd Deluxe", Familia.SOFTWARE, fecha3, 570.60);
		Producto p4 = new Producto(9835, "Alfombrilla Doramon", Familia.CONSUMIBLE, fecha4, 15.20);
		Producto p5 = new Producto(1003, "Alfombrilla F.C Barcelona", Familia.CONSUMIBLE, fecha5, 15.20);

		// CONSTANTE: <interface> MAP - <clase> HasMap
		// objeto 'MAPA_PRODUCTOS' se van poniendo los valores dentro del OBJETO
		// CONSTANTE.METODO(CLAVE________,VALOR = Objeto de la clase 'Producto' con
		// todos los valores)
		MAPA_PRODUCTOS.put(p1.getCodigo(), p1);
		MAPA_PRODUCTOS.put(p2.getCodigo(), p2);
		MAPA_PRODUCTOS.put(p3.getCodigo(), p3);
		MAPA_PRODUCTOS.put(p4.getCodigo(), p4);
		MAPA_PRODUCTOS.put(p5.getCodigo(), p5);
	}

	/**
	 * Constructor Basico
	 */
	public DummyDB() {

	}

	/**
	 * Devuelve un objeto de tipo "HashMap" con todos los valores (CLAVE,VALOR) de
	 * esta clase que hemos instanciado con "Productos" y "Familia"
	 *
	 * @return MAPA_PRODUCTOS
	 */
	public Map<Integer, Producto> getMapaProductos() {
		return MAPA_PRODUCTOS;
	}

}
