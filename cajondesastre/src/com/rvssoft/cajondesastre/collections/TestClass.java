package com.rvssoft.cajondesastre.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Crear una lista , arraylist ,
 *
 * 4 pasajeros de variables static
 *
 * Java 8 : Se usan Stream para iterar
 *
 * @author Formacion
 *
 */
public class TestClass {

 private static Pasajero p1 = new Pasajero(1, "Pepin", "Barcelona");
 private static Pasajero p2 = new Pasajero(2, "Honorio", "Madrid");
 private static Pasajero p3 = new Pasajero(3, "Anna", "Almeria");
 private static Pasajero p4 = new Pasajero(4, "Carlota", "Sevilla");

 /**
  * List --> no permite remove cuando esta iterando en la coleccion con
  * 'ITERATOR' solo se puede usar el 'remove' con el while
  *
  */
 private static void testList() {
  // Preguntar siempre por 'IS A'
  /**
   * Puedo Invocarlo como Interfaces , no hacerlo mediante Clases que implemente
   *
   */
  // Interfaces Clase Implementa la lista
//		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>(); // se puede mejorar

  List<Pasajero> listaPasajerosList = new ArrayList<>(); // se puede mejorar

  listaPasajerosList.add(p1);
  listaPasajerosList.add(p2);
  listaPasajerosList.add(p3);
  listaPasajerosList.add(p4);

  // Podemos mostrar la lista mediante el metodo toString
  System.out.println(listaPasajerosList);

  // Podemos iterar con el for clasico
  for (int i = 0; i < listaPasajerosList.size(); i++) {
   System.out.println(i + " " + listaPasajerosList.get(i).getNombre());
  }

  // Podemos iterar mediante el foreach
  for (Pasajero p : listaPasajerosList) {
   System.out.println(p.getNombre());
  }

  // Iterar con el iterador para recorrer los objetos de PASAJERO
  Iterator<Pasajero> iterator = listaPasajerosList.iterator();

  // metodo next y el metodo hashNext
  // Dentro de SQL : se comporta igual que un cursor
  while (iterator.hasNext()) {
   System.out.println("Elemento : " + iterator.next());
  }

 }

 private static void testSet() {
  // No existe ORDEN aunque lo parezca
  // Llamamos la Interfaz y usamos la clase para implementar el metodo
  Set<Pasajero> setPasajeros = new HashSet<>();
  setPasajeros.add(p1);
  setPasajeros.add(p2);
  setPasajeros.add(p3);
  setPasajeros.add(p4); // Si creo otro objeto igual , lo a�ade
  // Si creo otro objeto igual , lo a�ade : NO HACE NADA , NO LO A�ADE
//		setPasajeros.add(new Pasajero(4,"NUEVO", "NUEVA")); 

  System.out.println("\nSET");
  System.out.println("Elemento ");

  // Set con orden de llegada
  Set<Pasajero> pasajeroLinkados = new LinkedHashSet<>();
  pasajeroLinkados.add(p3);
  pasajeroLinkados.add(p4);
  pasajeroLinkados.add(p2);
  pasajeroLinkados.add(p1);

  System.out.println("\nSET - PasajeroLinkados");
  System.out.println(pasajeroLinkados);

 }

 /**
  * Solo un orden natural : reorganizar una orden de objetos Usar comparador si
  * queremos a�adir otro tipo de comparaci�n Usar "APARATOS DE DORAIMON" Usar la
  * interfaces <Compartor<Persona>
  */
 private static void testTreeSet() {
//      Interface   variable =    Clase
  Set<String> nombres = new TreeSet<>();
  nombres.add("Walter");
  nombres.add("Pepin");
  nombres.add("Bartolo");
  System.out.println(nombres);

  Set<Pasajero> pasajeros = new TreeSet<>();
  pasajeros.add(p1);
  pasajeros.add(p2);
  pasajeros.add(p3);
  pasajeros.add(p4);

  System.out.println(pasajeros);

 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
//		testList();
//		testSet();
  testTreeSet();
 }

}
