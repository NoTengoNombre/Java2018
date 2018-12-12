/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.interfaces.comparable;

/**
 * @see @since 11-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3Persona implements Comparable<T3Persona> {

 private String nombre;
 private int edad;
 private String telefono;

 /**
  *
  */
 public T3Persona() {
  this(null, 0, null);
 }

 public int getEdad() {
  return edad;
 }

 public String getNombre() {
  return nombre;
 }

 public String getTelefono() {
  return telefono;
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
  * <b> Para hacer comparaciones entre objetos buscar un atributo y compararlo
  * entre ambos objetos</b>
  * <br>
  * Compara 'this' con el objeto cuya referencia como parametro y el valor
  * devuelto
  *
  * @param persona Objeto a comparar con el objeto 'this' actual
  * @return -1 : objeto es menor que el recibido por parametro <br> | 0 :
  * objetos son iguales <br> | 1 <br> objeto es mayor que el recibido por
  * parametro
  */
 @Override
 public int compareTo(T3Persona persona) {
  if (this.equals(persona)) {
   return 0;
  }
  if (this.hashCode() == persona.hashCode()) {
   return 0;
  }

  if (this.edad != persona.edad) {

   int n = this.nombre.compareTo(persona.nombre);

   System.out.println(" ♦♦♦ Valor de 'n' : " + n);
   if (n == 0) {
    if (this.edad > persona.edad) {
     return 1;
    }
    return -1;
   }
  }
  return this.nombre.compareTo(persona.nombre);
 }

 /**
  * Sirve para comparar objetos de una forma mas rapida en estructuras 'hash' Si
  * cada objeto devuelve un 'hash' diferente no seguira comparando y considera a
  * los objetos distintos
  *
  * Ambos objetos comparte el mismo 'hash' invocará al metodo 'equals' y
  * revisara al detalle si se cumple la igualdad
  *
  * @return
  */
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = (prime * result) + ((nombre == null) ? 0 : nombre.hashCode());
  return result;
 }

 /**
  * En caso de que los objetos a comparar tengan el mismo 'hashCode' <br>
  * se ejecuta este metodo para encontrar diferencias entre sus atributos
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) {
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  T3Persona other = (T3Persona) obj;
  if (nombre == null) {
   if (other.nombre != null) {
    return false;
   } else if (!nombre.equals(other.nombre)) {
    return false;
   }
  }
  return true;
 }

 /**
  *
  * @return Todos los 'Atributos' de la clase
  */
 @Override
 public String toString() {
  return "Persona [Nombre : " + getNombre() + ", Edad : " + getEdad() + ", Telefono : " + getTelefono() + "]";
 }
}
