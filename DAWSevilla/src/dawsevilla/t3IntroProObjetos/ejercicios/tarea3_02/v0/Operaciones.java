/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02.v0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Operaciones {

 static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
 static Persona a = new Persona();

 static void introDatos() throws IOException {
  int opcion = 9;
  while (opcion < 0 || opcion > 3) {
   System.out.println(" Menu de Opciones ");
   System.out.println("--------------------");
   System.out.println("1 - Introduce nombre");
   System.out.println("2 - Introduce edad");
   System.out.println("3 - Introduce altura");
   System.out.println("0 - Salir");
   System.out.println("--------------------");
   System.out.println("¿ Qué desea hacer ? ");
   opcion = Integer.parseInt(dato.readLine());
  }

  switch (opcion) {
   case 1:
    System.out.println("Introduzca el nombre a incluir");
    String nombr = dato.readLine();
    a.cambia_Nombre(nombr);
    break;
   case 2:
    System.out.println("Introduzca el edad a incluir");
    int edad = Integer.parseInt(dato.readLine());
    a.cambia_edad(edad);
    break;
   case 3:
    System.out.println("Introduzca la altura a incluir");
    float altura = Float.parseFloat(dato.readLine());
    a.cambia_altura(altura);
    break;
   default:
    break;
  }
 }

 static void consultaDatos() throws IOException {
  int opcion = 9;
  while (opcion < 0 || opcion > 4) {
   System.out.println(" Menu de Opciones ");
   System.out.println("--------------------");
   System.out.println("1 - Consultar nombre");
   System.out.println("2 - Consultar edad");
   System.out.println("3 - Consultar altura");
   System.out.println("4 - Consultar Todos los datos");
   System.out.println("0 - Salir");
   System.out.println("--------------------");
   System.out.println("¿ Qué desea hacer ? ");
   opcion = Integer.parseInt(dato.readLine());
  }
  switch (opcion) {
   case 1:
    System.out.printf("El nombre es %s\n", a.consulta_Nombre());
    break;
   case 2:
    System.out.printf("La edad es %s\n", a.consulta_edad());
    break;
   case 3:
    System.out.printf("La altura es %s\n", a.consulta_altura());
    break;
   case 4:
    System.out.printf("%s\n", a.toString());
    break;
  }

 }

}
