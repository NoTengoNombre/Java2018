/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

/**
 * @see - Simular suspend() , resume() , stop()
 *
 * Mediate 2 variables se puede emular los metodos 'decrepated' como son
 * suspender , reanudar o para su propia ejecucion
 *
 * @since 17-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p_18SuspenderReanudarDetenerSubProcesos {

 public static void main(String[] args) {

  MiThreadSRD mt1 = new MiThreadSRD("Subproceso #1");
  mt1.run();
  MiThreadSRD mt2 = new MiThreadSRD("Subproceso #2");
  mt2.run();
  MiThreadSRD mt3 = new MiThreadSRD("Subproceso #3");
  mt3.run();
 }
}

class MiThreadSRD implements Runnable {

 /**
  * Atributo : variable de instancia
  *
  * Clase Thread 'crea un subproceso' desde esta variable de instancia podemos
  * invocar todos los demas objetos
  */
 Thread thread;
 /**
  * Atributo : variable de instancia - almacena si el subproceso esta suspendido
  * valores
  */
 boolean suspendido;

 /**
  * Atributo : variable de instancia - almacena si el subproceso esta parado
  */
 boolean parado;

 /**
  * Constructor : Recibe por argumento un String
  */
 public MiThreadSRD(String nombre) {
  thread = new Thread(this, nombre);
  suspendido = false;
  parado = false;
  thread.start(); // Inicia la ejecución de un subproceso invocando al metodo run()
 }

 /**
  * Metodo de Instancia : 'Detiene' la ejecución de un subproceso hasta que
  * recibe una 'notify'
  */
 synchronized void stop() {
  parado = true;
  suspendido = false;
  notify(); // saca 'waiting' a unos de los subprocesos esten en este estado y lo pasa a RUNNABLE
 }

 /**
  * Metodo de Instancia : 'Finaliza' la ejecución de un subproceso
  */
 synchronized void suspend() {
  suspendido = true;
 }

 /**
  * Resume : Continuar / Reanudar
  */
 synchronized void resume() {
  suspendido = false;
  notify(); // saca 'waiting' a unos de los subprocesos esten en este estado y lo pasa a RUNNABLE
 }

 /**
  * Metodo heredado de 'Runnable' e implemando para que se ejecute un bucle 100
  * veces y en cada iteracion donde el valor valga %10 = 0 se pare el hilo de
  * ejecución de ese subproceso
  */
 @Override
 public void run() {
  System.out.println(thread.getName() + " ARRANCANDO ");
  try {
   for (int i = 1; i < 1000; i++) {
    System.out.print("\u001B[36m" + i + " ");
    if ((i % 10) == 0) {
     System.out.println("\ni : " + i);
     Thread.sleep(4000);
    }
//    Bucle en 'run' que hace las comprobaciones periodicas
//    Sincronizar para acceder a suspendido y parado
    synchronized (this) { // sincrona este 'objeto' el que llamo al metodo porque este metodo es de instancia
     while (suspendido) { // 
      wait();
     }
     if (parado) {
      break;
     }
    }
   }
  } catch (InterruptedException exc) {
   System.out.println(thread.getName() + "- INTERRUMPIDO - Mensaje : " + exc.getMessage());
  }
  System.out.println(thread.getName() + "+ FINALIZADO");
 }

}
