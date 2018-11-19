/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.funcionesmiembro;

import java.util.Random;

/**
 * @see -
 * @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Programa04 {

 public static void main(String[] args) {

  int num = (new Random()).nextInt(11) + 5;
  Clase04[] personas = new Clase04[num];

  for (int i = 0; i < num; i++) {
   personas[i] = new Clase04(i, "Objeto " + i);
  }
  System.out.println("Se han creado " + Clase04.cuentaPersonas() + " personas");

 }
}
