/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase1_4.assertbasic;

/**
 * @see
 * https://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html#usage-invariants
 * @since 05-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class AssertBasicoSwitchParaAfirmar {

 /**
  * Metodo con la comprobacion 'assert'
  *
  * @param tipoEnum
  * @return
  */
 public static Enum getEnumAssert(Enum tipoEnum) {
  Enum tipoEnum1 = tipoEnum;
  Suit suit = (Suit) tipoEnum1;
  switch (suit) {
   case CLUBs:
    System.out.println("Soy CLUBs : " + Suit.CLUBs);
    break;
   case DIAMONDS:
    System.out.println("Soy DIAMONDS : " + Suit.DIAMONDS);
    break;
   case HEARTS:
    System.out.println("Soy HEARTS : " + Suit.HEARTS);
    break;
   case SPADES:
    System.out.println("Soy SPADES : " + Suit.SPADES);
    break;
   default:
    // Devuelve false : objeto 'suit'
    assert false : suit;
    break;
  }
  System.out.println("Aqui: " + suit);
  return suit;
 }

 /**
  * Metodo para lanzar una excepcion
  *
  * @param tipoEnum
  * @return
  */
 public static Enum getEnumLanzaExcepcionAssert(Enum tipoEnum) {
  Enum tipoEnum1 = tipoEnum;
  Suit suit = (Suit) tipoEnum1;
  switch (suit) {
   case CLUBs:
    System.out.println("Soy CLUBs : " + Suit.CLUBs);
    break;
   case DIAMONDS:
    System.out.println("Soy DIAMONDS : " + Suit.DIAMONDS);
    break;
   case HEARTS:
    System.out.println("Soy HEARTS : " + Suit.HEARTS);
    break;
   case SPADES:
    System.out.println("Soy SPADES : " + Suit.SPADES);
    break;
   default:
    // Para Controlar las posibles de 'EXCEPCIONES' de 'assert'
    throw new AssertionError(suit);
  }
  System.out.println("Aqui: " + suit);
  return suit;
 }

 public static void main(String[] args) {

  System.out.println("Valor devuelto : " + getEnumAssert(Suit.OTROS));
  System.out.println("Valor devuelto : " + getEnumLanzaExcepcionAssert(Suit.OTROS));

 }
}

enum Suit {
 CLUBs, DIAMONDS, HEARTS, SPADES, OTROS;
}

class Suits {

 private String CLUBs = "♣";
 private String DIAMONDS = "♦";
 private String HEARTS = "♥";
 private String SPADES = "♠";

}
