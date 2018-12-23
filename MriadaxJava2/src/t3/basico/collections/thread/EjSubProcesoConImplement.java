/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

/**
 * @see -
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
 * @since 17-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjSubProcesoConImplement implements Runnable {

 /**
  * Atributo : Variable de instancia
  */
 private int milisegundos;

 /**
  *
  */
 public EjSubProcesoConImplement() {
  super();
  this.milisegundos = 1000;
 }

 /**
  * Constructor - Inicializa el nombre y el tiempo para dormir el Subproceso
  *
  * @param nombre
  * @param milisegundos
  */
 public EjSubProcesoConImplement(String nombre, int milisegundos) {
  super();
  this.milisegundos = milisegundos;
 }

 /**
  * Devuelve los milisegundos
  *
  * @return
  */
 public int getMiliSegundos() {
  return milisegundos;
 }

 /**
  * Metodo que crea un 'subproceso secundario' para declarar variables y
  * ejecutar metodos , clases que queremos usar en un thread aparte
  *
  * Esta redifiniendo el metodo run() - Punto de inicio del SUBPROCESO
  *
  * <p>
  * Permite
  * </p>
  *
  * <ol>
  * <li>Invocar Clases</li>
  * <li>Invocar Declarar variables</li>
  * <li>Invocar Metodos</li>
  * </ol>
  *
  * Se crea un nuevo subproceso aparte del principal
  *
  */
 @Override
 public void run() {
//Aquí definimos las variables e invocamos las Clases , Metodos 
//que vamos a usar en el Subproceso
  System.out.println("Inicializamos el nuevo 'thread' a parte del Subproceso principal");
  int i = 1;
  while (true) {
   System.out.println("Run del Thread " + getClass().getSimpleName() + " Iteracion " + i++);
   if (i > milisegundos) {
    break;
   }
  }
 }

 public static void main(String[] args) {

//Con varios objetos
  EjSubProcesoConImplement sp1 = new EjSubProcesoConImplement("Subproceso #1", 1000);
  Thread thread = new Thread(sp1);
  thread.start();

//Instanciando directamente un objeto dentro de la clase Thread
  Thread thread2 = new Thread(new EjSubProcesoConImplement("Subproceso #2", 1000));
  thread2.start();

//Crea una Instancia directamente del objeto 'new Thread' 
//del objeto 'EjSubProcesoConImplement' para invocar al metodo start()
  (new Thread(new EjSubProcesoConImplement())).start();

 }
}
