/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag63BucleForPiramide {

 public static void main(String[] args) {

  for (int f = 0; f < 5; f++) {
   for (int c = f; c >= 0; c--) {
    System.out.print("*");
   }
   System.out.println("");
  }

  System.out.println("-------------------");

  for (int f = 0; f < 5; f++) {
   for (int c = f; c < 5; c++) {
    System.out.print("*");
   }
   System.out.println("");
  }

  System.out.println("-------------------");

  for (int f = 1; f < 7; f++) {
   for (int c = f; c < 7; c++) {
    if (c % 2 != 0) {
     System.out.print(" ");
    } else {
     System.out.print("*");
    }
   }
   System.out.println("");
  }

  System.out.println("-------------------");

  Asterisco a = new Asterisco();
  a.dibujaTriangulo(2, 5);

 }
}

class Asterisco {

 /**
  * Dibuja con asteriscos un patrón con forma de triangulo
  *
  * @param offset Desplazamiento izquierdo (sangria) del triangulo
  * @param altura Altura del triangulo (en lineas de texto)
  */
 public void dibujaTriangulo(int offset, int altura) {
//-------------------------------- 2          5
  int numAsteriscos = 1;
  int numEspacios = offset + (altura + 1);

  for (int i = 1; i <= altura; i++) {
   escribeCaracteres(' ', numEspacios);
   escribeCaracteres('*', numAsteriscos);
   System.out.println();
   numEspacios--;
   numAsteriscos = numAsteriscos + 2;
  }
 }

 /**
  * Escribe en la salida estandar un caracter repetido varias veces
  *
  * @param caracter : caracteres que se van a imprimir
  * @param repeticiones : numero de veces que el caracter debe imprimirse
  */
 public void escribeCaracteres(char caracter, int repeticiones) {
  for (int i = 0; i < repeticiones; i++) {
   System.out.print(caracter);
  }
 }
}
 