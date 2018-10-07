/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag65SentenciasContinue {

 public static void main(String[] args) {

  int i = 0;
  while (i < 10) {
   i++;
   if (i == 5) {
    System.out.println("Continua : " + i);
    continue; // si el 'i' esta dentro del bucle y debajo del 'continue' se repite la ejecución
   }
//   i++; // genera un bucle infinito
  }
 }
}
