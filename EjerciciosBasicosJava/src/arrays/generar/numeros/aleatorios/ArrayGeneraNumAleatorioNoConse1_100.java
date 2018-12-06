/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.generar.numeros.aleatorios;

import java.util.Arrays;

/**
 * @see - Iterar y Comprobar valores dentro de un array
 * @since 02-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ArrayGeneraNumAleatorioNoConse1_100 {

 static int[] a = new int[100];
 static int[] nAc = new int[a.length];

 public static void ver() {
  System.out.println("-----------");
  int c = 1;
  for (int indice : a) {
   if ((c++ % 10) == 0) {
    System.out.println(" ");
   } else {
    System.out.print(indice + " ");
   }
  }
  System.out.println("");
 }

 public static void setGenerar1_100() {
  for (int i = 1; i < a.length; i++) {
   nAc[0] = a[0];
   for (int j = 0; j < i; j++) {
    int num;
    if (a[j] == a[i]) {
     do {
      num = (int) (Math.random() * (1 + 99) + 1);
      for (int k = 0; k < i; k++) {
       if ((num == a[k]) || (num == nAc[k])) {
        num = (int) (Math.random() * (1 + 99) + 1);
        nAc[i] = num;
       }
      }
     } while ((num == a[j]) && (num == a[i]) || (nAc[i] == num));
     nAc[i] = a[i] = num;
    }
   }
  }
  ver();
 }

 public static void main(String[] args) {

  setGenerar1_100();
  Arrays.sort(a);
  ver();

 }
}
