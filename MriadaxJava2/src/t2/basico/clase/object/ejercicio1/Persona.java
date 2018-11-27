/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.ejercicio1;

import java.util.Objects;

/**
 * SUPERCLASE
 *
 * @see
 * <a href="https://miriadax.net/documents/91456252/91456480/6_ClaseSubclase.pdf/8aaec321-07fe-4a49-bf03-5852acf9ce6b">Enlace</a>
 * @since 25-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Persona {

 private String nombre;
 private String DNI;

 private byte edad;
 private char sexo;
 private boolean bCasado;
 private static int numero;

 public Persona() {
  this("Anonimo : " + (numero++), "DNI sin Identificar", (byte) 0, 'X', false);
 }

 public Persona(Persona person) {
  this(person.nombre, person.DNI, person.edad, person.sexo, person.bCasado);
 }

 public Persona(String nombre, String DNI, byte edad, char sexo, boolean bCasado) {
  this.nombre = nombre;
  this.DNI = DNI;
  this.edad = edad;
  this.sexo = sexo;
  this.bCasado = bCasado;
 }

 public String getDNI() {
  return DNI;
 }

 public void setDNI(String DNI) {
  this.DNI = DNI;
 }

 public byte getEdad() {
  return edad;
 }

 public void setEdad(byte edad) {
  this.edad = edad;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public char getSexo() {
  return sexo;
 }

 public void setSexo(char sexo) {
  this.sexo = sexo;
 }

 public boolean isbCasado() {
  return bCasado;
 }

 public void setbCasado(boolean bCasado) {
  this.bCasado = bCasado;
 }

 public int getNumero() {
  return ++numero;
 }

 public void pintar() {
  System.out.println(
          "Clase : " + getClass()
          + " hashCode : " + hashCode()
          + " DNI : " + getDNI()
          + " Nombre : " + getNombre()
          + " Edad : " + getEdad()
          + " Sexo : " + getSexo()
          + " Casado " + ((isbCasado() == false) ? "Si" : "No"));
 }

// @Override
// public int hashCode() {
//  return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
// }
// 
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = (prime * result) + ((DNI == null) ? 0 : DNI.hashCode());
  result = (prime * result) + edad;
  return result;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }

  final Persona other = (Persona) obj;
  if (this.edad != other.edad) {
   return false;
  }
  if (this.sexo != other.sexo) {
   return false;
  }
  if (this.bCasado != other.bCasado) {
   return false;
  }
  if (!Objects.equals(this.nombre, other.nombre)) {
   return false;
  }
  if (!Objects.equals(this.DNI, other.DNI)) {
   return false;
  }
  return true;
 }

 @Override
 public String toString() {
  return "[Nombre : " + getNombre()
          + "]" + "[DNI : " + getDNI()
          + "]" + "[Edad : " + getEdad()
          + "]" + "[Sexo : " + getSexo()
          + "]" + "[Casado : " + isbCasado()
          + "]" + "[Class :" + getClass() + "]";
 }

}
