/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.javadoc.etiquetascodigo;

/**
 * Clase que invoca el javadoc
 *
 * @author Raul Vela Salas
 * @since 25-oct-2018
 * @see Visitar www.adictosaltrabajo.com
 * @version 1.0
 */
public class EjemploJavaDoc {

 /**
  * Constante privada de gestion de errores
  */
 private static final int ERROR = 0;
 /**
  * Constante privada de gestion de errores
  */
 private static final int LOG = 0;
 /**
  * Constante privada de gestion de errores
  */
 private static final int INFO = 0;

 /**
  * Constructor por defecto : No inicializa nada
  */
 public EjemploJavaDoc() {
 }

 /**
  * Recibe un parametro y lo muestra por pantalla
  *
  * @param sError
  */
 void depura(String sError) {
  System.out.println("ejemplojavadoc: " + sError);
 }

 /**
  * Punto de entrada a la aplicacion : Lanza una excepcion directamente
  *
  * @exception RCException : Se genera una excepcion generica
  * @return true
  */
 public boolean ejecuta() throws RCException {
  /**
   * Retornamos 'true' por defecto
   */
  int error = 0;
  /**
   * Lanza la excepcion en caso de que el valor sea igual a 0
   */
  if (error == 0) {
   throw new RCException("Invocamos mi propia excepciones");
  }
  return true;
 }

 /**
  * Metodo principal
  *
  * @param args Array de argumentos
  */
 public static void main(String[] args) {

  EjemploJavaDoc objetoAuxiliar = new EjemploJavaDoc();

  try {
   objetoAuxiliar.ejecuta();
  } catch (RCException e) { // ejecutamos mi propia excepcion
   objetoAuxiliar.depura("Excepcion : " + e.getMessage());
  }
 }
}
