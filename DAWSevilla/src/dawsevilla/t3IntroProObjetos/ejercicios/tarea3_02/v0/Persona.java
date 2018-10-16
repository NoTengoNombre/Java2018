/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_02.v0;

/**
 * @see POJO
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Persona {

 String nombre;
 int edad;
 float altura;

 String consulta_Nombre() {
  return nombre;
 }

 int consulta_edad() {
  return edad;
 }

 float consulta_altura() {
  return altura;
 }

 void cambia_Nombre(String nombre) {
  this.nombre = nombre;
 }

 void cambia_edad(int edad) {
  this.edad = edad;
 }

 void cambia_altura(float altura) {
  this.altura = altura;
 }

 @Override
 public String toString() {
  return "- Nombre : " + consulta_Nombre() + ""
          + "\n- Edad : " + consulta_edad()
          + "\n- Altura : " + consulta_altura();
 }

}
