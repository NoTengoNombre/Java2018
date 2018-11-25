/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.basico;

/**
 * @see @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase03 {

 private int numero;
 private String nombre;

 public Clase03(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 public void modificaDatos(String nombre, int numero) {
  this.nombre = nombre;
  this.numero = numero;
 }

}
