/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructuras.condicionales.multiples;

/**
 * @see @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pa10SwitchNotasExamen {

 static int getNumeroAle() {
  return (int) (Math.random() * (1 + 19) + 1);
 }

 public static void main(String[] args) {

  //Declaracion variables
  final int num_preguntas = 20;
  int num_aciertos = getNumeroAle();
  int num_errores = getNumeroAle();
  int nota;
  String calificacion;

  // Procesamiento
  nota = (+(num_aciertos - (num_errores / 2)) * 10) / num_preguntas;

  System.out.println("Nota : " + (+nota));
  switch (nota) {
   case 5:
    calificacion = "suficiente".toUpperCase();
    break;
   case 6:
    calificacion = "bien".toUpperCase();
    break;
   case 7:
    calificacion = "bien alto".toUpperCase();
    break;
   case 8:
    calificacion = "notable bajo".toUpperCase();
    break;
   case 9:
    calificacion = "notable alto".toUpperCase();
    break;
   case 10:
    calificacion = "sobresaliente".toUpperCase();
    break;
   default:
    calificacion = "suspenso".toUpperCase();
    break;
  }

// Salida de informacion 
  System.out.println("Nota final : " + calificacion);

 }
}
