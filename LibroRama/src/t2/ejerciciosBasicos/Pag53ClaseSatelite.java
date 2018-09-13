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
public class Pag53ClaseSatelite {

}

/**
 *
 * @author Robot
 */
class Satelite {

 private double meridiano;
 private double paralelo;
 private double distancia_tierra;

 /**
  * Constructor Sobrecargado
  *
  * @param meridiano
  * @param paralelo
  * @param distancia_tierra
  */
 Satelite(double meridiano, double paralelo, double distancia_tierra) {
  this.meridiano = meridiano;
  this.paralelo = paralelo;
  this.distancia_tierra = distancia_tierra;
 }

 /**
  * Constructor Sobrecargado
  *
  * @param mer
  * @param par
  * @param distancia_tierra
  */
 Satelite(double mer, double par) {
  this.meridiano = mer;
  this.paralelo = par;
  this.distancia_tierra = 0;
 }

 /**
  * Constructor asociado al secundario
  */
 public Satelite() {
  this(10, 20, 30);
 }

 /**
  * Establecer meridiano
  *
  * @param meridiano
  */
 public void setMeridiano(double meridiano) {
  this.meridiano = meridiano;
 }

 /**
  * Obtener meridiano
  *
  * @return meridiano
  */
 public double getMeridiano() {
  return meridiano;
 }

 /**
  * Establecer paralelo
  *
  * @param paralelo
  */
 public void setParalelo(double paralelo) {
  this.paralelo = paralelo;
 }

 /**
  * Obtener paralelo
  *
  * @return paralelo
  */
 public double getParalelo() {
  return paralelo;
 }

 /**
  * Establecer distancia
  *
  * @param distancia_tierra
  */
 public void setDistanciaTierra(double distancia_tierra) {
  this.distancia_tierra = distancia_tierra;
 }

 /**
  * Obtener distancia
  *
  * @return
  */
 public double getDistanciaTierra() {
  return distancia_tierra;
 }

 /**
  * Fijar posicion
  *
  * @param m
  * @param p
  * @param d
  */
 public void setPosicion(double m, double p, double d) {
  meridiano = m;
  paralelo = p;
  distancia_tierra = d;
 }

 /**
  * Mostrar datos
  */
 public void printPosition() {
  System.out.println("El satelite se encuentra en el Paralelo : " + paralelo + " : Meridiano : " + meridiano + " : Distancia tierra : " + distancia_tierra);
 }

 public static void main(String[] args) {

  Satelite s = new Satelite();
  double sd = s.getDistanciaTierra();
  double sm = s.getMeridiano();
  double sp = s.getParalelo();
  System.out.println("\u001B[32mDistancia Tierra : " + sd + " : Paralelo : " + sp + " : Meridiano : " + sm);
  s.printPosition();

  Satelite s1 = new Satelite(100, 200, 300);
  double sd1 = s1.getDistanciaTierra();
  double sm1 = s1.getMeridiano();
  double sp1 = s1.getParalelo();
  System.out.println("\u001B[33mDistancia Tierra : " + sd1 + " : Paralelo : " + sp1 + " : Meridiano : " + sm1);
  s1.printPosition();
 }

}
