/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.excepciones;

import java.io.IOException;

/**
 * @see http://elvex.ugr.es/decsai/java/pdf/B2-excepciones.pdf
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploPropagacionExcepcionesHaciaArriba {

}

/**
 * Un metodo puede lanzar una excepcion porque crea explicitamente un objeto
 * "Throwable" y lo hace con "throw" o bien porque llame a un metodo que genere
 * la excepcion y no la capture
 *
 * @author Robot
 */
class ErrorPropaga {

 /**
  * Metodo que propaga una excepcion
  *
  * @throws IOException
  */
 public void funcionPropagaExcepcion() throws IOException {
// Fragmento de codigo que puede lanzar una excepcion
// de tipo IOException
 }

 /**
  *
  */
 public void funcionNoPropagaExcepcion() {
  // Fragmento de codigo libre de excepciones
//  try {
  // Fragmento de codigo libre que puede
  // lanzar una excepcion de tipo IOException
//    Ejemplo . Acceso a un fichero
//  } catch (IOException error) {
//   Tratamiento de la excepcion
//  } finally {
//   Liberar recursos (siempre se hace)
//  }
 }
}

