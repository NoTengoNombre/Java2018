/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @see p10
 * @since 28-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2GregorianCalendarBasico {

 public static void main(String[] args) {

  Calendar sameDate = new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44);
  System.out.println("Fecha 1 : " + sameDate.getTime());
  Date time = sameDate.getTime();
  System.out.println("Fecha 2 : " + time);

 }
}
