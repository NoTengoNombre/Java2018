/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 27-ago-2018
 * @version error
 * @author Raul Vela Salas
 */
public class Pag44CapturaPorTecladoMensajeError {

 public static void main(String[] args) {

  MensajeError.mostrarValores();
 }
}

/**
 *
 * @author Robot
 */
class MensajeError {

 /**
  * 
  */
 public static void mostrarValores() {
  int a = 10, b = 0, c;

  try {
   c = a / b;
  } catch (ArithmeticException ae) {
   System.err.println("Error : " + ae.getMessage());
   return;
  }
  System.out.println("Resultado : " + c);
 }
}
