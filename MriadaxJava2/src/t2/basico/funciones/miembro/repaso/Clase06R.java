/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso;

/**
 * @see p21
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase06R {

 private static int numPersonas; // variable de clase
 final public static int EDAD_MAX = 65; // CONSTANTE
 private int numero; // variable de instancia 'primitivo'
 private String nombre; // variable de instancia 'REFERENCIA'

 /**
  *
  */
 public Clase06R() {
  numPersonas++;
  numero = ((EDAD_MAX > numero) ? EDAD_MAX : numero);
  nombre = "anonimo";
 }

 /**
  *
  * @param numero
  * @param nombre
  */
 public Clase06R(int numero, String nombre) {
  numPersonas++;
  this.numero = numero;
  this.nombre = nombre;
 }

 /**
  * Constructor copia
  *
  * @param ob
  */
 public Clase06R(Clase06R ob) {
  numPersonas++;
  this.numero = ob.numero;
  this.nombre = ob.nombre;
 }

 /**
  *
  * @param nombre
  * @param numero
  */
 public void modificaDatos(String nombre, int numero) {
  numPersonas++;
  this.numero = (numero > EDAD_MAX) ? numero : EDAD_MAX;
  this.nombre = nombre;
 }

 /**
  *
  * @param nombre
  */
 public void modificaDatos(String nombre) {
  this.nombre = nombre;
 }

 /**
  *
  * @param numero
  */
 public void modificaDatos(int numero) {
  this.numero = (numero > EDAD_MAX) ? EDAD_MAX : numero;
 }

 public void modificaDatos() {
  numPersonas++;
  this.nombre = "anonimo ";
  this.numero = EDAD_MAX;
 }

 public void getID() {
  System.out.println("Ver identificador : " + this);
 }

 @Override
 public String toString() {
  return "Nombre : " + nombre + " Numero : " + numero;
 }

 public static void main(String[] args) {

  Clase06R objeto1 = new Clase06R();
  objeto1.modificaDatos("Luis Ruiz", 72);
  System.out.println(objeto1.toString());
  objeto1.getID();

  Clase06R objeto2 = new Clase06R(18, "Pepe Perez");
  objeto2.modificaDatos(Clase06R.EDAD_MAX);
  System.out.println(objeto2.toString());
  objeto2.getID();

  Clase06R objeto3 = new Clase06R(objeto2);
  objeto3.modificaDatos("Antonio Gil");
  System.out.println(objeto3.toString());
  objeto3.getID();

  Clase06R objeto4 = new Clase06R(objeto1);
  objeto4.modificaDatos();
  System.out.println(objeto4.toString());
  objeto4.getID();

 }
}
