/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.controldeExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag67TryCatchDivision0 {

}

class Test {

 private static String readString;
 private static int read;

 public static void lanzarMetodo() {
  //Leer desde teclado una cadena
  InputStreamReader is = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(is);

  System.out.println("Introduce un numero : ");
  try {
   readString = br.readLine();
   System.out.println("Valor del String :  " + readString);
  } catch (IOException e) {  // Error del sistema
   System.out.println("Mensaje : " + e.getLocalizedMessage());
  } finally {
   try {
    read = Integer.parseInt(readString);
   } catch (NumberFormatException ae) {
    System.out.println("Resultado 1 : " + ae.getMessage().toUpperCase());
   } finally {

    int a = read, b = 0, c = 0;
    System.out.println("Valor read : " + read);

    try {
     c = (a / b);
    } catch (java.lang.ArithmeticException ae) {
     System.out.println("Resultado : " + ae.getMessage().toUpperCase() + " Valor de c : " + c);
    }
   }
  }
 }

 public static void main(String[] args) {

  lanzarMetodo();
 }
}
