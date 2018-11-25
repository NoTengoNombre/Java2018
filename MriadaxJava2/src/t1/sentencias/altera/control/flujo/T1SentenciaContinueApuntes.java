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
public class T1SentenciaContinueApuntes {

 public static void main(String[] args) {

  Random aleatorio = new Random();

  int veces = 5;
  int num1 = 0;
  int num2 = 0;

  for (int i = 1; i <= veces; i++) {
   System.out.print("\nIteracion numero : " + i + " ===> ");
   num1 = aleatorio.nextInt(50);
   if (num1 == 0) {
    continue;
   }
   num2 = aleatorio.nextInt(1000);
   if (num2 == 0) {
    continue;
   }
   System.out.println("num2 : " + num2 + " | num1 : " + num1);
   System.out.println("num2 / num1 : " + (num2 / num1));
   System.out.println("num2 % num1 : " + (num2 % num1));
  }
 }
}
