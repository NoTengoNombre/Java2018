/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevillaejemplos.t4.excepciones.basicas;

/**
 * @see http://dis.um.es/~bmoros/Tutorial/parte9/cap9-3.html
 * @since 09-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T4CapturaExcepcionesNumericas {

 public static void main(String[] args) {

//  Declaracion
  int valor = 0;
  int x;
  try {
//   Inicializaicion y Procesamiento
   for (x = 0, valor = 100; x < 100; x++) { // La variable declara dentro de for 'modifica' el valor hasta el final del programa
    valor /= x;
   }
  } catch (ArithmeticException ae) {
   System.out.println("Error Aritmetico : " + ae.getMessage());
  } catch (Exception e) {
   System.out.println("Exception : " + e.getMessage());
  } finally {
   System.out.println("Nuevo Valor : " + valor);
  }
 }

}
