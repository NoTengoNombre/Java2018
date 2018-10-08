/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class ParOImpar {

  public static int v;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce un numero : ");

    v = scanner.nextInt();
    do {
      System.out.println("Introduce otro numero : ");
      v = scanner.nextInt();
      try {
      } catch (InputMismatchException ime) {
        System.out.println("Error : Introduce un numero : " + ime);
      }
    } while (v <= 1);

    int resto = v % 2;

    if (resto == 0) {
      System.out.println("es Par");
    } else {
      System.out.println("es ImPar");
    }
  }
}
