/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
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

class SumarArray {

 private int suma;

 /**
  * Metodo sincronizado
  *
  * 2 Subprocesos en su funcion run invocan a este metodo
  *
  * Solo 1 esta ejecutando el codigo sumarArray
  *
  * El otro espera a que el anterior acabe
  *
  * @param nums
  * @return
  */
 synchronized int sumarArray(int nums[]) {
  suma = 0;
  for (int i = 0; i < nums.length; i++) {
   suma += nums[i];
   System.out.println("La suma en el 'for' para " + Thread.currentThread().getName() + " es " + suma);
   try {
    Thread.sleep(10); // Sincr
   } catch (InterruptedException ix) {
    System.out.println("Mensaje : " + ix.getMessage());
    Logger.getLogger(SumarArray.class.getName()).log(Level.SEVERE, null, ix);
   }
  }
  return suma;
 }
}

/**
 *
 * @author MyDevelop
 */
class MiThreadSum implements Runnable {

// 
 Thread thread;

 static SumarArray sa = new SumarArray();

 int numeros[];
 int suma;

 /**
  *
  * @param nombre
  * @param numeros
  */
 public MiThreadSum(String nombre, int numeros[]) {
  thread = new Thread(this, nombre);
  this.numeros = numeros;
  thread.start();
 }

 /**
  *
  */
 @Override
 public void run() {
  int suma;
  System.out.println(thread.getName() + " EMPEZANDO");
  suma = sa.sumarArray(numeros);
  System.out.println("La suma en : " + thread.getName() + " es " + suma);
  System.out.println(thread.getName() + " TERMINADO");
 }

}
