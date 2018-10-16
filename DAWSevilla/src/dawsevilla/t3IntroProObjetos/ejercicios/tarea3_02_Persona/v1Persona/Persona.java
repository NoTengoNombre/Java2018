/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02_Persona.v1Persona;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @see Ej2 - Clase POJO
 * @since 15-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Persona {

 private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 private String nombre;
 private int edad;
 private float altura;

 public Persona() {
  this.nombre = "Anonimo";
  this.edad = 0;
  this.altura = 0.0f;
 }

 public Persona(String nombre, int edad, float altura) {
  this.nombre = nombre;
  this.edad = edad;
  this.altura = altura;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombres) {
  this.nombre = nombres;
 }

 public int getEdad() {
  return edad;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public float getAltura() {
  return altura;
 }

 public void setAltura(float altura) {
  this.altura = altura;
 }

 @Override
 public String toString() {
  return ""
          + "\n----------------------------"
          + "\n• Nombre : " + getNombre()
          + "\n• Edad : " + getEdad()
          + "\n• Altura : " + getAltura()
          + "\n";
 }

}
