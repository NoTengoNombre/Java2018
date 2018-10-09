/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 17
 * @since 08-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class TipoEnumerados {

 public enum DIAS {
  Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
 };

 public static void main(String[] args) {

  DIAS diaActual = DIAS.Martes;
  DIAS diaSiguiente = DIAS.Miercoles;

  Estaciones epoca = Estaciones.Otonio;

  System.out.print("Hoy es : " + diaActual + " y mañana : " + diaSiguiente);
  System.out.println(" del mes de : " + Meses.Noviembre + " en la epoca de " + epoca);

 }

}

enum Meses {
 Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
}
