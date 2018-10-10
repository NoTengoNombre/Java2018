/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 19
 * @since 08-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class LiteralesValorLiteralConstanteLiteral {

 public static void main(String[] args) {

  boolean literalBoolean1 = true;
  boolean literalBoolean2 = false;

  // Literal enteros
  int literalDecimal = 20;
  int literalOctal = 024;
  byte literalHexadecimal1 = 0x14;
  byte literalHexadecimal2 = 0xA;
  long literalLong = 873L;

  System.out.println("Literal Booleano 1 " + literalBoolean1);
  System.out.println("Literal Booleano 2 " + literalBoolean2);

  // Literal reales
  double valorDecimal1 = 13.2d;
  System.out.print("• Valor Decimal : \t" + valorDecimal1 + "\n");
  double valorDecimal2 = 13.2D;
  System.out.print("• Valor Decimal : \t" + valorDecimal2 + "\n");
  float valorFlotante1 = 2.f;
  System.out.print("• Valor Float : \t" + valorFlotante1 + "\n");
  float valorFlotante2 = 2.f;
  System.out.print("• Valor Float : \t" + valorFlotante2 + "\n");

  System.out.println("Literal Decimal " + literalDecimal);
  System.out.println("Literal Octal" + literalOctal);
  System.out.println("Literal Hexadecimal " + literalHexadecimal1);
  System.out.println("Literal Hexadecimal " + literalHexadecimal2);
  System.out.println("Literal Long " + literalLong);

  System.out.println("---------Retorno de carro ---------------");
  System.out.print("a \r");
  System.out.print("Retroceso\b \n");
  // Literal caracter
  char aEnOctal = '\101';
  System.out.println("Letra \"A\" en Octal : " + aEnOctal);
  char aEnHexadecimal = '\u0041';
  System.out.println("Letra \"A\" en HexaDecimal : " + aEnHexadecimal);

 }
}
