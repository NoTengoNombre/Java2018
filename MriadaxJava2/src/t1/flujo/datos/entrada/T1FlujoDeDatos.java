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
public class T1FlujoDeDatos {

 /**
  * Metodo principal
  *
  * @param args
  */
 public static void main(String[] args) {

//  Objeto 'in' para entrada de flujo
  Scanner sc = new Scanner(System.in);
// Funcion 'next' lee 'buffer' asociado al objeto Scanner
// Todo lo tecleado 'se almacena' en dicho Buffer y este se va vaciando de acuerdo con l oque se va leyendo con las funciones 'next'
  System.out.println("Intro cadena1 - caracter fin de linea no lo vacia ");
  String cadena = sc.next(); // El caracter de fin de linea 'no la vacia' del buffer
// Objeto 'out' es el flujo que consume informacion para escribir por pantalla
  System.out.println("Salida del flujo de datos : " + cadena);

  System.out.println("Intro cadena2 - caracter fin de linea no lo vacia ");
  Scanner sc1 = new Scanner(System.in);
  System.out.println("Otra linea con nextLine saca del buffer el caracter fin de linea ");
  String cadena1 = sc1.nextLine();
  System.out.println("Salida con nextLine : " + cadena1);

 }
}
