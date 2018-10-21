/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructrepetitivas.whilebasico;

/**
 * @see @since 17-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej15WhileBasicoApuntes {

 public static void main(String[] args) {

  // Declaracion e Inicializacion 
  int numero = 7;
  int contador;
  int resultado = 0;
  String titulo = "Numero:";

  // Salida de Informacion
  System.out.println(String.format("\t --- Tabla de Multiplicar --- \n\t\t%10s %d", titulo, numero));
  System.out.println("\t\t.............");
  contador = 1;
  // Procesamiento : Utilizamos ahora el bucle while
  while (contador <= 10) {
   resultado = contador * numero;
   System.out.println(String.format("\t\t%2d * %2d = %2d \n", numero, contador, resultado));
//   Modificamos el valor de la varible contadora, para hacer que el bucle
//   pueda seguir iterando hasta llegar a finalizar
   contador++;
  }
 }
}
