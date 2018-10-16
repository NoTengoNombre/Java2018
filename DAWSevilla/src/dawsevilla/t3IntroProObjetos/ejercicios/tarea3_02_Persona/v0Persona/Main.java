package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02_Persona.v0Persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @see Operaciones
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Main {

 static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

 public static void main(String[] args) throws IOException {
  int opcion = 9;
  while (opcion != 0) {
   opcion = menu();
   if (opcion == 1) {
    Operaciones.introDatos();
   }
   if (opcion == 2) {
    Operaciones.consultaDatos();
   }
  }
 }

 public static int menu() throws IOException {
  int opcion = 9;
  while (opcion < 0 || opcion > 2) {
   System.out.println("  menu de opciones  ");
   System.out.println("--------------------");
   System.out.println("1 - Introducir datos");
   System.out.println("2 - Consultar datos ");
   System.out.println("0 - Salir ");
   System.out.println("--------------------");
   System.out.println("  Qué desea hacer?  ");
   opcion = Integer.parseInt(dato.readLine());
  }
  return opcion;
 }
}
