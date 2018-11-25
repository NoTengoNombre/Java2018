/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.ejercicio.n3.letra.dni;

import java.util.Scanner;

/**
 * @see -
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Ejercicio2LetraDNIMain {

 public static void main(String[] args) {
//  Declaracion e Inicializacion
  int resultado;
  String cadena;
  char[] letras
          = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
           'D', 'X', 'B', 'N', 'J', 'Z', 'S',
           'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
  Scanner sc = new Scanner(System.in);

//  Procesamiento
  System.out.println("Introduce el numero del DNI : ");
  cadena = sc.nextLine();
  System.out.println("Numero introducido : " + cadena);
  if (cadena.length() != 8) {
   do {
    System.out.println("Cadena de numeros no valida : introduce una cadena de 8 numeros");
    cadena = sc.nextLine();
   } while (cadena.length() != 8);
  }
  int cadenaNumero = Integer.parseInt(cadena);
  resultado = (cadenaNumero % 23);
  char letra = letras[resultado];
  String dni = String.valueOf(cadenaNumero + "" + letra);

//  Salida
  System.out.println("DNI : " + dni);
 }
}
