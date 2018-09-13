/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 23-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag32TablaDeEjemplos {

 public static void main(String[] args) {

//  Operadores relacionales
  boolean b0 = (97 == 'a');
  System.out.print("\u001B[33m(97 == 'a') :  " + b0 + " \n");

  boolean b1 = (97 == 'a' == true);
  System.out.print("\u001B[33m(97 == 'a' == true) :  " + b1 + " \n");

  boolean b2 = (79 / 2 == 0) && (100 % 5 == 0);
  System.out.print("\u001B[32m(79 / 2 == 0) && (100 % 5 == 0) : " + b2 + "\n ");

  System.out.println("Operador byte : valor superior a 127 necesita casting");
  byte by1 = (byte) 200;
  System.out.println(by1);

  System.out.println("Operador byte : mayor a -128 necesita casting");
  byte by2 = (byte) -129;
  System.out.println(by2);

 }
}
