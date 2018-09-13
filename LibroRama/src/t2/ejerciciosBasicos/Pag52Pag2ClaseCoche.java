/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 28-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag52Pag2ClaseCoche {

 public static void main(String[] args) {
  int x = (int) (Math.random() * (1 + 100) + 50);
  Coche c1 = new Coche();
  c1.acelera(100);
  int v = c1.getVelocidad();

  System.out.println("Valor : " + x);
  if (v >= x) {
   System.out.println("Desciende la velocidad a menos de " + v);
  } else {
   System.out.println("Aumenta la velocidad sin superar los  " + v);
  }

  Coche2 c2 = new Coche2();
  System.out.println("• Velocidad actual : " + c2.getVelocidad());
 }
}

/**
 *
 * @author Robot
 */
class Coche {

 /**
  * Miembro de instancia : int
  */
 private int velocidad;

 /**
  * Constructor basico
  */
 public Coche() {
  velocidad = 0;
 }

 /**
  * Constructor SobreCargado
  *
  * @param velocidad
  */
 public Coche(int velocidad) {
  this.velocidad = velocidad;
 }

 /**
  * Obtener velocidad2 actual
  *
  * @return this.velocidad2
  */
 public int getVelocidad() {
  return this.velocidad;
 }

 /**
  *
  * @param mas
  */
 public void acelera(int mas) {
  velocidad += mas;
 }

 /**
  *
  * @param menos
  */
 public void frena(int menos) {
  velocidad -= menos;

 }

}

class Coche2 {

 /**
  * Miembro de instancia : int
  */
 private int velocidad2;

 /**
  * Constructor SobreCargado
  *
  * @param velocidad
  */
 public Coche2(int velocidad) {
  this.velocidad2 = velocidad;
 }

 /**
  * Constructor basico
  */
 public Coche2() {
  this(51);
 }

 /**
  * Obtener velocidad2 actual
  *
  * @return this.velocidad2
  */
 public int getVelocidad() {
  return this.velocidad2;
 }

 /**
  *
  * @param mas
  */
 public void acelera(int mas) {
  velocidad2 += mas;
 }

 /**
  *
  * @param menos
  */
 public void frena(int menos) {
  velocidad2 -= menos;

 }

}
