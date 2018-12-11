/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.set.hashset.treeset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @see p9
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p9ConjuntoSet {

}

class InterfaceConjuntoSet {

 static Random aleatorio = new Random();

 static List<Integer> listArrayNumeros = new ArrayList<Integer>();
 static Set<Integer> hashSetNumeros = new HashSet<Integer>();
 static Set<Integer> treeSetNumeros = new TreeSet<Integer>();

 public static void main(String[] args) {

  int n;
  for (int i = 1; i < 11; i++) {
   n = (aleatorio.nextInt(20) + 1);
   listArrayNumeros.add(n);
   hashSetNumeros.add(n);
   treeSetNumeros.add(n);
  }

  System.out.println("• Numeros generados orden fueron aniadidos");
  System.out.println("Elementos en el ArrayList : " + listArrayNumeros.size());
  for (Integer numero : listArrayNumeros) {
   System.out.print(numero + " ");
  }

  System.out.println();
  System.out.println("♣ Ignora repetidos y orden no previsible");
  System.out.println("Elementos en el HashSet : " + hashSetNumeros.size());
  for (Integer numero : hashSetNumeros) {
   System.out.print(numero + " ");
  }

  System.out.println();
  System.out.println("♥ Ignora repetidos y ordenados menor a mayor");
  System.out.println("Elementos en el TreeSet : " + hashSetNumeros.size());
  for (Integer numero : treeSetNumeros) {
   System.out.print(numero + " ");
  }
  System.out.println();

 }

}
