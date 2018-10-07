/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag66BucleForPiramide {

 public static void dibujarPiramide(int dimension) {
  int fila, columna;
  for (fila = 1; fila <= dimension; fila++) {
   for (columna = 1; columna <= (dimension - fila); columna++) {
    System.out.print(" ");
   }
   for (columna = 1; columna <= 2 * (fila - 1) + 1; columna++) {
    System.out.print("*");
   }
   System.out.println("");
  }
 }

 public static void main(String[] args) {

  int x = (int) (Math.random() * (1 + 10) + 2);
  System.out.println("Valor de la piramide : " + x);
  dibujarPiramide(x);

 }
}
