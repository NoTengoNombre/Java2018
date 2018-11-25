/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso;

/**
 * @see p19
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase04R {

 private static int numPersonas; //variable de clase
 private int numero;
 private String nombre;

 /**
  * Constructor sin parametros
  */
 public Clase04R() {
  numPersonas++;
  numero = 99;
  nombre = "anonimo";
 }

 /**
  * Constructor sin parametros
  *
  * @param obj
  */
 public Clase04R(Clase04R obj) {
  numPersonas++;
  numero = obj.numero;
  nombre = obj.nombre;
 }

 /**
  *
  * Constructor que recibe referencia objeto de Clase02
  *
  * @param num
  * @param obj
  */
 public Clase04R(int num, Clase04R obj) {
  numPersonas = num;
  numero = obj.numero;
  nombre = obj.nombre;
 }

 /**
  *
  * Constructor que genera 1 objeto con 2 parametros
  *
  * @param num
  * @param nomb
  */
 public Clase04R(int num, String nomb) {
  numPersonas++;
  numero = num;
  nombre = nomb;
 }

 /**
  * Devuelve cantidad de personas creadas
  *
  * @return numPersonas
  */
 public static int cuentaPersonas() {
  return numPersonas;
 }

}
