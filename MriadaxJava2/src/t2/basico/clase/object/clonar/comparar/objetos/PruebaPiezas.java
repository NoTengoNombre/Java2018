/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.clonar.comparar.objetos;

/**
 * @see p5
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class PruebaPiezas {

 public static void main(String[] args) {

//"Sin import" - LLamar al package 'DIRECTORIO' y 'SUBDIRECTORIOS' hasta llegar a la 'CLASE'
//DIRECTORIO
//    SUBDIRECTORIO
//          CLASE VariableInstacnia
//                            Reserva y devuelve la posicion de la memoria en el HEAP
//                                 DIRECTORIO
//                                     SUBDIRECTORIO
//                                           CONSTRUCTOR() -> Inicializa los ATRIBUTOS de la CLASE
  java.util.Random aleatorio = new java.util.Random();
  java.util.Scanner teclado = new java.util.Scanner(System.in);

  Liso liso = new Liso();
  System.out.println("[Color : " + liso.getColor() + "][Espesor : " + liso.getEspesor() + "]");

  Liso liso1 = new Liso("Rojo", 1.2F);
  System.out.println("[Color : " + liso1.getColor() + "][Espesor : " + liso1.getEspesor() + "]");
 }
}
