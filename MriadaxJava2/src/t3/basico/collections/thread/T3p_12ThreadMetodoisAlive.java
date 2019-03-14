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
public class T3p_12ThreadMetodoisAlive {

 public static void main(String[] args) {

  System.out.println("Comienzo funcion main");

  MiThread mt1 = new MiThread("Subproceso #1");
  MiThread mt2 = new MiThread("Subproceso #2");
  MiThread mt3 = new MiThread("Subproceso #3");

  do {
   System.out.println(".");
   try {
    Thread.sleep(100);
   } catch (InterruptedException exc) {
    System.out.println("Interrumpido en main. " + exc.getMessage());
   }
  } while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
  System.out.println("Finaliza la funcion main");
 }
}

/**
 *
 * @author MyDevelop
 */
class MiThread extends Thread {

 /**
  * Almacena el valor cuando comenzo a ejecutarse el Subproceso
  */
 private long inicio;

 /**
  * Constructor : Inicializa el valor de 'inicio'
  *
  * @param cadena "para indicar el subproceso que esta trabajando"
  */
 public MiThread(String cadena) {
  super(cadena);
  inicio = System.currentTimeMillis();
 }

 /**
  *
  * @return Devuelve el valor de inicio
  */
 public long getInicio() {
  return inicio;
 }

}
