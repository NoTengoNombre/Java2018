/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 27-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag46ConstructorPajaro {

 public static void main(String[] args) {

//  variable tipo referencia
  PajaroConstructor p1, p2, p3;
//     
  p1 = new PajaroConstructor();
  p2 = new PajaroConstructor('a', 3);
  p3 = new PajaroConstructor('g', 5);

  System.out.println("♦ Pajaro 1 " + p1.toString());
  System.out.println("• Pajaro 2 " + p2.toString());
  System.out.println("• Pajaro 2 " + p3.toString());

 }
}

/**
 * Clase pajaro
 *
 * @author Robot
 */
class PajaroConstructor {

 /**
  * Miembro de instancia : color
  */
 private char color;

 /**
  * Miembro de instancia : edad
  */
 private int edad;

 /**
  * Constructor
  */
 PajaroConstructor() {
  color = 'v';
  edad = 0;
 }

 /**
  * @param edad
  * @param color
  * @Override
  */
 public PajaroConstructor(char color, int edad) {
  this.color = color;
  this.edad = edad;
 }

 /**
  * Metodo por defecto sobreEscrito
  *
  * @return "Color : " + color + " Edad : " + edad;
  */
 @Override
 public String toString() {
  return "Color : " + color + " Edad : " + edad;
 }

}
