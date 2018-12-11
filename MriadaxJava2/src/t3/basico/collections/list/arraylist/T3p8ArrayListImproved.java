/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @see p8
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p8ArrayListImproved {

 public static void main(String[] args) {

  PruebaArrayList.setValues();
  System.out.println("--------------");
  PruebaArrayList.getValues();
 }
}

class PruebaArrayList {

 static int limite;
 static Random aleatorio = new Random();
 static List<Number> listaNumeros = new ArrayList<>();

 /**
  *
  * @param listaNumeros
  */
 public static void setValues() {
  limite = (aleatorio.nextInt(24) + 1);

  for (int i = 1; i < limite; i++) {
   int tipo = (aleatorio.nextInt(4) + 1);
   switch (tipo) {
    case 1:
     listaNumeros.add(aleatorio.nextInt(1000) + 1);
     break;
    case 2:
     listaNumeros.add(aleatorio.nextLong());
     break;
    case 3:
     listaNumeros.add(aleatorio.nextFloat());
     break;
    case 4:
     listaNumeros.add(aleatorio.nextDouble());
     break;
   }
  }
  showValues(listaNumeros);
  getIterador(listaNumeros);
  getForEach(listaNumeros);
 }

 public static void showValues(List<Number> listaNumeros) {
  System.out.println("Elementos lista : " + listaNumeros.size());
  listaNumeros.forEach((numero) -> {
   System.out.println(" - " + numero);
  });
 }

 /**
  *
  */
 public static void getValues() {
  int indice = aleatorio.nextInt(limite - 1);
  System.out.println("Elemento : " + indice + " : " + listaNumeros.get(indice));
  listaNumeros.remove(indice);
  System.out.println("Elementos lista : " + listaNumeros.size());
 }

 /**
  *
  * @param listaNumeros
  */
 public static void getIterador(List<Number> listaNumeros) {
  int i = 0;
  System.out.println("\u001B[33m• Funciones Iteradora");
  for (Iterator<Number> it = listaNumeros.iterator(); it.hasNext();) {
   Number numero = it.next();
   System.out.println((++i) + " - " + numero);
  }
 }

 /**
  *
  * @param listaNumeros
  */
 public static void getForEach(List<Number> listaNumeros) {
  int i = 0;
  System.out.println("\u001B[35m♠ Funciones Lambda");
  listaNumeros.forEach((numero) -> {
   System.out.println(i + " - " + numero);
  });
 }
}
