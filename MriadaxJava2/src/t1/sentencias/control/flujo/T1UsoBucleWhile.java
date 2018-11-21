/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @see p15
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoBucleWhile {

// Solo habrá una COPIA DE ESTE OBJETO PARA TODA LA CLASE
 private static final Random ALEATORIO = new Random();
 private static final Scanner TECLADO = new Scanner(System.in);
 private static List<Integer> lista = new ArrayList<>();

 public static List<Integer> getListaNumeros() {
  int menor = 1, mayor = 49, numero = 0;
  boolean seguir = true;
  int contador = 4;

  while (seguir) {
   numero = ALEATORIO.nextInt(mayor - (menor + 1)) + menor;
   lista.add(numero);
   System.out.println("Numero : " + numero);
   System.out.println("¿Quieres otro numero?");
   String opcion = TECLADO.next();
   seguir = (opcion.equals("s") || opcion.equals("S"));
  }
  System.out.println("FIN");
  return lista;
 }

 public static void setRecorrerElementos() {
  getListaNumeros();
  System.out.println("- Mediante Primitivos - ");
  for (int primitivoInt : lista) {
   System.out.println("Con indice primitivo : " + primitivoInt);
  }
  System.out.println("- Mediante Objetos - ");
  for (Integer objetoInt : lista) {
   System.out.println("Con indice primiytivo : " + objetoInt);
  }
  System.out.println("- Mediante Flecha - ");
  lista.forEach((objetoInt) -> {
   System.out.println("Con indice primitivo : " + objetoInt);
  });
 }

 public static void main(String[] args) {
  setRecorrerElementos();
 }
}
