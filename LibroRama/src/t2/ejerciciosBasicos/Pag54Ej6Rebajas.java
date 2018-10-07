/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 28-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag54Ej6Rebajas {

 public static void main(String[] args) {
  Rebajas r = new Rebajas();
  Rebajas r1 = new Rebajas(200, 20, 100);

  double v1 = r.getDescubrePorcentaje(100, 79);
  System.out.println("• precioOriginal : " + r.getPrecioOriginal() + " precioActual : " + r.getPrecioActual() + " porcentaje " + r.getPorcentaje());
  System.out.println("• Descubre Porcentaje : " + v1);

  double v2 = r.getDescubrePorcentaje(100, 50);
  System.out.println("• Descubre Porcentaje : " + v2);

  double v3 = r1.getDescubrePorcentaje(200, 50);
  System.out.println("▬ Descubre Porcentaje : " + v3);
 }
}

class Rebajas {

 private double precioOriginal;
 private double precioActual;
 private double porcentaje;

 /**
  *
  */
 public Rebajas() {
  precioOriginal = 0;
  precioActual = 0;
  porcentaje = 100;

 }

 public double getPrecioOriginal() {
  return precioOriginal;
 }

 public double getPrecioActual() {
  return precioActual;
 }

 public double getPorcentaje() {
  return porcentaje;
 }

 /**
  *
  * @param precioOriginal
  * @param precioActual
  * @param porcentaje
  */
 public Rebajas(double precioOriginal, double precioActual, double porcentaje) {
  this.precioOriginal = precioOriginal;
  this.precioActual = precioActual;
  this.porcentaje = porcentaje;
 }

 /**
  *
  * @return precioRebajado
  */
 public double getDescubrePorcentaje(double precioOriginal, double precioActual) {
  this.precioActual = precioActual;
  this.precioOriginal = precioOriginal;
  return (precioOriginal - precioActual) * porcentaje / precioOriginal;
 }
}
