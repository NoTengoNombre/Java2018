/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitcalculadora2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyDevelop
 */
public class Calculadora {

 /**
  * Almacena el valor
  */
 private int ans;

 /**
  * Constructor
  */
 public Calculadora() {
  ans = 0;
 }

 /**
  * Sumar 2 numeros y devolverlo en la memoria
  *
  * @param a
  * @param b
  * @return
  */
 public int add(int a, int b) {
  ans = a + b;
  return ans;
 }

 /**
  * Restar 2 numeros y devolverlo en la memoria
  *
  * @param a
  * @param b
  * @return
  */
 public int sub(int a, int b) {
  ans = a - b;
  return ans;
 }

 /**
  * Sumatoria al numero en memoria
  *
  * @param v
  * @return
  */
 public int add(int v) {
  ans += v; // ans = ans + v;
  return ans;
 }

 /**
  * Restar al numero en memoria
  *
  * @param v
  * @return
  */
 public int sub(int v) {
  ans -= v; // ans = ans - v;
  return ans;
 }

 public int div(int a, int b) {
  if (b == 0) {
   throw new ArithmeticException("No puedes dividir por 0");
  }
  ans = a / b;
  return ans;
 }

 /**
  * Devuelve el numero en memoria
  *
  * @return
  */
 public int ans() {
  return ans;
 }

 /**
  * Metodo para probar el @After
  *
  */
 public void clear() {
  ans = 0;
 }

 /**
  * Metodo para probar el tiempo de ejecución del mismo Si tarda
  */
 public void operacionOptimaMuyLarga() {
  try {
   Thread.sleep(2000); // simula lo que tarda el algoritmo en ejecutarse
  } catch (InterruptedException ex) {
   Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 public void operacionOptimaMuyLargaAntiBuclesInfinitos() {
  for (;;);
 }

}
