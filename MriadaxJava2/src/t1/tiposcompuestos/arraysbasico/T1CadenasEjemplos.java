
// Con esto voy navegando a traves de las carpetas del programa hasta llegar al archivo del programa
package t1.tiposcompuestos.arraysbasico;

// Con esto invoco un paquete que tiene una clase para poder usarla
import java.util.Scanner;

/**
 * @see -
 * @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1CadenasEjemplos {

 public static void main(String[] args) {

  Scanner teclado = new Scanner(System.in);
  System.out.println("Teclea dos palabras : ");

  String palabras = teclado.nextLine();
  System.out.println(palabras);
  System.out.println(palabras.toUpperCase());

  palabras = palabras.toLowerCase();
  System.out.println(palabras);

  palabras = "        " + palabras;
  System.out.println(palabras);
  palabras = palabras.trim();
  System.out.println(palabras);

  String str1 = palabras.substring(0, palabras.length());
  System.out.println(str1);
  long num = 9_876_543_211L;
  String str2 = String.valueOf(num);
  System.out.println(str2);

  str2 = str2.replace('1', '0');
  System.out.println(str2);
  teclado.close();
 }
}
