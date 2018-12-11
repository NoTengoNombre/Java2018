/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.polimorfismo.math.basico;

import static java.lang.Math.pow;

/**
 * @see p11
 * @since 29-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2ClaseMathBasic {

 public static void main(String[] args) {

  double potencia = pow(10, 3);
  System.out.println("Invocar a la funcion directamente : " + potencia);

  double potenciaRutaCompleta = java.lang.Math.pow(10, 3);
  System.out.println("Invocar a la funcion desde el paquete : " + potenciaRutaCompleta);

  System.out.println(" -------------- ");
  System.out.println("Numero E : " + Math.E);
  System.out.println("Numero PI : " + Math.PI);

  System.out.println(" -------------- ");
  System.out.println("Math valor absoluto : " + Math.abs(-11.1));
  System.out.println("Math arcocoseno : " + Math.acos(0.4));
  System.out.println("Math redondeo arriba : " + Math.ceil(0.14));
  System.out.println("Math redondeo abajo 0.14 : " + Math.floor(0.14));
  System.out.println("Math redondeo abajo -0.14 : " + Math.floor(-0.14));
  System.out.println("Math exponente : " + Math.exp(1));
  System.out.println("Math exponente : " + Math.exp(-1));
  System.out.println("Math exponente : " + Math.pow(10, 2));
  System.out.println(" -------------- ");

  for (int i = 1; i <= 20; i++) {
   double name = (int) (Math.random() * (1 + 10) + 1);
   System.out.println(i + " - Numero aleatorio : " + name);
   if (i == 10) {
    System.out.print(" -------------- ");
    System.out.println();
   }
  }

 }
}
