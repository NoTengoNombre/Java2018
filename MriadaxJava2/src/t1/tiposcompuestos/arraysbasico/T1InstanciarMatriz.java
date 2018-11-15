/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see p16
 * @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1InstanciarMatriz {

 public static void main(String[] args) {

  String grupo[][] = {{"Pepe", "Madrid", "coordina"},
  {"Ana", "Sevilla", "colabora"},
  {"Luis", "Lugo", "escribe"}
  };

  for (String[] strings : grupo) {
   for (String dato : strings) {
    System.out.println("\n" + dato + "\t\t");
   }
  }
 }
}
