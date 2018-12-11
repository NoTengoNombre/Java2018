/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.generar.numeros.aleatorios;

/**
 * @see - Iterar y Comprobar valores dentro de un array
 * @since 02-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ArrayGeneraNumAleatorioNoConse1_4 {

 static int[] a = {1, 1, 1, 1};
 static int[] nAc = new int[a.length];

 public static void ver() {
  System.out.println("-----------");
  for (int indice : a) {
   System.out.print(indice + " ");
  }
  System.out.println("");
 }

 public static void main(String[] args) {
  ver();

  for (int i = 1; i < a.length; i++) {
   nAc[0] = a[0];
   for (int j = 0; j < i; j++) {
    int num;
    if (a[j] == a[i]) {
     do {
      num = (int) (Math.random() * (1 + 3) + 1);
      for (int k = 0; k < i; k++) {
       if ((num == a[k]) || (num == nAc[k])) {
        num = (int) (Math.random() * (1 + 3) + 1);
        nAc[i] = num;
       }
      }
     } while ((num == a[j]) && (num == a[i]) || (nAc[i] == num));
     nAc[i] = a[i] = num;
    }
   }
  }

  System.out.println("");
  ver();
 }
}
