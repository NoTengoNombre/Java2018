/**
 * Cuando un primer subproceso accede a un metodo o codigo sincronizado bloquea
 * a los demas subprocesos
 *
 * Cuando el subproceso finaliza su ejecución desbloquea a los demas para que uno pueda acceder
 *
 */
package t3.basico.collections.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 *
 * * Metodo sincronizado
 *
 * 2 Subprocesos en su funcion run invocan a este metodo
 *
 * Solo 1 esta ejecutando el codigo sumarArray
 *
 * El otro espera a que el anterior acabe
 *
 * @since 15-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p_15EjeSynchronized {

 public static void main(String[] args) throws InterruptedException {

  MiThread3 mt1 = new MiThread3("Subproceso #1");
  MiThread3 mt2 = new MiThread3("Subproceso #2");
  MiThread3 mt3 = new MiThread3("Subproceso #3");
  System.out.println("ESTADO DE " + mt1.getName() + " ===> " + mt1.getState());
  System.out.println("COMIENZO " + System.currentTimeMillis());
  System.out.println("ESTADO DE " + mt2.getName() + " ===> " + mt2.getState());
  System.out.println("COMIENZO " + System.currentTimeMillis());
  System.out.println("ESTADO DE " + mt3.getName() + " ===> " + mt3.getState());
  System.out.println("COMIENZO " + System.currentTimeMillis());
 }
}

/**
 * Clase que tiene un mentodo que sincroniza un subproceso
 *
 * @author MyDevelop
 */
class SumarArray {

 /**
  * Atributos
  */
 private int suma;

 /**
  * synchronized - Permite sincronizar una funcion o bloque de código
  *
  * Si un primer subproceso accede al metodo o codigo sincronizado , este
  * bloquea a los demas subprocesos hasta que no termine de ejecutarse tu
  * codigo.
  *
  * Cuando subproceso finaliza su ejecución desbloquea a los demas para que uno
  * pueda acceder
  *
  * Metodo que recibe por parametro un array y en cada iteración de ese mismo
  * array va acumulando el valor en una variable de instancia y a continuacion
  * duerme el hilo 1000 milisegundos '1sg' para que al final de la iteracion de
  * todo el array devuelva el valor acumulado.
  *
  * @param nums array con valores almacenados
  * @return valor acumulado del array
  */
 synchronized int sumarArray(int nums[]) {
  suma = 0;
  for (int i = 0; i < nums.length; i++) {
   suma += nums[i];
   System.out.println("La suma en el 'for' para " + Thread.currentThread().getName() + " es " + suma);
   try {
    Thread.sleep(1000); // Duerme el hilo 10 milisegundos
   } catch (InterruptedException ix) {
    System.out.println("Mensaje : " + ix.getMessage());
    Logger.getLogger(SumarArray.class.getName()).log(Level.SEVERE, null, ix);
   }
  }
  return suma;
 }
}

/**
 * Clase que implementa un metodo de la interface Runnable
 *
 * @author MyDevelop
 */
class MiThreadSum implements Runnable { //interface 

 /**
  * Atributo de la clase 'Thread' para invocar todos sus metodos , variables.
  */
 Thread thread;

 /**
  * Invocar a la clase SumarArray para utilizar su metodo pero solo se crea una
  * copia del mismo
  */
 static SumarArray sa = new SumarArray();

 /**
  * Atributos de instancia
  */
 int numeros[];
 int suma;

 /**
  * Constructor que cuando se cree un objeto se inicializan 2 elementos que se
  * pasaran por argumento al constructor de la clase Thread
  *
  * @param nombre
  * @param numeros
  */
 public MiThreadSum(String nombre, int numeros[]) {
  thread = new Thread(this, nombre); // 1º"Threadgroup" instancia un objeto 'thread' 2º"nombre"
  this.numeros = numeros; // el array pasado como argumento se almacena en la clase MiThreadSum como ATRIBUTO
  thread.start(); // objet
 }

 /**
  * Metodo heredado de la interfaz 'Runnable' e implementado para mostrar el
  * nombre del subproceso 'thread' el cual no produce sincronizacion y cuando un
  * subproceso modifica el valor y otro subproceso a la vez lo solicita , le
  * devuelve la version no actualizada del valor
  *
  */
// @Override
// public void run() {
//  int suma;
//  System.out.println(thread.getName() + " EMPEZANDO ");
//  suma = sa.sumarArray(numeros);
//  System.out.println("La suma en : " + thread.getName() + " es " + suma);
//  System.out.println(thread.getName() + " TERMINADO ");
// }
// 
 /**
  * Metodo para que 1 subproceso bloque el paso de otro subproceso y así nos
  * valores no sean erroneos
  */
 @Override
 public void run() {
  int suma;
  System.out.println(thread.getName() + " EMPEZANDO");
  synchronized (numeros) {
   suma = sa.sumarArray(numeros);
  }
  System.out.println("La suma en " + thread.getName() + " es " + suma);
  System.out.println(thread.getName() + " TERMINADO ");
 }

}
