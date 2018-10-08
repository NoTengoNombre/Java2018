/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ejercicios;

/**
 * @see 49
 * @since 08-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ejercicios {

 public static void main(String[] args) {
  int x = 1;

//  while (x < 10) {
//   if (x > 3) {
//    System.out.println("Una X");
//   }
//  }
  int xx = 5;
  while (xx > 1) {
   xx--;
   if (xx < 3) {
    System.out.println(String.format("Otra X %d", xx));
   }
  }

  int x1 = 5;
  while (x1 > 1) {
   x1 = x1 - 1;
   if (x1 < 3) {
    System.out.printf("\nPues X %d ", x1);
   }
  }
  System.out.println("");

 }
}
