/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.herencia;

/**
 * SuperClase
 *
 * @see @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pieza {

// ATRIBUTOS : variables de INSTANCIA
// Ajustamos el principio de ENCAPSULAMIENTO
 protected int numero;
 protected String nombre;

 /**
  * Constructor Sobrecargado
  *
  * @param numero
  * @param nombre
  */
 public Pieza(int numero, String nombre) {
  super(); // Constructor de la clase OBJECT
  this.numero = numero;
  this.nombre = nombre;
 }

 public int getNumero() {
  return numero;
 }

 public String getNombre() {
  return nombre;
 }

 @Override
 public String toString() {
  return "♠ Pieza [nombre : " + getNombre()
          + "]" + "[numero : " + getNumero()
          + "]" + "[" + this.getClass() + "]";
 }

}
