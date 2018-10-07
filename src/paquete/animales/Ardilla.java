/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.animales;

/**
 * @see @since 06-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ardilla extends Animal {

 private String raza;
 private String color;
 private String pais;

 public Ardilla() {
  this(null, null, null);
 }

 public Ardilla(String raza, String color, String pais) {
  this.raza = raza;
  this.color = color;
  this.pais = pais;
 }

 public Ardilla(String raza, String color, String pais, int edad, double peso, boolean catalogado, String nombre, double tamaño) {
  super(edad, peso, catalogado, nombre, tamaño);
  this.raza = raza;
  this.color = color;
  this.pais = pais;
 }

 public String getRaza() {
  return raza;
 }

 public String getColor() {
  return color;
 }

 public String getPais() {
  return pais;
 }

 @Override
 public String toString() {
  return super.toString().concat(
          "\nRaza : " + getRaza()
          + "\nColor " + getColor()
          + "\nPais : " + getPais());
 }

};
