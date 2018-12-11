/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.paquete.java.utiles.clases.metodos;

import java.util.Arrays;
import java.util.Random;

/**
 * No tiene Constructores<br>
 * No instancia<br>
 * Metodo static<br>
 * Metodo Sobrecargados para usar tipos primitivos<br>
 *
 * @see p10
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2ClaseArrays {

 private static byte[] arrayBytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
 private static int[] arrayInt = new int[10];

 public static void main(String[] args) {

  int valorEncontrado1 = Arrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 0, 9, 6);
  System.out.println("Devuelve la posicion en la que se encuentra el elemento en el Array : " + valorEncontrado1);

  int valorEncontrado2 = Arrays.binarySearch(arrayBytes, (byte) 0, (byte) arrayBytes.length, (byte) 8);
  System.out.println("Devuelve la posicion en la que se encuentra el elemento en el Array : " + valorEncontrado2);

// Llena todas las posiciones del array con el numero aleatorio
  Arrays.fill(arrayInt, (new Random().nextInt(100) + 1));

  

 }
}
