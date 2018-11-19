/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see -
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1TipoWrapperMetodosConversion {

 public static void main(String[] args) {

  int numero = Integer.parseInt("89789");
  System.out.println("Numero convertido : " + numero);

  Double d = 897_789_456E14;
  String strd = d.toString();
  System.out.println(strd);

  String cadena = "'cadena de java'";
  String cadena1 = cadena + " tiene de longitud : " + Long.toString(cadena.length());
  System.out.println("" + cadena1);

  String octal = Long.toOctalString(4567895689L);
  System.out.println("Convertir a octal : " + octal);
  String binario = Integer.toBinaryString(44444);
  System.out.println("Convertir a binario : " + binario);
  String hexadecimal = Integer.toHexString(65535);
  System.out.println("Convertir a hexadecimal : " + hexadecimal);
  
  
  

 }
}
