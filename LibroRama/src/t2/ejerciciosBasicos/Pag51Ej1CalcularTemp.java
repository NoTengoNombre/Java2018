/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see Libro
 * @since 28-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag51Ej1CalcularTemp {

 public static void main(String[] args) {
  System.out.println("0 grados Celsius son " + t2.ejerciciosBasicos.Temperatura.celsiusToFarenheit(0) + " grados Farenheit ");
  System.out.println("10 grados Celsius son " + Temperatura.celsiusToFarenheit(10) + " grados Farenheit ");
  System.out.println("20 grados Celsius son " + Temperatura.celsiusToFarenheit(20) + " grados Farenheit ");
  System.out.println("30 grados Celsius son " + Temperatura.celsiusToFarenheit(30) + " grados Farenheit ");
  System.out.printf("0 grados Farenheit son %.2f grados Celsius\n", Temperatura.farenheitToCelsius(0));
  System.out.printf("10 grados Farenheit son %.2f grados Celsius\n", Temperatura.farenheitToCelsius(10));
  System.out.printf("20 grados Farenheit son %.2f grados Celsius\n", Temperatura.farenheitToCelsius(20));
  System.out.printf("30 grados Farenheit son %.2f grados Celsius\n", Temperatura.farenheitToCelsius(30));

 }
}

/**
 *
 * @author Robot
 */
class Temperatura {

 /**
  *
  * @param temp
  * @return
  */
 public static double celsiusToFarenheit(double temp) {
  return (1.8) * temp + 32;
 }

 /**
  *
  * @param temp
  * @return
  */
 public static double farenheitToCelsius(double temp) {
  return (temp - 32) / 1.8;
 }
}
