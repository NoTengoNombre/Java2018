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
public class PajaroInstancia {

 // Atributo de tipo Referencia
 String nombre;
 // Atributo de tipo valor
 int posX, posY;

 /**
  * Constructor por defecto
  *
  * Inicializa los atributos a sus valores por defecto
  */
 public PajaroInstancia() {
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
 public PajaroInstancia(String nombre, int posX, int posY) {
  this.nombre = nombre;
  this.posX = posX;
  this.posY = posY;
 }

 /**
  * Devuelve el valor de este objeto : Por eso los static solo tiene 1 COPIA del
  * valor
  *
  * @return posX
  */
 public double getNumX() {
  return posX;
 }

 /**
  * Devuelve el valor de este objeto : Por eso los static solo tiene 1 COPIA del
  * valor
  *
  * @return posY
  */
 public double getNumY() {
  return posY;
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
 public double volar(int posX, int posY) {
  this.posX = posX; // Variables que modifica los atributos 'datos' UNICAMENTE de este objeto 
  this.posY = posY; // Variables que modifica los atributos 'datos' UNICAMENTE de este objeto
  double desplazamiento = Math.sqrt((posX * posY) + (posX * posY)); // Utiliza los parametros "datos" para devolver un valor "dato"
  return desplazamiento;
 }

 public static void main(String[] args) {

//  Objeto 1
  PajaroInstancia loro1 = new PajaroInstancia("Lucy", 50, 50);
  double d = loro1.volar(100, 100);
  System.out.println(""
          + "El desplazamiento ha sido : " + d + ""
          + "\nValor de X : " + loro1.getNumX() + " Valor de Y : " + loro1.getNumY());

//  Objeto 2
  int num1 = 49;
  int num2 = 49;
  PajaroInstancia loro2 = new PajaroInstancia("Ada", num1, num2);
// Le estoy pasando como mensaje 'datos' al metodo : System.out.println() - el OBJETO.metodo(argum1,argum2);
  System.out.println("El desplazamiento ha sido : " + loro2.volar(num1, num2)); // Este metodo recibe 1 mensaje 'COMPUESTO' por 2 variables
  System.out.println("Valores X : " + loro2.getNumX() + " Valores Y : " + loro2.getNumY());

 }
}
