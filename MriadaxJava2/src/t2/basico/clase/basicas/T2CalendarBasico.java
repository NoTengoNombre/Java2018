/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * http://chuwiki.chuidiang.org/index.php?title=Clase_Calendar_de_Java
 *
 * @see p10
 * @since 28-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2CalendarBasico {

 public static void main(String[] args) {

//                             Devuelve una instancia de la clase 'Calendar'
  Calendar calendar = Calendar.getInstance();
//                                                  Devuelve un objeto 'Date'
  System.out.println("Fecha Completa : " + calendar.getTime());

  Date time = calendar.getTime();
  System.out.println("Fecha a milliseconds: " + time.getTime());
  System.out.println("Semana dentro de un año : " + calendar.getWeeksInWeekYear());
  System.out.println("Calendario Obtener zona horaria : " + calendar.getTimeZone());
  System.out.println("Calendario Semana del año : " + calendar.getWeekYear());
  calendar.clear();
  System.out.println("Calendario Obtener milisegundos : " + calendar.getTimeInMillis());
  System.out.println("Calendario Obtener tipo de calendario : " + calendar.getCalendarType());

  System.out.println("----------- Metodo Set para Parametrizar los valores ---------------");
//Abstracta "variableInstancia" apunta a una instancia de la clase Abstracta 'Calendar'
  Calendar sameDate = Calendar.getInstance();
  sameDate.set(Calendar.YEAR, 2010);
//  Month. 0 is January , 11 is November
  sameDate.set(Calendar.MONTH, Calendar.AUGUST);
  sameDate.set(Calendar.DAY_OF_MONTH, 23);

//  Either 12-hour clock plus AM/PM
  sameDate.set(Calendar.HOUR, 10);
  sameDate.set(Calendar.AM_PM, Calendar.PM);
//  or 24 hour clock
  sameDate.set(Calendar.HOUR_OF_DAY, 22);

  sameDate.set(Calendar.MINUTE, 36);
  sameDate.set(Calendar.SECOND, 22);
  sameDate.set(Calendar.MILLISECOND, 123);

  System.out.println("Some Date : " + sameDate.getTime());

  System.out.println("----------- Metodo Set para Parametrizar los valores usando Locate ---------------");
  Locale locale = Locale.getDefault(); // Le devuelve la localización actual usando la config JVM
  Calendar today = Calendar.getInstance(); //y

  System.out.println("Year : " + today.get(Calendar.YEAR));

  System.out.println("Month 'Actual' (0 is January) : " + today.get(Calendar.MONTH));

  System.out.println("Month (String) : " + today.getDisplayName(Calendar.MONTH, Calendar.SHORT, locale));

  System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));

  System.out.println("Day of Week (0 is Sunday) : " + today.get(Calendar.DAY_OF_WEEK));

  System.out.println("Day of Week (String) : " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale).toUpperCase());

  System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));

  System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));

  System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));

  System.out.println("24-hour clock : " + today.get(Calendar.HOUR_OF_DAY));

  System.out.println("12-hour clock : " + today.get(Calendar.HOUR));

  System.out.println("AM/PM : " + today.get(Calendar.AM_PM));

  System.out.println("AM/PM : "
          + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));

  System.out.println("Minutes : " + today.get(Calendar.MINUTE));

  System.out.println("Seconds : " + today.get(Calendar.SECOND));

  System.out.println("MiliSeconds : " + today.get(Calendar.MILLISECOND));

  System.out.println("----- FORMATO JAPONES ------ ");

  Locale localteChino = Locale.JAPANESE;
  Calendar hoy = Calendar.getInstance();
  System.out.println("Dia de la Semana (String) : " + hoy.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, localteChino).toUpperCase());
  System.out.println("AM/PM : " + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, localteChino));
 }
}
