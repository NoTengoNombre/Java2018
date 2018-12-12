/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.actividades.personas;

import java.util.Objects;

/**
 * @see -
 * https://miriadax.net/documents/91456252/91456480/11_ArrayList.pdf/25461a23-f37d-48d0-9450-5cfcc809005b
 * @since 12-dic-2018
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

 /**
  *
  */
 public Persona() {
  this("Anonimo", "DNI sin Identificar", (byte) 0, 'x', false);
 }

 /**
  *
  * @param person
  */
 public Persona(Persona person) {
  this(person.nombre, person.DNI, person.edad, person.sexo, person.bCasado);
 }

 /**
  *
  * @param nombre
  * @param DNI
  * @param edad
  * @param sexo
  * @param bCasado
  */
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

 /**
  *
  * @param obj
  * @return
  */
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
 public int hashCode() {
  int hash = 5;
  hash = 73 * hash + Objects.hashCode(this.nombre);
  hash = 73 * hash + Objects.hashCode(this.DNI);
  hash = 73 * hash + this.edad;
  hash = 73 * hash + this.sexo;
  hash = 73 * hash + (this.bCasado ? 1 : 0);
  return hash;
 }

 /**
  *
  * @return
  */
 @Override
 public String toString() {
  return "○ Persona : [Nombre : " + getNombre()
          + "]" + "[DNI : " + getDNI()
          + "]" + "[Edad : " + getEdad()
          + "]" + "[Sexo : " + getSexo()
          + "]" + "[Casado : " + isbCasado()
          + "]" + "[Class :" + getClass() + "]";
 }

}
