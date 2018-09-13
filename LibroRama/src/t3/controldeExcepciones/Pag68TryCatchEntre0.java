/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.controldeExcepciones;

/**
 * @see libro
 * @since 02-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag68TryCatchEntre0 {

 private static int c;

 public static int getNumero() {
  int x = (int) (Math.random() * (0 + 10) + 1);
  if (x < 5) {
   x = 0;
  } else {
   x = 1;
  }
  System.out.println("Numero elegido : " + x);
  return x;
 }

 public static void setDivision() {
  int a = 10, b = getNumero();

  try {
   System.out.println("\u001B[33m• Division : c = a / b ");
   c = a / b;

  } catch (ArithmeticException ae) {
   System.out.println("\u001B[33m• Obtener mensaje " + ae.getLocalizedMessage());
   System.out.println("\u001B[33m• : " + ae.getClass().getName());
   return;
  }
  System.out.println("\u001B[33m• Resultado de c : " + c);
 }

 public static void setOperacion() {
  System.out.println("♠ 1º Valor de c : " + c);
  int suma;
  int i = 0;
  setDivision();
  suma = i + c;
  System.out.println("♠ 2º Valor de c : " + c);
  System.out.println("♠ Suma es : " + suma);

 }

 public static void main(String[] args) {
  setOperacion();

 }
}
