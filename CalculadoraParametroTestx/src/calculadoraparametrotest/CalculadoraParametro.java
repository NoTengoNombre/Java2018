/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraparametrotest;

/**
 * @see
 * https://www.youtube.com/watch?v=e6tOIIJXUk0&index=7&list=PLTd5ehIj0goML37B7s9I9iN2zhJCfxJBC
 *
 * @author MyDevelop
 */
public class CalculadoraParametro {

 /**
  * Almacena el valor
  */
 private int ans;

 /**
  * Constructor
  */
 public CalculadoraParametro() {
  ans = 0;
 }

 /**
  * Sumar 2 numeros y devolverlo en la memoria
  *
  * @param a
  * @param b
  * @return
  */
 public int add(int a, int b) {
  ans = (a + b);
  return ans;
 }

 /**
  * Restar 2 numeros y devolverlo en la memoria
  *
  * @param a
  * @param b
  * @return
  */
 public int sub(int a, int b) {
  ans = (a - b);
  return ans;
 }

 /**
  * Sumatoria al numero en memoria
  *
  * @param v
  * @return
  */
 public int add(int v) {
  ans += v; // ans = ans + v;
  return ans;
 }

 /**
  * Restar al numero en memoria
  *
  * @param v
  * @return
  */
 public int sub(int v) {
  ans -= v; // ans = ans - v;
  return ans;
 }

 /**
  * Divide entre 0
  *
  * @param a
  * @param b
  *
  * @return
  */
 public int div(int a, int b) {
  // Si es igual a 0 
  if (b == 0) {
//   Lanza excepcion
   throw new ArithmeticException("No puedes dividir por 0");
  }
  ans = (a / b);
  return ans;
 }

 /**
  * Devuelve el numero en memoria
  *
  * @return atributo memoria
  */
 public int ans() {
  return ans;
 }

 /**
  * Metodo para probar el @After
  *
  */
 public void clear() {
  ans = 0;
 }

}
