/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.Arrays;

/**
 * @see libro
 * @since 30-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class ArraysBidimensionales {

 public static void main(String[] args) {

  final int[][] a = new int[4][4];

  for (int f = 0; f < 4; f++) {
   a[f][2] = 5;
   for (int c = 0; c < 4; c++) {
    a[f][2] = 5;
    System.out.print(a[f][c]);
   }
   System.out.println();
  }

  System.out.println("----------------------------");
  System.out.println("Valor : a[0][1] " + a[0][0]);
  System.out.println("Valor : a[1][1] " + a[1][0]);
  System.out.println("Valor : a[2][1] " + a[2][0]);
  System.out.println("Valor : a[3][1] " + a[3][0]);
  System.out.println("----------------------------");
  System.out.println("Valor : a[0][1] " + a[0][1]);
  System.out.println("Valor : a[1][1] " + a[1][1]);
  System.out.println("Valor : a[2][1] " + a[2][1]);
  System.out.println("Valor : a[3][1] " + a[3][1]);
  System.out.println("----------------------------");
  System.out.println("Valor : a[0][2] " + a[0][2]);
  System.out.println("Valor : a[1][2] " + a[1][2]);
  System.out.println("Valor : a[2][2] " + a[2][2]);
  System.out.println("Valor : a[3][2] " + a[3][2]);
  System.out.println("----------------------------");
  System.out.println("Valor : a[0][3] " + a[0][3]);
  System.out.println("Valor : a[1][3] " + a[1][3]);
  System.out.println("Valor : a[2][3] " + a[2][3]);
  System.out.println("Valor : a[3][3] " + a[3][3]);
  System.out.println("----------------------------");

  System.out.print("|a[0][1]=" + a[0][0]);
  System.out.print("|a[1][1]=" + a[1][0]);
  System.out.print("|a[2][1]=" + a[2][0]);
  System.out.print("|a[3][1]=" + a[3][0]);
  System.out.println(" ");
  System.out.print("|a[0][1]=" + a[0][1]);
  System.out.print("|a[1][1]=" + a[1][1]);
  System.out.print("|a[2][1]=" + a[2][1]);
  System.out.print("|a[3][1]=" + a[3][1] + "\u001B[33m");
  System.out.println(" ");
  System.out.print("|a[0][2]=" + a[0][2]);
  System.out.print("|a[1][2]=" + a[1][2]);
  System.out.print("\u001B[33m|a[2][2]=" + a[2][2]);
  System.out.print("|a[3][2]=" + a[3][2]);
  System.out.println(" ");
  System.out.print("|a[0][3]=" + a[0][3]);
  System.out.print("|a[1][3]=" + a[1][3]);
  System.out.print("|a[2][3]=" + a[2][3]);
  System.out.print("|a[3][3]=" + a[3][3]);
  System.out.println("");

 }

}
