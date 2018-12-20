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
  */
 public EjSubProcesoConExtends(String nombre, long minPrime) {
  super(nombre);
  this.minPrime = minPrime;
 }

 public long getMinPrime() {
  return minPrime;
 }

 /**
  *
  */
 @Override
 public void run() {
  try {
   //Aquí definimos las variables e invocamos las Clases , Metodos
//que vamos a usar en el Subproceso
   this.sleep(getMinPrime());
   System.out.println(""
           + "Lanzo el Subproceso - " + this.getName()
           + "\n- Id : " + this.getId()
           + "\n- Esta vivo ? : " + this.isAlive()
           + "\n- State : " + this.getState()
           + "\n- Prioridad : " + this.getPriority());
  } catch (InterruptedException ex) {
   Logger.getLogger(EjSubProcesoConExtends.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 public static void main(String[] args) {
  // Vamos a crear distintos Subprocesos
  EjSubProcesoConExtends sub1 = new EjSubProcesoConExtends("Subproceso #1", 1000);
  EjSubProcesoConExtends sub2 = new EjSubProcesoConExtends("Subproceso #2", 4000);
  sub1.start(); // inicia el metodo 'run' para el 1º subproceso creado mediante la instanciación
  sub2.start(); // inicia el metodo 'run' para el 2º subproceso creado mediante la instanciación

 }

}
