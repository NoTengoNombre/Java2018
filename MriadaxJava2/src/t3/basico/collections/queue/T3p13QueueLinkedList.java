 
package t3.basico.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * @see p13
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p13QueueLinkedList {

}

/**
 * Introduce tantos elementos tipo Integer como cantidad que indica el parametro
 * de la llamada al programa
 *
 * Se van eliminando 1 a 1
 *
 * @author MyDevelop
 */
class ContadorCola {

 public static void main(String[] args) throws InterruptedException {
  Scanner sc = new Scanner(System.in);
  System.out.println("Introduce un numero : ");
  String linea = sc.nextLine();

  Random aleatorio = new Random();
  int time = Integer.parseInt(linea);
  int n = 0;

  Queue<Integer> cola = new LinkedList<>();

  for (int i = time; i >= 0; i--) {
   System.out.println("primero: " + cola.peek());
   n = aleatorio.nextInt(100);
   if (cola.offer(n)) {
    System.out.println("Ultimo: " + n);
   } else {
    System.out.println("No se ha podido aniadir " + n);
   }
  }

  cola.forEach((num) -> {
   System.out.println(num + " ");
  });
  System.out.println();

  while (!cola.isEmpty()) {
   System.out.println("El primer elemento es : " + cola.poll());
   Thread.sleep(1000);
  }

  System.out.println("El primer elemento es : " + cola.poll());
 }
}
