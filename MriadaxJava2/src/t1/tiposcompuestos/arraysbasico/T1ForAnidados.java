/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

import java.util.Random;

/**
 * @see p15
 * @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1ForAnidados {

 public static void main(String[] args) {

  Random aleatorio = new Random();

  int apuestas = aleatorio.nextInt(10) + 1;

//  Crear array de 2 dimensiones
  int[][] numeros = new int[apuestas][6];
//  Recorrer array de 2 dimensiones
//  Almacenando un valor en cada posicion
  System.out.println("Apuestas : " + numeros.length);

  for (int i = 0; i < numeros.length; i++) {
   for (int j = 0; j < numeros[i].length; j++) {
    numeros[i][j] = aleatorio.nextInt(49) + 1;
   }
  }

  for (int[] apuesta : numeros) {
   for (int numero : apuesta) {
    System.out.print(numero + "\t");
   }
   System.out.println();
  }

 }
}
