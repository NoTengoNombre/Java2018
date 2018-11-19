/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.flujo.datos.entrada;

import java.util.Scanner;

/**
 * @see - p23
 * @since 16-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1FlujoDeDatos2 {

 /**
  * Metodo principal
  *
  * @param args
  */
 public static void main(String[] args) {

  Scanner teclado = new Scanner(System.in);

  System.out.println("Teclea un numero : ");
// Teclear numero y almacenarlo en variable
  int n = teclado.nextInt();
  System.out.println("Numero : " + n);

// Declarar una Referencia para cadenas de caracteres
  String nombre;
  System.out.println("Teclea tu nombre : ");
// Teclear una cadena de caracteres
// Hay que recoger el CR (fin de linea) pulsado para introducir numero
  String siguienteLinea = teclado.nextLine();
  System.out.println("Siguiente linea : " + siguienteLinea);
  nombre = teclado.nextLine();
  System.out.println("Nombre 2 : " + nombre);

 }
}
