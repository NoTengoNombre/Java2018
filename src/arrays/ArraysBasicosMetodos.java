/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;

/**
 * @see pag44
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ArraysBasicosMetodos {

 private static int a = (int) (Math.random() * 10), b = (int) (Math.random() * 10);

 private static int[] array = {1, 2, 3, 4, 5};
 private static int[] origen = {1, 2, 3, 4, 5};
 private static int[] destino = new int[4];
 private int[] arrayAleatorio = {getNA(), getNA(), getNA(), getNA(), getNA(), getNA(), getNA()};
 private static int[] arrayAleatorio2 = {getMA(), getMA(), getMA(), getMA(), getMA(), getMA(), getMA()};

 private static boolean[] isTrue(boolean... valor) {
  return valor;
 }

 public int getNA() {
  return (int) (Math.random() * 10);
 }

 public int[] getArrayElementos() {
  return arrayAleatorio;
 }

 /**
  * Con la instanciacion de un objeto dentro del metodo STATIC 'solo 1 copia'
  * podemos obtener un numero aleatorio distinto ya que cada vez que se invoca
  * al metodo getMA() obtenemos un nuevo objeto tendra su propio numero
  * aleatorio
  *
  * Un objeto distinto con su propio numero aleatorio
  *
  * @return devuelve un objeto distinto 'una copia'
  */
 public static int getMA() {
  ArraysBasicosMetodos abm = new ArraysBasicosMetodos();
  return abm.getNA();
 }

 public static void main(String[] args) {
  ArraysBasicosMetodos abm = new ArraysBasicosMetodos();

  System.out.println("valor : " + a);
  System.out.println("valor : " + b);
  boolean[] aTrue = isTrue((a > b), (a < b), (a >= b), (a <= b), (a == b), (a != b));

  System.out.println("Ver : " + Arrays.toString(aTrue));

  System.out.println("--------------------");

  int c = 1;
  for (boolean condicion : aTrue) {
   System.out.println(String.format("%dº Valor: %15b \n", c++, condicion));
  }

  System.out.println("--------------------");

  int length = aTrue.length;
  System.out.println("Longitud : " + length);

  int[] aEnt = new int[8];
  System.out.println("Longitud : " + aEnt.length);

  System.out.println("---------------------");

  System.arraycopy(origen, 0, destino, 0, destino.length);
  for (int i : destino) {
   String salida = String.format("-%5d \n", i);
   System.out.println(salida);
  }

  String cadenaElementos = Arrays.toString(array);
  System.out.println(String.format("%5s", cadenaElementos));

  for (int i : arrayAleatorio2) {
   System.out.print(String.format("%5d", i));
  }
  System.out.println("");

  for (int i = 0; i < abm.getArrayElementos().length; i++) {
   if (i == 0) {
    System.out.println("------------------------------------");
   }
   System.out.println(String.format("%d --> %5d ", i, abm.getArrayElementos()[i]));
  }

  System.out.println("longitud 1 : " + origen.length);
  System.out.println("longitud 2 : " + destino.length);

  for (int i = 0; (i < origen.length) && (i < destino.length); i++) {
   System.out.print(String.format("%d", origen[i]));
   System.out.println(String.format("%5d ", destino[i]));
   if (3 == i) {
    System.out.print(String.format("%d \n", origen[i] + 1));
   }
  }

  System.out.println(
          "Son iguales : " + Arrays.equals(origen, destino));
 }
}
