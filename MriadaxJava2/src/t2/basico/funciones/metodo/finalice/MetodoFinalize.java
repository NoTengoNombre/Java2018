/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.metodo.finalice;

import java.util.Random;
import t2.basico.funciones.miembro.basico.Clase11;

/**
 * @see p31
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MetodoFinalize {

 private static int numPersonas;

 public MetodoFinalize() {
 }

 public static int getNumPersonas() {
  return numPersonas;
 }

 @Override
 protected void finalize() throws Throwable {
  numPersonas--;
  System.out.println("Objeto que finaliza : " + this + " Quedan " + numPersonas);
 }

 public static void main(String[] args) throws InterruptedException {

  Clase11 objeto1 = new Clase11(28, "uno");
  Clase11 objeto2 = new Clase11(38, "dos");

  System.out.println("Hay " + Clase11.cuentaPersonas() + " objetos");

  int num = (new Random().nextInt(9) + 1);

  for (int i = 1; i < num; i++) {
   Clase11 clase11 = new Clase11(i, ("objeto " + i));
   System.out.println(clase11.toString());
   System.out.println("Hay " + Clase11.cuentaPersonas() + " objetos");
   ///////// Invoca el recolector de basura /////////
   Runtime garbage = Runtime.getRuntime(); // Provoca que Intervenga GC Explicitamente
   garbage.gc();
   /////////////////////////7
  } // Fin del ambito de cada "objeto" que se crea en cada ITERACION
  Thread.sleep(5000);  // Retraso de la ejecucion de 5 segundos
  System.out.println("Hay " + Clase11.cuentaPersonas() + " objetos");
 }
}
