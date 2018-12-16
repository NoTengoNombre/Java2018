/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @see -
 * @since 15-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p_14KeywordSynchronized {

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

  do {
   Thread.sleep(1000);
  } while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
  System.out.println("Finaliza la funcion main");

 }
}

class MiThread3 extends Thread {

 private static List lista;
 private long inicio;

 public MiThread3(String cdn) {
  super(cdn);
  inicio = System.currentTimeMillis();
 }

 synchronized public void listarTodos() {
  lista = new ArrayList(10);
  lista.add(new Random().nextInt(100));
  lista.add(new Random().nextInt(100));
  lista.add(new Random().nextInt(100));
  lista.add(new Random().nextInt(100));
  lista.add(new Random().nextInt(100));

  for (Object numero : lista) {
   System.out.println(numero);
  }

 }
}
