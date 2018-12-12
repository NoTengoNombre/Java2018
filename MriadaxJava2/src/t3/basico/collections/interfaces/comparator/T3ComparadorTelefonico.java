/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.interfaces.comparator;

import java.util.Comparator;

/**
 * Clase que implementa la interface Comparator<T3Persona> y personaliza el
 * metodo para comprobar si 2 objetos son iguales
 *
 *
 * @see -
 * @since 11-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3ComparadorTelefonico implements Comparator<T3Persona> {

 /**
  *
  * @param o1
  * @param o2
  * @return
  */
 @Override
 public int compare(T3Persona o1, T3Persona o2) {
  return o1.getTelefono().compareTo(o2.getTelefono());
 }
}
