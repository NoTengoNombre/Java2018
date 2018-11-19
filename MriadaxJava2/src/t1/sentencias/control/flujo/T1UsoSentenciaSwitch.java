/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see 9
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoSentenciaSwitch {

 public static void main(String[] args) {

  String cadena = "cadena";

  if (cadena instanceof String) {
   System.out.println("Soy una instance de String");
  } else {
   System.out.println("No soy una instance de String");
  }

  cadena = (new Random().nextInt(100) >= 50) ? "cadena" : ("cadena" + 1);

  System.out.println("Quien soy : " + cadena);

  switch (cadena) {
   case "cadena":
    System.out.println("" + cadena);
    break;
   case "":
    System.out.println("");
    break;
   default:
    System.out.println("otra cosa");
    break;
  }

 }
}
