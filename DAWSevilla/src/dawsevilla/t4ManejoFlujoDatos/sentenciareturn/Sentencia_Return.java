/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.sentenciareturn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see -
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Sentencia_Return {

 private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

 public static int suma(int numero1, int numero2) {
  int resultado;
  resultado = (numero1 + numero2);
  return resultado; // Mediante 'return' devolvemos el resultado de la suma
 }

 public static void main(String[] args) throws IOException {

  //Declaracion de variables
  String input; // Esta variable recibira la entrada de teclado
  int primero_numero, segundo_numero; // Estas variables almacenan los operandos

  //Solicitamos que el usuario introduzca dos numeros por consola
  System.out.print("Introduce el primer operando\n");
  input = BR.readLine(); // Leemos la entrada como cadena de caracteres
  primero_numero = Integer.parseInt(input); // Transformamos a entero lo introducido por teclado
  System.out.print("Introduce el segundo operando\n");
  input = BR.readLine(); // Leemos la entrada como cadena de caracteres
  segundo_numero = Integer.parseInt(input); // Transformamos a entero lo introducido por teclado

  // Imprimimos por consola el numero introducido
  System.out.println("Los operandos son : " + primero_numero + " y " + segundo_numero);
  System.out.println("Obteniendo su suma...");

  // Invocamos al metodo que realiza la suma , pasandole los parametros adecuados
  System.out.println("La suma de ambos operadores es : " + suma(primero_numero, segundo_numero));
 }
}
