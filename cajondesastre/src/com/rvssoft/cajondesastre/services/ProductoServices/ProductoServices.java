package com.rvssoft.cajondesastre.services.ProductoServices;

import java.util.List;

import com.rvssoft.cajondesastre.model.model6.Familia;
import com.rvssoft.cajondesastre.model.model6.Producto;

/**
 * hacer una lista de las cosas que quiero hacer 'me hace ilusion hacer estas
 * cosas'
 *
 * @author Formacion
 *
 */
public interface ProductoServices {

 /**
  * Este metodo devuelve un objeto pero con un ID que tiene otorgado
  *
  * @param producto
  */
 public void create(Producto producto);

 /**
  * Le paso un codigo y busca el producto en la bd DAO Metodo de base de datos
  *
  *
  * @param codigo
  * @return
  */
 public Producto read(int codigo);

 /**
  * Actualizar productos DAO Metodo de base de datos
  *
  * @param producto
  */
 public void update(Producto producto);

 /**
  * Borrar productos - DAO Metodo de base de datos
  *
  * @param producto
  */
 public void delete(Producto producto);

 /**
  * Mala practica porque no puede coger todos los valores
  * @return 
  */
 public List<Producto> getAll();

 /**
  * Indicandos los metodos dentro de la interfaces
  *
  * @param familia
  * @return
  */
 public List<Producto> getByFamilia(Familia familia);
}
