// Interfaces
package anteriores_paquetes;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.model.Familia;
import com.rvssoft.gestionproductos.backend.model.Producto;

public interface ProductoServicesCopiaSeguridad {

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
	
	public int incrementarPrecioToFamilia(double incremento, Familia familia);
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos);	
	
}
