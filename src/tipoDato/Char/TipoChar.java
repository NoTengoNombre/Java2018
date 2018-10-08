/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoDato.Char;

/**
 * @see # @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class TipoChar {

 public char c = 'a';

 public TipoChar() {
  this.c = 'b';
 }

 /**
  *
  * @return
  */
 public char getLetra() {
  return c;
 }

 /**
  *
  * @param ca
  */
 public void setLetra(char ca) {
  this.c = ca;
 }

 @Override
 public String toString() {
  char otro = getLetra();
  String valorDevuelto = String.valueOf(otro);
  return "• Ver caracter : " + valorDevuelto;
 }

}
