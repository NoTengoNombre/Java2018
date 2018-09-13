/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroJavaParaNovatos.cap1Intro;

import java.util.Scanner;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class Cap1AlgoritmosBasico {

 public static int i;
 public static int nT;
 public static int numero;
 public static int res;
 public static int TOTALASIG = 10;
 public static final int LONGMAX = 10;
 public static Scanner sc;

 /**
  *
  */
 public static void get10Numeros() {
  sc = new Scanner(System.in);
  System.out.println("• Introduce una secuencia de 10 numeros");

  for (i = 1; i <= LONGMAX; i++) {
   nT += numero = sc.nextInt();
   System.out.println(" Posicion : " + i + " Valor : " + numero + " Num.Total: " + nT);
  }

  res = nT / LONGMAX;
  System.out.println("♦ Total : " + res);
 }

 /**
  *
  */
 public static void getNumerosDefinidos() {
  sc = new Scanner(System.in);
  System.out.println("• Introduce cuantos numeros quieres usar : ");

  TOTALASIG = sc.nextInt();
  System.out.println("• Has elegido : " + TOTALASIG);

  for (i = 1; i <= TOTALASIG; i++) {
   System.out.println("• Introduce el " + i + "º numero");
   nT += numero = sc.nextInt();
   System.out.println("♦ Posicion : " + i + " Valor : " + numero + " Num.Total: " + nT);
  }

  res = nT / TOTALASIG;
  System.out.println("♦ Total : " + res);
 }

 public static void main(String[] args) {

  getNumerosDefinidos();

 }
}
