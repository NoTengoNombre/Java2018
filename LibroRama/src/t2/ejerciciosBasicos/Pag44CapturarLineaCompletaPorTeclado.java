/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see @since 26-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag44CapturarLineaCompletaPorTeclado {

 public static String ln = null;

 /**
  *
  * @return
  */
 public static String getTeclado() {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader buff = new BufferedReader(isr);
  try {
   ln = buff.readLine();
  } catch (IOException ex) {
   Logger.getLogger(Pag44CapturarLineaCompletaPorTeclado.class.getName()).log(Level.SEVERE, null, ex);
   System.out.println("Excepciones : " + ex.toString() + " " + ex.getMessage());
  }
  return ln;
 }

 public static void main(String[] args) {

  System.out.println("-- Capturar por teclado -- ");
  System.out.println(getTeclado());
 }
}
