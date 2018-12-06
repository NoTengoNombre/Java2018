/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejercicio.crear.array;

import java.util.Random;

/**
 * @see -
 * @since 29-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2EjCrearArray {

}

class ArrayInt {

 private int numAl = new Random().nextInt(49) + 1;
 private static int contador;
 private int[] array;
 private int[] array1 = new int[]{numAl, numAl, numAl, numAl, numAl, numAl, numAl, numAl};

 public ArrayInt() {
  array = new int[6];
 }

 public ArrayInt(int longitud) {
  array = new int[longitud];
 }

 public void rellenar(int i) {
  System.out.println("Ejecutado : " + (contador++) + " veces");
  if (contador <= array.length) {
   array[i] = i;
  }
 }

 public void rellenar() {
  for (int i = 0; i < array.length; i++) {
   array[i] = numAl;
  }
  for (int i = 0; i < array.length; i++) {
   for (int j = 0; j < array[i]; j++) {
    if (array[i] == array[j]) {
     array[i] = numAl;
    }
   }
  }

 }

 public void ordenar() {

 }

 public void visualizar() {

 }

}
