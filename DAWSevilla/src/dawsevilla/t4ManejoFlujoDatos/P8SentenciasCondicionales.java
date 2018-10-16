/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos;

/**
 * @see ejemplo
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class P8SentenciasCondicionales {

 public int getValores() {
  return (int) (Math.random() * (1 + 20) + 1);
 }

 // al fin y al cabo : esto sigue siendo un metodo
 public static void main(String[] args) {

  P8SentenciasCondicionales p = new P8SentenciasCondicionales();

  // Declaracion e inicialización de variables
  int num_aciertos = p.getValores();
  int num_errores = p.getValores();
  int num_preguntas = 20;
  float nota;
  String calificacion = "";

  System.out.println("Numero de aciertos : " + num_aciertos);
  System.out.println("Numero de errores : " + num_errores);

  //Procesamiento de datos
  nota = ((+num_aciertos - (num_errores / 2)) * 10) / num_preguntas;

  if (nota < 5) {
   calificacion = "INSUFICIENTE";
  } else {
   if ((nota >= 5) && (nota < 6)) {
    calificacion = "suficiente".toUpperCase();
   }
   if ((nota >= 6) && (nota < 7)) {
    calificacion = "bien".toUpperCase();
   }
   if ((nota >= 7) && (nota < 8)) {
    calificacion = "notable bajo".toUpperCase();
   }
   if ((nota >= 8) && (nota < 9)) {
    calificacion = "notable alto".toUpperCase();
   }
   if ((nota >= 9) && (nota <= 10)) {
    calificacion = "sobresaliente".toUpperCase();
   }
  }

  System.out.println("La nota obtenida es de : " + nota);
  System.out.println("Y la calificacion obtenida es de : " + calificacion);

 }

}
