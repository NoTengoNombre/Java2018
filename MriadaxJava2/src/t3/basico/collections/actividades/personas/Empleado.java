/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.actividades.personas;

import java.util.Objects;

/**
 * @see -
 * @since 12-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Empleado extends Persona {

 private String idPersonal;
 private float sueldo;

 /**
  * Constructor por defecto : hereda de la superclase
  */
 public Empleado() {
  super(); // hereda ATRIBUTOS del padre
 }

 /**
  *
  * @param idPersonal
  * @param sueldo
  */
 public Empleado(String idPersonal, float sueldo) {
  super(); // hereda ATRIBUTOS del padre
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 /**
  * Constructor Completo
  *
  * @param idPersonal
  * @param sueldo
  * @param nombre
  * @param DNI
  * @param edad
  * @param sexo
  * @param bCasado
  */
 public Empleado(String idPersonal, float sueldo, String nombre, String DNI, byte edad, char sexo, boolean bCasado) {
  super(nombre, DNI, edad, sexo, bCasado);
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 /**
  * Constructor que recibe un objeto de tipo Persona y lo implementa con otros
  * ATRIBUTOS
  *
  * @param idPersonal
  * @param sueldo
  * @param person
  */
 public Empleado(Persona person, String idPersonal, float sueldo) {
  super(person);
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 /**
  * Constructor Copia
  *
  * @param emp
  */
 public Empleado(Empleado emp) {
  this(emp.idPersonal, emp.sueldo);
 }

 public String getIdPersonal() {
  return idPersonal;
 }

 public void setIdPersonal(String idPersonal) {
  this.idPersonal = idPersonal;
 }

 public float getSueldo() {
  return sueldo;
 }

 public void setSueldo(float sueldo) {
  this.sueldo = sueldo;
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
  final Empleado other = (Empleado) obj;
  if (this.idPersonal == null ? other.idPersonal != null : !this.idPersonal.equals(other.idPersonal)) {
   return false;
  }
  if (this.sueldo != other.sueldo) {
   return false;
  }
  return true;
 }

 /**
  *
  * @return
  */
 @Override
 public int hashCode() {
  int hash = 5;
  hash = (97 * hash) + Objects.hashCode(this.idPersonal);
  hash = (97 * hash) + Float.floatToIntBits(this.sueldo);
  return hash;
 }

 /**
  *
  */
 @Override
 public void pintar() {
  System.out.println(
          "♠ Clase : " + getClass()
          + " hashCode : " + hashCode()
          + " IdPersonal : " + getIdPersonal()
          + " Sueldo : " + getSueldo()
          + " DNI : " + getDNI()
          + " Nombre : " + getNombre()
          + " Edad : " + getEdad()
          + " Sexo : " + getSexo()
          + " Casado " + ((isbCasado() == false) ? "Si" : "No"));
 }

 /**
  *
  * @return
  */
 @Override
 public String toString() {
  return "• Empleado : [IdPersonal : " + getIdPersonal() + "]"
          + "[Sueldo : " + getSueldo() + "]"
          + "[DNI : " + getDNI() + "]"
          + "[Edad : " + getEdad() + "]"
          + "[Nombre : " + getNombre() + "]"
          + "[Sexo : " + getSexo() + "]"
          + "[Casado : " + isbCasado() + "]";
 }
}
