/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.clonar.comparar.objetos;

/**
 * SUPERCLASE "PIEZA"<br>
 * Subclase de "Tubo" SuperClase "Tubo"<br>
 * Subclase de "Acanalado"<br>
 *
 * @see
 * @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public final class Liso extends Tubo {

// ATRIBUTOS DE INSTANCIA
 private String color;
 private float espesor;

 /**
  * Por defecto ( Herencia Object)
  */
 public Liso() {
  super();
  this.color = "Color Por defecto";
  this.espesor = 0.0F;
 }

 /**
  * Por defecto 2 Parametro de la Propia Clase
  *
  * @param color
  * @param espesor
  */
 public Liso(String color, float espesor) {
  this.color = color;
  this.espesor = espesor;
 }

 /**
  * Constructor HERENCIA SUPERCLASE 'Tubo'
  *
  * @param numero
  * @param nombre
  * @param calibre
  * @param medida
  */
 public Liso(int numero, String nombre, float calibre, String medida) {
  super(calibre, medida, numero, nombre);
  this.color = "Sin Color";
  this.espesor = 0.0F;
 }

 /**
  * Constructor HERENCIA SUPERCLASE 'Tubo' y SUPERCLASE 'Pieza'
  *
  * @param color
  * @param espesor
  * @param calibre
  * @param medida
  * @param numero
  * @param nombre
  */
 public Liso(String color, float espesor, float calibre, String medida, int numero, String nombre) {
  super(calibre, medida, numero, nombre);
  this.color = color;
  this.espesor = espesor;
 }

 /**
  *
  * @return
  */
 public String getColor() {
  return color;
 }

 /**
  *
  * @return
  */
 public float getEspesor() {
  return espesor;
 }

 /**
  * Implementa la funcion clone() en la clase donde se va a utilizar
  *
  * @return
  * @throws CloneNotSupportedException
  */
 @Override
 protected Object clone() throws CloneNotSupportedException {
  return new Liso(color, espesor, getCalibre(), getMedida(), getNumero(), getNombre());
 }

 /**
  * @return
  */
 @Override
 public String toString() {
  return "♦ Liso [color : " + getColor() + "][espesor : " + getEspesor() + "]" + "[" + this.getClass() + "]";
 }
}
