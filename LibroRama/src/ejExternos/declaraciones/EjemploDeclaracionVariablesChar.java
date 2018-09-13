/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.declaraciones;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploDeclaracionVariablesChar {

 public static void main(String[] args) {

  char c1 = '0';
  char c2 = 0;
  char c3 = 97;

  System.out.println("caracter : " + c1 + " - caracter : " + c2 + " - caracter : " + c3);

  for (int i = 0; i < 20; i++) {
   System.out.println(i + " : ♦ Cadena : " + (c3++));
  }

  System.out.println("-------------------");

  for (int i = 20; 0 < i; i--) {
   System.out.println(i + " : • Cadena : " + (++c3));
  }

 }
}
