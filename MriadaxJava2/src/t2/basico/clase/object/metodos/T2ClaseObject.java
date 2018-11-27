/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.metodos;

/**
 * @see p17
 * @since 25-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2ClaseObject {

 public static void main(String[] args) {
//Creamos una referencia que no apunta a ningun sitio
  Object objeto;

//Se puede utilizar una variable 'Object' para referenciar cualquier tipo
//En este caso apuntamos a un objeto de la clase MetodosObject();
  objeto = new MetodosObject(10, "Soy Cadena");

//La Referencia 'objetoAbajoArriba' apunta a la REFERENCIA 'objeto' 
//NECESITA HACER UN 'UP-CASTING' Explicito
  MetodosObject objetoAbajoArriba = (MetodosObject) objeto;
//Ahora puedo usar tanto los metodos de la CLASE OBJECT como de la clase MetodosObject
  String cadena = objetoAbajoArriba.getCadena();
  System.out.println("Cadena : " + cadena);
  int numero = objetoAbajoArriba.getNumero();
  System.out.println("Numero : " + numero);

 }
}

class MetodosObject {

 private int numero;
 private String cadena;

 public MetodosObject() {
  this(0, "");
 }

 public MetodosObject(int numero, String cadena) {
  this.numero = numero;
  this.cadena = cadena;
 }

 public String getCadena() {
  return cadena;
 }

 public int getNumero() {
  return numero;
 }

 @Override
 protected Object clone() throws CloneNotSupportedException {
  return super.clone(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public String toString() {
  return "[" + getCadena() + "][" + getNumero() + "]";
 }

}
