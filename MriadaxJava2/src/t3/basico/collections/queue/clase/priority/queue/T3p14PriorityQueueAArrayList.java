/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.queue.clase.priority.queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see p14
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p14PriorityQueueAArrayList {

 /**
  * Ordenar los elementos del ArrayList mediante la clase PriorityQueue
  *
  * @param c
  * @return
  */
 public static List ordenarLista(Collection c) {
  Queue cola = new PriorityQueue(c);
  List lista = new ArrayList();

  while (!cola.isEmpty()) {
   lista.add(cola.remove());
  }
  return lista;
 }

 public static void main(String[] args) {
  Random aleatorio = new Random();
  int cantidad = aleatorio.nextInt(15);
  int num = 0;

  List<Integer> lista = new ArrayList<>(); // crece dimensionalmente

  for (int i = 0; i < cantidad; i++) {
   lista.add(num = aleatorio.nextInt(15));
  }

  System.out.println("ArrayList Antes");
  for (Integer n : lista) {
   System.out.print(n + " ");
  }
  System.out.println();

  lista = ordenarLista(lista);
  System.out.println("ArrayList Despues");

  for (Integer n : lista) {
   System.out.print(n + " ");
  }
  System.out.println("");
 }
}
