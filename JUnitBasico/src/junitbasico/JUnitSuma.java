/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitbasico;

/**
 * Molde : Para crear objetos a partir de esta clase y los objetos que generamos
 * tenga los atributos propios donde almacenemos los datos que nos interese
 *
 * Clase para hacer pruebas
 *
 * @author MyDevelop
 */
public class JUnitSuma {

// Atributo/Propiedad/Variable Instancia/Tipo Primitivo
 private int a;

// Atributo/Propiedad/Variable Instancia/Tipo Primitivo
 private int b;

// Atributo/Propiedad/Variable Instancia/Tipo Referencia
 private String c = "pepe";

// Atributo/Propiedad/Variable Instancia/Tipo Referencia a Null
 private String c1 = null;

 /**
  * Devuelve la referencia al atributo de la clase
  *
  * @return
  */
 public String getC() {
  return c;
 }

 /**
  * Devuelve la referencia al atributo de la clase
  *
  * @return apunta a null
  */
 public String getC1() {
  return c1;
 }

 /**
  * Establece el valor del atributo de la clase para el objeto que se instancie
  *
  * @param a
  */
 public void setA(Integer a) {
  this.a = a;
 }

 /**
  * Establece el valor del atributo de la clase para el objeto que se instancie
  *
  * @param b
  */
 public void setB(int b) {
  this.b = b;
 }

 /**
  * Suma ambos atributos que este instanciado y los devuelve
  *
  * @return la suma de 2 atributos
  */
 public int sumar() {
  return (a + b);
 }

}
