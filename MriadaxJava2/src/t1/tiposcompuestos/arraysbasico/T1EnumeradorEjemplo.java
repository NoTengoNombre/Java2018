/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

import java.util.Random;

/**
 * @see - p18
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1EnumeradorEjemplo {

 public static void main(String[] args) {

// Random : Creo un objeto de tipo compuesto llamado Random
// aleatorio : Creo una variable de instancia 'aleatorio' 
// new : Reservo memoria en las capas SRAM , RAM para el objeto
// Random() : Inicializo los valores de los ATRIBUTOS de la clase Random mediante su constructor
  Random aleatorio = new Random();

//  Creo un numero aleatorio entre 1 y 9
  int num = aleatorio.nextInt(9) + 1;

//  Declaro una variable local
  int posicion;

//  Instancio un array que contendra en su interior todos los Enum
  EstadoCivil[] valoresEnumeracion = EstadoCivil.values();

  for (EstadoCivil estado : valoresEnumeracion) {
   posicion = estado.ordinal();
   System.out.println("La constante numero : " + posicion + " es " + estado.toString());
  }

//  Instancio un array de tipo 'EstadoCivil' y la longitud es un numero aleatorio entre 1 y 9
  EstadoCivil[] estados = new EstadoCivil[num]; // 1 a 9

//  Obtengo la longitud del array de EstadoCivil
  int nestados = EstadoCivil.values().length; // 1 a 9

  for (int i = 0; i < num; i++) {
// Almacena en cada indice de 'estados' un numero aleatorio entre 1 y 9
   estados[i] = valoresEnumeracion[aleatorio.nextInt(nestados)];
  }
  posicion = 0;
  for (EstadoCivil estado : estados) {
   System.out.println("estados [" + posicion + "]" + estado);
   posicion++;
  }

 }

}
