/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02_Persona.v1Persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Teclado {

 private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

 /**
  * @return cadena
  */
 public static String getCadena() {
  String cadena = null;
  System.out.println("☆ Introduce un Nombre");
  try {
   cadena = BR.readLine();
  } catch (IOException ioe) {
   System.out.println("- Error : " + ioe.getMessage());
  }
  return cadena;
 }

 /**
  * @return numero entero
  */
 public static int getNumeroEntero() {
  String cadena;
  int entero = 0;
  System.out.println("☆ Introduce un Numero");
  try {
   cadena = BR.readLine();
   entero = Integer.parseInt(cadena);
  } catch (IOException ioe) {
   System.out.println("- Error : : " + ioe.getMessage());
  }
  return entero;
 }

 /**
  * @return numero entero
  */
 public static int getNumeroEntero2() {
  String cadena;
  int entero = 0;
  System.out.println("☆ Introduce una Edad");
  try {
   cadena = BR.readLine();
   entero = Integer.parseInt(cadena);
  } catch (IOException ioe) {
   System.out.println("- Error : : " + ioe.getMessage());
  }
  return entero;
 }

 /**
  * @return numero entero
  */
 public static float getNumeroFloat() {
  String cadena;
  float decimal = 0;
  System.out.println("☆ Introduce un Decimal");
  try {
   cadena = BR.readLine();
   decimal = Float.parseFloat(cadena);
  } catch (IOException ioe) {
   System.out.println("- Error : " + ioe.getMessage());
  }
  return decimal;
 }

}
