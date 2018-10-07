/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Seleccion;

/**
 * @see libro
 * @since 30-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag60EstructuraIFAnidados {

 private static final double ALEATORIO = (int) (Math.random() * (1 + 100) + 10);

 public static void main(String[] args) {

  if (ALEATORIO >= 100) {
   System.out.println("Mayor de 100 : " + ALEATORIO);
  } else if ((ALEATORIO > 80) && (ALEATORIO <= 99)) {
   System.out.println("entre 80 y 90: " + ALEATORIO);
  } else if ((ALEATORIO > 70) && (ALEATORIO <= 89)) {
   System.out.println("entre 70 y 80: " + ALEATORIO);
  } else if ((ALEATORIO > 60) && (ALEATORIO <= 79)) {
   System.out.println("entre 60 y 70: " + ALEATORIO);
  } else if ((ALEATORIO > 50) && (ALEATORIO <= 69)) {
   System.out.println("entre 50 y 60: " + ALEATORIO);
  } else if ((ALEATORIO > 40) && (ALEATORIO <= 59)) {
   System.out.println("entre 40 y 50: " + ALEATORIO);
  } else if ((ALEATORIO > 30) && (ALEATORIO <= 49)) {
   System.out.println("entre 30 y 40: " + ALEATORIO);
  } else if ((ALEATORIO > 20) && (ALEATORIO <= 39)) {
   System.out.println("entre 20 y 30: " + ALEATORIO);
  } else if ((ALEATORIO > 10) && (ALEATORIO <= 29)) {
   System.out.println("entre 10 y 20: " + ALEATORIO);
  } else if ((ALEATORIO > 0) && (ALEATORIO <= 19)) {
   System.out.println("entre 0 y 10: " + ALEATORIO);
  }
 }
}
