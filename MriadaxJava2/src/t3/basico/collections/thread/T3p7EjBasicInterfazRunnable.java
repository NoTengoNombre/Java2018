/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

import java.util.Random;

/**
 * @see -
 *
 * Se crean dos clases de “threads”,
 *
 * uno con subclase de Thread,
 *
 * otra clase implementanda por la subclase Runnable.
 *
 * Se crean dos objetos de cada tipo y se lanza su ejecución con el metodo run()
 * que indica el punto de inicio de salida del subproceso.
 *
 * En cada metodo "run()" se ejecuta un código de información el cual indica que
 * el thread es un número determinado de veces
 *
 *
 * @since 14-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p7EjBasicInterfazRunnable {

}

/**
 *
 * @author MyDevelop
 */
class InterfazRunnable implements Runnable {

 /**
  * Numero de veces
  */
 private int n;

 /**
  * Constructor recibe el numero de veces que se ejecuta el metodo run
  *
  * @param n
  */
 public InterfazRunnable(int n) {
  this.n = n;
 }

 /**
  * Metodo que marca el punto inicio del programa
  */
 @Override
 public void run() {
  int i = 1;
  while (true) {
   System.out.println("Run del thread " + getClass().getSimpleName() + " Iteracion " + i++);
   if (i > n) {
    break;
   }
  }
 }

 public static void main(String[] args) {
  Random aleatorio = new Random();
  ClaseThread ct1 = new ClaseThread(aleatorio.nextInt(5) + 1);
  ClaseThread ct2 = new ClaseThread(aleatorio.nextInt(6) + 1);

  InterfazRunnable ir1 = new InterfazRunnable(aleatorio.nextInt(4) + 1);
  InterfazRunnable ir2 = new InterfazRunnable(aleatorio.nextInt(7) + 1);
  
  ct1.start();
  ct2.start();

  new Thread(ir1).start();
  new Thread(ir2).start();

 }
}
