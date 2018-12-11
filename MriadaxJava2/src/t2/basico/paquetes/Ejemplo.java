/**
 * PAQUETES : Son Directorios/Carpetas
 *
 */
package t2.basico.paquetes;

/**
 * @see p4
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ejemplo {

// ATRIBUTOS : variables instancia
 private int numero;
 private String cadena;
 private boolean cierto;

 public Ejemplo() {
  this(0, "void", false);
 }

 public Ejemplo(int numero, String cadena, boolean cierto) {
  this.numero = numero;
  this.cadena = cadena;
  this.cierto = cierto;
 }

 public int getNumero() {
  return numero;
 }

 public void setNumero(int numero) {
  this.numero = numero;
 }

 public String getCadena() {
  return cadena;
 }

 public void setCadena(String cadena) {
  this.cadena = cadena;
 }

 public boolean isCierto() {
  return cierto;
 }

 public void setCierto(boolean cierto) {
  this.cierto = cierto;
 }

 @Override
 public String toString() {
  return "[Numero : " + getNumero() + "][Cadena : " + getCadena() + "][Cierto : " + isCierto() + "]";
 }

}

enum Casos {
 UNO, DOS, TRES, CUATRO;
}

