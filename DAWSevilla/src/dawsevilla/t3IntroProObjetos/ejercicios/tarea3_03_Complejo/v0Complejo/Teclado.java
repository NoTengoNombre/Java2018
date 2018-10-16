/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v0Complejo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see Main
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Teclado {

 public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public static int getNumeroEntero() {
  int numE = 0;
  System.out.println("Intro Numero Entero");
  try {
   numE = Integer.parseInt(br.readLine());
  } catch (IOException ioe) {
   System.out.println("" + ioe.getLocalizedMessage());
  }
  return numE;
 }

 public static double getNumeroDecimal() {
  double numD = 0;
  System.out.println("Intro Numero Decimal");
  try {
   numD = Float.parseFloat(br.readLine());
  } catch (IOException ioe) {
   System.out.println("" + ioe.getLocalizedMessage());
  }
  return numD;
 }

}
