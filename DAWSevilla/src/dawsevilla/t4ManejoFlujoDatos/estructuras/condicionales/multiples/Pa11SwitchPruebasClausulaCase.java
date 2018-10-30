/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructuras.condicionales.multiples;

/**
 * @see @since 30-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pa11SwitchPruebasClausulaCase {

 public static void main(String[] args) {

//  Declaracion
  switch ((int) (Math.random() * 5)) {
   case 1:
    System.out.println("" + 1);
    break;
   case 2:
    System.out.println("" + 2);
    break;
   case 3:
    System.out.println("" + 3);
    break;
   case 4:
    System.out.println("" + 4);
    break;
   case 5:
    System.out.println("" + 5);
    break;
   default:
    System.out.println("Fuera del rango entre 1 y 5 ");
    break;

  }
 }
}
