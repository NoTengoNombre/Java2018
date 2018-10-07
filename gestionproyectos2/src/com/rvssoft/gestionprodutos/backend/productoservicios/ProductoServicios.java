package com.rvssoft.gestionprodutos.backend.productoservicios;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;

/**
 * 
 * @see
 * @since 11 sept. 2018 : 22:22:32
 * @author Android
 *
 *         !!!!!! Interfaces Basica !!!!!!!!
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
	 * @return lee el numero del codigo de Producto
	 */
	public Producto read(int codigo);

	// INTERFACEs : List --> Permite duplicados - Hereda metodos de "COLLECTION"

	// Obtención de listas

	/**
	 * 
	 * @return List<Producto>
	 */
	public List<Producto> getAll();

	/**
	 * Recibe un valor de tipo Enum
	 * 
	 * @param Enum familia
	 * @return List<Producto>
	 */
	public List<Producto> getByFamilia(Familia familia);

	/**
	 * 
	 * @param familia
	 * @return
	 */
	public List<Producto> getByFamiliaStream(Familia familia);

	/**
	 * Devuelve una List<Producto> : necesita ArrayList para implementar sus metodos
	 * 
	 * @param min
	 * @param max
	 * @return List <Producto> entre un rango min y max
	 */
	public List<Producto> getByPriceRange(double min, double max);

	/**
	 * Devuelve una lista<Producto> comprendido entre 2 objetos tipo 'Date'
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return List<Producto> entre un rango 'objeto' de tipo Date
	 */
	public List<Producto> getBetweenDates(Date fecha1, Date fecha2);

	/**
	 * Devuelve una lista<Producto> comprendido entre 2 objetos tipo 'Date'
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return List<Producto> entre un rango 'objeto' de tipo Date
	 */
	public List<Producto> getBetweenDatesMio(Date fecha1, Date fecha2);

	/**
	 * Devuelve una lista<Producto> comprendido entre 2 objetos tipo 'Date'
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return List<Producto> entre un rango 'objeto' de tipo Date
	 */
	public List<Producto> getBetweenDatesStream(Date fecha1, Date fecha2);

//	Estadisticas

	/**
	 * Aunque ponga "Map" - devuelve un objeto de la clase 'HashMap' porque es la
	 * clase que lo implementa
	 * 
	 * @return 'Objeto' de tipo HashMap "String" y "Integer"
	 */
	public Map<String, Integer> getNumeroProductosByFamilia();

	/**
	 * Aunque ponga "Map" - devuelve un objeto de la clase 'HashMap' porque es la
	 * clase que lo implementa
	 * 
	 * @return 'Objeto' de tipo HashMap "String" y "Integer"
	 */
	public Map<String, Integer> getNumeroProductosByFamilia2();

	/**
	 * Aunque ponga "Map" - devuelve un objeto de la clase 'HashMap' porque es la
	 * clase que lo implementa
	 * 
	 * @return devuelve un 'Objeto' de tipo Map<String, Double> que necesita un
	 *         HashMap para ser implementado
	 */
	public Map<String, Double> getPrecioMedioByFamilia();
	
	/**
	 * 
	 * @return
	 */
	public Map<String, Double> getPrecioMedioByFamilia2();

	// Lógica de negocio

	/**
	 * 
	 * @param      double incremento
	 * @param Enum familia
	 * @return int producto incrementado
	 */
	public int incrementarPrecioToFamilia(double incremento, Familia familia);

	/**
	 * 
	 * @param double incremento
	 * @param List<Producto> productos
	 * @return int producto incrementado
	 */
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos);

}
