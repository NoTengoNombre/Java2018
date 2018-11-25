/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.basico;

/**
 * @see p31
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase11 {

 private int numero;
 private String nombre;
 private static int numPersonas;

 public Clase11() {
  this(0, "Anonimo");
 }

 public Clase11(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 public String getNombre() {
  return nombre;
 }

 public int getNumero() {
  return numero;
 }

 public static int cuentaPersonas() {
  return ++numPersonas;
 }

 @Override
 public String toString() {
  return "Clase11 [numero= " + numero + " : nombre= " + nombre + "]";
 }

}
