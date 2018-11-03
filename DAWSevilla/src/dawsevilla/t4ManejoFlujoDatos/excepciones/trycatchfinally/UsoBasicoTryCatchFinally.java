/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.excepciones.trycatchfinally;

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
public class UsoBasicoTryCatchFinally {

 public static void main(String[] args) {

  int numero = -1;
  int intentos = 0;
  String linea;

  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

  do {
   try {
    System.out.println("Introduzca un numero entre 0 y 100");
    linea = teclado.readLine();
    numero = Integer.parseInt(linea);
   } catch (IOException ex) {
    Logger.getLogger(UsoBasicoTryCatchFinally.class.getName()).log(Level.SEVERE, null, ex);
   } finally {
    intentos++;
   }
  } while ((numero < 0) || (numero > 10));

  System.out.println("El numero introducido es : " + numero);
  System.out.println("Numero de intentos : " + intentos);

 }
}
