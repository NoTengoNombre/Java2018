/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.conversiones;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploConversionesString {

 public static void main(String[] args) {

  int num = Integer.parseInt("45");
  System.out.println("Numero : " + num);

  char letra = String.valueOf("cadena").charAt(0);
  System.out.println("Letra : " + letra);

 }
}
