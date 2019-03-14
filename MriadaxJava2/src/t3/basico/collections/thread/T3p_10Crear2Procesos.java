/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

/**
 * @see -
 * @since 14-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p_10Crear2Procesos {

 public static void main(String[] args) throws InterruptedException {
//  Declaracion
  Prueba p1 = new Prueba("--- thread 1 ---");
  Prueba p2 = new Prueba("--- thread 2 ---");

//  Procesamiento
  System.out.println("ESTADO DE " + p1.getName() + " ===> " + p1.getState());
  System.out.println("COMIENZO: " + System.currentTimeMillis());
  p1.start(); // Subproceso 1 : Inicia el Subproceso

  System.out.println("ESTADO DE " + p1.getName() + " ===> " + p1.getState());
  System.out.println("COMIENZO: " + System.currentTimeMillis());
  p2.start(); // Subproceso 2 : Inicia el Subproceso

  Thread.sleep(100);
  p1.interrupt(); // Interrunpe

  Thread.sleep(100);
  p1.interrupt(); // Interrunpe
  p2.interrupt(); // Interrunpe

  Thread.sleep(100);
  p2.interrupt();// Interrunpe

  int i = 0;
  do {
//   System.out.println("Incremento : " + (++i));
  } while (!((p1.getState() == Thread.State.TERMINATED) && (p2.getState() == Thread.State.TERMINATED)));

//  Salida
  System.out.println("ESTADO DE " + p1.getName() + " ===> " + p1.getState());
  System.out.println("FINALIZACION: " + System.currentTimeMillis());
 }
}

/**
 *
 * @author MyDevelop
 */
class Prueba extends Thread {

 /**
  * Atributo : variable de instancia
  */
 private long inicio;

 /**
  * Constructor por defecto
  */
 public Prueba() {
  this(null);
 }

 /**
  * Constructor por defecto
  *
  * @param inicio
  */
 public Prueba(String str) {
  super(str);
  inicio = System.currentTimeMillis();
 }

 /**
  * Implementación del metodo 'run' de la clase Thread
  */
 @Override
 public void run() {
  inicio = 0;
  for (int i = 1; i <= 3; i++) {
   System.out.println("INICIO DE CICLO " + i + " DE " + getName() + " ===> " + (System.currentTimeMillis() - inicio) + " milisegundos");
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    System.out.println("• Error : " + e.getLocalizedMessage());
    System.out.println("INTERRUMPIDO : " + getName() + " ===> " + (System.currentTimeMillis() - inicio) + " milisegundos");
   } finally {
    System.out.println("FIN DE CICLO " + i + " DE " + getName() + " ===> " + (System.currentTimeMillis() - inicio) + " milisegundos");
   }
  }
 }
} // Fin de la clase Prueba
