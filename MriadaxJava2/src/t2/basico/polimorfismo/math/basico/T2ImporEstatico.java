/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.polimorfismo.math.basico;

//             Pkt.Pkt..Clase..ATRIBUTO(Clase InputStream)
import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
import static java.lang.System.in;
import static java.lang.System.out;
//import static java.lang.Math.sqrt;
//import static java.lang.Math.floor;
//import static java.lang.Math.ceil;
import static java.lang.Math.*;

import java.util.Scanner;

/**
 * @see p13
 * @since 29-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2ImporEstatico {

 public static void main(String[] args) {

  System.out.println("Intro un valor ");
  Scanner teclado = new Scanner(in);
  double d = teclado.nextDouble();
  out.println("La raiz de " + d + " es " + sqrt(d));
  out.println("Redondeo hacia arriba : " + d + " es " + ceil(d));
  out.println("Redondeo hacia abajo : " + d + " es " + floor(d));
  out.println("Redondeo de byte es : " + MAX_VALUE + " a " + MIN_VALUE);
 }
}
