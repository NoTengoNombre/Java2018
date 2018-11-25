/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.polimorfismo;

/**
 * Subclase
 *
 * @see @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class TuboPoli extends PiezaPoli {

 //Atributos de INSTANCIA
 private float calibre;
 private String medida;

 //Atributos de CLASE
 private static int numero;

 public TuboPoli() {
  super(0, null);
  this.calibre = 0.0F;
  this.medida = "Sin Medida";
 }

 /**
  * Constructor SobreCargado
  *
  * @param calibre
  * @param medida
  * @param numero
  * @param nombre
  */
 public TuboPoli(float calibre, String medida, int numero, String nombre) {
  super(numero, nombre); // Hereda 2 atributos de la SuperClase Pieza mediante su Propio Constructor
  this.calibre = calibre;
  this.medida = medida;
 }

 public float getCalibre() {
  return calibre;
 }

 public String getMedida() {
  return medida;
 }

 public int getCantidad() {
  return numero;
 }

 @Override
 public void vender(int cantidad) {
  numero++;
  System.out.println("○ VENDIDO TUBO " + this.getNombre() + " - " + getCantidad());
 }

 @Override
 public String toString() {
  return "○ Tubo [calibre : " + getCalibre() + "][medida : " + getMedida() + "] - " + super.toString();
 }

}
