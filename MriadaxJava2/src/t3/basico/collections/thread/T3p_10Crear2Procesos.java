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
  Prueba p1 = new Prueba("---thread 1 ---");
  Prueba p2 = new Prueba("---thread 2 ---");

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

class Prueba extends Thread {

 private String cadena;

 public Prueba(String cadena) {
  this.cadena = cadena;
 }

 public Prueba() {
  this(null);
 }
 

}
