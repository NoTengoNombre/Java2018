/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitcalculadora2;

/**
 *
 * @author MyDevelop
 */
public class JUnitCalculadora2 {

 
 public static int suma(int a, int b) {
  return a + b;
 }

 public static int resta(int a, int b) {
  return a - b;
 }

 public static void main(String[] args) {

  int a = 3, b = 2;
  int res = suma(a, b);
  System.out.println("3 + 2 = " + res);
  int esperado = 5;

  if (res == esperado) {
   System.out.println("Este programa esta bien hecho");
  } else {
   System.out.println("Este programa esta bien MAL hecho");
  }

 }
}
