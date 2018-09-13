/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 29-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag56Ej5ClaseSatelite {

}

class Satelite2 {

 private double meridiano;
 private double paralelo;
 private double distancia_tierra;

 private final static double alturaNivelDelMar = 6378;
 private final static double geoEstacionaria = 35786;
 private final static double geoGeosincrona = 42164;

 public Satelite2() {
  this.meridiano = 0;
  this.paralelo = 0;
  this.distancia_tierra = 0;
 }

 public Satelite2(int meridiano, int paralelo, int distancia_tierra) {
  this.meridiano = meridiano;
  this.paralelo = paralelo;
  this.distancia_tierra = distancia_tierra;
 }

 public void setPosicion(double meridiano, double paralelo, double distancia_tierra) {
  this.meridiano = meridiano;
  this.paralelo = paralelo;
  this.distancia_tierra = distancia_tierra;
 }

 public void printPosicion() {
  System.out.println(
          "El satelite se encuentra en el paralelo : " + paralelo
          + "\nEl satelite se encuentra en el meridiano : " + meridiano
          + "\nEl satelite se encuentra en el distancia_tierra : " + distancia_tierra);
 }

 public void variaAltura(double desplazamiento) {
  if (desplazamiento <= 0 || desplazamiento >= geoEstacionaria) {
   System.out.println("Estas fuera de la orbita");
  } else {
   this.distancia_tierra = (desplazamiento - alturaNivelDelMar);
  }
 }

 public boolean enOrbita() {
  if ((distancia_tierra >= 200) && (distancia_tierra < 1200)) {
   System.out.println("\u001B[36mEsta en Orbita baja terrestre : " + (distancia_tierra));
  }
  if ((distancia_tierra >= 1200) && (distancia_tierra <= geoEstacionaria)) {
   System.out.println("\u001B[35mEsta en Orbita media terrestre : " + (distancia_tierra));
  }
  if ((distancia_tierra >= geoEstacionaria) && (distancia_tierra <= geoGeosincrona)) {
   System.out.println("\u001B[32mEsta en Orbita geosíncrona : " + (distancia_tierra));
  } else if ((distancia_tierra <= 199) || (distancia_tierra >= geoGeosincrona)) {
   System.out.println("\u001B[31mNo esta dentro de la Orbita terrestre : " + (distancia_tierra));
  }
  return (distancia_tierra <= geoGeosincrona) || (200 <= distancia_tierra);
 }

 public void variaPosicion(double variaParalelo, double variaMeridiano) {
  this.paralelo = variaParalelo;
  this.meridiano = variaMeridiano;
 }

 public int generarOrbita() {
  int orbitaGenerada = (int) ((Math.random() * (1 * 60000) + 10));
  return orbitaGenerada;
 }

 public static void main(String[] args) {

  final int meridianoN = (int) ((Math.random() * (1 * 10000) + 10));
  final int paraleloN = (int) ((Math.random() * (1 * 360) + 10));

  Satelite2 s2 = new Satelite2();
  s2.setPosicion(meridianoN, paraleloN, new Satelite2().generarOrbita());
  s2.printPosicion();
  s2.enOrbita();
  s2.variaAltura(new Satelite2().generarOrbita());
  s2.printPosicion();
  s2.enOrbita();
 }
}

class Satelite3 {

 private double meridiano;
 private double paralelo;
 private double distancia_tierra;

 public Satelite3() {
  this.meridiano = 0;
  this.paralelo = 0;
  this.distancia_tierra = 0;
 }

 public Satelite3(double meridiano, double paralelo, double distancia_tierra) {
  this.meridiano = meridiano;
  this.paralelo = paralelo;
  this.distancia_tierra = distancia_tierra;
 }

 public void setPosicion(double meridiano, double paralelo, double distancia_tierra) {
  this.meridiano = meridiano;
  this.paralelo = paralelo;
  this.distancia_tierra = distancia_tierra;
 }

 public void printPosicion() {
  System.out.println(""
          + "El satelite se encuentra en paralelo : " + paralelo
          + " en el meridiano : " + meridiano
          + " y en la distancia_tierra : " + distancia_tierra);
 }

}
