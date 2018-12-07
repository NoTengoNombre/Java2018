/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces.referencias;

/**
 * @see p9
 * @since 06-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public interface Gestionar {

 public int cantidadElementos();

 public boolean estaLlena();

 public boolean estaVacia();

 public boolean correctaClave(Object clave);

 public Object getValor(Object clave);

 public boolean agregarUnElemento(Object clave, Object valor);

 public boolean borrarUltimoElemento();

}
