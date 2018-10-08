/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.animales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @see @since 06-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MiPrograma {

 private static void leerArchivo(String miArchtxt) throws IOException {
  String cadena;
  FileReader f = new FileReader(miArchtxt);
  try (BufferedReader b = new BufferedReader(f)) {
   while ((cadena = b.readLine()) != null) {
    System.out.println(cadena);
   }
  }
 }

 public static void main(String[] args) {

  System.out.println("------------------");
  Animal a1 = new Ardilla("roedores esciuromorfos", "Rojizo", "España", 2, 2.2, true, " Sciuridae", 1.20);
  System.out.println("Ardilla 1º - " + a1.toString());

  System.out.println("------------------");
//  Animal a2 = new Gato("Felis silvestris catus", "Blanco", "America", true);
  Animal a2 = new Gato("Felis silvestris catus", "Blanco", "America", true, 4, 4.3, true, "Siames", 3.30);
  System.out.println("Gato 1º - " + a2.toString());

  System.out.println("------------------");
  Animal a3 = new Perro("Canis lupus familiaris", "Blanco", "America", true, 9, 17.2, true, "Dalmata", 13.2, true);
  System.out.println("Perro 1º - " + a3.toString());

  System.out.println("------------------");
  Perro miPerro = new Perro("Pequines", 2.1);
  System.out.println("Perro 2º - " + miPerro.toString());

  while ((Math.random() * (1 + 10) + 1) > 3) {
   miPerro.isJuega();
  }

  int[] listaNumeros = {2, 3, 4, 5};

  System.out.println("Perro : " + miPerro.getNombre());

  String numero = "8";

  int z = Integer.parseInt(numero);

  Scanner sc = new Scanner(System.in);

  System.err.println("Leer archivo desde teclado : ");
  try {
   leerArchivo(sc.nextLine());
  } catch (IOException ex) {
   System.out.println("Error : " + ex.getMessage());
  }

 }

}
