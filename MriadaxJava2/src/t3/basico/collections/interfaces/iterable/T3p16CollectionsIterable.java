/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.interfaces.iterable;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @see p16
 * @since 11-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p16CollectionsIterable {

 public static void main(String[] args) {

  Random aleatorio = new Random();

  List<Number> listaNumeros = new ArrayList<>(10);

  for (int i = 0; i < 10; i++) {
   listaNumeros.add(aleatorio.nextInt(20));
   listaNumeros.add((double) Math.round((aleatorio.nextFloat() * 100d) / 100d));
  }

//  Codigo que añade elementos a listaNumeros
  for (Number numero : listaNumeros) {
   System.out.print(numero + " ");
  }
  System.out.println();

  Iterator<Number> iterador = listaNumeros.iterator();

  while (iterador.hasNext()) {
   Class clase = iterador.next().getClass();
   if (clase.equals(Float.class) || clase.equals(Double.class)) {
    iterador.remove();
   }
  }
  for (Number numero : listaNumeros) {
   System.out.print(numero + " ");
  }
  System.out.println();

 }
}
