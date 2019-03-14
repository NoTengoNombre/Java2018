/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

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
public class T3p7EjBasicClaseThread {

}

/**
 *
 * @author MyDevelop
 */
class ClaseThread extends Thread {

 /**
  * Numero de veces
  */
 private int n;

 /**
  * Constructor que cuenta las veces que se ejecuta el metodo run();
  *
  * @param n
  */
 public ClaseThread(int n) {
  this.n = n;
 }

 /**
  * Punto de inicio del subproceso
  */
 @Override
 public void run() {
  int i = 1;
  while (true) {
   System.out.println("Run del thread " + this.getName() + " de " + getClass().getSimpleName() + " con ID " + this.getId() + ". Iteracion " + i++);
   if (i > n) {
    break;
   }
  }
 }

}
