/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.JavaBeans;

import java.io.Serializable;

/**
 * @see https://es.wikipedia.org/wiki/JavaBean
 * @since 28-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class PersonaBean implements Serializable {

 /**
  * Miembro de instancia : String nombre
  */
 private String nombre;

 /**
  * Miembro de instancia : String edad
  */
 private int edad;

 /**
  * Constructor sin argumentos
  */
 public PersonaBean() {
 }

 /**
  * Constructor del JavaBean
  *
  * SobreCargado
  *
  * @param nombre
  * @param edad
  */
 public PersonaBean(String nombre, int edad) {
  this.nombre = nombre;
  this.edad = edad;
 }

 /**
  * Constructor por copia
  *
  * @param personaBean
  */
 public PersonaBean(PersonaBean personaBean) {
  this.nombre = personaBean.getNombre();
  this.edad = personaBean.getEdad();
 }

 /**
  * Establecer Nombre
  *
  * @param n
  */
 public void setNombre(String n) {
  this.nombre = n;
 }

 /**
  * Establecer Edad
  *
  * @param e
  */
 public void setEdad(int e) {
  this.edad = e;
 }

 /**
  * Obtener nombre
  *
  * @return (this.nombre)
  */
 public String getNombre() {
  return (this.nombre);
 }

 /**
  * Obtener edad
  *
  * @return (this.edad)
  */
 public int getEdad() {
  return (this.edad);
 }

 public static void main(String[] args) {

  PersonaBean pb = new PersonaBean();
  pb.setNombre("pepe");
  pb.setEdad(10);
  System.out.println("• Edad : " + pb.getEdad());
  System.out.println("• Nombre : " + pb.getNombre());

  PersonaBean pb1 = new PersonaBean("juan", 20);
  System.out.println("• Edad : " + pb1.getEdad());
  System.out.println("• Nombre : " + pb1.getNombre());

  PersonaBean pb2 = new PersonaBean(pb1);
  System.out.println("♦ Edad : " + pb2.getEdad());
  System.out.println("♦ Nombre : " + pb2.getNombre());

 }
}
