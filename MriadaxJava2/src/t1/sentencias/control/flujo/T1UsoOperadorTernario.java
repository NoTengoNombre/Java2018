/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see p7
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoOperadorTernario {

 private static final int NUMERO = new Random().nextInt(100);

 private static int[] cadenaNumerosAleatorios = new int[10];
 private static int[] cadenaNumerosFijos = new int[10];

 private static int resultado;
 private static int divisor;
 private static int dividendo;

 public static boolean esMayorEdad(int edad) {
  boolean valor;
  valor = (edad >= 18) ? true : false;
  return valor;
 }

 public static boolean esMayorEdadApuntes(int edad) {
  return (edad >= 18) ? true : false;
 }

 public static void main(String[] args) {

  System.out.println("Valores Generados");
  for (int i = 1; i < cadenaNumerosFijos.length - 1; i++) {
   if (i == 0) {
    System.out.println("Tipo String");
   }
   String cadena = (new Random().nextInt(100) >= 50) ? "0" : "1";
   System.out.print(cadena + " ");

   // Se genera un nuevo Numero en cada Iteración del bucle
   cadenaNumerosAleatorios[i] = (new Random().nextInt(100) <= 50) ? 0 : 1;
   // NO SE genera un nuevo Numero en cada Iteración del bucle
   cadenaNumerosFijos[i] = (NUMERO <= 50) ? 0 : 1;
  }
  System.out.println("");

  System.out.println("Valores Aleatorios ");
  for (int indice : cadenaNumerosAleatorios) {
   System.out.print(indice + " ");
  }
  System.out.println("");

  System.out.println("Valores fijos ");
  for (int indice : cadenaNumerosFijos) {
   System.out.print(indice + " ");
  }

  System.out.println("\n------ Apuntes ------- ");

  resultado = divisor == 0 ? 0 : (dividendo / divisor);
  System.out.println("Valor de resultado " + resultado);

  for (int i = 1; i < 11; i++) {
   System.out.println("\u001B[33m ♠ Hombre : " + i + " - " + esMayorEdad(new Random().nextInt(100)));
   System.out.println("\u001B[35m ♥ Mujer : " + i + " - " + esMayorEdadApuntes(new Random().nextInt(100))
   );
  }

  System.out.println("-----------------------");

  for (int i = 1; i < 11; i++) {
   System.out.println(i + " : " + (esMayorEdadApuntes(new Random().nextInt(100)) == true ? "\u001B[33m ♠ Hombre" : "\u001B[35m ♥ Mujer"));
  }
 }
}
