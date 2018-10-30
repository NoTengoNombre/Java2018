/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos;

/**
 * @see @since 30-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class SalidaPorPantalla {

 public static void main(String[] args) {

  char parametro = 'A';
  String s = "texto";
  int numero = 10;
  double ddecimal = 1.1;
  float fdecimal = 1.1F;

  System.out.printf("- Caracter %c \"%c\" \n", 'a', parametro);
  System.out.printf("- Entre \"%s\" de \"%s\" \n", "cadenas", s);
  System.out.printf("- Numero entero \"%d\" \n", numero);
  System.out.printf("- Numero decimal como double %f \n", ddecimal);
  System.out.printf("- Numero decimal como float %f \n", fdecimal);
  System.out.printf("- Numero float %f \n", fdecimal);
  System.out.printf("- Numero float %e \n", fdecimal);

  System.out.println("\n- Mostrar valores -");
  System.out.printf("- Numero decimal : %,.2f\n", fdecimal);
  System.out.printf("- Numero decimal : %,.2f\n", 12456.876543);
  System.out.printf("- Numero decimal : %,18.2f\n", 82456.876543);
  System.out.printf("\nColor %s,\nNumero %d,\nReal %9.2f", "Cadena", 123456, fdecimal);
  System.out.printf("\n\t Cadenas %s \n", "cadena");

 }
}
