/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.leerTeclado;

import java.util.Scanner;

/**
 * @see pag 34
 * @since 14-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EntradaTecladoScanner {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Leer un num: ");
  int num = sc.nextInt();
  System.out.printf("Obtener un num : %d \n", num);
  String cadena = sc.next();
  System.out.printf("Obtener un String : %s \n", cadena);

 }
}
