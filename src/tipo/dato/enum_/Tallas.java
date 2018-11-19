/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo.dato.enum_;

import java.util.Scanner;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class Tallas {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Introduce una talla");
  String entrada = sc.next().toUpperCase();
  Uso_Tallas talla = Enum.valueOf(Uso_Tallas.class, entrada);
  String valor = talla.dame_Abreviatura();
  System.out.println("Talla : " + valor);

  System.out.println(".---------------------------.");

  System.out.println("Introduce una talla");
  String entrada2 = sc.next().toUpperCase();
  Uso_Tallas2 tallas2 = Enum.valueOf(Uso_Tallas2.class, entrada2);
  System.out.println("Talla 2 : " + tallas2.dame_Abreviatura2());

 }
}
