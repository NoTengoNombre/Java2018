/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v1Complejo;

/**
 * @see Ej2
 * @since 15-oct-2018
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

 public Complejo(double... numero) {
  this.real = numero[0];
  this.imag = numero[1];
 }

 public double consulta_Real() {
  return real;
 }

 public double consulta_Imag() {
  return imag;
 }

 public void cambia_Real(double real) {
  this.real = real;
 }

 public void cambia_Imag(double imag) {
  this.imag = imag;
 }

 public void sumarMetodos(Complejo b) {
  double resultado;
  double vReal = consulta_Real() + b.consulta_Real();
  double vImaginaria = consulta_Imag() + b.consulta_Imag();
  resultado = (vReal + vImaginaria);
  System.out.printf("- Resultado : %.2f\n", (vReal + vImaginaria));
  System.out.printf("- Resultado Sumando Numeros : %.2f\n", (resultado));
 }

 public void sumarAtributos(Complejo b) {
  double resultado;
  double vReal = this.real + b.consulta_Real();
  double vImaginaria = this.imag + b.consulta_Imag();
  resultado = (vReal + vImaginaria);
  System.out.printf("- Resultado : %.2f\n", (vReal + vImaginaria));
  System.out.printf("- Resultado Sumando Numeros : %.2f\n", (resultado));
 }

 @Override
 public String toString() {
  System.out.printf("• Valor Real: %.2f\n", consulta_Real());
  System.out.printf("• Valor Complejo: %.2f\n", consulta_Imag());
  return consulta_Real() + " + " + consulta_Imag() + "i";
 }

}
