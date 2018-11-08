/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitsimpleclase;

/**
 *
 * @author MyDevelop
 */
public class JUnitSimpleClase {

 public static char getCalculaLetra(int dni) {
  String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
  int modulo = dni % 23;
  char letra = juegoCaracteres.charAt(modulo);
  return letra;
 }

 public static int getNumeroDNI() {
  int name = (int) (Math.random() * 10000000);
  return name;
 }

 public static String getNumeroCompleto(int numero) {
  char letra = getCalculaLetra(numero);
  String num = String.valueOf(numero);
  String le = String.valueOf(letra);
  String numeroLetra = num + le;
  return numeroLetra;
 }

 public static void main(String[] args) {

  System.out.println(getNumeroCompleto(getNumeroDNI()));

 }
}
