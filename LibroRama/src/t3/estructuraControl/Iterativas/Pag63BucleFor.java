/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag63BucleFor {

 private static int contador = 0;

 public static void main(String[] args) {

  int numero;
  int numero2;
  for (numero = 0; numero <= 10; numero += 2) {
   System.out.print("*\t");
   System.out.print(contador++ + "\t");
   for (numero2 = 0; numero2 <= 10; numero2++) {
    System.out.print("*\t");
    System.out.print(contador++ + "\t");
   }
  }
  System.out.println("");
 }
}
