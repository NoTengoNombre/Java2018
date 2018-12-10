/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @see p8
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p8ArrayList {

 public static void main(String[] args) {

  Random aleatorio = new Random();
  List<Number> listaNumeros = new ArrayList<Number>();

  int limite = (aleatorio.nextInt(24) + 1);

  System.out.println("limite : " + limite);

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
    default:
     System.out.println("Indice fuera del rango");
     break;
   }
  }

  System.out.println("Elementos lista : " + listaNumeros.size());

  for (Number numero : listaNumeros) {
   System.out.println(numero);
  }

  int indice = aleatorio.nextInt(limite - 1);
  System.out.println("Elemento : " + indice + " : " + listaNumeros.get(indice));
  listaNumeros.remove(indice);
  System.out.println("Elementos lista : " + listaNumeros.size());
 }
}
