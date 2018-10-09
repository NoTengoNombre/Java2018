/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos.ejercicios;

/**
 * @see pdf
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej5_2Multiplos {

 public static void main(String[] args) {

  byte numero1 = 10;
  byte numero2 = 5;

  boolean multiplo = (numero1 % numero2) == 0;
  System.out.println("Es multiplo : " + multiplo);
 }
}
