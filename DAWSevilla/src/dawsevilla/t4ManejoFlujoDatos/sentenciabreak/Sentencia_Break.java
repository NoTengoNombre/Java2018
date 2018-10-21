/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.sentenciabreak;

/**
 * @see @since 17-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Sentencia_Break {

 public static void main(String[] args) {

  int contador;

  for (contador = 0; contador < 10; contador++) {
   if (contador == 7) {
    System.out.println("• Valor : " + contador);
    break;
   }
   System.out.println("♦ Valor : " + contador);
  }
  System.out.println("Fin del programa ");
 }
}
