/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 26-ago-2018
 * @version 1 millón de veces más
 * @author Raul Vela Salas
 */
public class Pag42ClasePajaro {

}

/**
 * Clase Pajaro
 *
 * @author Robot
 */
class Pajaro {

 /**
  * Miembro de instancia
  */
 private char color;

 /**
  * Miembro de instancia
  */
 private int edad;

 /**
  * Metodo fijar la edad
  *
  * @param entero 'e'
  */
 public void setEdad(int e) {
  edad = e;
 }

 /**
  * Mostrar edad
  */
 public void printEdad() {
  System.out.println("Edad del loro : " + edad);
 }

 /**
  * Fijar color
  *
  * @param c
  */
 public void setColor(char c) {
  color = c;
 }

 /**
  * Mostrar color
  */
 public void printColor() {
  switch (color) {
   case 'v':
    System.out.println("Color : verde");
    break;
   case 'a':
    System.out.println("Color : azul");
    break;
   case 'g':
    System.out.println("Color : gris");
    break;
   case 'n':
    System.out.println("Color : negro");
    break;
   case 'b':
    System.out.println("Color : blanco");
    break;
   default:
    System.out.println("Color no establecido");
  }
 }

 static {
  System.out.println("Loro Felipe : ");
  Pajaro p = new Pajaro();
  p.setColor('b');
  p.printColor();
  p.setEdad(10);
  p.printEdad();
 }
}

class Test {

 public static void main(String[] args) {

  Pajaro p = new Pajaro();
  p.setEdad(5);
  p.printEdad();
  p.setColor('a');
  p.printColor();
 }
}
