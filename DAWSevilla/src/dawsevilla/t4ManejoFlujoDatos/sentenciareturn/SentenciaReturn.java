/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.sentenciareturn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * @since 30-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class SentenciaReturn {

 public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public static int suma(int num1, int num2) {
  int resultado = (num1 + num2);
  return resultado;
 }

 public static void main(String[] args) {

//  Declaracion E inicializacion
  int primerNumero = 0, segundoNumero = 0;

// Procesamiento de los datos : Solicitamos que el usuario introduzca 2 numeros por consola
  System.out.println("Introduce el 1º operando ");
  try {
   primerNumero = Integer.parseInt(br.readLine());
  } catch (IOException ex) {
   Logger.getLogger(SentenciaReturn.class.getName()).log(Level.SEVERE, null, ex);
  }

  System.out.println("Introduce el 2º operando ");
  try {
   segundoNumero = Integer.parseInt(br.readLine());
  } catch (IOException ex) {
   Logger.getLogger(SentenciaReturn.class.getName()).log(Level.SEVERE, "Excepcion basica", ex);
  }

//  Imprimimos los valores introducidos
  System.out.println("Los valores introducidos son : 1º numero " + primerNumero);
  System.out.println("Los valores introducidos son : 2º numero " + segundoNumero);

  System.out.println("La suma de ambos operadores es de : " + suma(primerNumero, segundoNumero));

 }

}
