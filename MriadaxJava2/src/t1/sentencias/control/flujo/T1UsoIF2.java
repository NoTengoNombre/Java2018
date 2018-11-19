/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see - 5
 * @since 16-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoIF2 {

 public static void main(String[] args) {

  Random aleatorio = new Random();

  int num = 0;
  int num1 = aleatorio.nextInt(5), num2 = aleatorio.nextInt(2500);

  if (num1 == 0) {
   num++;
  }
  System.out.println("Num2 : " + num2);
  System.out.println("Num1 : " + num1);

  System.out.println(num2 / num1);

 }
}
