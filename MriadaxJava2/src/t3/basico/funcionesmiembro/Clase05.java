/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.funcionesmiembro;

/**
 * @see -
 * @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase05 {

 private static int numPersonas;
 final public static int EDAD_MAX = 65;

 private int numero;
 private String nombre;

 public Clase05() {
  this.numero = EDAD_MAX;
  this.nombre = "anonimo";
 }

 public Clase05(int numero, String nombre) {
  this.numero = (numero > EDAD_MAX) ? EDAD_MAX : numero;
  this.nombre = nombre;
 }

 public void modificaDatos(String nombre, int numero) {
  this.numero = (numero > EDAD_MAX) ? EDAD_MAX : numero;
  this.nombre = nombre;
 }

}
