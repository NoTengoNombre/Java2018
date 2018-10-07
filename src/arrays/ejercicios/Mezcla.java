/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicios;

/**
 * @see pag 48
 * @since 08-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Mezcla {

 public static void main(String[] args) {
  int x = 3;

  while (x > 0) {
   if (x > 2) {
    System.out.print("a");
   }

   x--;
   System.out.print("-");

   if (x == 2) {
    System.out.print("b c");
   }

   if (x == 1) {
    System.out.print("d");
    x--;
   }
  }
  System.out.println("");

 }
}
