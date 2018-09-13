package com.rvssoft.cajondesastre.model.geometrica;

public class Circulo implements Figura {

 //Atributos
 private double radio;
 private Punto centro;

 /**
  *
  * @param centro
  * @param radio
  */
 public Circulo(Punto centro, double radio) {
  this.centro = centro;
  this.radio = radio;
 }

 /**
  *
  * @param x
  * @param y
  * @param radio
  */
 public Circulo(double x, double y, double radio) {
  this.centro = new Punto(x, y);
  this.radio = radio;
 }

 public double getRadio() {
  return radio;
 }

 public void setRadio(double radio) {
  this.radio = radio;
 }

 public Punto getCentro() {
  return centro;
 }

 @Override
 public void trasladar(double deltaX, double deltaY) {
  this.centro.trasladar(deltaX, deltaY);
 }

 @Override
 public double getPerimetro() {
  // TODO Auto-generated method stub
  return 2 * (Math.PI) * this.radio;
 }

 @Override
 public double getArea() {
  // TODO Auto-generated method stub
  return Math.PI * (Math.pow(radio, 2));
 }

}
