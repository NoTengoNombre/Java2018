/**
 * Divide el programa en partes mas pequeñas
 * para solucionar el problema
 *
 */
package dawsevillaejemplos.t4.excepciones.basicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Compuesta
 *
 * Programa que recibe desde teclado un dato entero entre 0 y 100
 *
 * Cuenta las veces que se ha intentado introducir el numero
 *
 * @author MyDevelop
 */
public class T4Leer100numeros {

// Instancia de clase  
 private static BufferedReader br;
 private static int contador;

 public static int getContador() {
  return contador++;
 }

 /**
  * Inicializa y devuelve un objeto para leer la entrada de datos
  *
  * @return Posicion de memoria 'Objeto' donde esta almaceno el 'objeto'
  * InputStreamReader y que esta implementado por la clase final System cuyo
  * atributo tiene un 'InputStream'
  */
 public static String getCadena() {
  // Declaración e Inicialización
  String valor = null;
  br = new BufferedReader(new InputStreamReader(System.in));
  // Procesamiento
  try {
   valor = br.readLine();
   if (isNumber(valor)) {
    return valor;
   } else {
    do {
     System.out.println("Introduce otro valor que no sea una letra");
     getContador();
     valor = br.readLine();
    } while (isNumber(valor) != true);
   }
  } catch (IOException ioe) {
   System.out.println("Error entrada de datos : " + ioe.getMessage());
  }
  // Salida
  return valor;
 }

 /**
  * Devuelve el numero entero
  *
  * @param cadena
  * @return entero
  */
 public static int getConversion(String cadena) {
  // Declaración e Inicialización
  int numero;
  // Procesamiento
  numero = Integer.parseInt(cadena);
  // Salida
  return numero;
 }

 /**
  * Lee la entrada de datos por teclado y devuelve un entero
  *
  * @return numero entero
  */
 public static int getNumero() {
  // Declaracion e inicialización
  int conversion;
  // Procesamiento
  conversion = getConversion(getCadena());
  // Salida
  return conversion;
 }

 /**
  * Comprueba si el valor esta entre los rangos de 0 a 100
  *
  * @return
  */
 public static int getNumeroEntre1y100() {
  int x;
  do {
   System.out.println("Introduce un valor entre 0 y 100");
   x = getNumero();
   if ((x > 0) || (x <= 100)) {
    getContador();
   } else {
    System.out.println("Valor no permitido : " + x);
    getContador();
   }
  } while ((x <= 0) || (x > 100));
  System.out.println("Numero de intentos : " + contador);
  System.out.println("Valor introducido : " + x);
  return x;
 }

 /**
  *
  * @param valor
  * @return
  */
 public static boolean isNumber(String valor) {
  try {
   Integer.parseInt(valor);
   return true;
  } catch (NumberFormatException nfe) {
   System.out.println("Valor introducido no numerico : " + nfe.getMessage());
   return false;
  }
 }

 public static void main(String[] args) {

  getNumeroEntre1y100();

 }
}
