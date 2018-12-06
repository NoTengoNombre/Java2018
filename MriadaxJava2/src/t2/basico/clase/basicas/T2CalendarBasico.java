/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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
  Calendar calendar = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta 'Calendar'
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
  Calendar today = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta 'Calendar'

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
  Calendar hoy = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta
  System.out.println("Dia de la Semana (String) : " + hoy.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, localteChino).toUpperCase());
  System.out.println("AM/PM : " + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, localteChino));

  System.out.println("------ Metodo add() ------- ");

  Calendar hoy1 = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta
  hoy1.add(Calendar.DAY_OF_MONTH, 0);
  System.out.println("Fecha de hoy 0 : " + hoy.getTime());

  hoy1 = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta
  hoy1.add(Calendar.DAY_OF_MONTH, 1);
  System.out.println("Fecha de hoy 0 : " + hoy.getTime());

  hoy1.add(Calendar.DAY_OF_MONTH, 20);
  System.out.println("Fecha de hoy 1 : " + hoy.getTime());

  Calendar hoy2 = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta 'Calendar'
  hoy2.add(5, -20);
  System.out.println("Fecha de hoy 2 : " + hoy2.getTime());
  for (int i = 1; i < 29; i++) {
   hoy2 = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta 'Calendar'
   hoy2.add(5, -(i));
   System.out.println(i + " Fecha de hoy 2 : " + hoy2.getTime());
  }

  System.out.println("------ Comparar Fechas -------- ");
  Locale local = Locale.getDefault();
// Devuelve una Instancia de una Clase Abstracta 'Calendar'
  Calendar today3 = Calendar.getInstance(); // devuelve la fecha/hora de 'hoy'

// Establecer la hora local                          //local = 'Mensaje - Argumento' enviado al parametro del metodo getDisplayName
  today3.getDisplayName(Calendar.AM_PM, Calendar.LONG, local);

// Devuelve una Instancia de una Clase Abstracta 'Calendar'
  Calendar after3 = Calendar.getInstance();

// Establecer la hora local                          //local = 'Mensaje - Argumento' enviado al parametro del metodo getDisplayName
  after3.getDisplayName(Calendar.AM_PM, Calendar.LONG, local);

  after3.add(Calendar.HOUR_OF_DAY, 2);
  System.out.println("Fecha de today '2' : " + today3.getTime());

  Calendar before3 = Calendar.getInstance(); // Devuelve una Instancia de una Clase Abstracta 'Calendar'
  before3.add(Calendar.HOUR_OF_DAY, -5);
  System.out.println("Fecha de after '-5' : " + after3.getTime());

  System.out.println(" ------ Horas Fijadas ------ ");
  System.out.println("Today is after today +2 hours " + today3.after(after3));
  System.out.println("Today is before today +2 hours " + today3.before(after3));
  System.out.println("Today is after today -5 hours " + today3.after(before3));
  System.out.println("Today is before today -5 hours " + today3.before(before3));

  System.out.println("-- Dias entre 2 fechas --");
  Calendar aDay = Calendar.getInstance();
  aDay.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale);
  System.out.println("Fecha Actual : " + aDay.getTime());
  aDay.set(Calendar.MONTH, Calendar.MARCH);

  Calendar otherDay = Calendar.getInstance();
  otherDay.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale);
  System.out.println("Fecha Despues : " + otherDay.getTime());
  otherDay.set(Calendar.MONTH, Calendar.FEBRUARY);

  System.out.println(" --------- Pasar Milisegundos/segundos/minutos a Dias -------- ");

  long milisec = (aDay.getTimeInMillis()) - (otherDay.getTimeInMillis());
  System.out.println("Milisegundos : " + milisec);

  float milisegundosSegundos = (milisec / 1000);
  System.out.println("dividir por 1000 para pasar los milisegundos a segundos : " + milisegundosSegundos + "\"");

  float SegundosMinutos = (milisegundosSegundos / 60);
  System.out.println("dividir por 60 segundos para obtener minutos : " + (SegundosMinutos) + "\"");

  float minutosHoras = (SegundosMinutos / 60);
  System.out.println("dividir por 60 minutos para obtener horas : " + (minutosHoras) + "\'");

  float dias = (minutosHoras / 24);
  System.out.println("dividir por 60 minutos para obtener horas : Sin precisión : " + (dias) + "");
  System.out.println("dividir por 60 minutos para obtener horas : Con precisión : " + (Math.round(dias)) + "");

  System.out.println(" --------- Pasar Milisegundos/segundos/minutos a Dias en una sola Linea -------- ");
  long milisecToDays = (aDay.getTimeInMillis() - otherDay.getTimeInMillis());
  System.out.println("Milisegundos : " + milisecToDays);
  int days = (int) (milisecToDays / 1000 / 60 / 60 / 24);
  System.out.println("Days : " + days);

  System.out.println(" ------- Zonas Horarias ------- ");
  Calendar spanishToday = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
  System.out.println("Spanish hour : " + spanishToday.get(Calendar.HOUR_OF_DAY));
  Calendar canadianToday = Calendar.getInstance(TimeZone.getTimeZone("Canada/Central"), Locale.CANADA);
  System.out.println("Canadian hour : " + canadianToday.get(Calendar.HOUR_OF_DAY));

  System.out.println(" ------- Zonas Horarias ------- ");
  Calendar japanToday = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPANESE);
  System.out.println("Japan hour : " + japanToday.get(Calendar.HOUR_OF_DAY));
  Calendar arabianToday = Calendar.getInstance(TimeZone.getTimeZone("Africa/Cairo"), Locale.CANADA);
  System.out.println("Arabian hour : " + arabianToday.get(Calendar.HOUR_OF_DAY));

  System.out.println("Medida componiendo una cadena : ");
  Calendar aToday = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
  System.out.println("Hoy : " + aToday);
  Calendar anotherToday = Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
  System.out.println("Otro dia : " + anotherToday.toString());
  System.out.println(" -- Como cadena -- ");
  String cadena = anotherToday.toString();
  System.out.println("• Calendario : " + cadena);

  System.out.println(" -- Formateado -- ");
  String[] cadenaArray = cadena.split(",");
  for (String elementosCalendario : cadenaArray) {
   System.out.println("♦ " + elementosCalendario);
  }

 }
}
