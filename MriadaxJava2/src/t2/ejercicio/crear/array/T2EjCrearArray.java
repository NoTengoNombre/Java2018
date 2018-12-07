/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejercicio.crear.array;

/**
 * @see -
 * @since 29-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2EjCrearArray {

 public static void main(String[] args) {
  ArrayInt ai = new ArrayInt();
  ai.rellenar();
  ai.visualizar();
  ai.ordenar();
  ai.visualizar();
  ai.rellenar(5);
  ai.visualizar();
 }

}

/**
 * Clase contiene los Atributos/Metodos/Constructores para realizar las
 * operaciones
 *
 * @author Raul Vela
 */
class ArrayInt {

 private int numAl = (int) (Math.random() * (1 + 49) + 1);
 private int[] array;
 private int[] nAc = new int[6];

 /**
  * Constructor que inicializa la longitud del 'Array' pasado por parametro
  */
 public ArrayInt() {
  array = new int[6];
  // Inicializar los valores del array a '1' para evitar tener '0'
  for (int i = 0; i < array.length; i++) {
   array[i] = 1;
  }
 }

 /**
  * Constructor que recibe por parametro la longitud del array
  *
  * @param longitud
  */
 public ArrayInt(int longitud) {
  array = new int[longitud];
 }

 /**
  * Metodo Overload : Genera 'Array' de numeros pasados por parametro
  *
  * @param i
  */
 public void rellenar(int i) {
  System.out.println("• Rellenar con el valor : " + i);
  for (int j = 0; j < array.length; j++) {
   array[j] = i;
  }
 }

 /**
  * Procedimiento de instancia Overload : Genera 'Array' numeros aleatorios no repetidos
  */
 public void rellenar() {
  System.out.println("• Rellenar con valores aleatorios ");
  for (int i = 1; i < array.length; i++) {
   nAc[0] = array[0];
   for (int j = 0; j < i; j++) {
    int num;
    if (array[j] == array[i]) {
     do {
      num = (int) (Math.random() * (1 + 49) + 1);
      for (int k = 0; k <= i; k++) {
       if ((num == array[k]) || (num == nAc[k])) {
        num = (int) (Math.random() * (1 + 49) + 1);
        nAc[i] = num;
       }
      }
     } while ((num == array[j]) && (num == array[i]) || (nAc[i] == num));
     nAc[i] = array[i] = num;
    }
   }
  }
 }

 /**
  * Procedimiento de instancia para ordenar los elementos del array
  */
 public void ordenar() {
  System.out.println("♦ Ordenacion");
  int aux;
  for (int i = 0; i < array.length; i++) {
   for (int j = 0; j < array.length; j++) {
    if (array[i] < array[j]) {
     aux = array[j];
     array[j] = array[i];
     array[i] = aux;
    }
   }
  }
 }

 /**
  * Metodo de instancia para ver los elementos generados
  */
 public void visualizar() {
  for (int indice : array) {
   System.out.print(indice + " ");
  }
  System.out.println("");
 }

}
