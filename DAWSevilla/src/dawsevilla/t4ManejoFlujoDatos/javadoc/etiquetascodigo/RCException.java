/*
 * ejemplojavadoc.java 
 *
 */
package dawsevilla.t4ManejoFlujoDatos.javadoc.etiquetascodigo;

/**
 * La Clase que comienza la estructura de excepciones
 *
 * @author Raul Vela Salas
 * @since 25-oct-2018
 * @version 1.0
 * @see visitar www.adictosaltrabajo.com
 */
public class RCException extends Exception {

 /**
  * Constructor de la clase que recibe un parametro lo inicializa como un objeto
  * de la clase Exception y se lo pasa al metodo de la clase
  *
  * @param psError
  */
 public RCException(String psError) {
  super(psError);
  depura(psError);
 }

 /**
  * Recibe un parametro y lo muestra por pantalla
  *
  * @param psError
  */
 void depura(String psError) {
  System.out.println("Error : " + psError);
 }

}
