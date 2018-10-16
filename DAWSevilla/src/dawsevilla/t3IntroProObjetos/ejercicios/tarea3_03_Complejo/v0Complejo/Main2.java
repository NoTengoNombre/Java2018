/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v0Complejo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see Complejo
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Main2 {

 public static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

 public static void main(String[] args) throws IOException {

  Complejo miNumero = new Complejo();
  Complejo miNumero2 = new Complejo(12, 2);

  System.out.println("Introduzca un valor para el numero Real");
  double miReal = Double.parseDouble(dato.readLine());
  miNumero.setReal(miReal);
  System.out.printf("El numero real introducido es %.2f\n", miNumero.getReal());

  System.out.println("Introduzca un valor para el numero Imaginario");
  double miImaginario = Double.parseDouble(dato.readLine());
  miNumero.setImaginario(miImaginario);
  
  System.out.printf("El numero Imaginario introducido es %.2f\n", miNumero.getImaginario());
  System.out.println("El numero complejo : " + miNumero.toString() + " sumado a " + miNumero2.toString() + " es igual a : ");

  miNumero.setSumar(miNumero2);

 }
}
