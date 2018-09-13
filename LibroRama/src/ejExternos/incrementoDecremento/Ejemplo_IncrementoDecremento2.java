/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.incrementoDecremento;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ejemplo_IncrementoDecremento2 {

 public static void main(String[] args) {

  int i = 2;
  System.out.println(i++);
  System.out.println(2 / i++);
  System.out.println(2 * i++);
  System.out.println(2 / (+i));
  System.out.println(2 + (-i));
  System.out.println(2 * (-i));
 }
}
