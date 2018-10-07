// Interfaces
package gestionproductos.backend.services;

import java.util.Date;
import java.util.List;
import java.util.Map;

import gestionproductos.backend.model.Familia;
import gestionproductos.backend.model.Producto;

 

/**
 * 
 * @author Formacion
 *
 */
public interface ProductoServices {

	//Operaciones CRUD (solo create y read)
	
	public void create(Producto producto);
	public Producto read(int codigo);
	
	//Obtención de listas 
	
	public List<Producto> getAll();
	public List<Producto> getByFamilia(Familia familia);
	public List<Producto> getByPriceRange(double min, double max); 
	public List<Producto> getBetweenDates(Date fecha1, Date fecha2);
	
	//Estadisticas
	
	public Map<String,Integer> getNumeroProductosByFamilia();
	public Map<String,Double> getPrecioMedioByFamilia();
	
	//Lógica de negocio
	
	/**
	 * 
	 * @author Formacion - Raul Vela Salas
	 * 
	 * <h1> Soy un header h1 de HTML </h1>
	 * <p> Soy <strong> header </strong> parrafo </p>
	 *  
	 * @param incremento Porcentaje a incrementar
	 * @param familia objeto
	 * @return Retorna el numero de productos modificados
	 */
	public int incrementarPrecioToFamilia(double incremento, Familia familia);
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos);	
	
}
