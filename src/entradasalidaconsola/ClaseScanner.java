/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalidaconsola;

import java.util.Scanner;

/**
 * @see pag 42
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ClaseScanner {

 public static void main(String[] args) {

  Scanner lector = new Scanner(System.in);
  System.out.println("Introduce una cadena : ");
  String next = lector.next();
  System.out.println("Leer cadena : " + next);

  System.out.println("Hasta un espacio : ");
  String nombre1 = lector.next();
  System.out.println("Salida : " + nombre1);

  System.out.println("Lee hasta el final de la linea de izq a derecha : ");
  String nombre2 = lector.nextLine();
  System.out.println("Salida : " + nombre2);

  System.out.println("Lee un entero: ");
  int edad;
  try {
   edad = lector.nextInt();
  } catch (java.util.InputMismatchException ime) {
   System.out.println("Salida del entero : " + ime.getMessage() + " Localizacion : " + ime.getLocalizedMessage());
  }
 }
}
