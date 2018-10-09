/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos.ejercicios;

import java.util.Scanner;

/**
 * @see ej 8
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej8Calcular2Numeros {

 private static int num = 0;

 public static double getNumero() {
  double numero;
  Scanner sc = new Scanner(System.in);
  if (num == 0) {
   System.out.println("Introduce 1º numero ");
   numero = sc.nextDouble();
   num++;
  } else {
   System.out.println("Introduce 2º numero ");
   numero = sc.nextDouble();
  }
  return numero;
 }

 public static void main(String[] args) {

  double num1 = getNumero();
  double num2 = getNumero();
  System.out.println("1º numero : " + num1 + " - 2º numero : " + num2);

  System.out.println("--- Lista de Operaciones --- ");
  System.out.println(num1 + " + " + num2 + " =  " + (num1 + num2));
  System.out.println(num1 + " - " + num2 + " =  " + (num1 - num2));
  System.out.println(num1 + " * " + num2 + " =  " + (num1 * num2));
  System.out.println(num1 + " / " + num2 + " =  " + (num1 / num2));
  System.out.println(num1 + " ^ " + (+2) + " = " + (Math.pow(num1, 2)));
  System.out.println('\u221A' + "" + num1 + " = " + Math.sqrt(num1));

 }
}
