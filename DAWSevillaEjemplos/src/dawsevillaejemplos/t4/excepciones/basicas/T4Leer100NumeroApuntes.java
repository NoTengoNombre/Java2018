/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevillaejemplos.t4.excepciones.basicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see -
 * @since 08-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T4Leer100NumeroApuntes {

 public static void main(String[] args) {

// Declaracion e Inicializacion
  int numero = -1;
  int intentos = 0;
  String linea;
  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

// Procesamiento
  do {
   try {
    System.out.print("Introduce un numero entre 0 y 100 : ");
    linea = teclado.readLine();
    numero = Integer.parseInt(linea);
   } catch (IOException ioe) {
    System.out.println("Error al leer del teclado : " + ioe.getMessage());
   } catch (NumberFormatException nfe) {
    System.out.println("Debe introducir un numero entre 0 y 100. " + nfe.getMessage());
   } finally {
    intentos++;
   }
  } while ((numero < 0) || (numero > 100));

// Salida
  System.out.println("El numero introducido es : " + numero);
  System.out.println("Numero de intentos : " + intentos);
 }
}
