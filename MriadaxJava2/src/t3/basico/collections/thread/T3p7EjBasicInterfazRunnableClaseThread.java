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
public class T3p7EjBasicInterfazRunnableClaseThread {

 public static void main(String[] args) {
  Random aleatorio = new Random();

  ClaseThreadA ct1 = new ClaseThreadA(aleatorio.nextInt(4) + 1);
  ct1.start();

  ClaseThreadA ct2 = new ClaseThreadA(aleatorio.nextInt(7) + 1);
  ct2.start();

  InterfazRunnable ir1 = new InterfazRunnable(aleatorio.nextInt(4) + 1);
  new Thread(ir1).start();

  InterfazRunnable ir2 = new InterfazRunnable(aleatorio.nextInt(7) + 1);
  new Thread(ir2).start();
 }
}

/**
 * SubClase InterfazRunnableA creado a partir de la Interfaz Runnable para crear
 * un subproceso secundario
 *
 * @author MyDevelop
 */
class InterfazRunnableA implements Runnable {

 /**
  * Numero de veces
  */
 private int n;

 /**
  * Constructor basico que inicializa la variable
  */
 public InterfazRunnableA() {
  this.n = n;
 }

 /**
  * Constructor recibe el numero de veces que se ejecuta el metodo run
  *
  * @param n
  */
 public InterfazRunnableA(int n) {
  this.n = n;
 }

 /**
  * Metodo que marca el punto inicio del programa
  */
 @Override
 public void run() {
  int i = 1;
  while (true) {
   System.out.println("• Run del Interfaz Runnable " + getClass().getSimpleName() + " Iteracion " + i++);
   if (i > n) {
    break;
   }
  }
 }
}

/**
 * SubClase ClaseThreadA creado a partir de la Clase Thread para crear un
 * subproceso secundario
 */
class ClaseThreadA extends Thread {

 /**
  * ATRIBUTO : Variable de Instancia
  */
 private int n;

 /**
  * Constructor
  */
 public ClaseThreadA() {
  this.n = 1000;
 }

 /**
  * Constructor que recibe por paramqweetro un elemento
  *
  * @param n
  */
 public ClaseThreadA(int n) {
  this.n = n;
 }

 /**
  *
  * @return Devuelve el atributo 'n'
  */
 public int getN() {
  return n;
 }

 /**
  * Punto de inicio del Subproceso
  */
 @Override
 public void run() {
  int i = 1;
  while (true) {
   System.out.println(
           "♣ Run de la Clase Thread " + this.getName()
           + " de " + getClass().getSimpleName()
           + " con ID " + this.getId()
           + " . Iteracion " + i++);
   if (i > n) {
    break;
   }
  }
 }
}
