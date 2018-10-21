/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructcondicionales;

import java.util.Arrays;

/**
 * @see eje
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class P9aSwitchBasicoCondicionales {

 public static void main(String[] args) {

  String cadena1 = "si";
  String cadena2 = "no";
  int num = (int) (Math.random() * (1 + 9) + 1);
  System.out.println("Numero Aleatorio : " + num);

  switch ((num > 4) ? cadena1 : cadena2) {
   case "si":
    int[] valor = {1, 2, 3, 4, 5};
    if ((num >= valor.length) && (num != 10)) {
     System.out.println("Lista de valores : " + Arrays.toString(valor));
    } else {
     System.out.println("Sin lista de valores : " + Arrays.toString(valor));
    }
    System.out.println("Permite String : ♂ ");
    break;
   case "no":
    System.out.println("Permite String : ♀ ");
    break;
   default:
    System.out.println("Permite String Por defecto");
  }

 }
}
