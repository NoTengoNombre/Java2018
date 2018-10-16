/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v0Complejo;

/**
 * @see POJO
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Complejo {

 double real;
 double imag;

 public Complejo() {
  this.real = 0;
  this.imag = 0;
 }

 public Complejo(double real, double imag) {
  this.real = real;
  this.imag = imag;
 }

 public double getReal() {
  return real;
 }

 public void setReal(double real) {
  this.real = real;
 }

 public double getImaginario() {
  return imag;
 }

 public void setImaginario(double imaginario) {
  this.imag = imaginario;
 }

 public void setSumar(Complejo complejo) {
  double uno, dos;
  uno = (this.real + complejo.getReal());
  dos = (this.imag + complejo.getImaginario());
  System.out.printf("• La parte real (%.2f y %.2f) es igual a %.2f\n", this.real, complejo.real, uno);
  System.out.printf("• La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, complejo.imag, dos);
 }

 public void setSumarMetodos(Complejo complejo) {
  double uno, dos;
  uno = (this.real + complejo.getReal());
  dos = (this.imag + complejo.getImaginario());
  System.out.printf("♦ La parte real (%.2f y %.2f) es igual a %.2f\n", this.getReal(), complejo.getReal(), uno);
  System.out.printf("♦ La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.getImaginario(), complejo.getImaginario(), dos);
 }

 @Override
 public String toString() {
  return String.valueOf(real) + " + " + String.valueOf(imag) + " i ";
 }

}
