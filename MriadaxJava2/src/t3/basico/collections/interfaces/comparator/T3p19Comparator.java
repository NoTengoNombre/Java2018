/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see -
 * @since 11-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p19Comparator {

 private static void isSame(T3Persona p1, T3Persona p2) {
  System.out.println("---------------------");
  T3ComparadorTelefonico t3ct = new T3ComparadorTelefonico();
  int compara = t3ct.compare(p1, p2);
  System.out.println("1 Persona " + p1);
  System.out.println("2 Persona " + p2);
  switch (compara) {
   case -1:
    System.out.println("El primer objeto es menor que el segundo");
    break;
   case 0:
    System.out.println("los objetos son iguales");
    break;
   case 1:
    System.out.println("El primer objeto es mayor que el segundo");
    break;
  }
  System.out.println("Valor Obtenido : " + compara);
 }

 public static void main(String[] args) {

  List<T3Persona> per = new ArrayList<>();

  per.add(new T3Persona("Zacarias", 25, "923566744"));
  per.add(new T3Persona("Rosa", 23, "918575732"));
  per.add(new T3Persona("Blas", 34, "956589032"));
  per.add(new T3Persona("Rosa", 18, "985467804"));
  per.add(new T3Persona("Zacarias", 25, "944556679"));
  per.add(new T3Persona("XDistinto1", 35, "995467804"));
  per.add(new T3Persona("XDistinto2", 45, "999467804"));
  per.add(new T3Persona("XDistinto3", 65, "999467804"));

  Collections.sort(per, new T3ComparadorTelefonico());

  per.forEach((persona) -> {
   System.out.println(persona);
  });

  isSame(per.get(2), per.get(3));
  isSame(per.get(3), per.get(2));
  isSame(per.get(6), per.get(7));

 }
}
