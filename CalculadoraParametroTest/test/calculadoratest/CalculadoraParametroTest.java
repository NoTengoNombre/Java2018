/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import calculadoraparametrotest.CalculadoraParametro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author MyDevelop
 *
 * 1a- @RunWith(value = Parameterized.class) - Se usa para decirle a la clase
 * que para las pruebas con parametros use el CONSTRUCTOR y los parametros que
 * tiene declarados
 *
 * 2a- Cuando se ejecute este RunWith con este Parameterized lo que va a hacer
 * es buscar la anotacion @Parameters y que sea compatible
 */
@RunWith(value = Parameterized.class) // @Parameterized "llamara a" @Parameters
public class CalculadoraParametroTest {

 // Son los parametros que va a usar el constructor para hacer las pruebas parametrizadas
 private int a, b, exp;

 /**
  * Necesitamos un metodos especial - que devuelva algo iterable como una
  * coleccion , una lista
  *
  * 1b- Iterable - Imaginarlo como un Arraylist - va a tener un arraylist de
  * objetos
  *
  * 2b- ArrayList que va a contener un array de objetos y tiene los parametros
  * del constructor para hacer la prueba Parametrizada por Constructor
  *
  * @return
  */
// @Parameters // cuando se ejecute    
 public static Iterable<Object[]> getData() {
// Crear un lista de objetos para almacenar los parametros
  List<Object[]> obj = new ArrayList<>();
// Valores que quiero que corra con los mismo parametros que el constructor
// Prueba 1           num1+num2=resultado
  obj.add(new Object[]{3, 1, 4});
// Prueba 2           num1+num2=resultado
  obj.add(new Object[]{2, 3, 5});
// Prueba 3           num1+num2=resultado
  obj.add(new Object[]{3, 3, 6});
  return obj; // Devuelve un objeto lista donde adquiere los datos para las pruebas
 }

 /**
  * Igual que el anterior pero con una Matriz de objetos para hacer las pruebas
  *
  * @return Lista de objetos para hacer pruebas
  */
 @Parameters
 public static Iterable<Object[]> getDataAsList() {
  return Arrays.asList(new Object[][]{
   //num1+num2=result
   {3, 1, 4},
   //num1+num2=result
   {2, 3, 5},
   //num1+num2=result
   {3, 3, 6}
  });
 }

 /**
  * Creamos un constructor con 3 variables para las pruebas
  *
  * Quien llama a este constructor es el JUnit
  *
  * 3a - El constructor va a usar la lista de objetos del metodo Iterable para
  * hacer las pruebas
  *
  * @param a
  * @param b
  * @param exp
  */
 public CalculadoraParametroTest(int a, int b, int exp) {
  this.a = a;
  this.b = b;
  this.exp = exp;

 }

 /**
  * Pruebas Unitarias con varios parametros que los coge del constructor
  * parametrizado y que usa el metodo getDataAsList
  */
 @Test
 public void testAdd() {
  CalculadoraParametro calc = new CalculadoraParametro();
  int result = calc.add(a, b);
  Assert.assertEquals(exp, result);
 }
}
