/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.operadores;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class moduloResto {

 public static void main(String[] args) {

  for (int i = 0; i <= 10; i++) {
   if (i % 1 == 0) {
    System.out.println("Si - " + i);
   }
  }
  System.out.println("--------------");

  for (int i = 0; i <= 10; i++) {
   if (i % 2 == 0) {
    System.out.println("Si - " + i);
   }
  }
  System.out.println("--------------");

  for (int i = 0; i <= 10; i++) {
   if (i % 3 == 0) {
    System.out.println("Si - " + i);
   }
  }
  System.out.println("--------------");

  for (int i = 1; i <= 16; i += 1) {
   if (i % 2 != 0) {
    System.out.println("Si - " + i);
   }
  }
  System.out.println("--------------");

 }
}
