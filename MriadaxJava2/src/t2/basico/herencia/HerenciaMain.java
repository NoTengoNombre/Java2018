/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.herencia;

import java.util.Random;

/**
 * @see @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class HerenciaMain {

 public static void main(String[] args) {

  Pieza pieza = new Pieza(25, "Arandela Centrifugadora");
  System.out.println(pieza.toString());
  Tubo tubo = new Tubo(1.0f, "Pulgadas", 101, "Especial");
  System.out.println(tubo.toString());
  Plancha plancha = new Plancha(201, "Extra", 2.1f, 3.5f, 0.2f);
  System.out.println(plancha.toString());
  Acanalado acanalado = new Acanalado("Plastico", true, 30.5f, "10", 102, "Humos");
  System.out.println(acanalado.toString());
  Liso listo = new Liso(103, "Canal", 0.0F, "Sin Medida");
  System.out.println(listo.toString());

  Plancha planchaProtected = new Plancha(301, "ExtraNuevo", 35.4f, 4.5f, 1.5f);
  Random aleatorio = new Random();
  float metros;

  System.out.println("#" + planchaProtected);

  do {
   metros = (aleatorio.nextFloat() + 1.0F);
   System.out.println("### Metros cortados : " + metros);
  } while (planchaProtected.cortar(metros));
 }
}
