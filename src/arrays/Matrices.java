/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * @see pag 46
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Matrices {

 public static void main(String[] args) {

  int[] unaD = new int[2];
  int[][] dosD = new int[2][3];
  int[][][] tresDo = new int[2][3][4];

  int[][][] tresD = {
   {{1, 2, 3},
   {4, 5, 6}},
   {{11, 12, 13},
   {14, 15, 16}},
   {{111, 112, 113},
   {114, 115, 116}}
  };

  for (int i = 0; i < unaD.length; i++) {
   System.out.print(String.format("%d", unaD[i]));
  }
  System.out.println("");

  System.out.println("-----------------");

  for (int i = 0; i < tresD.length; i++) {
   for (int j = 0; j < tresD[i].length; j++) {
    for (int k = 0; k < tresD[i][j].length; k++) {
     System.out.print(String.format("%2d ", tresD[i][j][k]));
    }
    System.out.println("");
   }
   System.out.println("");
  }
  System.out.println("");

 }

}
