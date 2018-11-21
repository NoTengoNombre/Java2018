/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.altera.control.flujo;

import java.util.Random;

/**
 * @see p19
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1SentenciaContinueRazonamiento {

 public static void main(String[] args) {

  for (int i = 0; i <= 10; i++) {
   if (i == 5) { // Cuando el valor es igual a 'i'y
// Se saltan todas las demas instrucciones que haya debajo , 
// incrementa el valor del contador del bucle y continua ejecutando el flujo
    continue;
   }
   System.out.println("Numeros : " + i);
  }

 }

}
