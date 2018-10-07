package com.rvssoft.cajondesastre.collections;

/**
 * POJOS
 *
 * @author Formacion
 *
 * Comparable - comparteTo - recibe un String y devuelve un numero Entero : -1
 * anterior , 0 igual , 1 siguiente
 *
 */
public class Pasajero implements Comparable<Pasajero> {

 private int codigo;
 private String nombre;
 private String ciudad;

 public Pasajero(int codigo, String nombre, String ciudad) {
  this.codigo = codigo;
  this.nombre = nombre;
  this.ciudad = ciudad;
 }

 public int getCodigo() {
  return codigo;
 }

 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getCiudad() {
  return ciudad;
 }

 public void setCiudad(String ciudad) {
  this.ciudad = ciudad;
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
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  Pasajero other = (Pasajero) obj;
  if (codigo != other.codigo) {
   return false;
  }
  return true;
 }

 @Override
 public String toString() {
  return "Pasajero [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
 }

 /**
  *
  */
 @Override
 public int compareTo(Pasajero otro) {
  return this.getNombre().compareTo(otro.getNombre());
 }

}
