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
public class Clase02 {

 private int numero;
 private String nombre;

 public Clase02() {
  this.numero = 99;
  this.nombre = "anonimo";
 }

 public Clase02(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 public Clase02(Clase02 o) {
  this.numero = o.numero;
  this.nombre = o.nombre;
 }

 public void leerDatos() {
  System.out.println("Nombre : " + nombre);
  System.out.println("Numero : " + numero);
 }

}
