/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

/**
 * @see -
 * @since 17-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjSubProcesoConExtends extends Thread {

 /**
  * Atributo : Variable de instancia - Almacena los milisegundos que quiero
  * detener el hilo de ejecución del subproceso secundario
  */
 long minPrime;

 /**
  *
  * @param nombre
  * @param minPrime
  */
 public EjSubProcesoConExtends(String nombre, long minPrime) {
  super(nombre); // Constructor de la clase Thread 
  this.minPrime = minPrime;
 }

 /**
  * Devuelve el tiempo en milisegundos
  *
  * @return
  */
 public long getMinPrime() {
  return minPrime;
 }

 /**
  * Esta redifiniendo el metodo <b>run()</b> - Punto de inicio del SUBPROCESO
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
  */
 @Override
 public void run() {
  //Aquí definimos las variables e invocamos las Clases , Metodos
//que vamos a usar en el Subproceso
// Al heredar de Thread - el operador 'this' hace referencia a un objeto del tipo 'Thread'
  System.out.println(""
          + "- Lanzo el Subproceso - " + this.getName()
          + "\n- Id : " + this.getId()
          + "\n- Esta vivo ? : " + this.isAlive()
          + "\n- State : " + this.getState()
          + "\n- Prioridad : " + this.getPriority());
 }

 public static void main(String[] args) {
  // Vamos a crear distintos Subprocesos
  EjSubProcesoConExtends sub1 = new EjSubProcesoConExtends("Subproceso #1", 1000);
  sub1.start(); // inicia el metodo 'run' para el 1º subproceso creado mediante la instanciación
  EjSubProcesoConExtends sub2 = new EjSubProcesoConExtends("Subproceso #2", 4000);
  sub2.start(); // inicia el metodo 'run' para el 2º subproceso creado mediante la instanciación

 }

}
