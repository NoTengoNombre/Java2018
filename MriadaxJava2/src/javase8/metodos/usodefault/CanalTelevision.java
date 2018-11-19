/**
 * Este modificador nos permite crear un nuevo método en la interfaz,
 * pero definiendo su implementación por defecto,
 * de tal manera que la operación no requiera modificar
 * las clases que hagan uso de esa interfaz.
 * En el ejemplo anterior, definimos dos nuevos
 * métodos, ambos con modificador default, que
 * implementan la opción de subir y bajar un canal:
 *
 * Cuando usamos interfaces con métodos default, podemos encontrarnos con varias posibilidades a la hora de extenderlos:
 *
 * Que queramos dejar el método default sin cambios, y usarlo tal y como está.
 * Podemos redeclarar el método default, convirtiéndolo en un método abstracto, que necesitaría implementación.
 * Podemos redefinir el método default, lo cual lo sobreescribe y cambiaríamos el comportamiento de este.
 *
 */
package javase8.metodos.usodefault;

/**
 *
 * @see https://www.genbeta.com/desarrollo/java-8-metodos-default
 * @author MyDevelop
 */
public interface CanalTelevision {

 /**
  * Devuelve el canal actual
  *
  * @return un num entero
  */
 int getCanal();

 /**
  * Establece un numero entero
  *
  * @param canal establece el canal que se encuentra
  */
 void setCanal(int canal);

 /**
  * Metodo <b>default</b> se va a redefinir en todas las clases que hereden de
  * esta interface sin tener que ir clase por clase redifiniendolas
  *
  * <b>Es una implementación global para todas las clases.</b>
  */
 default void subirCanal() {
  setCanal(getCanal() + 1);
 }

 /**y
  * Metodo <b>default</b> se va a redefinir en todas las clases que hereden de
  * esta interface sin tener que ir clase por clase redifiniendolas
  *
  * <b>Es una implementación global para todas las clases.</b>
  */
 default void bajarCanal() {
  int canalActual = getCanal();
  if (canalActual > 0) {
   setCanal(getCanal() - 1);
  } else {
   setCanal(0);
  }
 }
}
