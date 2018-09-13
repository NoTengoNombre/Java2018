/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.controldeExcepciones;

import java.io.BufferedReader;
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
public class Pag67ExcepcionesTiempoCompilacion {

 public static void main(String[] args) {

  ExcepcionEnCompilacion eec = new ExcepcionEnCompilacion();
  eec.lanzarMetodo();
  System.out.println("Valores 1 " + eec.getCadenaDevuelve1());
  System.out.println("Valores 2 " + eec.getCadenaDevuelve2());

 }
}

class ExcepcionEnCompilacion {

 // Una sola copia del objeto
 private static String cadena = null;
 private String cadenaDevuelta1;
 private String cadenaDevuelta2;
 private static final InputStreamReader isr = new InputStreamReader(System.in);
 private static final BufferedReader br = new BufferedReader(isr);

 public static String getCadena() {
  System.out.println("Introduce una cadena : ");
  try {
   cadena = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(Pag67ExcepcionesTiempoCompilacion.class.getName()).log(Level.SEVERE, null, ex);
  } finally {
   System.out.println("Ver cadena : " + cadena);
  }
  return cadena;
 }

 public static String getCadena2() {
  System.out.println("Introduce otra cadena : ");
  String cadena2 = null;
  try {
   cadena2 = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(Pag67ExcepcionesTiempoCompilacion.class.getName()).log(Level.SEVERE, null, ex);
   System.out.println("Lanzar cadena : " + ex.getCause().toString());
  } finally {
   System.out.println("Ver cadena2 : " + cadena2);
  }
  return cadena2;
 }

 public void lanzarMetodo() {
  this.cadenaDevuelta1 = getCadena();
  this.cadenaDevuelta2 = getCadena2();
 }

 public String getCadenaDevuelve1() {
  return cadenaDevuelta1;
 }

 public String getCadenaDevuelve2() {
  return cadenaDevuelta2;
 }

}
