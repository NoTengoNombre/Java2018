/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see -
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Conversiones {

 public static void main(String[] args) {

  byte a = 127;
  short b = Short.MAX_VALUE;
  System.out.println(a + " - " + b);
  // Una cosa es mostrar el valor
  System.out.println(a + b);
  // Otra cosa es mostrar asignar el valor a una variable que no puede almacenar su precisión
  short c = (short) (a + b);
  System.out.println("Valor que ha alcanzo la maxima precision : " + c);

  char ch = 'a';
  int i = ch;
  System.out.println("La 'a' pasada a 'int' : " + i);

  double d1 = 1.10;
  byte b1 = 10;
  double soyDouble = d1 + b1;
  System.out.println(d1 + b1 + " - " + soyDouble);

  float f1 = 101.1f;
  int i1 = 100;
  float soyFloat = f1 + i1;
  System.out.println(f1 + i1 + " - " + soyFloat);

  long l1 = 1000;
  byte b11 = 1;
  long soyLong = l1 + b11;
  System.out.println(l1 + b11 + " - " + soyLong
  );

 }
}
