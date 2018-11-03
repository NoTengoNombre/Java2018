/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.excepciones.excepciones.reanudacion;

/**
 * @see -
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ExcepcionReanudacion {

 public static void main(String[] args) {

  boolean fueraDelLimite = true;
  int i;
  String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};

  while (fueraDelLimite) {
   try {
    i = (int) (Math.random() * 9);
//    i = 9; // Error Repetido infinitas veces
    System.out.println("Numero aleatorio : " + i);
    System.out.println(texto[i]);
    fueraDelLimite = false;
   } catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("\u001b[33mExcepcion - Numero del indice fuera del rango de la excepcion: " + ex.getMessage());
   }
  }
 }
}
