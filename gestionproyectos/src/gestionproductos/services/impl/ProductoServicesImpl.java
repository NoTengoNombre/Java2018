package gestionproductos.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import gestionproductos.backend.dummydb.DummyDB;
import gestionproductos.backend.model.Familia;
import gestionproductos.backend.model.Producto;
import gestionproductos.backend.services.ProductoServices;

public class ProductoServicesImpl implements ProductoServices {

	private DummyDB dummyDB = new DummyDB();

	/**
	 * Crear un producto
	 */
	@Override
	public void create(Producto producto) {
		dummyDB.getMapaProductos().put((producto.getCodigo()), producto);
	}

	/**
	 * Se añade un codigo 'int' y devuelve el 'objeto' de tipo Producto
	 */
	@Override
	public Producto read(int codigo) {
		Producto producto = null;
		// Sacar la coleccion de Productos
		List<Producto> listaProductos = new ArrayList<>(dummyDB.getMapaProductos().values());
		// Recorrer la lista productos
		for (Producto p : listaProductos) {
			if (p.getCodigo() == codigo) {
				// Objeto producto almacena el nuevo objeto 'p'
				producto = p;
			}
		}
		return producto;
	}

	/**
	 * Obtener todos los objetos de tipo 'Producto'
	 */
	@Override
	public List<Producto> getAll() {
		return new ArrayList<Producto>(dummyDB.getMapaProductos().values());
	}

	/**
	 * Recibe un objeto Familia Devuelve un objeto Producto con la familia a la que
	 * pertenece
	 * 
	 */
	@Override
	public List<Producto> getByFamilia(Familia familia) {
		// Lista de resultados para almacenar lista de 'objetos'
		List<Producto> listaResultado = new ArrayList<Producto>();

		// Lista de productos
		List<Producto> productos = new ArrayList<>(dummyDB.getMapaProductos().values());

		// Recorrer la lista de productos
		for (Producto producto : productos) {
			if (producto.getFamilia().equals(familia.name().toString())) {
				// Añadimos a la lista de objetos el objeto productos
				listaResultado.add(producto);
			}
		}
		// Devuelve una lista de objetos filtrado
		return listaResultado;
	}

	/**
	 * Stream para trabajar con colecciones Que es lo que quiero pero como hacerlo
	 * 
	 * @param familia
	 * @return
	 */
	public List<Producto> getByFamiliaStream(Familia familia) {

		return dummyDB.getMapaProductos().values().stream().filter(p -> p.getFamilia().equals(familia))
				.collect(Collectors.toList());

	}

	/**
	 * Creo 2 List de objetos Productos 1 Lista con valores 1 Lista sin valores
	 * 
	 */
	@Override
	public List<Producto> getByPriceRange(double min, double max) {

		// Lista de resultados para almacenar lista de 'objetos'
		List<Producto> listaResultado = new ArrayList<Producto>();

		// Lista de productos
		List<Producto> productos = new ArrayList<>(dummyDB.getMapaProductos().values());

		// Recorrer la lista de productos
		for (Producto producto : productos) {
			if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
				// Añadimos a la lista de objetos el objeto productos
				listaResultado.add(producto);
			}
		}
		// Devuelve una lista de objetos filtrado
		return listaResultado;
	}

	public List<Producto> getByPriceRangeStream(double min, double max) {
		// Esta es la parte del tubo
		// p -> va obteniendo los valores poco a poco 
		return dummyDB.getMapaProductos().values().stream().filter(p -> p.getPrecio() <= max)
				.collect(Collectors.toList());
		
	}

	/**
	 * 
	 */
	@Override
	public List<Producto> getBetweenDates(Date fecha1, Date fecha2) {

		String strFecha1 = "10/12/2014";
		String strFecha2 = "10/12/2014";

		Date f1 = null;
		Date f2 = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			f1 = sdf.parse(strFecha1);
			f2 = sdf.parse(strFecha2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Lista <Productos> para almacenar los valores
		List<Producto> listaResultado = new ArrayList<Producto>();
		// Lista <Productos> para recorrer los elementos de tipo 'productos
		List<Producto> listaProductos = new ArrayList<>(dummyDB.getMapaProductos().values());

		for (Producto p : listaProductos) {
			if ((p.getFechaAlta().compareTo(f1) >= 0) && (p.getFechaAlta().compareTo(f2) <= 0)) {
				listaResultado.add(p);
			}
		}
		return listaResultado;
	}

	/**
	 * 
	 */
	@Override
	public Map<String, Integer> getNumeroProductosByFamilia() {

//		Familia.values();
//
//		for (Familia f : familia.values()) {
//			f.name().toString();
//		}

		return null;
	}

	/**
	 * 
	 */
	@Override
	public Map<String, Double> getPrecioMedioByFamilia() {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = new ArrayList<>(dummyDB.getMapaProductos().values());
		return null;
	}

	/**
	 * 
	 */
	@Override
	public int incrementarPrecioToFamilia(double incremento, Familia familia) {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = new ArrayList<>(dummyDB.getMapaProductos().values());
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos) {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = new ArrayList<>(dummyDB.getMapaProductos().values());
		return 0;
	}

}
