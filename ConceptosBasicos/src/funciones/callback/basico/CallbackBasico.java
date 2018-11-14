/**
 * ¿Hay otra forma de hacerlo? Sí, otra forma es utilizando una clase abstracta,
 * esta clase implementa algunos métodos pero otros los podemos dejar
 * "vacíos" para que alguna clase la extienda y los pueda implementar,
 * les defina la funcionalidad.
 *
 * Evidentemente esta es otra manera de hacer callback,
 * ya que la clase abstracta puede llamar a los métodos
 * cada vez que los necesita (de acuerdo a alguna función esperada),
 * y el contenido de esos métodos (qué es lo que realmente hacen)
 * se define afuera, en la clase que la extiende.
 *
 */
package funciones.callback.basico;

/**
 * @see http://sourcenotas.blogspot.com/2009/07/callback-en-java.html
 * @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class CallbackBasico {

}

/**
 * Crea un metodo que sera compartido por las demas clases y que implementa la
 * clase Mozo
 */
interface CamareroMultilingue {

 /**
  * Metodo para ser implementado por cada clase
  */
 public void pedirCafe();

}

/**
 *
 * @author MyDevelop
 */
class ClaseEsp {

 //interfaz que permite que el pedido sea interpretado afuera de esta clase
 private CamareroMultilingue pedido;
 private boolean hambre; //varible de ejemplo

 /**
  *
  * @param p
  */
 public ClaseEsp(CamareroMultilingue p) {
  pedido = p;
 }

 /**
  * Ejecuta la acción mediante la invocación del metodo del Callback
  */
 public void procesa() {
  hambre = true;
  if (hambre) {
   System.out.println("Buenos dia , un cafe por favor");
   pedido.pedirCafe();
  }
 }
}

class ClaseFra {

 //interfaz que permite que el pedido sea interpretado afuera de esta clase
 private CamareroMultilingue pedido;
 private boolean hambre; //varible de ejemplo

 public ClaseFra(CamareroMultilingue p) {
  pedido = p;
 }

 /**
  * Ejecuta la acción mediante la invocación del metodo del Callback
  */
 public void procesa() {
  hambre = true;
  if (hambre) {
   System.out.println("Bonjour, un café s'il vous plaît?");
   pedido.pedirCafe();
  }
 }
}

class ClaseIng {

 //interfaz que permite que el pedido sea interpretado afuera de esta clase
 private CamareroMultilingue pedido;
 private boolean hambre; //varible de ejemplo

 public ClaseIng(CamareroMultilingue p) {
  pedido = p;
 }

 /**
  * Ejecuta la acción mediante la invocación del metodo del Callback
  */
 public void procesa() {
  hambre = true;
  if (hambre) {
   System.out.println("Hello , Can i have a coffee , please ? ");
   pedido.pedirCafe();
  }
 }
}

class Restaurant {

 public static void main(String[] args) {

//  Clase creada in situ que implementa la interface
  class Mozo implements CamareroMultilingue {

   /**
    * Metodo implmentando que usará las demas clases
    */
   @Override
   public void pedirCafe() {
    System.out.println("El mozo le pide al cocinero : UN JAVA!");
    System.out.println(" ");
   }
  }

  //Notar que la interfaz es publica porque deben conocerla
  //todas las clases que la contienen como propiedad
  //pero! las clases que la implementan pueden ser privadas, internas, etc
  //cada una que implemente puede tener el alcance y la implementacion que quiera
  //siempre que respete los métodos y campos mínimos que propone la interfaz.
  Mozo mozoInterprete = new Mozo();

  //Clientes, al ingresar al bar se le asigna un mozo interprete (en este caso el mismo)
  ClaseEsp ce = new ClaseEsp(mozoInterprete);
  ClaseFra cf = new ClaseFra(mozoInterprete);
  ClaseIng ci = new ClaseIng(mozoInterprete);

  //acción! se procesa el pedido de los clientes
  ce.procesa();
  cf.procesa();
  ci.procesa();
 }
}
