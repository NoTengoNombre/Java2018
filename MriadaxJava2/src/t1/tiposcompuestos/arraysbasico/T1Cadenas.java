/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see -
 * @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Cadenas {

 public static void main(String[] args) {
  String cadena = new String("Cadena 1");
  String cadena2 = "Cadena 2";

  System.out.println("Objetos diferentes en cada asignacion");

  String nombre = "Objeto 1"; // objeto 1
  System.out.println(nombre);

  nombre = nombre + " Objeto 2 - Tiene una referencia distinta a Objeto 1 ";
  System.out.println(nombre);

  System.out.println("Valor es : " + "si".equals("si"));
  System.out.println("Valor es : " + "si".equals("no"));

  System.out.println("Longitud: " + "longitud".length());

  System.out.println("Posicion : " + "12345".charAt(0));
  System.out.println("Posicion : " + "12345".charAt(1));
  System.out.println("Posicion : " + "12345".charAt(2));
  System.out.println("Posicion : " + "12345".charAt(3));
  System.out.println("Posicion : " + "12345".charAt(4));
  try {
   System.out.println("Posicion : " + "12345".charAt(5));
  } catch (java.lang.StringIndexOutOfBoundsException siobe) {
   System.out.println("Fuera del limite: " + siobe.getMessage());
  }

//  Si ambas cadenas son iguales - devuelve 0
  System.out.println("iguales".compareTo("iguales"));
//  Si es menor lo que esta a izquierda - negativo
  System.out.println("Cadena derecha mas caracteres : " + "a".compareTo("ab"));
//  Si es mayor lo que esta a la derecha - positivo
  System.out.println("Cadena derecha menos caracteres : " + "ab".compareTo("a"));

  System.out.println("\u0041");

  String patron = "Especificacadena";
  String busqueda = "cadena";

  System.out.println("Si indexOf devuelve -1 no hay coincidencia : " + busqueda.indexOf(patron));
  System.out.println("-------------------");
  System.out.println("Si indexOf devuelve distinto de 0 : ");
  System.out.println("Muestra la posicion de la coincidencia de la cadena : " + patron.indexOf(busqueda));

  System.out.println("1- Se coloca la cadena donde buscar");
  System.out.println("2- Se coloca el valor a buscar");
  String ca = "e";
  System.out.println("La letra 'e' se encuentra en la posicion : " + "cadena".indexOf(ca) + " de la palabra 'cadena'");

  String cad1 = "cadena";
  String cad2 = "e";
  System.out.println("Uso lastIndexOf: " + cad1.lastIndexOf(cad2));

  System.out.println("hay 2 'a' asi que devuelve el valor numerico de la posicion 'a' ");
  String cad1a = "cadena";
  String cad2a = "a";
  System.out.println("Uso lastIndexOf: " + cad1a.lastIndexOf(cad2a));

  String subCadena = "Copia este String";
  System.out.println(subCadena.substring(6));

  String subCadena2 = "Copia este String";
  String miSubCadena = subCadena2.substring(0, 6);
  System.out.println(miSubCadena);
  String subCadena3 = subCadena2.substring(0, subCadena2.length());

  System.out.println(subCadena2.equals(subCadena3));
  System.out.println(subCadena2 == subCadena3);

  if (subCadena2 == subCadena3) {
   System.out.println("Son cadenas iguales ");
  } else {
   System.out.println("No Son cadenas iguales ");
  }

  String comp1 = new String("cadena");
  String comp2 = new String("cadena");

  if (comp1 == comp2) {
   System.out.println("Iguales " + comp1 + " - " + comp2);
  } else {
   System.out.println("No Iguales " + comp1 + " - " + comp2);
  }

  //Nuevo String
  String minuscula = "VALORES".toLowerCase();
  System.out.println(minuscula);

  //Nuevo String
  String mayuscula = "valores".toUpperCase();
  System.out.println(mayuscula);

  String numero = String.valueOf(111);
  System.out.println("Numero total : " + numero);

  String replaza = "CADENA";
  String replaza2 = replaza.replace("A", "X");
  System.out.println("Reemplazado : " + replaza2);

 }
}
