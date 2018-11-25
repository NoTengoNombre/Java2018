/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso;

/**
 * @see p20
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase05R {

 private static int numPersonas; // variable de clase

 final public static int EDAD_MAX = 65;
 private int numero;
 private String nombre;

 /**
  * Constructor inicializador basico
  */
 public Clase05R() {
  this.numero = EDAD_MAX;
  this.nombre = "anonimo";
 }

 /**
  * Constructor inicializador
  *
  * @param numero
  * @param nombre
  */
 public Clase05R(int numero, String nombre) {
  this.numero = (numero > EDAD_MAX) ? EDAD_MAX : numero;
  this.nombre = nombre;
 }

 /**
  * Cambia la edad de los ATRIBUTOS de un objeto
  *
  * @param nombre
  * @param numero
  */
 public void modificaDatos(String nombre, int numero) {
  this.numero = (numero > EDAD_MAX) ? EDAD_MAX : numero;
  this.nombre = nombre;
 }

}
