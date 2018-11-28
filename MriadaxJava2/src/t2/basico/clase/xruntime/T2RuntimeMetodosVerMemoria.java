/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.xruntime;

/**
 * @see p9
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2RuntimeMetodosVerMemoria {

 public static void main(String[] args) {

//  No Instancia : Retorna un Objeto
  Runtime runtime = Runtime.getRuntime();

  long maxMemory = runtime.maxMemory();
  System.out.println("Maxima Memoria : " + maxMemory);

  long freeMemory = runtime.freeMemory();
  System.out.println("Memoria Libre : " + freeMemory);

  long totalMemory = runtime.totalMemory();
  System.out.println("Memoria Total : " + totalMemory);

  int verProcesos = runtime.availableProcessors();
  System.out.println("Numero de procesadores disponibles : " + verProcesos);
  
  
  

 }
}
