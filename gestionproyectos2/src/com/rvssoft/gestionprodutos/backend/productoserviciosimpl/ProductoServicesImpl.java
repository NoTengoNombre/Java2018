package com.rvssoft.gestionprodutos.backend.productoserviciosimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.rvssoft.gestionproductos.backend.dummydb.DummyDB;
import com.rvssoft.gestionproductos.backend.familia.Familia;
import com.rvssoft.gestionproductos.backend.familia.Producto;
import com.rvssoft.gestionprodutos.backend.productoservicios.ProductoServicios;

/**
 * @see
 * @since 11 sept. 2018 : 20:59:49
 * @author Android - Raul
 *
 */
public class ProductoServicesImpl implements ProductoServicios {

	/**
	 * Invocamos la clase 'DummyDB'
	 * 
	 * para simular una llamada a la BD poder invocar todos sus metodos
	 * 
	 * "Es el control remoto para llamar a los atributos y metodos de las otras
	 * clases"
	 */
	private DummyDB dummyDB = new DummyDB();

	/**
	 * Constructor por defecto
	 */
	public ProductoServicesImpl() {
	}

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

	/**
	 * Metodo 'put' de la Interface "Map" que recibe 2 parametros:
	 * 
	 * (int codigoProducto, Objeto producto) que mediante la clase 'HashMap'
	 * 
	 * Creamos un objeto 'producto' y le introducimos su key
	 */
	@Override
	public void create(Producto producto) {
//		objecto.interface.........metodo(Integer...........,objeto...);
		dummyDB.getMapaProductos().put(producto.getCodigo(), producto);
	}

	/**
	 * Metodo de la Interface Map
	 * 
	 * Lee un codigo mediante un entero
	 */
	@Override
	public Producto read(int codigo) {
//		       objecto.interface.......metodo(Integer);
		return dummyDB.getMapaProductos().get(codigo);
	}

	/**
	 * Devuelve un objeto <strong>ArrayList</strong> "TipoProducto"
	 */
	@Override
	public List<Producto> getAll() {
//		---------------Clase<Producto>(objetos.metodoMap.......().metodoDevuelveProductos()
//		Creamos una lista de objetos que tiene por parametros una lista de objeto Productos
//		Devuelve una lista de objetos 'Clave,Valor'
		return new ArrayList<Producto>(dummyDB.getMapaProductos().values());
	}

	/**
	 * Funcion Basica
	 */
	@Override
	public List<Producto> getByFamilia(Familia familia) {
		// Interface List del Objeto Producto implementado por la clase
		// ArrayList<Producto>
		List<Producto> orderProductoByFamilia = new ArrayList<Producto>();
		// Interface List del Objeto <Producto> que apunta a una referencia del metodo
		// getAll() que devuelve un ArrayList de producto
		List<Producto> allProducto = getAll();
		// Recorremos el ArrayList de productos
		for (Producto producto : allProducto) {
//			 Comparamos lo que tenemos en la bd 'dummyDB' 
//			con lo que le pasamos por parametro
			// Si : La familia por parametro esta dentro de la lista de Familia de la
			// 'dummyDB'
			if (producto.getFamilia().equals(familia)) {
//				Entonces lo añadimos a la nueva lista de producto
				orderProductoByFamilia.add(producto);
			}
		}
		// Devuelve una ArrayList<Producto> por familia
		return orderProductoByFamilia;
	}

	/**
	 * Funcion Stream
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> getByFamiliaStream(Familia familia) {
		return (List<Producto>) dummyDB.getMapaProductos().values()
				.stream()
				.filter(p -> p.getFamilia().equals(familia));
	}

	/**
	 * Metodo que devuelve una objeto 'PAQUETE' List de productos despues de pasarle
	 * por parametro un minimo y un maximo
	 */
	@Override
	public List<Producto> getByPriceRange(double min, double max) {
// Creamos un 'objeto' de tipo List<Producto> que se implementa con una clase ArrayList<Producto>
		List<Producto> orderProductByPriceRange = new ArrayList<Producto>();
// Creamos un 'objeto' de tipo List<Producto> llamado 'allProducto' que apunta o almacena una referencia a 'getAll()'
		List<Producto> allProductos = getAll();

		// Recorremos con un foreach todos los objetos de tipo 'Producto' almacenados
		// dentro
		// de la referencia 'allProductos'
		if (min < max) {
			for (Producto producto : allProductos) {
// Si : Objeto producto es mayor que el minimo '&&' menor que el maximo
				if ((producto.getPrecio() >= min) && (producto.getPrecio() <= max)) {
					// Añadimos el objeto a la List de objetos productos
					orderProductByPriceRange.add(producto);
				}
			}
		} else { // Sino Apunta a 'null'
			System.out.println("Error al introducir los datos");
			// Devuelve un objeto apunta a null
			orderProductByPriceRange = null;
		}
		return orderProductByPriceRange;
	}

	/**
	 * Que necesito hacer : Obtener un ArrayList de 'Producto'
	 * 
	 * Como lo consigo o hago : Metiendo 2 fechas y comparandolas
	 * 
	 * Que he conseguido u obtenido : Devolver un objeto ArrayList 'producto' con
	 * las 2 fechas
	 */
	@Override
	public List<Producto> getBetweenDatesMio(Date fecha1, Date fecha2) {
		// 1º Creamos un nuevo ArrayList para almacenar los objetos que esten entre
		// ambas fechas
		List<Producto> productosGetBetweenDates = new ArrayList<Producto>();
		// 2º Almacenamos en el objeto de tipo Interface List<Producto> una referencia
//		a un objeto de tipo ArrayList - Menos consumo de memoria , acceso mas rapido
		List<Producto> allProductos = getAll();

		// Forach : Desde 'producto' hasta 'Todos los productos'
		for (Producto producto : allProductos) {

			Date fechaAlta = producto.getFechaAlta();

			if ((fecha1.compareTo(fechaAlta) < 0) && (fecha2.compareTo(fechaAlta) > 0)) {
				System.out.println("Soy fecha 1 : " + fecha1 + "Soy fecha 2 : " + fecha2);
				productosGetBetweenDates.add(producto);
			}
		}
		return productosGetBetweenDates;
	}

	/**
	 * Qué necesito hacer o conseguir
	 * 
	 * Como lo consigo o hago
	 * 
	 * Que tengo que usar
	 * 
	 * Que he conseguido u obtenido
	 * 
	 * Dividir el problema en pequeñas partes
	 * 
	 */
	@Override
	public List<Producto> getBetweenDates(Date fecha1, Date fecha2) {

		List<Producto> productGetBetweenDates = new ArrayList<Producto>();

		List<Producto> allProductos = getAll();

		for (Producto producto : allProductos) {
			if ((producto.getFechaAlta().after(fecha1)) && (producto.getFechaAlta().before(fecha2))) {
				productGetBetweenDates.add(producto);
			}
		}

		return productGetBetweenDates;
	}

	/**
	 * 
	 */
	@Override
	public List<Producto> getBetweenDatesStream(Date fecha1, Date fecha2) {
		return dummyDB.getMapaProductos() // obtenemos Map de Productos
				.values() // de ese Map obtenemos los valores
				.stream() // obtenemos un acceso secuencia a los elementos 'cogiendo 1 a 1'
				.filter(p -> p.getFechaAlta().compareTo(fecha1) >= 0 && (p.getFechaAlta().compareTo(fecha2) <= 0))
				.collect(Collectors.toList());
	}

	/**
	 * 
	 */
	@Override
	public Map<String, Integer> getNumeroProductosByFamilia() {
		// Necesito 3 variables para almacenar los productos
		int nsoftware = 0;
		int nhardware = 0;
		int nconsumible = 0;
// Obtenemos una Lista de productos
		List<Producto> listaProductos = new ArrayList<Producto>(dummyDB.getMapaProductos().values());
// Creamos un Map implementado con un HashMap
		Map<String, Integer> numeroProducto = new HashMap<String, Integer>();
// Recorro la lista de objetos 'listaProductos'
		for (Producto p : listaProductos) {
			// Tipo 'familia'
			switch (p.getFamilia()) {
			case SOFTWARE:
				nsoftware++;
				break;
			case HARDWARE:
				nhardware++;
				break;
			case CONSUMIBLE:
				nconsumible++;
				break;
			}
		}
		// Agregamos al Map con el metodo put los tipos de Familia y el numero de
		// elementos que tienen
		numeroProducto.put("SOFTWARE", nsoftware);
		numeroProducto.put("HARDWARE", nhardware);
		numeroProducto.put("CONSUMIBLE", nconsumible);
		return numeroProducto;
	}

	/**
	 * Que necesito hacer : Obtener productos a partir de una familia
	 * 
	 * Como lo conseguido o hago : Tengo que llamar al tipo Enum 'Familia' y
	 * compararlo con un bucle que recorra todos los objeto 'Productos' y sacarle su
	 * 'codigo'
	 * 
	 * Que he conseguido u obtenido
	 * 
	 */
	@Override
	public Map<String, Integer> getNumeroProductosByFamilia2() {
		// Inicializamos el Map de 'objetos<String,Integer>' que esta implementado por
		// un HashMap
		// para almacenar valores
//		Interface            objeto          Clase Implementa la Interface 'Map'
		Map<String, Integer> mapFamily = new HashMap<>(); // Se usa para almacenar datos
		// Recorre todos los valores de los objetos 'Enum' de tipo 'Familia'
		for (Familia familia : Familia.values()) {
			// Recorremos el 'Enum' de familias
			mapFamily.put(familia.name().toString(), getByFamilia(familia).size());
			// Añadimos con 'put' el nombre de las familias
			// como 'key' siempre el toString, y como 'value' el 'size' de la familia
		}
		return mapFamily;
	}

	/**
	 * 
	 * @return numeroProductos
	 */
	public Map<String, Double> getPrecioMedioByFamilia() {
//		Obtener el numero de productos
		int nsofware = 0;
		int nhardware = 0;
		int nconsumibles = 0;
//		Obtener la sumatoria de productos
		double totalSoftware = 0;
		double totalHardware = 0;
		double totalConsumible = 0;
// 'List' de productos
		List<Producto> listaProductos = new ArrayList<Producto>(dummyDB.getMapaProductos().values());
// 'Map' para almacenar los valores no ordenados y ni duplicados mediante la 
//	clase HashMap que implementa los metodos de la Interface Map
		Map<String, Double> numeroProductos = new HashMap<String, Double>();
		// Recorremos todos los productos del List<Producto> implementados por ArrayList
		for (Producto p : listaProductos) {
//			Obtenemos la familia			
			switch (p.getFamilia()) {
			case SOFTWARE:
				nsofware++;
				totalSoftware += p.getPrecio();
				break;
			case HARDWARE:
				nhardware++;
				totalHardware += p.getPrecio();
				break;
			case CONSUMIBLE:
				nconsumibles++;
				totalConsumible += p.getPrecio();
				break;
			}
		}

		numeroProductos.put(Familia.SOFTWARE.toString(), totalSoftware / nsofware);
		numeroProductos.put(Familia.HARDWARE.toString(), totalHardware / nhardware);
		numeroProductos.put(Familia.CONSUMIBLE.toString(), totalConsumible / nconsumibles);

		return numeroProductos;
	}

	/**
	 * 
	 */
	@Override
	public Map<String, Double> getPrecioMedioByFamilia2() {
// Inicializa 'Map'                     Implementa el Map con la Clase HashMap
		Map<String, Double> mapFamily = new HashMap<>();
// Declara 2 variables para almacenar ambos valores
		double sumPrecio = 0;
		double average = 0;
//		1º For : Recorre todos los valores del tipo Enum
		for (Familia familia : Familia.values()) {
//			2º For : Recorre todas las familias con 'getByFamilia' que devuelve un ArrayList
//			de la clase Producto
			for (Producto p : getByFamilia(familia)) {
				// Sacamos todos los precios por familia
// Seria : Familia = HardWare - Precio - 100 , 200 , 300 depende de la cantidad elementos del objeto 'Producto'
// que tenga una familia determinada
				sumPrecio += p.getPrecio();
			}
			// La media es : La sumatoria de todos los precios / cantidad de productos de
			// esa familia
			average = sumPrecio / getByFamilia(familia).size();
			// Añadimos al objeto 'mapFamily'
//			El nombre de la Familia y la media de esa familia
			mapFamily.put(familia.name().toString(), average);
		}
		// Devuelve un objeto HashMap
		return mapFamily;
	}

	/**
	 * Recibe por parametro objeto 'Familia' hardware y un incremento
	 */
	@Override
	public int incrementarPrecioToFamilia(double incremento, Familia familia) {
// Almacenar resultado		
		int resultado = 0;
// Creamos un ArrayList de Productos y le pasamos por parametros un array de Map
		List<Producto> listaProductos = new ArrayList<Producto>(dummyDB.getMapaProductos().values());
// Creamos una instancia HashMap 'que almacenara' sin orden y no acepta nulos
		Map<String, Double> numerosProductos = new HashMap<String, Double>();
// Recorremos la lista de TODOS los objetos
		for (Producto p : listaProductos) {
			if (p.getFamilia() == familia) {
				p.setPrecio((int) (p.getPrecio() + (int) p.getPrecio() * incremento));
				resultado++;
			}
		}
		return resultado;
	}

	/**
	 * Recibe por parametro el incremento y una lista List<Producto>
	 * 
	 * .values() - Devuelve una 'VISTA' de todos los valores de objeto 'MAP'
	 * 
	 * Los cambios que se realiza en el Map se reflejan en la Collection
	 */
	@Override
	public int incrementarPrecioToProductList(double incremento, List<Producto> listaProductosPorParam) {
//      almacenamos el resultado
		int resultado = 0;
// Obtenemos todos los productos en un ArrayList de Producto
		List<Producto> allProductos = new ArrayList<>(dummyDB.getMapaProductos().values());
// Recorremos lista de productos que pertenece al HashMap
		for (Producto vistaProductos : allProductos) { // allProductos = Tiene una VISTA de los 'VALORES' del Map
// Recorremos los productos que nos llegan desde los argumentos del metodo 			
			for (Producto listaProduct : listaProductosPorParam) {
//				Comparamos el codigo del producto == con la lista de productos que te llegan por parametro
				if (vistaProductos.getCodigo() == listaProduct.getCodigo()) {
					vistaProductos.setPrecio(
							(int) ((int) vistaProductos.getPrecio() + (int) vistaProductos.getPrecio() * incremento));
					resultado++;
				}
			}
		}
		return resultado;
	}

}
