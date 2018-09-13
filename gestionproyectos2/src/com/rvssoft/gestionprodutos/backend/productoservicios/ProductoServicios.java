package com.rvssoft.gestionprodutos.backend.productoservicios;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;

/**
 * Interfaces Basica
 * 
 * @see
 * @since 11 sept. 2018 : 22:22:32
 * @author Android
 *
 */
public interface ProductoServicios {

	// Operaciones CRUD (solo create y read)

	/**
	 * Crea un nuevo "objeto" --> 'producto' de tipo 'Producto'
	 * 
	 * @param producto
	 */
	public void create(Producto producto);

	/**
	 * Recibe un valor numerico
	 * 
	 * @param codigo
	 * @return el numero del codigo
	 */
	public Producto read(int codigo);

	// INTERFACEs : List --> Permite duplicados - Hereda metodos de "COLLECTION"

	// Obtención de listas

	public List<Producto> getAll();

	public List<Producto> getByFamilia(Familia familia);

	public List<Producto> getByPriceRange(double min, double max);

	public List<Producto> getBetweenDates(Date fecha1, Date fecha2);

//	Estadisticas

	/**
	 * Aunque ponga MAP devuelve un objeto de la clase 'HashMap' porque es la clase
	 * que lo implementa
	 * 
	 * @return 'Objeto' de tipo HashMap "String" y "Integer"
	 */
	public Map<String, Integer> getNumeroProductosByFamilia();

	/**
	 * Aunque ponga MAP devuelve un objeto de la clase 'HashMap' porque es la clase
	 * que lo implementa
	 * 
	 * @return 'Objeto' de
	 */
	public Map<String, Double> getPrecioMedioByFamilia();

	// Lógica de negocio

	/**
	 * 
	 * @param incremento
	 * @param familia
	 * @return Precio producto incrementado
	 */
	public int incrementarPrecioToFamilia(double incremento, Familia familia);

	/**
	 * 
	 * @param incremento
	 * @param productos
	 * @return Precio producto incrementado
	 */
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos);

}
