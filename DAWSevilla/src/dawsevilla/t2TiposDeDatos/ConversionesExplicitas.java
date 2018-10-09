/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 29
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ConversionesExplicitas {

 public static void main(String[] args) {

  byte bdenominador_ = 10;
  byte bnumerador_ = 2;
  byte res = (byte) (int) (bdenominador_ / bnumerador_);
  System.out.println("Valor entero : " + res);

  byte bdenominador = 10;
  byte bnumerador = 3;
  double res1 = (bdenominador / bnumerador);
  System.out.println("Valor decimal : " + res1);

  byte bdenominador1 = 4;
  byte bnumerador1 = 4;
  byte division = (byte) (bdenominador1 / bnumerador1);
  System.out.println("Valor decimal : " + division);

  System.out.println("------------------------------");
  System.out.println("La suma en Java entre bytes se realiza con numeros binarios \n"
          + "\u001B[33m Números 01100100 (100) y 01111101 (125); "
          + "\n\u001B[33mEl resultado de esta operación es 11100001, "
          + "\n\u001B[33my aquí viene la parte divertida: "
          + "\n\u001B[33mLe estamos diciendo a nuestro computador "
          + "\n\u001B[33mque guarde 11100001 en una variable byte,");

  System.out.println("\u001B[35m"
          + "La suma, resta, multiplicación y división"
          + "\n\u001B[35mde dos bytes me retorna un entero"
          + "\n\u001B[35mpor eso necesita un casting (byte)");
  byte numero1b = 100;
  byte numero2b = 125;
  byte sumab = (byte) (numero1b + numero2b);
  System.out.println("\u001B[35mSuma : " + sumab);

  short numero1s = 100;
  short numero2s = 125;
  short sumas = (short) (numero1s + numero2s);
  System.out.println("Suma : " + sumas);

  int numero1i = 100;
  int numero2i = 30;
  int numero1Suma = numero1i / numero2i;
  System.out.println("Suma Integer : " + numero1Suma);

  byte numero1 = Byte.parseByte("00000001", 2);
  System.out.println("Complemento de 2 : " + numero1);

  byte numero2 = (byte) Short.parseShort("10000001", 2);
  System.out.println("Complemento de 2 : " + numero2);

  int a = 5;
  int b = 2;
  int r = (a / b);
  System.out.println("Valor: " + r);

  int a1 = 5;
  byte b1 = 2;
  byte almacena = (byte) (b1 + a1);
  System.out.println("Valor --> byte almacena = (byte) (b1 + a1) : " + almacena);

  // El tipo menor no puede almacenar el tipo mayor por eso necesita un (casting)
  int mayor = 10;
  short menor = 5;
  short resultado = (short) (mayor - menor);
  System.out.println("Resultado 0 : " + resultado);

  // El tipo mayor podra representar cualquier valor del tipo menor
  int mayor1 = 10;
  short menor1 = 5;
  int resultado1 = (mayor1 - menor1);
  System.out.println("Resultado 1 : " + resultado1);

  long mayor2 = 10;
  short menor2 = 5;
  int resultado2 = (int) (mayor2 - menor2);
  System.out.println("Resultado 2 : " + resultado2);

  long mayor3 = 10;
  short menor3 = 5;
  short resultado3 = (short) (int) (mayor3 - menor3);
  System.out.println("Resultado 3 : " + resultado3);

  byte mayor4 = 100;
  long menor4 = 5;
  byte resultado4 = (byte) (mayor4 - menor4);
  System.out.println("Resultado 4 : " + resultado4);

  byte mayor5 = 100;
  long menor5 = 5;
  long resultado5 = (mayor5 - menor5);
  System.out.println("Resultado 5 : " + resultado5);

 }
}
