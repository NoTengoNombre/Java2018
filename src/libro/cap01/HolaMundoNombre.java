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
public class HolaMundoNombre {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa su nombre : ");

    String nom = scanner.nextLine();

    System.out.println("Hola Mundo : " + nom);

    if (nom.contains("pepe")) {
      System.out.println("Hola pepe : qué tal ");
    } else {
      System.out.println("No eres pepe");
    }

  }
}
