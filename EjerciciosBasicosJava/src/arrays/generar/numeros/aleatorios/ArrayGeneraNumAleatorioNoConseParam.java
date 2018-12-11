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
public class ArrayGeneraNumAleatorioNoConseParam {

 public static void ver(int[] a) {
  System.out.println("-----------");
  for (int i : a) {
   System.out.print(i + " ");
  }
  System.out.println("");
 }

 public static void setGenerarMatricesNoConsecutivos(int longitud) {

  int[] a = new int[longitud];
  int[] nAc = new int[a.length];

  for (int i = 1; i < a.length; i++) {
   for (int j = 0; j < i; j++) {
    int num;
    if (a[j] == a[i]) {
     do {
      num = (int) (Math.random() * (1 + longitud) + 1);
      for (int k = 0; k < i; k++) {
       if ((num == a[k]) || (num == nAc[k])) {
        num = (int) (Math.random() * (1 + longitud) + 1);
        nAc[i] = num;
       }
      }
     } while ((num == a[j]) && (num == a[i]) || (nAc[i] == num));
     nAc[i] = a[i] = num;
    }
   }
  }
  ver(a);
 }

 public static void main(String[] args) {

  setGenerarMatricesNoConsecutivos(4);

 }
}
