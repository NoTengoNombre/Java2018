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
public class Pag44CapturarLineaCompletaPorTeclado2 {

 private static int iDato;

 /**
  *
  * @return iDato
  */
 public static int getTeclado() {
  String sDato = null;

  try {

   System.console().readLine();

  } catch (java.lang.NullPointerException npe) {
   System.out.println("Null Pointer Exception : " + npe.getLocalizedMessage() + " Obtener mensaje " + npe.getMessage());
  }
  iDato = Integer.parseInt(sDato);
  return iDato;
 }

 public static void main(String[] args) {

  System.out.println("-- Capturar por teclado -- ");
  System.out.println(getTeclado());
 }
}
