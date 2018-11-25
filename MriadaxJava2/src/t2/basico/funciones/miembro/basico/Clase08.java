/**
 * Las CLASES representan ENTIDADES(tablas)
 * Los OBJETOS representan REGISTROS
 * Las VARIABLES DE INSTANCIA representan CAMPOS
 *
 *
 */
package t2.basico.funciones.miembro.basico;

/**
 * @see p23
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase08 {

 private static int numPersonas;
 public final static int EDAD_MAX = 65;
 private int numero;
 private String nombre;

 public Clase08(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
  numPersonas++;
 }

 public Clase08() {
//  this(new Random().nextInt(100), "anonimo");
  this(1, "anonimo");
  System.out.println("- Dentro del objeto : " + this);
  numPersonas++;
 }

 public static int getNumPersonas() {
  return ++numPersonas;
 }

 public int getNumero() {
  return numero;
 }

 public void setNumero(int numero) {
  this.numero = (numero > EDAD_MAX) ? EDAD_MAX : numero;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void modificaDatos(String nombre, int num) {
  setNombre(nombre);
  setNumero(numero);
 }

 @Override
 public String toString() {
  return "Nombre : " + getNombre() + " - Numero : " + getNumero();
 }

 public static void main(String[] args) {

  Clase08 objeto1 = new Clase08(52, "Anacleto Agente Secreto");
  Clase08 objeto2 = new Clase08(57, "Mortadelo y Filemon");

  System.out.println("Objeto1 : " + objeto1.toString());
  System.out.println("Objeto2 : " + objeto2.toString());

 }
}
