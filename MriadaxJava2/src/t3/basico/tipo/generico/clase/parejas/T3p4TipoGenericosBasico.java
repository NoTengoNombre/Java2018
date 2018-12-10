/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.tipo.generico.clase.parejas;

/**
 * @see p4
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p4TipoGenericosBasico {

}

/**
 *
 * @author MyDevelop
 */
class PruebaPareja {

 public static void main(String[] args) {

//                         0           1          2         3       4       5
  String[] palabras = {"tenedor", "cuchillo", "cuchara", "taza", "vaso", "plato"};

  Pareja<String> mm = ArrayAlgo.minMax(palabras);

  System.out.println("menor  = " + mm.getPrimero());
  System.out.println("mayor  = " + mm.getSegundo());

 }
}

/**
 *
 * @author MyDevelop
 */
class ArrayAlgo {

 /**
  * Devuelve una pareja de palabras.
  *
  * 'min' es la menor en orden alfabetico
  *
  * 'max' es la mayor en orden alfabetico
  *
  * @param a
  * @return new Pareja<>(min, max);
  */
 public static Pareja<String> minMax(String[] a) {
  if ((a == null) || (a.length == 0)) {
   return null;
  }

  String min = a[0];
  String max = a[0];

  for (int i = 1; i < a.length; i++) {
   if (min.compareTo(a[i]) > 0) {
    min = a[i];
   }
   if (max.compareTo(a[i]) < 0) {
    max = a[i];
   }
  }
  return new Pareja<>(min, max);
 }
}

/**
 * Clase generica para almacenar objetos del tipo Pareja
 *
 * @author MyDevelop
 * @param <E>
 */
class Pareja<E> {

 /**
  * ATRIBUTO : Variable de Instancia Tipo Generico Clase Pareja
  */
 private E primero;
 /**
  * ATRIBUTO : Variable de Instancia Tipo Generico Clase Pareja
  */
 private E segundo;

 /**
  * Constructor por defecto : Inicializa a 'null' los ATRIBUTOS
  */
 public Pareja() {
  this.primero = null;
  this.segundo = null;
 }

 /**
  *
  * Constructor : Inicializa los valores de los OBJETOS
  *
  * @param primero
  * @param segundo
  */
 public Pareja(E primero, E segundo) {
  this.primero = primero;
  this.segundo = segundo;
 }

 /**
  *
  * @return Devuelve objeto Generico de 'TIPO' Pareja
  */
 public E getPrimero() {
  return primero;
 }

 /**
  *
  * @return Devuelve objeto Generico de 'TIPO' Pareja
  */
 public E getSegundo() {
  return segundo;
 }

 /**
  *
  * @param valor : Establece el valor del ATRIBUTO tipo Generico
  */
 public void setPrimero(E valor) {
  primero = valor;
 }

 /**
  *
  * @param valor : Establece el valor del ATRIBUTO tipo Generico
  */
 public void setSegundo(E valor) {
  segundo = valor;
 }

}
