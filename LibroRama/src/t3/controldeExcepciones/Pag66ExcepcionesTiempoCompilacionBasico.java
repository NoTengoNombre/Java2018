/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.controldeExcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag66ExcepcionesTiempoCompilacionBasico {

 public static void main(String[] args) {
  ExcepcionTiempoCompilacion eec = new ExcepcionTiempoCompilacion();
  int capturaTeclado = eec.getCapturaTeclado();
  System.out.println("• Valor : " + capturaTeclado);
 }
}

class ExcepcionTiempoCompilacion {

// Varias copias del mismo objeto
 private final InputStreamReader isr;
 // Varias copias del mismo objeto
 private final BufferedReader br;
 private int numero;

 public ExcepcionTiempoCompilacion() {
  this.isr = new InputStreamReader(System.in);
  this.br = new BufferedReader(isr);
  this.numero = 0;
 }

 public ExcepcionTiempoCompilacion(int numero) {
  this.isr = new InputStreamReader(System.in);
  this.br = new BufferedReader(isr);
  this.numero = numero;
 }

 public int getNumero() {
  return this.numero;
 }

 public void setNumero(int numero) {
  this.numero = numero;
 }

 /**
  * Coge el valor por teclado
  *
  * Captura las excepciones
  *
  * @return numero entero
  */
 public int getCapturaTeclado() {
  String num;
  try {
   System.out.println("♦ Intro mensaje : ");
   num = br.readLine();
   numero = Integer.parseInt(num);
  } catch (IOException ex) {
   Logger.getLogger(ExcepcionTiempoCompilacion.class.getName()).log(Level.SEVERE, null, ex);
   System.out.println("♠ Error " + ex.getLocalizedMessage().toUpperCase(Locale.GERMANY));
  } catch (NumberFormatException nfe) {
   System.out.println("• Error " + nfe.getLocalizedMessage().toLowerCase());
  } finally {
   System.out.println("Valor del numero : " + numero);
  }
  return numero;
 }

}
