/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clases.anidadas;

import java.util.Random;

/**
 * CLASE CONTENEDORA
 *
 * @see p34
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 *
 */
public class ListaNumerosIterador {

 /**
  * ATRIBUTO : Crea una lista de Integer
  */
 private Integer[] lista;

 /**
  * ATRIBUTO : Almacena el numero de elementos
  */
 private int numElementos;

 /**
  * CLASE CONTENEDORA por defecto
  *
  */
 public ListaNumerosIterador() {
  this(new Random().nextInt(100));
 }

 /**
  * Declara la cantidad de elementos de tipo Integer puede almacenar
  *
  * @param maxElementos
  */
 public ListaNumerosIterador(int maxElementos) {
  lista = new Integer[maxElementos];
 }

 /**
  * Recibe un 'entero' y devuelve el valor dentro de la lista
  *
  * @param i
  * @return el valor en ese elemento
  */
 public int get(int i) {
  return lista[i];
 }

 /**
  * Añade un 'numero' al nuevo elemento de la lista
  *
  * @param i Un numero que se almacenara en la lista de elementos
  */
 public void add(int i) {
  lista[numElementos++] = i;
 }

 /**
  * Metodo de la clase CONTENEDORA que utiliza elementos de la clase Interna
  *
  * @return 1 nuevo objeto Iterador
  */
 public Iterador getIterador() {
  return new Iterador();
 }

 /**
  * Clase Interna o CLASE ANIDADA : Como Miembro de la Clase Interna
  */
 class Iterador {

  /**
   * Atributo clase Anidada 'Interior'
   */
  int indice;

  /**
   * Devuelve un objeto tipo "Integer" si hay elementos , en caso contrario
   * devuelve NULL de TIPO (Integer)
   *
   * @return Si el indice es menor que la longitud de elementos : Incrementa el
   * valor
   */
  Integer siguiente() {
   if (indice < numElementos) {
    return lista[indice++];
   } else {
    return (Integer) null;
   } // Fin de la clase INTERNA
  } // Fin de la CLASE CONTENEDORA
 }
}
