/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.excepciones.clasethrowable.exception.numberformatexception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see - https://www.youtube.com/watch?v=2gWTVxe31g8&feature=related
 * @since 08-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T4ExcepcionConversionCaracterANumero {

 public static void main(String[] args) throws Exception {

  System.out.println("Inicio del programa");
  metodo1();
  metodoA();
  metodoE();
  try {
   metodoThrows();
  } catch (Exception e) {
   System.out.println("Error al lanzar metodo 'metodoThrow' "
           + "lo gestiona el metodo Main : " + e.getMessage());
  }
  metodoThrowMain();
  System.out.println("Final del programa");
 }

 /**
  * No lanza excepcion
  */
 public static void metodo1() {
  try {
   int x = Integer.parseInt("1");
   System.out.println("Valor de x : " + x);
  } catch (NumberFormatException e) {
   System.out.println("♦ Error General : " + e);
  }
 }

 /**
  * Lanza excepcion
  */
 public static void metodoA() {
  try {
   int x = Integer.parseInt("A");
   System.out.println("Valor de x : " + x);
  } catch (NumberFormatException nfe) {
   System.out.println("• Error General : " + nfe.getMessage());
  }
 }

 /**
  * Lanza excepcion general
  */
 public static void metodoE() {
  try {
   int x = Integer.parseInt("A");
   System.out.println("Valor de x : " + x);
  } catch (Exception nfe) {
   System.out.println("• Error General : " + nfe.getMessage());
  }
 }

 /**
  *
  * @throws Exception
  */
 public static void metodoThrows() throws Exception {
  int x = Integer.parseInt("A");
  System.out.println("Valor de x : " + x);
 }

 /**
  * Metodo que gestiona la Excepcion el metodo main();
  *
  * @throws Exception
  */
 public static void metodoThrowMain() throws Exception {
  int x = Integer.parseInt("A");
  System.out.println("Valor de x : " + x);
 }

}
