/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

/**
 * @see https://netbeans.org/kb/docs/java/junit-intro.html#Exercise_10
 * @author nb
 */
public class Utils {

 private Utils() {
 }

 /**
  * Concatena palabras
  *
  * @param words - Varargs
  * @return cadena String
  */
 public static String concatWords(String... words) {
  StringBuilder buf = new StringBuilder();
  for (String word : words) {
   buf.append(word);
  }
  return buf.toString();
 }

 /**
  * Genera un numero factorial
  *
  * @param number
  * @return
  * @throws IllegalArgumentException
  */
 public static String computeFactorial(int number) throws IllegalArgumentException {
// Si : numero menor 1 
  if (number < 1) {
//   Lanza excepcion : No es un error de computación pero si de logica
   throw new IllegalArgumentException("zero or negative parameter (" + number + ')');
  }
// Reservamos memoria para una variable que tenga una referencia a '1'
  BigInteger factorial = new BigInteger("1");
// Recorremos la lista de objetos
  for (int i = 2; i <= number; i++) { // 2 3 4 5 6 7 8
// Returns a BigInteger whose value is (this * val).
   factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
  }
  return factorial.toString();
 }

 /**
  *
  * @param word
  * @return
  */
 public static String normalizeWord(String word) {
  int i;
  try {
   // Instancia una clase Generica con el nombre entre comillas
//    La normalización es el proceso mediante el cual puede realizar 
//    ciertas transformaciones de texto para que sea reconciliable 
//    de una manera que puede no haber sido antes.
   Class<?> normalizerClass = Class.forName("java.text.Normalizer");
   // Instancia una clase Generica sin referencia
   Class<?> normalizerFormClass = null;
// Instancia un array de clases y almacena en la posicion[0] la clase instanciada 
//   "Devuelve una matriz de objetos de clase que refleja" 
//   todas las clases e interfaces declaradas como miembros 
//   de la clase representada por este objeto de clase "getDeclaredClasses"
   Class<?>[] nestedClasses = normalizerClass.getDeclaredClasses();
// Recorremos 
   for (i = 0; i < nestedClasses.length; i++) {
//    Creamos una nueva clase y almacenamos la posicion[0] del array
    Class<?> nestedClass = nestedClasses[i];
//    Si:La clase 'nestedClass' tiene el mismo nombre que 'java.text.Normalizer$Form'
    if (nestedClass.getName().equals("java.text.Normalizer$Form")) {
//     La clase generica 'normalizerClass' almacena una referencia a 'nestedClass'
     normalizerFormClass = nestedClass;
    }
   }
//    Asegura o Afirma que va a ser un tipo Enum
   assert normalizerFormClass.isEnum();
//   Instanciamos un objeto de la clase methodNormalize que apuntara a una referencia del objeto 'normalizerClass'
   Method methodNormalize = normalizerClass.getDeclaredMethod("normalize", CharSequence.class, normalizerFormClass);
// Instanciamos una variable  
   Object nfcNormalization = null;
// Creamos un array de objetos de tipo 'enum'
   Object[] constants = normalizerFormClass.getEnumConstants();
// Recorremos el array de objetos
   for (i = 0; i < constants.length; i++) {
//  El objeto 'constant' tiene una referencia que apunta a la posicion del objeto 
    Object constant = constants[i];
//  Si: Objeto tiene una cadena que equivale a 'NFC'
    if (constant.toString().equals("NFC")) { // Near Field Communication (NFC) o comunicación de campo cercano
//   La variable 'nfcNormalization' apunta a la misma referencia que 'constant'  
     nfcNormalization = constant;
    }
   }
//invoke : Invoca el método subyacente representado por este objeto Method, 
//en el objeto especificado con los parámetros especificados. 
//Los parámetros individuales se desenvuelven automáticamente 
//para coincidir con los parámetros formales primitivos,
//y tanto los parámetros primitivos como los de referencia están sujetos a 
//las conversiones de invocación de métodos, según sea necesario.
//Regresa cadena con el Еscuchar 
   return (String) methodNormalize.invoke(null, word, nfcNormalization);
  } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
   return null;
  }
 }

}
