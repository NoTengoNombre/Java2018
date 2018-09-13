/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Seleccion;

/**
 * @see libro
 * @since 30-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag61IF_Anidados {

 public static void main(String[] args) {

  System.out.println("Valor generado " + new IfAnidado().getX());
  int x = new IfAnidado().getX();

  if (x == 4) {
   System.out.println("La variable es igual a 4 : " + x);
  }

  if (x > 5) {
   System.out.println("La variable es mayor a 5 : " + x);
  } else {
   System.out.println("La variable es menor que 6 : " + x);
  }

  if (x > 6) {
   System.out.println("La variable es mayor a 7 : " + x);
  } else if (x == 6) {
   System.out.println("La variable es igual a 6 : " + x);
  } else {
   System.out.println("La variable es menor que 6 : " + x);
  }

 }
}

class IfAnidado {

 private static int x = (int) (Math.random() * (1 + 10) + 1);

 public IfAnidado() {
 }

 public int getX() {
  return x;
 }
}
