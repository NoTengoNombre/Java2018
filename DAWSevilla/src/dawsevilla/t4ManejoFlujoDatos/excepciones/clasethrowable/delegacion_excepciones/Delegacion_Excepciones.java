/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.excepciones.clasethrowable.delegacion_excepciones;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @see -
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Delegacion_Excepciones {

 public int leeaño(BufferedReader lector) throws IOException, NumberFormatException {
  String linea = lector.readLine();
  return Integer.parseInt(linea);
 }

 public static void main(String[] args) {

 }
}
