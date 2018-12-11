/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.paquete.java.utiles.clases.metodos;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * @see p10
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2ClaseRandom {

 public static void main(String[] args) {

  Random aleatorio = new Random();
  DoubleStream doubles = aleatorio.doubles();
  System.out.println("Numero ilimitado de double entre '0' e infinito : " + doubles);
  System.out.println("Aleatorio : " + aleatorio.nextInt(100));

 }
}
