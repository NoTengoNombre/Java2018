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
public class Tecnico extends Obrero {

 private String especialidad;
 private String seccion;
 private double plus;

 /**
  * Constructor por defecto
  */
 public Tecnico() {
  this("Sin especialidad", "Sin seccion", 0.0);
 }

 /**
  * Constructor basico
  *
  * @param plus
  * @param seccion
  * @param especialidad
  */
 public Tecnico(String especialidad, String seccion, double plus) {
  this.especialidad = especialidad;
  this.seccion = seccion;
  this.plus = plus;
 }

 /**
  * Constructor que implementa un objeto de tipo Tecnico y añade las
  * caracterticas del objeto 'Obrero'
  *
  * @param plus
  * @param especialidad
  * @param seccion
  * @param obrero
  */
 public Tecnico(String especialidad, String seccion, double plus, Obrero obrero) {
  super(obrero);
  this.especialidad = especialidad;
  this.seccion = seccion;
  this.plus = plus;
 }

 public String getEspecialidad() {
  return especialidad;
 }

 public double getPlus() {
  return plus;
 }

 public String getSeccion() {
  return seccion;
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

  final Tecnico tecnico = (Tecnico) obj;
  if (this.especialidad != tecnico.especialidad) {
   return false;
  }
  if (this.plus != tecnico.plus) {
   return false;
  }
  if (this.seccion != tecnico.seccion) {
   return false;
  }
  return true;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 97 * hash + Objects.hashCode(this.especialidad);
  hash = 97 * hash + Objects.hashCode(this.seccion);
  hash = 97 * hash + (int) (Double.doubleToLongBits(this.plus) ^ (Double.doubleToLongBits(this.plus) >>> 32));
  return hash;
 }

 @Override
 public String toString() {
  return "♦ Tecnico : [Especialidad: " + getEspecialidad() + " Plus: " + getPlus() + " Seccion: " + getSeccion() + "]";
 }

}
