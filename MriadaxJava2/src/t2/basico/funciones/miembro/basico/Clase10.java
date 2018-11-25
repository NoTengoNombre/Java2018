/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.basico;

import java.util.Objects;

/**
 * @see p28
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase10 {

 private int numero;
 private String nombre;

 /**
  * Constructor por defecto
  *
  */
 public Clase10() {
  this(0, "Anonima");
 }

 /**
  * Constructor Clonador
  *
  * @param objeto2 the value of objeto2
  */
 public Clase10(Clase10 objeto2) {
 }

 /**
  * @param numero
  * @param nombre
  */
 public Clase10(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 public String getNombre() {
  return nombre;
 }

 public int getNumero() {
  return numero;
 }

 /**
  *
  * @param obj
  * @return
  */
 @Override
 public boolean equals(Object obj) {
  if (this == obj) { // si la referencia de este objeto 'this' == "argumento" objeto
   return true;
  }
  if (obj == null) { // si la referencia "argumento" objeto == null
   return false; // sale
  }
//Devuelve la clase de tiempo de ejecución de este objeto. 
//El objeto Class devuelto es el objeto que se bloquea 
//mediante métodos estáticos sincronizados de la clase representada.
  if (this.getClass() != obj.getClass()) { // si ambas 
   return false;
  }

  Clase10 other = (Clase10) obj;
  if (nombre == null) { // Si ATRIBUTO 'nombre' == null
   if (other.nombre != null) { // Si un 'objeto.ATRIBUTO' distinto de 'null'
    return false;
   }
  } else if (!nombre.equals(other.nombre)) { // Si las 'cadenas' son distintas devuelve false 'No es mismo objeto'
   return false;
  }
  if (numero != other.numero) { //  Si 'numero' es distinto 'Objeto.ATRIBUTO'
   return false;
  }
  return true;
 }

 @Override
 public int hashCode() {
  int hash = 3;
  hash = 17 * hash + this.numero;
  hash = 17 * hash + Objects.hashCode(this.nombre);
  return hash;
 }

 public static void main(String[] args) {

  Clase10 objeto1 = new Clase10(52, "Anacleto");
  Clase10 objeto2 = new Clase10(52, "Mortadelo y Filemon");
  Clase10 clonoObjeto2 = new Clase10(objeto2);
  Clase10 objeto3 = new Clase10(objeto1.getNumero(), "Carpanta");
  Clase10 objeto4 = new Clase10(27, objeto1.getNombre());
  Clase10 objetoNull = null;
  Clase10 objeto = objeto1;

  System.out.println("objeto1.equals(objeto) : " + objeto1.equals(objeto));
  System.out.println("objeto1.equals(objetoNull) : " + objeto1.equals(objetoNull));
  System.out.println("objeto1.equals(\"Anacleto\") : " + objeto1.equals("Anacleto"));
  System.out.println("objeto1.equals(objeto3) : " + objeto1.equals(objeto3));
  System.out.println("objeto1.equals(objeto4) : " + objeto1.equals(objeto4));
  System.out.println("objeto1.equals(objeto1) : " + objeto1.equals(objeto1));
  System.out.println("objeto1.equals(clonoObjeto2) : " + objeto1.equals(clonoObjeto2));

 }
}
