/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.interfaces.comparator;

/**
 * @see -
 * @since 11-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3Persona {

 private String nombre;
 private int edad;
 private String telefono;

 /**
  *
  */
 public T3Persona() {
  this(null, 0, null);
 }

 /**
  *
  * @param nombre
  * @param edad
  * @param telefono
  */
 public T3Persona(String nombre, int edad, String telefono) {
  this.nombre = nombre;
  this.edad = edad;
  this.telefono = telefono;
 }

 /**
  *
  * @return
  */
 public String getTelefono() {
  return telefono;
 }

 /**
  *
  * @return
  */
 public int getEdad() {
  return edad;
 }

 /**
  *
  * @return
  */
 public String getNombre() {
  return nombre;
 }

 @Override
 public String toString() {
  return "[Nombre: " + getNombre() + " - Edad: " + getEdad() + " - Telefono: " + getTelefono() + "]";
 }

}
