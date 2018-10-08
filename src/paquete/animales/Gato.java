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
public class Gato extends Animal {

 private String raza;
 private String color;
 private String pais;
 private boolean domestico;

 public Gato() {
  this(null, null, null, false);
 }

 public Gato(String raza, String color, String pais, boolean domestico) {
  this.raza = raza;
  this.color = color;
  this.pais = pais;
  this.domestico = domestico;
 }

 public Gato(String raza, String color, String pais, boolean domestico, int edad, double peso, boolean catalogado, String nombre, double tamaño) {
  super(edad, peso, catalogado, nombre, tamaño);
  this.raza = raza;
  this.color = color;
  this.pais = pais;
  this.domestico = domestico;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public String getPais() {
  return pais;
 }

 public void setPais(String pais) {
  this.pais = pais;
 }

 public String getRaza() {
  return raza;
 }

 public void setRaza(String raza) {
  this.raza = raza;
 }

 public boolean isDomestico() {
  return domestico;
 }

 public void setDomestico(boolean domestico) {
  this.domestico = domestico;
 }

 @Override
 public String toString() {
  return super.toString().concat(
          "\nRaza : " + getRaza()
          + "\nColor " + getColor()
          + "\nPais : " + getPais()
          + "\nDomestico : " + isDomestico());
 }

}
