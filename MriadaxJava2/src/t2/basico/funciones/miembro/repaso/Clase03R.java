/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso;

/**
 * @see p18
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase03R {

 private int numero;
 private String nombre;

 public Clase03R() {
  this.numero = 0;
  this.nombre = "";
 }

 /**
  * Constructor con 2 parametros
  *
  * @param numero
  * @param nombre
  */
 public Clase03R(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 /**
  * Funcion que accede a las variables de instancia y cambia su valor
  *
  * @param nombre
  * @param numero
  */
 public void modificarDatos(String nombre, int numero) {
  this.nombre = nombre;
  this.numero = numero;
 }

}
