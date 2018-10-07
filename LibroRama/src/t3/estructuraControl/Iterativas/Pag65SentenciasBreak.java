/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Iterativas;

/**
 * @see https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Sentencia_break
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag65SentenciasBreak {

 /**
  *
  */
 public static void contarDigitosConBreak() {
  int numero = 4557888;
  int digitos = 0;
  while (numero > 0) {
   numero /= 10;
   digitos++;
   if (digitos == 5) {
    break;
   }
  }
  if (digitos == 5) {
   System.out.println("El numero tiene 5 o mas digitos");
  }
 }

 /**
  *
  */
 public static void contarDigitosSinBreak() {
  int numero = 4557888;
  int digitos = 0;
  while (numero > 0 && digitos < 5) {
   numero /= 10;
   digitos++;
  }
  if (digitos == 5) {
   System.out.println("El numero tiene 5 o mas digitos ");
  }
 }

 public static void main(String[] args) {

  contarDigitosConBreak();
  contarDigitosSinBreak();
 }
}
