/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 28-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag54Ej1Finanzas {

 public static void main(String[] args) {

  Fianzas f = new Fianzas(1.17);
  System.out.printf("• Dollar To Euro %.2f\n", f.getDollarToEuro(10));
  System.out.printf("▬ Euro To Dollar %.2f\n", f.getEuroToDollar(10));

  Fianzas f1 = new Fianzas(10, 10, 1.36);
  System.out.printf("• Dollar To Euro %.2f\n", f1.getDollarToEuro(10));
  System.out.printf("▬ Euro To Dollar %.2f\n", f1.getEuroToDollar(10));

 }
}

/**
 * @author Robot
 */
class Fianzas {

 private double dollar;
 private double euro;
 private double cambio;

 private double dollarToEuro;
 private double euroToDollar;

 /**
  * Constructor : establece el cambio
  */
 public Fianzas() {
  this.cambio = 1.17;
 }

 /**
  * Constructor : establece el cambio
  */
 public Fianzas(double cambio) {
  this.cambio = cambio;
 }

 /**
  *
  * @param dollar
  * @param euro
  * @param cambio
  */
 public Fianzas(double dollar, double euro, double cambio) {
// This = Este objeto - El que instancie con este CONSTRUCTOR
  this.dollar = dollar;
  this.euro = euro;
  this.cambio = cambio;
 }

 /**
  * Obtener dollar a euro
  *
  * @return dollarToEuro
  */
 public double getDollarToEuro(double dollar) {
  return dollarToEuro = (dollar / cambio);
 }

 /**
  * Obtener euro a dolar
  *
  * @return euroToDollar
  */
 public double getEuroToDollar(double euro) {
  return euroToDollar = (euro * cambio);
 }
}
