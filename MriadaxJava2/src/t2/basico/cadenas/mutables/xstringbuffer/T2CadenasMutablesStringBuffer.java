/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.cadenas.mutables.xstringbuffer;

/**
 * Clase trabaja con cadenas mutables <br>
 * StringBuffer : Sincroniza <br>
 * StringBuilder : No Sincroniza
 *
 * @see p9
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2CadenasMutablesStringBuffer {

 public static void main(String[] args) {

  String cadena = "Cadena inmutable\""; // Crea un objeto
  String cadenaMinuscula = cadena.toLowerCase(); // Crea otro nuevo objeto para almacenar el valor modificado mediante la funcion
  System.out.println("\"Nuevo objeto : " + cadenaMinuscula);
  System.out.println("• Cadena 1 : " + cadenaMinuscula.hashCode());
  // Me obliga a instancia otro objeto
  String cadenaMayusculas = cadenaMinuscula.toUpperCase();// Crea otro nuevo objeto para almacenar el valor modificado mediante la funcion
  System.out.println("\"Nuevo objeto : " + cadenaMayusculas);
  System.out.println("\"Cantidad : " + cadenaMayusculas.length());
  System.out.println("♦ Cadena 2 : " + cadenaMayusculas.hashCode());

  StringBuffer sbf = new StringBuffer(); // Crea un objeto
  sbf.append("\"Cadena mutable "); // Añado un nuevo elemento "metodo" al mismo 'objeto' sin tener que crear un nuevo objeto
  sbf.append("y con sincronizacion\""); // Añado nuevo elementos al mismo 'objeto'
  System.out.println(sbf);
  System.out.println(sbf.reverse()); // Añado un
  System.out.println("\"Cantidad: " + sbf.length());
  System.out.println("•• Cadena 1 : " + sbf.hashCode());

  StringBuilder sb = new StringBuilder();
  sb.append("\"Cadena mutable ");
  sb.append("y sin sincronizacion\"");
  StringBuilder reverse = sb.append(" !Dar la vuelta! ").reverse();
  System.out.println(reverse);
  System.out.println("Cantidad de caracteres : " + reverse.capacity());
  System.out.println("○○ Cadena 2 : " + sb.hashCode());

 }
}
