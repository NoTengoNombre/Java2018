/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

import java.util.Scanner;

/**
 * @see -
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Sentencias {

 public static void main(String[] args) {

  Scanner teclado = new Scanner(System.in);

  int i; // Sentencia de creacion de variables
  i = teclado.nextInt(); // Sentencias de asignacion
  boolean esPar = i % 2 == 0 ? true : false; // Setencia de asignacion
  if (esPar == true) { // Sentencia de decision simple
   System.out.println("Se ha tecleado un numero par"); // Sentencia para invocar el metodo println y ejecutar su instrucción
   
  } else {
   System.out.println("Se ha tecleado un numero impar");
  }

 }
}
