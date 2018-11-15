/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Programa {

 public static void main(String[] args) {
  int nArgumentos = args.length;
  if (nArgumentos == 0) {
   System.out.println(
           "Se ejecuto Programa sin argumentos");
  } else {
   int num = 1;
   for (String argumento : args) {
    System.out.print("Argumento" + num + ": ");
    System.out.println(argumento);
    num++;
   }
  }
 }
}
