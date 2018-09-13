package com.rvssoft.gestionprodutos.backend.productoserviciosimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.dummydb.DummyDB;
import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;
import com.rvssoft.gestionprodutos.backend.productoservicios.ProductoServicios;

/**
 * @see
 * @since 11 sept. 2018 : 20:59:49
 * @author Android - Sergio
 *
 */
public class ProductoServicesImpl implements ProductoServicios {

	/**
	 * Invocamos la clase 'DummyDB' para simular una llamada a la BD
	 */
	private DummyDB dummyDB = new DummyDB();

	/**
	 * Creamos un producto y lo introducimos mediante su key codigo
	 * 
	 * 1º Invocamos un objeto 'dummyDB' donde tengo todos los objetos 'productos'
	 * declarados e instanciados con el constructor
	 * 
	 * 2º Invocamos el metodo 'getMapaProductos' que devuelve un objeto de la Clase
	 * 'HashMap'
	 * 
	 */
	@Override
	public void create(Producto producto) {

		dummyDB.getMapaProductos().put(producto.getCodigo(), producto);
	}

	/**
	 * Lee un codigo mediante un entero
	 */
	@Override
	public Producto read(int codigo) {
		return dummyDB.getMapaProductos().get(codigo);
	}

	@Override
	public List<Producto> getAll() {
		return new ArrayList<Producto>(dummyDB.getMapaProductos().values());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> getByFamilia(Familia familia) {
		return (List<Producto>) dummyDB.getMapaProductos()
				.values()
				.stream()
				.filter(p -> p.getFamilia()
				.equals(familia));
	}

	@Override
	public List<Producto> getByPriceRange(double min, double max) {

		List<Producto> orderProductByFamily = new ArrayList<Producto>();
		List<Producto> allProductos = getAll();

		for (Producto producto : allProductos) {
			if (producto.getFamilia().equals(familia)) {
				orderProductByFamily.add(producto);
			}
		}
		return orderProductByFamily;
	}

	@Override
	public List<Producto> getBetweenDates(Date fecha1, Date fecha2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getNumeroProductosByFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> getPrecioMedioByFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int incrementarPrecioToFamilia(double incremento, Familia familia) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos) {
		// TODO Auto-generated method stub
		return 0;
	}

}
