/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.ejercicio.n3.letra.dni;

import java.util.Scanner;

/**
 * @see -
 * @since 21-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Ejercicio2LetraDNI {

 public static void main(String[] args) {
  new LetraDNI().getComprobarNumeros();

 }
}

class LetraDNI {

 private int numero;
 private static final Scanner TECLADO = new Scanner(System.in);
 private char letras[]
         = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
          'D', 'X', 'B', 'N', 'J', 'Z', 'S',
          'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

 public int getLongitudNumero() {
  return numero;
 }

 public int getNumero() {
  System.out.println("Introduce 8 numeros");
  numero = TECLADO.nextInt();
  return numero;
 }

 public int getComprobarNumeros() {
  int longitudNumero = getNumero();
  do {
   if (longitudNumero != 8) {
    System.out.println("Fuera del rango");
    longitudNumero = getNumero();
   }
  } while (longitudNumero >= 9 || longitudNumero <= 7);
  return 0;
 }

}
