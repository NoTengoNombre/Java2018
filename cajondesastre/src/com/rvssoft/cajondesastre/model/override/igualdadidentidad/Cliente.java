package com.rvssoft.cajondesastre.model.override.igualdadidentidad;

/**
 * Igualdad e identidad
 *
 * @author Formacion
 *
 */
public class Cliente {

 private int codigo;
 private String nombre;
 private String apellido1;
 private String apellido2;

 public Cliente(int codigo2, String nombre2, String apellido12, String apellido22) {
  this.codigo = codigo;
  this.nombre = nombre;
  this.apellido1 = apellido1;
  this.apellido2 = apellido2;
 }

 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + codigo;
  return result;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj) // este objeto
  {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) // esta clase 'actual' 
  {
   return false;
  }
  Cliente other = (Cliente) obj; //objeto lo trato como Cliente
  if (codigo != other.codigo) // los object no tienen codigo
  {
   return false;
  }
  return true;
 }

 @Override
 public String toString() {
  return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
          + apellido2 + "]";
 }

}
