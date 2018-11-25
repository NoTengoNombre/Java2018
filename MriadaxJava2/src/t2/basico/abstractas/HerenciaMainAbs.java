/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.abstractas;

import java.util.Random;

/**
 * @see @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class HerenciaMainAbs {

 public static void main(String[] args) {

  TuboAbs tubo = new TuboAbs(1.0f, "Pulgadas", 101, "Galvanizado");
  System.out.println(tubo.toString());
  PlanchaAbs plancha = new PlanchaAbs(201, "Plancha Madera", 2.1f, 3.5f, 0.2f);
  System.out.println(plancha.toString());
  PlanchaAbs planchaProtected = new PlanchaAbs(301, "Plancha Hierro", 35.4f, 4.5f, 1.5f);

  Random aleatorio = new Random();
  float metros;

  System.out.println("#" + planchaProtected);

  do {
   metros = (aleatorio.nextFloat() + 1.0F);
   System.out.println("### Metros cortados : " + metros);
  } while (planchaProtected.cortar(metros));

  System.out.println("-------------------");
  System.out.println("Tubos vendidos ");
  tubo.vender((int) metros);

  System.out.println("-------------------");
  System.out.println("Plancha vendidas ");
  plancha.vender((int) metros);

 }
}
