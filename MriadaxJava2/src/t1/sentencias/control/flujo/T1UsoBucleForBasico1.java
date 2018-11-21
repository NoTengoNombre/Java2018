/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @see @since 19-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoBucleForBasico1 {

 public static void main(String[] args) {

  Scanner teclado = new Scanner(System.in);

  int numero = 0;
  boolean b = false;

  System.out.println("Tabla de multiplicar");
  System.out.println("Introduce un numero");
  try {
   numero = teclado.nextInt();
  } catch (InputMismatchException ime) {
   System.out.println("Error : " + ime.getMessage());
   b = true;
  } finally {
   if (b) {
    System.out.println("Tienes que introducir un numero");
   } else {
    for (int i = 0; i <= 10; i++) {
     System.out.println(numero + " * " + i + " = " + (numero * i));
    }
   }
  }
 }
}
