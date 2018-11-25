/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.basico;

import java.util.Random;

/**
 * @see p27
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase09 {

 /**
  * variable de clase
  */
 private static int numPersonas;
 /**
  * variable de clase
  */
 final public static int EDAD_MAX = 65;
 /**
  * variable de instancia
  */
 private int numero;
 /**
  * variable de instancia
  */
 private String nombre;

 /**
  *
  * @param numero
  * @param nombre
  */
 public Clase09(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 /**
  * Constructor por defecto
  */
 public Clase09() {
  /// Al poner esto cuando invoque el metodo toString se ejecutara estos datos
  this(new Random().nextInt(100), ((new Random().nextInt(100)) > (new Random().nextInt(100)) ? ("Anonimo " + 1) : "No Anonimo"));
 }

 /**
  * @return Datos Almacenados en los ATRIBUTOS de la clase
  */
 @Override
 public String toString() {
  return "Clase09 [numero= " + numero + ", nombre= " + nombre + "]";
 }

 public static void main(String[] args) {
  Clase09 objeto1 = new Clase09();
  Clase09 objeto2 = new Clase09();
  System.out.println("Objeto1 : " + objeto1);
  System.out.println("Objeto2 : " + objeto2);
 }
}
