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
public class Pag66SentenciasBreakContinuePiramide {

 public static void main(String[] args) {

  int i = 0;
  bucleext:
  while (i < 20) {
   i++;
   for (int k = 0; k < (20 - i); k += 2) {
    if (i % 2 == 0) {
     continue bucleext;
    }
    System.out.print("-");
   }
   for (int j = 0; j < i; j++) {
    System.out.print("*");
   }
   System.out.println("");
   if (i == 19) {
    break bucleext;
   }
  }
 }
}
