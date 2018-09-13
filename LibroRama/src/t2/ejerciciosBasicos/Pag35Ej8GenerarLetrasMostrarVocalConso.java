/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 24-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag35Ej8GenerarLetrasMostrarVocalConso {

 public static char letra;

 /**
  *
  * @return
  */
 public static char getLetra() {
  return (char) (Math.random() * 26 + 'a');
 }

 /**
  *
  * @param letra
  * @return
  */
 public static char setValor(char letra) {
  if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
   System.out.println("\u001B[32mVocal : " + letra);
   return letra;
  } else {
   System.out.println("\u001B[35mConsonante : " + letra);
   return letra;
  }
 }

 public static void setResultado() {
  letra = setValor(getLetra());
  System.out.println("\u001B[30mValor de la letra : " + letra);
 }

 public static void main(String[] args) {
  for (int i = 0; i < 10; i++) {
   setResultado();
  }
 }

}
