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
public class Clase07 {

 private static int numPersonas;
 public final static int EDAD_MAX = 65;
 private int numero;
 private String nombre;

 public Clase07(int numero, String nombre) {
  this.numero = numero;
  this.nombre = nombre;
  numPersonas++;
 }

 public Clase07() {
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

  Clase07 objeto1 = new Clase07();
  objeto1.modificaDatos("Luis Ruiz", 27);

  System.out.println("El nombre es " + objeto1.getNombre());
  System.out.println("El numero es " + objeto1.getNumero());

  Clase07 objeto2 = new Clase07();
  objeto2.setNumero((objeto2.getNumero() + 1));
  System.out.print("El nombre es : " + objeto2.getNombre());
  System.out.println("y tiene un numero igual a : " + objeto2.getNumero());

 }
}
