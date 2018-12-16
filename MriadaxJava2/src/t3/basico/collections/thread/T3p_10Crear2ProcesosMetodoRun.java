/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * @since 14-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p_10Crear2ProcesosMetodoRun {

 public static void main(String[] args) throws InterruptedException {
//  Declaracion
  Prueba2 p1 = new Prueba2("---thread 1 ---");
  Prueba2 p2 = new Prueba2("---thread 2 ---");

//  Procesamiento
  System.out.println("ESTADO DE " + p1.getName() + " ===> " + p1.getState());
  System.out.println("COMIENZO: " + System.currentTimeMillis());
  p1.start(); // Subproceso 1

  System.out.println("ESTADO DE " + p1.getName() + " ===> " + p1.getState());
  System.out.println("COMIENZO: " + System.currentTimeMillis());
  p2.start(); // Subproceso 2

  Thread.sleep(100);
  p1.interrupt(); // Interrunpe

  Thread.sleep(100);
  p1.interrupt(); // Interrunpe
  p2.interrupt(); // Interrunpe

  Thread.sleep(100);
  p2.interrupt();// Interrunpe

  int i = 0;
  do {
   System.out.println("Incremento : " + (++i));
  } while (!((p1.getState() == Thread.State.TERMINATED) && (p2.getState() == Thread.State.TERMINATED)));

//  Salida
  System.out.println("ESTADO DE " + p1.getName() + " ===> " + p1.getState());
  System.out.println("FINALIZACION: " + System.currentTimeMillis());
 }
}

class Prueba2 extends Thread {

 private long inicio;

 public Prueba2(String cadena) {
  super(cadena);
  inicio = System.currentTimeMillis();
 }

 /**
  *
  */
 @Override
 public void run() {
  for (int i = 1; i <= 3; i++) {
   System.out.println("• INICIO DE CICLO " + i + " DE " + getName() + " ===> " + (System.currentTimeMillis() - inicio) + " milisegundos");
   try {
    Thread.sleep(1000);
   } catch (InterruptedException ex) {
    System.out.println("♠ Error: " + ex.getMessage() + " - Mensajes: " + ex.getLocalizedMessage());
    System.out.println("♠ INTERRUMPIDO : " + getName() + " ===> " + (System.currentTimeMillis() - inicio) + " milisegundos");
    Logger.getLogger(Prueba2.class.getName()).log(Level.SEVERE, null, ex);
   } finally {
    System.out.println("♥ FIN DE CICLO " + i + " DE " + getName() + " ===> " + (System.currentTimeMillis() - inicio) + " milisegundos");
   }
  }
 }
}
