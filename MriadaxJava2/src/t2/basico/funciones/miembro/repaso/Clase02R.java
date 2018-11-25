/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso;

/**
 * @see p16
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase02R {

 private int numero;
 private String nombre;

 /**
  * Constructor sin parametros
  */
 public Clase02R() {
  numero = 99;
  nombre = "anonimo";
 }

 /**
  * Constructor 2 parametros
  *
  * @param numero
  * @param nombre
  */
 public Clase02R(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 public Clase02R(Clase02R obj) {
  nombre = obj.nombre;
  numero = obj.numero;
 }

 public void leerDatos() {
  System.out.println("Nombre : " + nombre);
  System.out.println("Numero : " + numero);
 }

 public static void main(String[] args) {
  Clase02R objeto1 = new Clase02R();
  objeto1.leerDatos();
  Clase02R objeto2 = new Clase02R(18, "Pepe Perez");
  objeto2.leerDatos();
  Clase02R objeto3 = new Clase02R(objeto2);

 }
}
