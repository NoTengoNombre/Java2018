/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.basico;

/**
 * SUPERCLASE "PIEZA"<br>
 * Subclase de "Tubo" SuperClase "Tubo"<br>
 * Subclase de "Acanalado"<br>
 *
 * @see p6
 * @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public final class Acanalado extends Tubo {

// ATRIBUTOS 
 private String material;
 private boolean esFlexible;

 /**
  * SUPER Constructor nivel 1 ( Herencia Completa )
  *
  * @param material
  * @param esFlexible
  * @param calibre
  * @param medida
  * @param numero
  * @param nombre
  */
 public Acanalado(String material, boolean esFlexible, float calibre, String medida, int numero, String nombre) {
  super(calibre, medida, numero, nombre);
  this.material = material;
  this.esFlexible = esFlexible;
 }

 /**
  * SUPER y SUB Constructor nivel 2 (Herencia Intermedia)
  *
  * @param material
  * @param esFlexible
  */
 public Acanalado(String material, boolean esFlexible) {
  super(0, material, 0, material);
  this.material = material;
  this.esFlexible = esFlexible;
 }

 /**
  * Constructor nivel 3
  */
 public Acanalado() {
  super();
  this.esFlexible = false;
  this.material = "Material Anonimo";
 }

 public String getMaterial() {
  return material;
 }

 public boolean isFlexible() {
  return esFlexible;
 }

 @Override
 public String toString() {
  return "♥ Acanalado [material : " + getMaterial() + "]" + "[flexible : " + isFlexible() + "]" + "[" + super.toString();
 }

}
