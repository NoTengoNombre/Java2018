/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos;

import java.awt.Rectangle;

/**
 * @see @since 11-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class InstanciarObjetoRectangle {

 public static void main(String[] args) {

  Rectangle rect = new Rectangle(50, 50, 150, 150);

  System.out.println("----------- Coordenadas esquina superior izquierda --------- ");
  System.out.println("\tx = " + rect.x + "\n\ty = " + rect.y);

  System.out.println("----------- Dimensiones -------------");
  System.out.println("\tAlto = " + rect.height);
  System.out.println("\tAncho = " + rect.width);

  rect.height = 100;
  rect.width = 100;
  rect.setSize(200, 200);

  System.out.println("\n --- Nuevos valores de los atributos --- ");
  System.out.println("\tx = " + rect.x + "\n\ty = " + rect.y);
  System.out.println("\tAlto = " + rect.height);
  System.out.println("\tAncho = " + rect.width);

 }
}
