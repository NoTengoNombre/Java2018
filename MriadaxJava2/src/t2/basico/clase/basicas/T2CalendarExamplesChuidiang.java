/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.basicas;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @see @since 29-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2CalendarExamplesChuidiang {

}

class CalendarExamples {

 public static void main(String[] args) {

  today();
  setDate();
  getDate(Locale.getDefault());
  getDate(Locale.GERMAN);
  addSubstractDays();
  compareDates();
  daysBetweenDates();
  timeZone();
 }

 private static void timeZone() {
  Calendar spanishToday = Calendar.getInstance(TimeZone.getDefault());
  Calendar canadianToday = Calendar.getInstance(TimeZone.getTimeZone("Canada/Central"));

  System.out.println("Spanish hour " + spanishToday.get(Calendar.HOUR_OF_DAY));
  System.out.println("Canadian hour " + canadianToday.get(Calendar.HOUR_OF_DAY));

  // Available TimeZones
  String[] timeZones = TimeZone.getAvailableIDs();
  System.out.println("Available Timezones " + Arrays.toString(timeZones));
 }

 private static void daysBetweenDates() {
  Calendar aDay = Calendar.getInstance();
  aDay.set(Calendar.MONTH, Calendar.MARCH);
  Calendar otherDay = Calendar.getInstance();
  otherDay.set(Calendar.MONTH, Calendar.FEBRUARY);

  long milisec = aDay.getTimeInMillis() - otherDay.getTimeInMillis();
  long days = milisec / 1000 / 60 / 60 / 24;
  System.out.println("Days : " + days);
 }

 private static void compareDates() {
  Calendar today = Calendar.getInstance();
  Calendar after = Calendar.getInstance();
  after.add(Calendar.HOUR_OF_DAY, 2);

  Calendar before = Calendar.getInstance();
  before.add(Calendar.HOUR_OF_DAY, -5);

  System.out.println("Today is after today+2hours " + today.after(after));
  System.out.println("Today is before today+2hours " + today.before(after));
  System.out.println("Today is after today-5hours " + today.after(before));
  System.out
          .println("Today is before today-5hours " + today.before(before));
 }

 private static void getDate(Locale locale) {
  Calendar today = Calendar.getInstance(locale);
  System.out.println("Year : " + today.get(Calendar.YEAR));
  System.out.println("Month (0 is January): " + today.get(Calendar.MONTH));
  System.out.println("Month (String): "
          + today.getDisplayName(Calendar.MONTH, Calendar.SHORT,
                  locale));
  System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));
  System.out.println("Day of Week (0 is Sunday): "
          + today.get(Calendar.DAY_OF_WEEK));
  System.out.println("Day of Week (String): "
          + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
                  locale));
  System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));
  System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));
  System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));
  System.out.println("24-hour clock : " + today.get(Calendar.HOUR_OF_DAY));
  System.out.println("12-hour clock : " + today.get(Calendar.HOUR));
  System.out.println("AM/PM : " + today.get(Calendar.AM_PM));
  System.out.println("AM/PM : "
          + today.getDisplayName(Calendar.AM_PM, Calendar.LONG,
                  locale));
  System.out.println("Minutes : " + today.get(Calendar.MINUTE));
  System.out.println("Seconds : " + today.get(Calendar.SECOND));
  System.out.println("MiliSeconds : " + today.get(Calendar.MILLISECOND));
 }

 private static void today() {
  Calendar today = Calendar.getInstance();
  System.out.println("today : " + today.getTime());
 }

 private static void setDate() {
  Calendar sameDate = Calendar.getInstance();

  sameDate.set(Calendar.YEAR, 2010);
  // Month. 0 is January, 11 is November
  sameDate.set(Calendar.MONTH, Calendar.AUGUST);
  sameDate.set(Calendar.DAY_OF_MONTH, 23);

  // Either 12-hour clock plus AM/PM
  sameDate.set(Calendar.HOUR, 10);
  sameDate.set(Calendar.AM_PM, Calendar.PM);
  // or 24-hour clock
  sameDate.set(Calendar.HOUR_OF_DAY, 22);

  sameDate.set(Calendar.MINUTE, 36);
  sameDate.set(Calendar.SECOND, 22);
  sameDate.set(Calendar.MILLISECOND, 123);

  System.out.println("Some Date : " + sameDate.getTime());
 }

 private static void addSubstractDays() {
  Calendar today = Calendar.getInstance();
  today.add(Calendar.DAY_OF_MONTH, 20);
  System.out.println("Today plus 20 days : " + today.getTime());

  today = Calendar.getInstance();
  today.add(Calendar.DAY_OF_MONTH, -20);
  System.out.println("Today minus 20 days : " + today.getTime());

 }
}
