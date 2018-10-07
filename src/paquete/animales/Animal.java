/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.animales;

import java.io.Serializable;

/**
 * @see @since 06-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Animal implements Serializable {

 private int edad;
 private double peso;
 private boolean catalogado;
 private String nombre;
 private double tamaño;

 public Animal() {
  this(0, 0.0, false, null, 0.0);
 }

 public Animal(String nombre, double tamaño) {
  this.nombre = nombre;
  this.tamaño = tamaño;
 }

 public Animal(int edad, double peso, boolean catalogado, String nombre, double tamaño) {
  this.edad = edad;
  this.peso = peso;
  this.catalogado = catalogado;
  this.nombre = nombre;
  this.tamaño = tamaño;
 }

 public int getEdad() {
  return edad;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public double getPeso() {
  return peso;
 }

 public void setPeso(double peso) {
  this.peso = peso;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public boolean isCatalogado() {
  return catalogado;
 }

 public void setCatalogado(boolean catalogado) {
  this.catalogado = catalogado;
 }

 public double getTamaño() {
  return tamaño;
 }

 public void setTamaño(double tamaño) {
  this.tamaño = tamaño;
 }

 @Override
 public String toString() {
  return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\nPeso: " + getPeso() + "\nCatalogado: " + isCatalogado() + "\nTamaño: " + getTamaño();
 }
}
