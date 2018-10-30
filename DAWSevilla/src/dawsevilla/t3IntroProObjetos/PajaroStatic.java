/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos;

/**
 *
 * @author MyDevelop
 */
public class PajaroStatic {

 // Atributo de tipo Referencia
 static String nombre;
 // Atributo de tipo valor
 static int posX, posY;

 /**
  * Constructor por defecto
  *
  * Inicializa los atributos a sus valores por defecto
  */
 public PajaroStatic() {
//  this.nombre = null;
//  this.posX = 0;
//  this.posY = 0;
 }

 /**
  * Constructor sobrecargado
  *
  * Cuando cree un objeto con este constructor le voy a dar una serie de
  * parametros que estaran dentro del objeto y que podre recuperar por medio de
  * los metodos de esta clase
  *
  * @param nombre
  * @param posX
  * @param posY
  */
 public PajaroStatic(String nombre, int posX, int posY) {
  this.nombre = nombre;
  PajaroStatic.posX = posX;
  PajaroStatic.posY = posY;
 }

 /**
  *
  * @param nombre
  */
 public static void setNombre(String nombre) {
  PajaroStatic.nombre = nombre;
 }

 /**
  *
  * @param posX
  */
 public static void setPosX(int posX) {
  PajaroStatic.posX = posX;
 }

 /**
  *
  * @param posY
  */
 public static void setPosY(int posY) {
  PajaroStatic.posY = posY;
 }

 /**
  *
  * @return
  */
 public static String getNombre() {
  return nombre;
 }

 /**
  * Devuelve el valor de este objeto : Por eso los static solo tiene 1 COPIA del
  * valor
  *
  * @return posX
  */
 public static double getNumX() {
  return posX;
 }

 /**
  * Devuelve el valor de este objeto : Por eso los static solo tiene 1 COPIA del
  * valor
  *
  * @return posY
  */
 public static double getNumY() {
  return PajaroStatic.posY;
 }

 /**
  * Metodo para calcular la distancia recorrida por el pajaro pasandole los
  * parametros y utilizando un objeto de la propia clase
  *
  * El valor que devuelve el metodo se podra pasar a otro metodo como mensaje
  * 'dato' para realizar otras acciones
  *
  * @param posX
  * @param posY
  * @return
  */
 public static double volar(int posX, int posY) {
  PajaroStatic.posX = posX; // Variables que modifica los atributos 'datos' UNICAMENTE de este objeto 
  PajaroStatic.posY = posY; // Variables que modifica los atributos 'datos' UNICAMENTE de este objeto
  double desplazamiento = Math.sqrt((posX * posY) + (posX * posY)); // Utiliza los parametros "datos" para devolver un valor "dato"
  return desplazamiento;
 }

 public static void main(String[] args) {

  String nom = PajaroStatic.getNombre();
  double numX = PajaroStatic.getNumX();
  double numY = PajaroStatic.getNumY();
  System.out.println("Nombre : " + nom + " Valor x : " + numX + " - Valor y : " + numY);

  PajaroStatic.nombre = "Halcón";
  PajaroStatic.posX = 5;
  PajaroStatic.posY = 6;

  System.out.println("Nombre : " + nombre + " Valor x : " + posX + " - Valor y : " + posY);
  System.out.println("Nombre : " + PajaroStatic.nombre + " Valor x : " + PajaroStatic.posX + " - Valor y : " + PajaroStatic.posY);
  System.out.println("Nombre : " + getNombre() + " Valor x : " + getNumX() + " - Valor y : " + getNumY());

  PajaroStatic.setNombre("Aguila");
  PajaroStatic.setPosX(11);
  PajaroStatic.setPosY(12);

  System.out.println("Nombre " + PajaroStatic.nombre + " Valor x : " + PajaroStatic.getNumX() + " - Valor y : " + PajaroStatic.getNumY());
  System.out.println("Nombre " + PajaroStatic.getNombre() + " Valor x : " + PajaroStatic.getNumX() + " - Valor y : " + PajaroStatic.getNumY());

 }
}
