/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * @see 43
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ArraysBasicos {

 public static void main(String[] args) {

  int[] num = new int[7];
  double[] decimales = new double[10];
  int contador = 1;

  Perro[] misPerros = new Perro[2];
  misPerros[0] = new Perro(new Perro().getGenerarNombre(), new Perro().getGenerarEdad());
  misPerros[1] = new Perro(new Perro().getGenerarNombre(), new Perro().getGenerarEdad());

  for (Perro perro : misPerros) {
   System.out.println((contador++) + " Perro - Nombre : " + perro.getNombre() + " Edad : " + perro.getEdad());
  }

 }
}

class Perro {

 private String nombre;
 private int edad;

 public Perro() {
  this(null, 0);
 }

 public Perro(String nombre, int edad) {
  this.nombre = nombre;
  this.edad = edad;
 }

 public int getEdad() {
  return edad;
 }

 public String getNombre() {
  return nombre;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public int getGenerarEdad() {
  return (int) (Math.random() * (1 + 15) + 1);
 }

 public String getGenerarNombre() {
  String nomb = "";
  for (int i = 0; i < 6; i++) {
   char letra = (char) (Math.random() * 26 + ('a'));
   if (i == 0) {
    String letraMayus = String.valueOf(letra);
    nomb += letraMayus.toUpperCase();
   }
   nomb += letra;
  }
  System.out.println("Nombre : " + nomb);
  return nomb;
 }

 /**
  *
  * @return return super.toString().concat("Nombre : " + getNombre() + " Edad :
  * " + getEdad());
  */
 @Override
 public String toString() {
  return super.toString().concat("Nombre : " + getNombre() + " Edad : " + getEdad());
 }

}
