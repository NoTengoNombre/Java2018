/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoOperadorTernario2 {

 public static void main(String[] args) {

  int resultado;
  int divisor = new Random().nextInt(100);
  int dividendo = new Random().nextInt(100);

  resultado = (divisor == 0) ? 0 : (dividendo / divisor);
  System.out.println("Valor : " + resultado);
 }

}
