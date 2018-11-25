/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.repaso; // paquete 'ruta de directorios' donde se encuentra Clase01R.java

import java.util.Random;
import java.util.Scanner; // para utilizar Scanner invoca la Clase mediante el paquete

/**
 * @see p12
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase01R {

 private int numero; // variable de instancia privada de tipo PRIMITIVO
 private String nombre; // variable de instancia privada de tipo REFERENCIA

 /**
  * Establece por defecto una incialización a los ATRIBUTOS del objeto que
  * instancie con el constructor
  *
  */
 public Clase01R() {
// Le doy valores por defecto a los 'ATRIBUTOS' de los objetos que se instancien con el constructor vacio
  this((new Random().nextInt(100) >= 50) ? 1 : 2, "Anonimo"); // Puedo meterle un operador ternario y hace comprobaciones
 }

 /**
  *
  *
  * @param numero
  * @param nombre
  */
 public Clase01R(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
 }

 /**
  * Metodo de acceso publico
  */
 public void definirDatos() {
  Scanner teclado = new Scanner(System.in); // Objeto para establecer conexion con la entrada de datos
  System.out.println("Teclea un nombre");
  nombre = teclado.nextLine(); // Objeto invoca un metodo para captura entrada de datos y lo almacena en una variable de instancia
  System.out.println("Teclea un numero");
  numero = teclado.nextInt(); // Objeto invoca un metodo para captura entrada de datos y lo almacena en una variable de instancia
 }

 /**
  * Metodo de acceso
  */
 public void leerDatos() {
  System.out.println("Nombre : " + nombre);
  System.out.println("Numero : " + numero);
 }

 public static void main(String[] args) {

  Clase01R objeto1 = new Clase01R(); // Crea una Instancia de la clase para invocar los metodos propios de la clase
  objeto1.definirDatos(); // Instancia invoca el metodo para ejecutar su acción 
  objeto1.leerDatos(); // Instancia invoca el metodo para mostrar los datos
  Clase01R referencia = objeto1; // Se crea una 'nueva referencia-INSTANCIA' que apunta a la posición de memoria 'HEAP' donde estan almacenados los valores
  referencia.leerDatos(); // Instancia invoca el metodo para mostrar los datos
 }
}
