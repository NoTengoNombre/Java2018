/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructuras.repetitivas.forforeachbasico;

import java.util.Arrays;

/**
 * @see @since 30-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej11TForEachBasico {

 public static void main(String[] args) {

  int[] array = {1, 2, 3, 4, 5};
  /*--------------------------------------------------- Instancio un objeto en la memoria sin tener una variable que referencie a esa posicion*/
  Object[] objetos = {"Cadena", Arrays.toString(array), new Persona("Pepe", 20, 1200), Integer.BYTES, '1'};

  int x = 0;

  for (Object obj : objetos) {
   System.out.println("Objeto " + (++x) + " : " + obj);
  }

 }

}

class Persona {

 // Atributos
 private static String nombre;
 private static int edad;
 private static double sueldo;

 //Metodos
 // Constructor : Inicializa los objetos a su valor por defecto
 public Persona() {
 }

 // Constructor : Inicializa los valores del objeto segun sus parametros 
 public Persona(String nombre, int edad, double sueldo) {
  Persona.nombre = nombre;
  Persona.edad = edad;
  Persona.sueldo = sueldo;
 }

 public static String getNombre() {
  return nombre;
 }

 public static void setNombre(String nombre) {
  Persona.nombre = nombre;
 }

 public static int getEdad() {
  return edad;
 }

 public static void setEdad(int edad) {
  Persona.edad = edad;
 }

 public static double getSueldo() {
  return sueldo;
 }

 public static void setSueldo(double sueldo) {
  Persona.sueldo = sueldo;
 }

 /**
  * Este metodo muestra por consola "de forma magica" los valores del objeto que
  * haya instanciado con esta clase
  *
  * Si quito este metodo cuando instancie con el operador 'new' solo me saldra
  * la posición en memoria del objeto
  *
  *
  * @return Los atributos de la clase
  */
 @Override
 public String toString() {
  return "Nombre : " + getNombre() + "\nEdad : " + getEdad() + "\nSueldo : " + getSueldo();
 }
}
