/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Sentencia_break
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag66BreakDentroDeFor {

 public static void lanza1() {
  for (int i = 0; i < 10; i++) {
   System.out.println(" i + 1 : " + (i + 1));
   System.out.println(" i + 2 : " + (i + 2));
   System.out.println(" i + 3 : " + (i + 3));
   System.out.println("-------------------");
   break;
  }
 }

 public static void lanza2() {
  for (int f = 0; f < 10; f++) {
   System.out.println("\u001B[33m f + 1 : " + (f + 1));
   System.out.println("\u001B[33m f + 2 : " + (f + 2));
   System.out.println("\u001B[33m f + 3 : " + (f + 3));
   System.out.println("-------------------");
  }
 }

 public static void lanzador() {
  lanza1();
  lanza2();
 }

 public static void main(String[] args) {
  lanzador();
 }
}
