/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.excepciones.clasethrowable.exception_para_programas;

import dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v0Complejo.Teclado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ExcepcionesBasicaAritmeticas {

 public static void main(String[] args) {

  int numero = 0;
  int intentos = 0;
  String linea;

  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

  do {
   System.out.print("Introduzca un numero entre 0 y 100\n");
   try {
    linea = teclado.readLine();
    numero = Integer.parseInt(linea);
   } catch (IOException ex) {
    Logger.getLogger(ExcepcionesBasicaAritmeticas.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("Mensaje : " + ex.getMessage());
   } catch (NumberFormatException e) {
    Logger.getLogger(ExcepcionesBasicaAritmeticas.class.getName()).log(Level.SEVERE, null, e);
    System.out.println("Mensaje : " + e.getMessage());
   } finally {
    intentos++;
    System.out.println("Numero de intentos : " + intentos);
   }
  } while (numero < 0 || numero > 100);
  System.out.println("El numero introducido es : " + numero);
  System.out.println("Total de intentos : " + intentos);
 }
}
