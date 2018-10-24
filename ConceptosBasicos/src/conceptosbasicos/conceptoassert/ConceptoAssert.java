/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos.conceptoassert;

import java.util.Random;

/**
 * Assert : En un determinado momento del código una determinada condición debe
 * ser cierta
 *
 * @see
 * https://picodotdev.github.io/blog-bitix/2015/02/la-palabra-clave-assert-de-java-y-un-ejemplo/
 * @since 23-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ConceptoAssert {

 public static void main(String[] args) {

  Main main = new Main();
  System.out.println(main.nextNumber());

 }
}

class Main {

 private Random random;

 public Main() {
  random = new Random();
 }

 /**
  * Devuelve un numero entero entre 0 y 9
  *
  * @return
  */
 public int nextNumber() {
  int i = random.nextInt(40);

// Si el calculo del numero fuese más complejo incluyendo un assert
// podemo8s asegurar en tiempo de desarrollo en esta postcondicion
// el valor generado por este metodo
//
// La linea de codigo anterior segun el contrato del metodo deberia ser
// int i = random.nextInt(10);
//-- AFIRMAMOS / ASEGURAMOS / IMPONEMOS --
  assert (i >= 0) && (i < 10) : String.format("El numero devuelto no cumple la postcondicion (%d)", i);
// Devuelve un num entre 0 y 40 
  return i;
 }

}
