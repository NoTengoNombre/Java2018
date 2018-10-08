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
public class Ejercicios1 {

 public static void main(String[] args) {

  int x = 0;
  int y = 0;

  while (x < 5) {
   x = x + 1; // 1
   y = y + x; // 1

//   y = y + 1;
//   if (y > 4) {
//    y = y - 1;
//   }
   if (y > 5) {
    x = x + 1;
    if (y < 3) {
     x = x - 1;
    }
   }
   y = y + 2;
//   y = y + 1;
//   if (y > 4) {
//    y = y - 1;
//   }
//   y = x - y;
//   y = y + x;

   System.out.print(x + "" + y + " ");
   x--;
  }
 }
}
