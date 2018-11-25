/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.ejercicio.n1.tipo.de.datos;

import java.util.Scanner;

/**
 * @see -
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1EjercicioTiposDeDatos {

 private static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

  int c = 0;
  int c1 = 0;
  float resultado1 = 0;
  float resultado2 = 0;
  System.out.println("Introduce " + (++c) + " valor entero");
  int entero1 = sc.nextInt();
  System.out.println("Introduce " + (++c) + " valor entero");
  int entero2 = sc.nextInt();
  System.out.println("Introduce un valor decimal");
  float decimal1 = sc.nextFloat();

  resultado1 = (float) entero1 + (float) entero2 + decimal1;
  System.out.println("Resultado de la suma : " + resultado1);

  System.out.println("Quien es el mayor de los 2 enteros : ");
  System.out.println((entero1 >= entero2) ? entero1 : entero2);

  resultado2 = ((float) entero1 / (float) entero2) / decimal1;
  System.out.println("Resultado : " + resultado2);

  System.out.println("Introduce " + (++c1) + " una cadena");
  String cadena1 = sc.next();
  System.out.println("Introduce " + (++c1) + " una cadena");
  String cadena2 = sc.next();

  System.out.println("Concatenacion : " + cadena1.concat(cadena2));

 }
}
