/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl;

/**
 * @see libro
 * @since 30-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag60Expresiones {

 private final static double PI = 3.14159265359;
 private static final double RADIO = (double) (Math.random() * 1 + 100);
 private final static int VALOR = 2;
 private static double area;

 public static void main(String[] args) {
  //-----Expresión en Programación 
  area = VALOR * (PI * RADIO);
  //-------------------Expresión en Programación 
  final double area2 = VALOR * (PI * RADIO);
  //---------Expresión en Programación 
  String s = Integer.toString((int) (VALOR * (PI * RADIO)));
  System.out.println("Valor final : " + s);
 }
}
