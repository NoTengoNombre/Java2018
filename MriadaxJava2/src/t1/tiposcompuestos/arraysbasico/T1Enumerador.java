/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see -
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1Enumerador {

 public static void main(String[] args) {

  EstadoCivil ec = EstadoCivil.CASADO;

//  Uso de values();
  EstadoCivil estados[] = EstadoCivil.values();

  int x = (int) (Math.random() * estados.length);
  System.out.println("Valor es : " + x);

  if (estados[x] == EstadoCivil.CASADO) {
   System.out.println("Esta casado : " + x);
  }

  switch (estados[x]) {
   case SOLTERO:
    System.out.println("Esta soltero " + x);
    break;
   case VIUDO:
    System.out.println("Esta viudo " + x);
    break;
   case SEPARADO:
    System.out.println("Esta separado " + x);
    break;
   case DIVORCIADO:
    System.out.println("Esta divorciado " + x);
    break;
   default:
    System.out.println("default : " + estados[x] + " - " + ec);
    break;
  }

//  Uso de valuesOf
  EstadoCivil obtener0 = EstadoCivil.valueOf("CASADO");
  System.out.println("Estado : " + obtener0);

//  Uso de valuesOf
  EstadoCivil obtener1[] = EstadoCivil.values();
  for (EstadoCivil obtener11 : obtener1) {
   System.out.println("Numero del Estado : " + obtener11.ordinal());
  }

 }
}

/**
 * Tipo especial
 *
 * @author MyDevelop
 */
enum EstadoCivil {
 SOLTERO, CASADO, VIUDO, SEPARADO, DIVORCIADO
}
