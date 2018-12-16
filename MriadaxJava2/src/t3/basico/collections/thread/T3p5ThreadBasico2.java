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
public class T3p5ThreadBasico2 {

// En otro codigo , por ejemplo una funcion main
// se crean diferentes subprocesos
 public static void main(String[] args) {
  Subprocesos subproceso1 = new Subprocesos("Subproceso 1");
  Subprocesos subproceso2 = new Subprocesos("Subproceso 1");
  // Otras sentencias
  subproceso1.start(); // start inicia el proceso llamado a 'run'
  subproceso2.start(); // start inicia el proceso llamado a 'run'
//  new Thread(subproceso1).start();
//  new Thread(subproceso2).start();
//  otras sentencias

 }
}

/**
 *
 * @author MyDevelop
 */
class Subprocesos extends Thread {

 /**
  * Contador
  */
 private static int contador;

 /**
  *
  * @param nombre
  */
 public Subprocesos(String nombre) {
  super(nombre); // Invoca al Constructor de la clase 'super'
 }

 /**
  * Metodo heredado de la clase Thread
  */
 @Override
 public void run() {
  System.out.println((++contador) + " - My Thread is running ☻");
  // define run...
 }

}
