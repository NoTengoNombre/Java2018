/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.util.TimeZone;

/**
 * @see http://chuwiki.chuidiang.org/index.php?title=Clase_Calendar_de_Java
 * @since 29-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2TodasZonasHorarias {

 public static void main(String[] args) {
  System.out.println(" ------- Zonas Horarias Todo el Mundo ------- ");
  String[] timeZones = TimeZone.getAvailableIDs();
  for (int i = 0; i < timeZones.length; i++) {
   System.out.println(i + " • Zona horaria : " + timeZones[i]);
  }
 }
}
