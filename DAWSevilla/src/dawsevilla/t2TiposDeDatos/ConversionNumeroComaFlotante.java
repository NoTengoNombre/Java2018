/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 31
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ConversionNumeroComaFlotante {

 public static void main(String[] args) {

  double num = 3.5;
  long round = Math.round(num);
  double ceil = Math.ceil(num);
  double floor = Math.floor(num);
  System.out.println("Redonde hacia el siguiente entero : " + round
          + "\nMinimo entero sea mayor igual a num : " + ceil
          + "\nEntero mayor que sea inferior o igual a num : " + floor);
 }
}
