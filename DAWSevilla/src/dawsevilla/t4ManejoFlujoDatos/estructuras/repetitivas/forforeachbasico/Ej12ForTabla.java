/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructuras.repetitivas.forforeachbasico;

/**
 * @see @since 17-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej12ForTabla {

 enum Tabla {
  siete, catorce, veintiuno, veintiocho, treintacinco, cuarentaydos, cuarentaynueve, cincuentayseis, sesentaytres, setenta
 }

 public static void main(String[] args) {

  //Declaracion de variables
  int numero = 7;
  int contador;
  int resultado;

  //Salida de informacion
  System.out.println("Tabla de multiplicar del " + numero);
  System.out.println("...................................");

  //Utilizamos ahorea el bucle for
  for (contador = 1; contador <= 10; contador++) {
   resultado = (contador * numero);
   System.out.println(numero + " x " + contador + " = " + resultado);
  }

  System.out.println("...................................");
  contador = 0;
  for (Tabla value : Tabla.values()) {
   System.out.println(numero + " x " + (++contador) + " = " + value.name());
  }
  System.out.println("...................................");
 }
}
