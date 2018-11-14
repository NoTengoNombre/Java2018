/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer100numerostest;

import dawsevillaejemplos.t4.excepciones.basicas.T4Leer100numeros;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MyDevelop
 */
public class T4Leer100NumeroApuntesTest {

 public T4Leer100NumeroApuntesTest() {
 }

 /**
  * Metodo marcado como una prueba
  */
 @Test
 public void test() {

 }

// @Test
// public void testCadena() {
//  String cadena = T4Leer100numeros.getCadena();
//  String valorEsperado = "cadena";
//  assertEquals(cadena, valorEsperado);
// }
// 
 @Test
 public void testConversion() {
  int conversion = T4Leer100numeros.getConversion("1");
  int valorEsperado = 1;
  assertEquals(conversion, valorEsperado);
 }

}
