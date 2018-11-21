/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.altera.control.flujo;

import java.util.Random;

/**
 * @see -
 * @since 20-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1SentenciaBreak {

 private static int num1;
 private static int num2;

 public T1SentenciaBreak(int num1, int num2) {
  this.num1 = num1;
  this.num2 = num2;
 }

 public T1SentenciaBreak() {
  this(num1 = new Random().nextInt(10), num2 = new Random().nextInt(10));
 }

 public static int getNum1() {
  return num1;
 }

 public static int getNum2() {
  return num2;
 }

 public static void setNum1(int num) {
  T1SentenciaBreak.num1 = num;
 }

 public static void setNum2(int num) {
  T1SentenciaBreak.num2 = num;
 }

 public int getNumeroAleatorio() {
  return new Random().nextInt(101);
 }

 public static void setFuncionalidad() {
  for (;;) {
   num1 = new T1SentenciaBreak().getNumeroAleatorio();
   num2 = new T1SentenciaBreak().getNumeroAleatorio();
   System.out.println("num2 : " + num2 + " num1 : " + num1);
   if (num1 == 0) {
    break;
   }
   if (num2 == 0) {
    break;
   }
   System.out.println("num2 / num1 : " + (num2 / num1));
   System.out.println("num2 % num1 : " + (num2 % num1));
  }
 }

 public static void main(String[] args) {
  setFuncionalidad();
 }
}
