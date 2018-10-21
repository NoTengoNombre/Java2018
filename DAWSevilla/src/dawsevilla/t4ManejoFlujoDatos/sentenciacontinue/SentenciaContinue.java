/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.sentenciacontinue;

/**
 * @see -
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class SentenciaContinue {

 public static void main(String[] args) {

  //Declaracion de variables
  int contador;

  System.out.println("Imprimiendo los numeros pares que hay del 0 al 10 ...");
//Procesamiento y salida del informacion

  for (contador = 0; contador < 10; contador++) {
   if (contador % 2 != 0) {
    System.out.println("Permite el continue");
    continue;
// ("No permite el continue");
   }
   System.out.println(contador + " ");
  }
  System.out.println("\nFin del programa");
  /**
   * Las iteraciones del bucle que generan la impresion de cada uno de los
   * numeros pares , seran aquellos en las que el resultado de calcular el resto
   * de la division entre 2 de cada valor de la variable contador sera de 0
   */

 }

}
