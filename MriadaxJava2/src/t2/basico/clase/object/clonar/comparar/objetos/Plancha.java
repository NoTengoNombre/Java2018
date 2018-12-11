/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.clonar.comparar.objetos;

import java.text.DecimalFormat;

/**
 * Subclase de PIEZA : No tiene más Subclases
 *
 * @see p5
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public final class Plancha extends Pieza {

 // ATRIBUTOS : variables de INSTANCIA
 private float largo;
 private float ancho;
 private float espesor;

 /**
  * Constructor SobreCargado
  *
  * Invoca al CONSTRUCTOR de la SUPERCLASE para implementar sus ATRIBUTOS
  *
  * @param numero
  * @param nombre
  * @param largo
  * @param ancho
  * @param espesor
  */
 public Plancha(int numero, String nombre, float largo, float ancho, float espesor) {
  super(numero, nombre);// Hereda 2 atributos de la SuperClase Pieza mediante su Propio Constructor  
  this.largo = largo;
  this.ancho = ancho;
  this.espesor = espesor;
 }

 public float getLargo() {
  return largo;
 }

 public float getAncho() {
  return ancho;
 }

 public float getEspesor() {
  return espesor;
 }

 /**
  * Devuelve la cantidad de metros de tubo que se puedan cortar
  *
  * @param metros
  * @return
  */
 public boolean cortar(float metros) {
  DecimalFormat df = new DecimalFormat("#,###.##");
  System.out.println("# De " + getNombre() + " con numero " + getNumero());
  if (largo < metros) {
   System.out.println("\u001B[35m# No se puede cortar " + metros + " metros");
   System.out.println("\u001B[36m# Solo quedan " + df.format(largo) + " metros");
   return false;
  }
  largo -= metros;
  System.out.println("\u001B[33m# Se han cortado " + metros + " metros");
  System.out.println("\u001B[32m# Quedan : " + df.format(largo) + " metros");
  return true;
 }

 @Override
 public String toString() {
  return "# Plancha [largo : " + getLargo() + "][ancho : " + getAncho() + "][espesor : " + getEspesor() + "]" + "[" + super.toString() + "]";
 }

}
