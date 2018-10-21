/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructrepetitivas.dowhilebasico;

/**
 * @see -
 * @since 17-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej16DoWhileTabla7Apuntes {

 public static void main(String[] args) {

//  Declaracion e Instanciacion de variables
  int contador;
  int numero = 7;
  int resultado;
//  Salida de informacion
  System.out.println("Tabla de multiplicar del : " + numero);
  System.out.println("...............................");

//  Utilizamos ahora el bucle do-while
  contador = 1;

//   Procedimiento
  do {
   resultado = contador * numero;
   System.out.println(numero + " * " + contador + " = " + resultado);
   contador++;
  } while (contador <= 10);

 }
}
