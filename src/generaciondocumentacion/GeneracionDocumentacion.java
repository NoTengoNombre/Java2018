/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generaciondocumentacion;

import java.util.ArrayList;
import java.util.List;

/**
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 * @see 'clase referencia'
 */
public class GeneracionDocumentacion {

 /**
  * Metodo principal
  *
  * @param args Argumentos en linea de comandos
  */
 public static void main(String[] args) {

  String[] saludo = new String[3];
  saludo[0] = "Bienvenidos al mundo Java";
  saludo[1] = "Por @author ";
  saludo[2] = "y Sun Inc.";

  for (String indice : saludo) {
   System.out.println(indice);
  }

  System.out.println("-----------------");

  List<String> saludos = new ArrayList<>();
  saludos.add("\u001B[33m " + saludo[0]);
  saludos.add("\u001B[33m " + saludo[1]);
  saludos.add("\u001B[33m " + saludo[2]);

  saludos.forEach(p -> {
   System.out.println(p);
  });

 }

}
