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
public class Ej15WhileBasico {

 public static void main(String[] args) {

  // Declaracion
  final int maximo;
  int contador;
  int resultado;
  int valor;

  // Inicializacion
  maximo = 10;
  contador = 0;
  resultado = 0;
  valor = 7;

  // Procesamiento
  while (contador <= maximo) {
   System.out.println(String.format("%d * %2d = %2d \n", valor, contador, resultado));
   resultado = resultado + valor;
   ++contador;
  }
 }
}
