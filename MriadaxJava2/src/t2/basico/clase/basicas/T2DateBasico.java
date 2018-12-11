/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.util.Date;

/**
 * @see p10
 * @since 28-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2DateBasico {

 public static void main(String[] args) {

  Date fecha1 = new Date(2000, 0, 12);
  Date fecha2 = new Date(1984, 6, 12);
  System.out.println("Fecha : " + fecha1);
  System.out.println("Fecha : " + fecha1.toString());
  System.out.println(fecha1 + " antes " + fecha2 + " : " + fecha1.before(fecha2));
  System.out.println(fecha1 + " despues " + fecha2 + " : " + fecha1.after(fecha2));
  System.out.println("Compara Fechas : " + fecha1.compareTo(fecha2));
  System.out.println("Compara Fechas : " + fecha2.compareTo(fecha1));

 }
}
