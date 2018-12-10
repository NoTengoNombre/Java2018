/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @see p13
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p13QueueLinkedListConsola {

}

/**
 * Introduce tantos elementos tipo Integer como cantidad que indica el parametro
 * de la llamada al programa
 *
 * Se van eliminando 1 a 1
 *
 * @author MyDevelop
 */
class ContadorCola2 {

 public static void main(String[] args) {

  Random aleatorio = new Random();
  int time = Integer.parseInt(args[0]);
  int n = 0;

  Queue<Integer> cola = new LinkedList<Integer>();
  for (int i = time; i >= 0; i--) {
   System.out.println("primero: " + cola.peek());
   n = aleatorio.nextInt(1000);
   if (cola.offer(n)) {
    System.out.println(" ultimo: " + n);
   } else {
    System.out.println("No se ha podido aniadir " + n);
   }
  }
  for (Integer num : cola) {
   System.out.println(num + " ");
  }
  System.out.println();
 }
}
