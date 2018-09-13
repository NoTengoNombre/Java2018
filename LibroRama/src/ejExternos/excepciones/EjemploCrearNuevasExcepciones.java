/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.excepciones;

/**
 * @see http://elvex.ugr.es/decsai/java/pdf/B2-excepciones.pdf
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploCrearNuevasExcepciones {

 public static void main(String[] args) {

  DivideByZeroException dbze = new DivideByZeroException("!!!!!!!!!!ERROR!!!!!!!!!!");
  dbze.dividir(10, 0);
  DivideByZeroException dbze1 = new DivideByZeroException();
  dbze1.dividir(10, 0);

 }
}

class DivideByZeroException extends ArithmeticException {

 public DivideByZeroException() {
 }

 public DivideByZeroException(String mensaje) {
  super(mensaje);
 }

 public double dividir(int num, int den) throws DivideByZeroException {
  if (den == 0) {
   throw new DivideByZeroException("Error en la operacion : " + den);
  }
  return (double) num / (double) den;
 }

}
