/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.polimorfismo;

/**
 * Clase Abstract
 *
 * @see @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public abstract class PiezaPoli {

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
 public PiezaPoli(int numero, String nombre) {
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

 /**
  * Funcion Abstracta que se implementará en las demas SubClases
  *
  * @param cantidad
  */
 public abstract void vender(int cantidad);

 /**
  * Devuelve todos atributos de esta clase
  *
  * @return
  */
 @Override
 public String toString() {
  return "♠ Pieza [nombre : " + getNombre()
          + "]" + "[numero : " + getNumero()
          + "]" + "[" + this.getClass() + "]";
 }

}
