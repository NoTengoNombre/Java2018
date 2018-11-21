/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.ejercicio.n2.repetir.numeros.n.veces;

import java.util.Random;

/**
 * @see -
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1EjercicioRepetirNumeroNVeces {

 public static void main(String[] args) {
  new NumerosAleatorios().setAction();
 }
}

class NumerosAleatorios {

 private final static int NUM1 = 18;
 private final static int NUM2 = 65;
 private final int aleatorio1 = new Random().nextInt(20);

 public int getNumero1() {
  return NUM1;
 }

 public int getNumero2() {
  return NUM2;
 }

 public int getNumeroAleatorio1() {
  return aleatorio1;
 }

 public int getNumeroAleatorio2() {
  return new Random().nextInt(NUM2 - NUM1) + 1 + NUM1;
 }

 public void setAction() {
  for (int i = 0; i < getNumeroAleatorio1(); i++) {
   System.out.println(i + " Numero aleatorio : " + getNumeroAleatorio2());
  }
 }
}
