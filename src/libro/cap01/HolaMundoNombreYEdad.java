/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class HolaMundoNombreYEdad {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa su nombre : ");

    String nom = scanner.nextLine();

    int edad = scanner.nextInt();

    System.out.println("Nombre : " + nom);
    System.out.println("Edad : " + edad);

    if (nom.contains("pepe") && (edad == 20)) {
      System.out.println(
              "Hola " + nom + " "
              + ": ya tienes : " + edad);
    } else {
      System.out.println("No eres pepe y tienes " + edad);
    }

  }
}
