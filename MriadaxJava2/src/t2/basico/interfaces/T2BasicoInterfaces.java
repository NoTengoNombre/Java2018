/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces;

/**
 * @see p3
 * @since 06-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2BasicoInterfaces {

}

/**
 * Modificador a nivel de paquete
 *
 * @author MyDevelop
 */
interface Visualizar {

 /**
  * Procedimiento de la interfaz : sin implementacion y publico para ser
  * implementado en la clase que lo 'implements'
  *
  * @param pos
  */
 public void verUnaPareja(int pos);

 /**
  * Procedimiento de la interfaz : sin implementacion y publico para ser
  * implementado en la clase que lo 'implements'
  *
  * @param clave
  */
 public void verUnaParejaPorClave(Object clave);

 /**
  * Procedimiento de la interfaz : sin implementacion y publico para ser
  * implementado en la clase que lo 'implements'
  */
 public void listarParejas();

}
