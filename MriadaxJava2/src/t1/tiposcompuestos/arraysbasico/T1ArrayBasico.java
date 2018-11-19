/*
7 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

import java.util.Random;

/**
 * @see -
 * @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1ArrayBasico {

 static int[] arrayInt3 = new int[10];

 public static void main(String[] args) {

  int[] arrayInt1 = new int[10];
  int arrayInt2[] = new int[10];
  arrayInt3 = new int[10];

  int listanumeros[];

  listanumeros = new int[10];

  char[] letras = new char[10];

  System.out.println("Longitud total : " + (letras.length));
  System.out.println("Longitud total : " + (letras.length - 1));
  System.out.println("Longitud total : " + (letras.length - 2));
  System.out.println("Longitud total : " + (letras.length - 3));
  System.out.println("Longitud total : " + (letras.length - 4));

  for (int i = 0; i < letras.length; i++) {
   System.out.print(i + " - " + letras[i]);
  }
  System.out.println("");

  letras = new char[]{'m', 'a', 't', 'i', 'h', 'u', 'e', 'l', 'o', 's'};

  int i = 0;
  for (char letra : letras) {
   System.out.println(i++ + " - " + letra);
  }

  System.out.println("letras[2] - " + letras[2]);
  System.out.println("letras[8] - " + letras[8]);
  System.out.println("letras[8] = 'a' -> " + (letras[8] = 'a'));
  System.out.println("letras[10] produce la Expecion : java.lang.ArrayIndexOutOfBoundsException");

  System.out.println(" --- Declaracion array aleatorio --- ");

//  Crear una variable de instancia
  Random aleatorio = new Random();

  int size = aleatorio.nextInt(25) + 1;
  int lista[] = new int[size];

  for (int j = 0; j < lista.length; j++) {
   lista[j] = aleatorio.nextInt(1000);
  }

  for (int j = 0; j < lista.length; j++) {
   System.out.println("lista[" + j + "] : " + lista[j]);
  }

  System.out.println("------ Declarar array en una sola linea ------ ");

  char vocales[] = {'a', 'e', 'i', 'o', 'u'};

  for (char vocal : vocales) {
   System.out.print(" " + vocal);
  }
  System.out.println("");

  int milista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  for (int elemento : milista) {
   System.out.print(elemento + " - ");
   if (elemento == milista.length) {
    System.out.println("");
   }
  }

  String nombres[] = {"Pepe Perez", "Gil Lopez", "Ana Ruiz"};

  for (String nombre : nombres) {
   System.out.println("Posicion de la memoria : " + nombres + " - " + nombre);
  }

//  Recorre el array y obtiene el valor de cada posicion
  int pos = 0;
  for (int n : lista) {
   System.out.println(" - Posicion : " + +(++pos) + " - " + n);
  }

 }
}
