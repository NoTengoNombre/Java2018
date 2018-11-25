/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.polimorfismo;

import java.util.Random;

/**
 * @see p14
 * @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class HerenciaMainPoli {

 public static void main(String[] args) {

  TuboPoli tubo = new TuboPoli(1.0f, "Pulgadas", 101, "Galvanizado");
  System.out.println(tubo.toString());
  PlanchaPoli plancha = new PlanchaPoli(201, "Plancha Madera", 2.1f, 3.5f, 0.2f);
  System.out.println(plancha.toString());
  PlanchaPoli planchaProtected = new PlanchaPoli(301, "Plancha Hierro", 3.4f, 4.5f, 1.5f);

  Random aleatorio = new Random();
  float metros;

  System.out.println("◘ " + planchaProtected);

  do {
   metros = (aleatorio.nextFloat() + 1.0F);
   System.out.println("◘  Metros cortados : " + metros);
  } while (planchaProtected.cortar(metros));

  System.out.println("-------------------");
  System.out.println("Tubos vendidos ");
  tubo.vender((int) metros);

  System.out.println("-------------------");
  System.out.println("Plancha vendidas ");
  plancha.vender((int) metros);

  System.out.println("Numero de ventas : " + PlanchaPoli.getNumVentas());

//  PiezaPoli[] piezasVendidas = new PiezaPoli[PlanchaPoli.getNumVentas()];
//Codigo que crea objeto de las SubCLASES 'Tubo' y 'Plancha'
//con la referencia a cada uno de esos objetos es un
//elemento del array piezasVendidas
//  for (PiezaPoli pieza : piezasVendidas) {
//   int cantidad = aleatorio.nextInt(10) + 1;
//   pieza.vender(cantidad);
//  }
//
  System.out.println("\u001B[33m --- Nueva Venta - Polimorfica --- ");

  int numVentas = aleatorio.nextInt(5) + 1;

//!!SE CREAN 2 SubCLASES Directas que HEREDEN de la SUPERCLASE!!! 
//!!SE CREA UN ARRAY DE OBJETOS de la SUPERCLASE
  PiezaPoli[] piezasVendidas = new PiezaPoli[numVentas];

  for (int i = 0; i < piezasVendidas.length; i++) {
   int tipoPieza = aleatorio.nextInt(3) + 2;
   if (tipoPieza % 2 == 0) {
//!!La variables de instancia ALMACENAN la posición de memoria donde esta el OBJETO PlanchaPoli
    piezasVendidas[i] = new PlanchaPoli(401, "Plancha Extra Fina", 30.f, 4.5f, 0.3f);
   } else {
//!!La variables de instancia ALMACENAN la posición de memoria donde esta el OBJETO TuboPoli
    piezasVendidas[i] = new TuboPoli(1.0f, "Tubo Especial", 501, "pulgadas");
   }
  }

  for (PiezaPoli pieza : piezasVendidas) {
   int cantidad = aleatorio.nextInt(10) + 1;
//!!El OBJETO 'pieza' ejecutara el METODO 'vender' que dependiendo del tipo de REFERENCIA a la que apunte en la memoria HEAP 
//!!Ejecutara el metodo de la funcion 'vender' de TuboPoli o PlanchaPoli
   pieza.vender(cantidad);
  }

 }
}
