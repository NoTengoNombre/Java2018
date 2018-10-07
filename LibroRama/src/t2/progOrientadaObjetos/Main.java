/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class Main {

 public static void main(String[] args) {

  Constantes con = new Constantes();

  System.out.println(""
          + "• PI: " + con.getPI()
          + "\n • Cadena: " + con.getCadena()
          + "\n • Caracteres: " + con.getCaracteres()
          + "\n • Cadena1: " + con.getCadena1());

  System.out.println("-----------------------------");

  Suma suma = new Suma();
  System.out.println("• Suma : " + suma.toString());

  int numero1 = suma.getN1();

  Suma2 suma2 = new Suma2();
  System.out.println("• Suma : " + suma2.toString());

  int numero2 = suma2.getN4();

  int contandor = 1;

  while (contandor <= 10) {
   if (numero1 > numero2) {
    System.out.println("Veces " + contandor + " numero1 : " + numero1);
   } else {
    System.out.println("Veces " + contandor + " numero2 : " + numero2
    );
   }
   contandor++;
  }
 }
}
