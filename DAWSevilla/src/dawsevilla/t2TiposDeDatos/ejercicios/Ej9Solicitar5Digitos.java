/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos.ejercicios;

import java.util.Scanner;

/**
 * @see 9
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej9Solicitar5Digitos {

 public static int get5digitosPro() {
  Scanner sc = new Scanner(System.in);
  int numero;
  System.out.println("Introduce 5 digitos");
  numero = sc.nextInt();
  while (numero > 99999 || (numero < 10000)) {
   System.out.println("Numero erroneo. Solo 5 cifras. Vuelve a intentarlo");
   numero = sc.nextInt();
  }
  return numero;
 }

 public static String getNumText(int n1) {
  String resultado = "";
  int diviendo, resto;
  diviendo = n1;
  while (diviendo > 0) {
   resto = diviendo % 10;
   diviendo = diviendo / 10;
   resultado = String.valueOf(resto) + " " + resultado;
  }
  return resultado;
 }

 public static void get5digitos() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Introduce 5 digitos");
  String cadena = sc.next();
  char n1 = cadena.charAt(0);
  char n2 = cadena.charAt(1);
  char n3 = cadena.charAt(2);
  char n4 = cadena.charAt(3);
  char n5 = cadena.charAt(4);
  System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " ");
  System.out.println(
          cadena.charAt(0)
          + " " + cadena.charAt(1)
          + " " + cadena.charAt(2)
          + " " + cadena.charAt(3)
          + " " + cadena.charAt(4)
  );
 }

 public static void main(String[] args) {

  System.out.println(getNumText(get5digitosPro()));
 }
}
