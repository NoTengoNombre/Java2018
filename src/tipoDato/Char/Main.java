/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoDato.Char;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Main {

 public static void main(String[] args) {

  TipoChar tc = new TipoChar();
  String cadena = tc.toString();
  System.out.println(cadena);

//  char 'a' se convierte en numero
  char a = 'a';
//  1º Incializa 
//  2º Hace la comprobacion
//  3º luego muestra el valor de 'a' dentro de la salida 
//-----------------------------  3º hace el incremento
//  4º vuelta a empezar
  for (int i = 97; i < 130; i++, a++) {
   System.out.println(a);
//   System.out.println(++a);
  }

 }
}
