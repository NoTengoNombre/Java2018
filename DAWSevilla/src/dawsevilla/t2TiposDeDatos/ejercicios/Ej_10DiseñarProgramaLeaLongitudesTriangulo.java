/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos.ejercicios;

import java.util.Scanner;

/**
 * @see @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej_10DiseñarProgramaLeaLongitudesTriangulo {

 public static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

  System.out.println("Fórmula de Herón ".toUpperCase());
  System.out.println("1º Lado");
  double l1 = sc.nextDouble();
  System.out.println("2º Lado");
  double l2 = sc.nextDouble();
  System.out.println("3º Lado");
  double l3 = sc.nextDouble();

  double area;
  final double sp = ((l1 + l2 + l3) / 2);
  double sp1 = (sp - l1);
  double sp2 = (sp - l2);
  double sp3 = (sp - l3);

  area = Math.sqrt(sp * ((sp1) * (sp2) * (sp3)));
  System.out.println("Area : " + area);
 }
}
