/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02_Persona.v1Persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see ej2
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Main {

 public static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

 public static int menu() {
  int opcion = 9;
  while ((opcion < 0) || (opcion > 2)) {
   System.out.println("--------------------");
   System.out.println("  Menu de Opciones  ");
   System.out.println("--------------------");
   System.out.println("1 - Agregar datos ");
   System.out.println("2 - Consultar datos ");
   System.out.println("0 - Salir ");
   System.out.println("--------------------");
   System.out.println("  Qué desea hacer?  ");
   System.out.println("--------------------");
   try {
    opcion = Integer.parseInt(dato.readLine());
   } catch (IOException ex) {
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
  if (opcion == 0) {
   System.out.println("\t Fin del Programa");
  }
  return opcion;
 }

 public static void setEjecucionPrograma() {
  int opcion = 9;
  while (opcion != 0) {
   opcion = menu(); // reescribe el valor de la variable
   if (opcion == 1) {
    Operaciones.getIntroduceDatos();
   }
   if (opcion == 2) {
    Operaciones.consultarDatos();
   }
  }
 }

 public static void main(String[] args) {
  setEjecucionPrograma();
 }
}
