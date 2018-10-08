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
public class Perro extends Animal {

 private String raza;
 private String color;
 private String pais;
 private boolean domestico;
 private boolean juega;
 private Perro miPerro;

 public Perro() {
  this(null, null, null, false, false);
 }

 /**
  *
  * @param nombre
  * @param tamaño
  */
 Perro(String nombre, double tamaño) {
  super(nombre, tamaño);
 }

 /**
  *
  * @param raza
  * @param color
  * @param pais
  * @param domestico
  */
 public Perro(String raza, String color, String pais, boolean domestico, boolean juega) {
  this.raza = raza;
  this.color = color;
  this.pais = pais;
  this.domestico = domestico;
  this.juega = juega;
 }

 /**
  *
  * @param raza
  * @param color
  * @param pais
  * @param domestico
  * @param edad
  * @param peso
  * @param catalogado
  * @param nombre
  * @param tamaño
  * @param juega
  */
 public Perro(String raza, String color, String pais, boolean domestico, int edad, double peso, boolean catalogado, String nombre, double tamaño, boolean juega) {
  super(edad, peso, catalogado, nombre, tamaño);
  this.raza = raza;
  this.color = color;
  this.pais = pais;
  this.domestico = domestico;
  this.juega = juega;
 }

 /**
  * @return the raza
  */
 public String getRaza() {
  return raza;
 }

 /**
  * @param raza the raza to set
  */
 public void setRaza(String raza) {
  this.raza = raza;
 }

 /**
  * @return the color
  */
 public String getColor() {
  return color;
 }

 /**
  * @param color the color to set
  */
 public void setColor(String color) {
  this.color = color;
 }

 /**
  * @return the pais
  */
 public String getPais() {
  return pais;
 }

 /**
  * @param pais the pais to set
  */
 public void setPais(String pais) {
  this.pais = pais;
 }

 /**
  * @return the domestico
  */
 public boolean isDomestico() {
  return domestico;
 }

 /**
  * @param domestico the domestico to set
  */
 public void setDomestico(boolean domestico) {
  this.domestico = domestico;
 }

 public int getLadrar(int x) {
  if (x < 20) {
   return miPerro.getLadrar(x);
  } else {
   return miPerro.getLadrar(x + 2);
  }
 }

 public void setJuega(boolean juega) {
  this.juega = juega;
 }

 public boolean isJuega() {
  return juega;
 }

 @Override
 public String toString() {
  return super.toString().concat(
          "\nRaza : " + getRaza()
          + "\nColor : " + getColor()
          + "\nJuega : " + isJuega()
          + "\nPais : " + getPais());
 }

}
