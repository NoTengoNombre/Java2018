/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor 1.
 */
package dawsevilla.t3IntroProObjetos.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @see Ej1
 * @since 15-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Persona {

 String nombre;
 int edad;
 float altura;

 public Persona() {
  this.nombre = "Luisa Perez";
  this.edad = 22;
  this.altura = 1.70f;
 }

 public Persona(String nombre, int edad, float altura) {
  this.nombre = nombre;
  this.edad = edad;
  this.altura = altura;
 }

 String consultaNombre() {
  return nombre;
 }

 void cambiaNombre(String nombre) {
  this.nombre = nombre;
 }

 int getEdad() {
  return edad;
 }

 void setEdad(int edad) {
  this.edad = edad;
 }

 float getAltura() {
  return altura;
 }

 void setAltura(float altura) {
  this.altura = altura;
 }

 String getTecladoInput() {
  String nom = null;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  try {
   System.out.println("Introduce el Nombre");
   nom = br.readLine();
  } catch (IOException ioe) {
   System.out.println("IOException: " + ioe.getLocalizedMessage());
  }
  return nom;
 }

 String getTecladoScanner() {
  String nom;
  Scanner sc = new Scanner(System.in);
  System.out.println("Introduce el Nombre");
  nom = sc.nextLine();
  return nom;
 }

 int getNumeroEntero() {
  int num = 0;
  String cadena;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  try {
   System.out.println("Introduce la edad");
   cadena = br.readLine();
   num = Integer.parseInt(cadena);
  } catch (IOException ioe) {
   System.out.println("IOException : " + ioe.getMessage());
  }
  return num;
 }

 float getNumeroDecimal() {
  float decimal = 0;
  String cadena;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  try {
   System.out.println("Introduce la altura");
   cadena = br.readLine();
   decimal = Float.parseFloat(cadena);
  } catch (IOException ioe) {
   System.out.println("IOException : " + ioe.getMessage());
  }
  return decimal;
 }

 @Override
 public String toString() {
  return "\n• Nombre : " + consultaNombre() + "\n• Altura : " + getAltura() + "\n• Edad : " + getEdad();
 }

 public static void main(String[] args) {

  Persona p1 = new Persona();
  System.out.println("Persona Por defecto: "
          + "\nNombre : " + p1.consultaNombre()
          + "\nEdad : " + p1.getEdad()
          + "\nAltura : " + p1.getAltura()
  );

  p1.cambiaNombre(p1.getTecladoInput());
  System.out.println("Nombre : " + p1.consultaNombre());

  p1.setEdad(p1.getNumeroEntero());
  System.out.println(String.format("Edad : %d ", p1.getEdad()));

  p1.setAltura(p1.getNumeroDecimal());
  String salida = String.format("Altura : %.2f \n", p1.getAltura());
  System.out.println(salida);

  System.out.println("Persona: " + p1);
  System.out.println("Con ToString : " + p1.toString());

  Persona p2 = new Persona("David", (int) (Math.random() * 100), 1.60f);
  System.out.println(String.format("Nombre : %s\n Edad : %d\n Altura : %.2f\n", p2.consultaNombre(), p2.getEdad(), p2.getAltura()));

 }
}
