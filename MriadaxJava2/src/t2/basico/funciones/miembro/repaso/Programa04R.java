/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso;

import java.util.Random;

/**
 * @see 20
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Programa04R {

 public static void main(String[] args) {

  int num = new Random().nextInt(11) + 5;
  Clase04R[] personas = new Clase04R[num];

  for (int i = 0; i < num; i++) {
   personas[i] = new Clase04R(num, "Objeto " + i);
  }

  System.out.println("Se han creado " + Clase04R.cuentaPersonas() + " personas");

 }
}
