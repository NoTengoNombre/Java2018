/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see # @since 23-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag33N4IntercambioVariables {

 public static void main(String[] args) {

  int a = 5, b = 4;

  System.out.println("a : " + a);
  System.out.println("b : " + b);

  int tmp = a;
  a = b;
  b = tmp;

  System.out.println("a : " + a);
  System.out.println("b : " + b);

 }

}
