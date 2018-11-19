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
public class Clase04 {

 // Variable de clase
 private static int numPersonas;

 // Variables de instancia
 private int numero;
 private String nombre;

 public Clase04() {
  numPersonas++;
  numero = 99;
  nombre = "anonimo";
 }

 public Clase04(int numero, String nombre) {
  numPersonas++;
  this.numero = numero;
  this.nombre = nombre;
 }

 public Clase04(Clase04 ob) {
  numPersonas++;
  numero = ob.numero;
  nombre = ob.nombre;
 }

 public static int cuentaPersonas() {
  return numPersonas;
 }

}
