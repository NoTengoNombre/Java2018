/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see Libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag66Etiquetas {

 private static int num = (int) (Math.random() * (1 + 10) + 2);

 public static void main(String[] args) {

  System.out.println("Numero generado : " + num);

  int i = 0;
  bucleext:
  while (i < 100) {
   i++;
   for (int j = 0; j < i; j++) {
    if (i == num) {
     break bucleext;
    }
    System.out.print("*");
   }
   System.out.println("");
  }
  System.out.println("");
 }

}
