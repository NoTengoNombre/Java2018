/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 23-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag33N5ClaseJoven {

 int edad;
 String nivel;
 float ingresos;

 public Pag33N5ClaseJoven() {
  this.edad = 0;
  this.nivel = "";
  this.ingresos = .0F;
 }

 public Pag33N5ClaseJoven(int edad, String nivel, float ingresos) {
  this.edad = edad;
  this.nivel = nivel;
  this.ingresos = ingresos;
 }

 public String getCadena() {
  char l = (char) ((char) (Math.random() * 26) + 'a');
  return String.valueOf(l);
 }

 public void setDatos(int edad, float di, String cad) {

  if ((edad > 30) && (di > 1000)) {
   System.out.println("edad : " + edad);
   System.out.println("dinero : " + di);
  }
 }

 public static void main(String[] args) {

  Pag33N5ClaseJoven cjp = new Pag33N5ClaseJoven();
  int ed = cjp.edad = (int) (Math.random() * (1 + 100) + 1);
  float di = cjp.ingresos = (int) (Math.random() * 10000);
  String cad = cjp.getCadena().toUpperCase();

  System.out.println("\n • edad : " + ed + "\n ♦ dinero : " + di + "\n ♠ cadena : " + cad);

 }
}
