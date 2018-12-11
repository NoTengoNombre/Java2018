/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.clonar.comparar.objetos;

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
  * Constructor por defecto
  */
 public Pieza() {
  this(0, "");
 }

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

 /**
  *
  * @return prime
  */
 @Override
 public int hashCode() {
  final int prime = 31; // Patron Numerico 'primo' para Generar el numero HashCode
  int result = 1; // 
  result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
  result = prime * result + numero;
  return result;
 }

 /**
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) {
  if (this == obj) { // 'objeto' actual tiene la misma 'REFERENCIA' al pasado por parametro
   return true;
  }
  if (obj == null) { // 'objeto' por parametro tiene una 'REFERENCIA' que apunta a 'null' 
   return false;
  }
// getClass -> Devuelve la clase del objeto
  if (getClass() != obj.getClass()) {
   return false;
  }
//  Objeto que no se 'HEREDA' por nadie
  Pieza other = (Pieza) obj; // Up-Casting
//  Si el 'objeto' actual tiene una referencia que apunta al 'objeto' por REFERENCIA devuelve TRUE
  if (nombre == null) {
   if (other.nombre != null) {
    return false;
   }
  } else if (!nombre.equals(other.nombre)) {
   return false;
  }
  if (numero != other.numero) {
   return false;
  }
  return true;
 }

 /**
  *
  * @return getNombre + " " + getNumero + " " + getClass
  */
 @Override
 public String toString() {
  return "♠ Pieza [nombre : " + getNombre()
          + "]" + "[numero : " + getNumero()
          + "]" + "[" + this.getClass() + "]";
 }

}
