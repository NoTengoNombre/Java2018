/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see Ejercicio 7
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej7ResolverEcuaciones {

 private static int c = 0;

 /**
  *
  * @return
  */
 private static double leerLineaBuffer() {
  double numero = 0;
  int contador = 0;
  if (contador == 0) {
   System.out.println("Introduce 1º numero : 'Denominador' ");
   contador++;
  } else {
   System.out.println("Introduce 2º numero : 'Numerador' ");
  }
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader bfr = new BufferedReader(isr);
  try {
   String cadena = bfr.readLine();
   numero = Double.parseDouble(cadena);
   System.out.println("Ver Valor : " + cadena);
  } catch (IOException ex) {
   Logger.getLogger(Ej7ResolverEcuaciones.class.getName()).log(Level.SEVERE, null, ex);
  }
  return numero;
 }

 private static double lineaScanner() {
  if (c == 0) {
   System.out.println("Introduce 1º Miembro");
   c++;
  } else {
   System.out.println("Introduce 2º Miembro");
  }
  Scanner sc = new Scanner(System.in);
  double numero = sc.nextDouble();
  return numero;
 }

 private static double realizarEcuacion(double numeroX, double numero) {
  double resultado = -(numero / numeroX);
  System.out.println(((int) numeroX) + "x + " + ((int) numero) + " = " + 0);
  return resultado;
 }

 public static void main(String[] args) {
  System.out.println("Resultado : " + realizarEcuacion(leerLineaBuffer(), leerLineaBuffer()));
 }
}
