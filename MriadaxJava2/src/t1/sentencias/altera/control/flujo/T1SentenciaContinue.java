/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.altera.control.flujo;

import java.util.Random;

/**
 * @see p19
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1SentenciaContinue {

 private static int veces;
 private int num1;
 private int num2;

 public T1SentenciaContinue(int veces, int num1, int num2) {
  T1SentenciaContinue.veces = veces;
  this.num1 = num1;
  this.num2 = num2;
 }

 public T1SentenciaContinue() {
  this(veces = getNumero(), (10 * 10), Short.MAX_VALUE);
 }

 public static int getVeces() {
  return veces;
 }

 public int getNumero1() {
  return num1;
 }

 public int getNumero2() {
  return num2;
 }

 public void setNumero1(int num) {
  num1 = num;
 }

 public void setNumero2(int num) {
  num2 = num;
 }

 public static int getNumero() {
  return new Random().nextInt(100);
 }

 public void setAccion() {
  for (int i = 1; i <= getVeces(); i++) {
   System.out.print("\niteracion numero : " + i + " ===> \n");
   setNumero1(getNumero());
   if (getNumero1() == 0) {
    continue;
   }
   setNumero2(getNumero());
   if (getNumero2() == 0) {
    continue;
   }
   System.out.println("num1 : " + getNumero1() + " num2 : " + getNumero2());
   System.out.println("num1 / num2 = " + (getNumero1() / getNumero2()));
   System.out.println("num1 % num2 = " + (getNumero1() % getNumero2()));
  }
 }

 public static void main(String[] args) {

  T1SentenciaContinue tsc = new T1SentenciaContinue();
  tsc.setAccion();
 }
}
