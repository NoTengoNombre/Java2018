/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * @see p17
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoBuclesDoWhileBasico {

 private static Random aleatorio = null;
 private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public static Random getAleatorio() {
  return aleatorio = new Random();
 }

 public int getNumeroAleatorio() {
// Declaracion e Inicializacion
  aleatorio = getAleatorio();
  int num = 0;
  String palabra = null;
  boolean f = false;
// Procesamiento
  do {
   num = aleatorio.nextInt(20);
   System.out.println("Numero generado : " + num);
   try {
    System.out.println("Desea continuar 'si' o 'no' ");
    palabra = br.readLine();
   } catch (IOException ioe) {
    System.out.println("Error" + ioe.getMessage());
   }
  } while ((palabra.equals("s")) || (palabra.equals("S")));
// Salida
  return num;
 }

 /**
  *
  * @return
  */
 public int getNumeroAleatorioEjPdf() {
  Random alea = getAleatorio();
  Scanner teclado = new Scanner(System.in);
  int menor = 1, mayor = 49, numero = 0;
  boolean seguir = false;
  do {
   numero = alea.nextInt(mayor - menor + 1) + menor;
   System.out.println("Numero : " + numero);
   System.out.println("Quieres otro numero ? ");
   String opcion = teclado.next();
   seguir = opcion.equals("s") || opcion.equals("S");
  } while (seguir);
  System.out.println("Fin");
  return numero;
 }

 public static void main(String[] args) {
  T1UsoBuclesDoWhileBasico tubdwb = new T1UsoBuclesDoWhileBasico();
  int numeroAleatorio = tubdwb.getNumeroAleatorio();
  System.out.println("1 Valor : " + numeroAleatorio);

  T1UsoBuclesDoWhileBasico tubdwb1 = new T1UsoBuclesDoWhileBasico();
  int numeroAleatorio1 = tubdwb1.getNumeroAleatorio();
  System.out.println("2 Valor : " + numeroAleatorio1);

  System.out.println("3 Valor : " + new T1UsoBuclesDoWhileBasico().getNumeroAleatorio());

  System.out.println("--------------------------");
  T1UsoBuclesDoWhileBasico tubdwb2 = new T1UsoBuclesDoWhileBasico();
  tubdwb2.getNumeroAleatorioEjPdf();

 }
}
