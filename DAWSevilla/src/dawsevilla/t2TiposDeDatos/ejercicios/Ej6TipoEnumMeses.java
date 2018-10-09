/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos.ejercicios;

/**
 * @see @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej6TipoEnumMeses {

 public enum Epocas {
  Primavera, Verano, Otoño, Invierno
 }

 private Meses mes;

 /**
  *
  * @return mes
  */
 public Meses getMes() {
  return mes;
 }

 /**
  *
  * @param mes
  */
 public void setMes(Meses mes) {
  this.mes = mes;
 }

 public static void main(String[] args) {

  Ej6TipoEnumMeses tem = new Ej6TipoEnumMeses();
  tem.setMes(Meses.Marzo);
  Meses mesEscogido = tem.getMes();
  System.out.println("Soy Mes : " + mesEscogido);
  System.out.println("Soy Epoca : " + Epocas.Primavera);
  System.out.println("Soy Mes : " + Meses.Marzo);

  System.out.println("------ Todos los meses ------ ");
  int c = 1;
  for (Meses indice : Meses.values()) {
   System.out.println(c++ + " - " + indice.toString());
  }

 }
}

enum Meses {
 Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
}
