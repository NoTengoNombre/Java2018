/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructuras.repetitivas.dowhilebasico;

/**
 * @see do while
 * @since 17-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej15DoWhileBasico {

 public static void main(String[] args) {

  int max = 10;
  int c = 0;
  do {
   System.out.println("Soy menor de " + max + " : SI - contador : " + c);
  } while (c++ < 10);
  System.out.println("Soy menor de " + max + " : NO - contador : " + c);
 }
}
