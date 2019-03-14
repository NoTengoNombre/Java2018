/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

/**
 * @see -
 *
 * @since 14-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p_12ThreadMetodoJoin {

 /**
  * El Subproceso main() espera a que termine los demas Subproceso ya que estan
  * unidos a él por el metodo join();
  *
  * Hasta que no termine los subprocesos de los objetos 'mt1 , mt2 , mt3' no
  * continua con el subprocesos del metodo 'main'
  *
  * 'main' esta esperando a los demas subprocesos
  *
  * @param args
  */
 public static void main(String[] args) {

  System.out.println("Comienzo funcion main");

  MiThread mt1 = new MiThread("Subproceso #1");
  MiThread mt2 = new MiThread("Subproceso #2");
  MiThread mt3 = new MiThread("Subproceso #3");

  do {
   System.out.println(".");
   try {
    mt1.join();
    System.out.println("Subproceso #1 se ejecuta join");
    mt2.join();
    System.out.println("Subproceso #2 se ejecuta join");
    mt3.join();
    System.out.println("Subproceso #3 se ejecuta join");
   } catch (InterruptedException exc) {
    System.out.println("Interrumpido en main. " + exc.getMessage());
   }
  } while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
  System.out.println("Finaliza la funcion main");
 }
}

class MiThread2 extends Thread {

 private long inicio;

 public MiThread2(String cadena) {
  super(cadena);
  inicio = System.currentTimeMillis();
 }

}
