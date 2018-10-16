/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.leerTeclado;

import java.util.Scanner;

/**
 * @see pag 34
 * @since 14-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EntradaTecladoScannerEjemplo {

 public static void main(String[] args) {

  // Creamos objeto teclado
  Scanner teclado = new Scanner(System.in);

  // Declaramos variables a utilizar
  String nombre;
  int edad;
  boolean estudias;
  float salario;

//   Entrada de datos
  System.out.println("Nombre : ");
  nombre = teclado.nextLine();
  System.out.println("Edad : ");
  edad = teclado.nextInt();
  System.out.println("Estudios : ");
  estudias = teclado.nextBoolean();
  System.out.println("Salario : ");
  salario = teclado.nextFloat();

  System.out.println("Bienvenido : " + nombre);
  System.out.println("Edad : " + edad);
  System.out.println(("Estudias : " + (estudias == true)));
  System.out.println("Salario : " + salario);

 }
}
