/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.modificadores.finales;

/**
 * @see -
 * @since 25-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2EjemploModificadorFinal {

 public static void main(String[] args) {

// Crear una variable de instancia final 
  final CLASEFINAL cf = new CLASEFINAL();
  System.out.println("Soy una cadena : " + cf.toString());
 }
}

/**
 * CLase que NADIE podra heredar de ELLA
 *
 * @author MyDevelop
 */
final class CLASEFINAL {

 /**
  * Atributo : Variable de Instancia : Almacena valor
  */
 private int valor;

 /**
  * CONSTANTE : Nunca se podra usar en el CONSTRUCTOR
  */
 final private static int MAX_ELEMENTOS1 = 100;

 /**
  * CONSTANTE : Nunca se podra usar en el CONSTRUCTOR
  */
 private final static int MAX_ELEMENTOS2 = 200;

 /**
  * CONSTANTE : Nunca se podra usar en el CONSTRUCTOR
  */
 final private String miTipo1 = "EJEMPLO1";

 /**
  * CONSTANTE : Nunca se podra usar en el CONSTRUCTOR
  */
 private final String miTipo2 = "EJEMPLO2";

 /**
  * Constructor basico : Inicializa los valores
  */
 public CLASEFINAL() {
  this(5);
 }

 /**
  * Este Constructor usa una variable de instancia para almacenar los valores
  * que se asigne en el constructor cuando se instancie una variable de
  * instancia
  *
  * @param valor
  */
 public CLASEFINAL(int valor) {
  this.valor = valor;
 }

 /**
  * Funcion que tiene por variable local un elemento privado
  */
 public void haceAlgo() {
  final int numero = 12; // CONSTANTE LOCAL
//  Codigo de la funcion
 }

 /**
  *
  * @return
  */
 @Override
 final public String toString() {
  return "Metodo Anulado Final";
 }

}
