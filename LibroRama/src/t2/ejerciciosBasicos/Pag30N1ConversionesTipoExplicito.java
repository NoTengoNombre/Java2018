/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag30N1ConversionesTipoExplicito {

 public static void main(String[] args) {

  byte bx = 5;
  byte by = 2;

  byte bz = (byte) (bx - by);
  System.out.println("byte : " + bz);

  System.out.println("----------------------------");

  int idato = 5;
  byte bdato;
  bdato = (byte) idato;
  System.out.println("bdato : " + bdato);
  System.out.println("idato : " + idato);

  System.out.println("Conversion int a coma flotante");

  float x = 4.5f;
  float y = (float) 3.0;
  System.out.println(" valor de y : " + y);

  System.out.println("----------------------------");

  int i = 2;
  int j = (int) (i * x);
  System.out.println(" valor de j : " + j);
  System.out.println("----------------------------");

  double dx = 2.0;
  double dz = dx * y;
  System.out.println("Producto de float por double : dz = dz * y = " + dz);
  System.out.println("----------------------------");

 }
}
