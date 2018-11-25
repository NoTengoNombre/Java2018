/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.ejercicio.n3.letra.dni;

import java.util.Scanner;

/**
 * @see -
 * @since 21-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Ejercicio2LetraDNI {

 public static void main(String[] args) {
  LetraDNI ldni = new LetraDNI();
  ldni.setNumeroDNI();
 }
}

class LetraDNI {

 private int numero;
 private int numeroTotal;
 private static int numeroDNI;
 private static int indice;
 private final int[] NUMALMACENADOS = new int[8];

 private char[] letras
         = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
          'D', 'X', 'B', 'N', 'J', 'Z', 'S',
          'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

 public int getLongitudNumero() {
  return numero;
 }

 public int getNumeroTotal() {
  return numeroTotal;
 }

 public int getNumeroDNI() {
  return numeroDNI;
 }

 public int getIndice() {
  return (++indice);
 }

 public int[] getArrayNumeros() {
  return NUMALMACENADOS;
 }

 public char setLetra(int num) {
  char letra = letras[num];
  return letra;
 }

 public int getNumero() {
  Scanner teclado = new Scanner(System.in);
  System.out.println("Introduce el " + (getIndice()) + "º numero");
  numero = teclado.nextInt();
  if ((numero <= 0) || (numero > 9)) {
   do {
    System.out.println("Numero " + numero + " no es valido - Introduce otro numero entre 1 y 9");
    numero = teclado.nextInt();
   } while ((numero <= 0) || (numero > 9));
  }
  System.out.println("Numero Introducido : " + numero);
  return numero;
 }

 public int[] getSumaNumeros() {
  for (int i = 0; i < NUMALMACENADOS.length; i++) {
   NUMALMACENADOS[i] = getNumero();
  }
  return NUMALMACENADOS;
 }

 public String getNumeroToString() {
  String almacenaCadena = "";
  getSumaNumeros();
  int[] numeros = new int[getArrayNumeros().length];
  String[] cadena = new String[numeros.length];

  for (int i = 0; i < getArrayNumeros().length; i++) {
   cadena[i] = String.valueOf(getArrayNumeros()[i]);
  }
  for (String valor : cadena) {
   almacenaCadena += valor;
  }
  return almacenaCadena;
 }

 public int getCadenaNumero() {
  String numeroToString = getNumeroToString();
  return Integer.parseInt(numeroToString);
 }

 public int getValorDNI() {
  int resultado;
  int totalNum = getCadenaNumero();
  System.out.println("Valor total : " + totalNum);
  resultado = (totalNum % 23);
  return resultado;
 }

 public void setNumeroDNI() {
  System.out.println("Letra : " + setLetra(getValorDNI()));
 }

}
