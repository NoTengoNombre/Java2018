/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @see p10
 * @since 28-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2Locale {

 public static void main(String[] args) {

  DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("es"));
  TimeZone zonahoraria = df.getTimeZone();
  System.out.println("Zona horaria : " + zonahoraria);
  Calendar calendar = df.getCalendar();
  System.out.println("Cadena : " + calendar.getCalendarType());

 }
}
