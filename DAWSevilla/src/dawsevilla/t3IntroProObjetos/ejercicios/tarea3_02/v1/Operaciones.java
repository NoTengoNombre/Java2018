/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02.v1;

/**
 * @see @since 15-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Operaciones {

 private static final Persona PERSONA = new Persona();

 public static Persona getIntroduceDatos() {
  int opcion = 9;
  while ((opcion < 0) || (opcion > 3)) {
   System.out.println(" --------------------");
   System.out.println("   Menu de Opciones   ");
   System.out.println(" --------------------");
   System.out.println("1 - ♥ Introduce el Nombre");
   System.out.println("2 - ♣ Introduce la Edad");
   System.out.println("3 - ♦ Introduce la Altura");
   System.out.println("0 - ♠ Salir");
   System.out.println(" --------------------");
   System.out.println(" ¿ Qué quieres hacer ? ");
   System.out.println(" --------------------");
   opcion = Teclado.getNumeroEntero();
  } // fin while
  switch (opcion) {
   case 1:
    PERSONA.setNombre(Teclado.getCadena());
    break;
   case 2:
    PERSONA.setEdad(Teclado.getNumeroEntero2());
    break;
   case 3:
    PERSONA.setAltura(Teclado.getNumeroFloat());
    break;
   default:
    System.out.println("Ninguna opcion seleccionada");
    break;
  } // fin switch
  return PERSONA;
 }

 public static void consultarDatos() {
  int num = 9;
  while ((num < 0) || (num > 4)) {
   System.out.println(" --------------------");
   System.out.println("  Menu de Opciones");
   System.out.println(" --------------------");
   System.out.println("1 - ♥ Ver el Nombre");
   System.out.println("2 - ♣ Ver la Edad");
   System.out.println("3 - ♦ Ver la Altura");
   System.out.println("4 - अ Ver Todos los datos");
   System.out.println("0 - ♠ Salir");
   System.out.println(" --------------------");
   System.out.println(" ¿ Qué quieres hacer ?");
   num = Teclado.getNumeroEntero();
  }
  switch (num) {
   case 1:
    System.out.println("♥ - Nombre : " + PERSONA.getNombre());
    break;
   case 2:
    System.out.println("♣ - Edad : " + PERSONA.getEdad());
    break;
   case 3:
    System.out.println("♦ - Altura : " + PERSONA.getAltura());
    break;
   case 4:
    System.out.println("अ - Todos los datos : " + PERSONA.toString());
    break;
   default:
    System.out.println("♦ - Ninguna opcion seleccionada");
    break;
  }
 }
} // fin clase

