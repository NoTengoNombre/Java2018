/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag29N1ConversionesTipoImplicita {

 public static void main(String[] args) {

  byte b = 5;
  short s;
  int i;
  long l;
  float f = 1.1F;
  double d;

  s = b;
  System.out.println("byte a short : " + s);
  i = s;
  System.out.println("short a int " + i);
  l = i;
  System.out.println("int a long " + l);
  d = f;
  System.out.println("float a double " + d);

 }
}
