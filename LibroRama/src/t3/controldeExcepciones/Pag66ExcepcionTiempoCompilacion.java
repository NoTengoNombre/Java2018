/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.controldeExcepciones;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag66ExcepcionTiempoCompilacion {

 private static final InputStreamReader isr = new InputStreamReader(System.in);
 private static final BufferedReader br = new BufferedReader(isr);

 /**
  *
  * @return
  */
 public static String getMensaje() {
  System.out.println("• Introduce una letra • ");
  String caracter = null;
  try {
   caracter = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(Pag66ExcepcionTiempoCompilacion.class.getName()).log(Level.SEVERE, null, ex);
   try {
    throw new EOFException("Error lanzado ");
   } catch (EOFException ex1) {
    Logger.getLogger(Pag66ExcepcionTiempoCompilacion.class.getName()).log(Level.SEVERE, null, ex1);
   }
  }
  return caracter;
 }

 public static void main(String[] args) {

  System.out.println("Ver mensaje : " + getMensaje());

 }
}
