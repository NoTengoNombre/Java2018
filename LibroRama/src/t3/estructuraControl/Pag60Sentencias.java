/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl;

import java.awt.*;

/**
 * @see
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/introduccion/primero.htm
 * @since 30-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag60Sentencias {

}

/**
 * Todo lo que esta a la derecha del operador de ASIGNACION
 *
 * @author Robot
 */
class Sentencias {

 public static void main(String[] args) {
  int base = 10; // Sentencia de asignación 
  System.out.println("El primer programa"); // Sentencia de invocación de metodos

  Rectangulo rectangulo = new Rectangulo(base, 20); // Sentencia de objetos
  rectangulo.mover();  // Sentencia de invocación de metodos
  rectangulo.mover(base, 50); // Sentencia de invocación de metodos

  if ((rectangulo.getAltura() >= 1) || (rectangulo.getBase() >= 1)) { //Sentencias de control de flujo
   System.out.println("Area Rectangulo: " + (rectangulo.getBase() * rectangulo.getAltura())); // Sentencia de invocación de metodos
  } else { // Sentencia de bloques
   System.out.println("Area demasiado pequeña para un Rectangulo: " + rectangulo.getBase() * rectangulo.getAltura()); // Sentencia de invocación de metodos
  }
  System.out.println("Coordenadas -> " + rectangulo.toString()); //Sentencia de invocacion de metodos
 }
}

/**
 *
 * @author Robot
 */
class Rectangulo {

 private int b;
 private int h;

 public Rectangulo() {
 }

 public Rectangulo(int x, int y) {
  this.b = x; // Sentencia de asignación
  this.h = y; // Sentencia de asignación
 }

 public void mover() {
  this.b += b; // Sentencia de asignación
  this.h += h; // Sentencia de asignación
 }

 public void mover(int x, int y) {
  this.b = x; // Sentencia de asignación
  this.h = y; // Sentencia de asignación
 }

 public int getBase() {
  return b;
 }

 public int getAltura() {
  return h;
 }

 /**
  *
  * @return
  */
 @Override
 public String toString() {
  return "Base : " + getBase() + " Altura " + getAltura();
 }

}
