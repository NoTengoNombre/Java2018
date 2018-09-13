/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 27-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag46UsoMetodoStaticYDinamicos {

 public static void main(String[] args) {

  PajaroStatic p1, p2;
  p1 = new PajaroStatic();
  PajaroStatic.muestraPajaros();
  System.out.println("• Valor : " + p1.toString());
  p2 = new PajaroStatic('a', 3);
  PajaroStatic.muestraPajaros();
  p2.toString();
  System.out.println("• Valor : " + p2.toString());

 }
}

/**
 *
 * @author Robot
 */
class PajaroStatic {

 private static int numPajaros = 0;
 private char color;
 private int edad;

 public PajaroStatic() {
//  color = 0;
  color = 'v';
  edad = 0;
  nuevoPajaro();
 }

 public PajaroStatic(char color, int edad) {
  this.color = color;
  this.edad = edad;
  nuevoPajaro();
 }

 public void setColor(char color) {
  this.color = color;
 }

 public char getColor() {
  return color;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public int getEdad() {
  return edad;
 }

 public static void nuevoPajaro() {
  numPajaros++;
 }

 public static void muestraPajaros() {
  System.out.println("Numero de pajaros : " + numPajaros + " ");
 }

 /**
  *
  * @return "Obtener color : " + getColor() + " Obtener edad : " + getEdad();
  */
 @Override
 public String toString() {
  return " ▬ Obtener color : " + getColor() + " ▬ Obtener edad : " + getEdad();

 }

}
