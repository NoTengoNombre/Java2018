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
public class Pag64BucleDoWhile {

 private static int numero = 1;

 public static void main(String[] args) {

  final int total = 10;

  do {
   System.out.println("- " + numero);

  } while (numero++ < total);
 }

 
 
 
}
