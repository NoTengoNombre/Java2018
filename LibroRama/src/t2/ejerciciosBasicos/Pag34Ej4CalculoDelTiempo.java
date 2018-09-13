/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Robot
 */
public class Pag34Ej4CalculoDelTiempo {

 public static int t;
 public static int horas;
 public static int minutos;
 public static int segundos;

 public static void setTiempo() {
  t = (int) (Math.random() * (1 + 10000) + 10);
  System.out.println("Tiempo total : \u001B[35m" + t);
  horas = t / 3600;
  int restoHoras = t % 3600;
  minutos = restoHoras / 60;
  segundos = restoHoras % 60;

  System.out.println("Horas : " + horas + " Minutos : " + minutos + " Segundos : " + segundos);
  System.out.println((horas * 360) + (minutos * 60) + segundos);
 }

 public static void main(String[] args) {

  setTiempo();
 }
}
