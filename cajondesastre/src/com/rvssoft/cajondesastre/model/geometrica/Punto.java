package com.rvssoft.cajondesastre.model.geometrica;

public class Punto {

 private double x = 0;
 private double y = 0;

 public Punto() {

 }

 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
 }

 public double getX() {
  return x;
 }

 public void setX(double x) {
  this.x = x;
 }

 public double getY() {
  return y;
 }

 public void setY(double y) {
  this.y = y;
 }

 public void trasladar(double deltaX, double deltaY) {
  this.x += deltaX;
  this.y += deltaY;
 }

 public double distancia(Punto otro) {
  double punto1 = Math.pow(otro.y - this.y, 2);
  double punto2 = Math.pow(otro.x - this.x, 2);
  return Math.sqrt(punto1 + punto2);
 }

 @Override
 public String toString() {
  return "Punto [x=" + x + ", y=" + y + "]";
 }
}
