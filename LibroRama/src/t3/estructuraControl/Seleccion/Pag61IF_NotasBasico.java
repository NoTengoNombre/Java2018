/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Seleccion;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag61IF_NotasBasico {

 public static void main(String[] args) {
  int matematicas = (int) (Math.random() * (1 + 9) + 1), lengua = (int) (Math.random() * (1 + 9) + 1);
  System.out.println("Matematicas : " + matematicas);
  System.out.println("Lengua : " + lengua);
  if (matematicas > 4) {
   if (lengua > 4) {
    System.out.println("Enhorabuena");
   } else {
    System.out.println("No has aprobado todas las asignaturas");
   }
  } else {
   System.out.println("No has aprobado todas las asignaturas");
  }
 }
}
