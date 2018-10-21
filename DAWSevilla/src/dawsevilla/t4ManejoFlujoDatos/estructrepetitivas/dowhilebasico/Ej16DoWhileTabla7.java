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
public class Ej16DoWhileTabla7 {

 public static void main(String[] args) {

//  Declaracion e Instanciacion
  int num = 7;
  int max = 10;
  int resultado;
  int contador = 0;

//   Procedimiento
  do {
   resultado = num * contador;
   System.out.println(num + " * " + contador + " = " + resultado);
  } while (contador++ < max);

 }
}
