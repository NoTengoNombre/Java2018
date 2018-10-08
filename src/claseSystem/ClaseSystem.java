/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseSystem;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * @see apuntes
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ClaseSystem {

 public static void main(String[] args) {

  InputStream in = System.in;
  System.out.println("Cadena : " + in);
  PrintStream out = System.out;
  System.out.println("Cadena : " + out);
  PrintStream err = System.err;
  System.out.println("Cadena : " + err);

  String cadena = "Cadena";

  System.out.printf("%s: %15d \n", cadena, 100);
  System.out.printf("%s: %15d \n", cadena, 200);
  System.out.printf("%s: %15d \n", cadena, 300);
  System.out.printf("%s: %15d \n", cadena, 400);

 }
}
