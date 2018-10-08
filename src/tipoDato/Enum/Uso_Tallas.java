
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoDato.Enum;

/**
 * @see @since @version @author Raul Vela Salas
 */
public enum Uso_Tallas {

 /**
  *
  */
 MINI("S"), MEDIANO("M"), GRANDE("X");

 /**
  * String
  */
 private String abreviatura;

 /**
  *
  * @return abreviatura
  */
 public String dame_Abreviatura() {
  return abreviatura;
 }

 /**
  *
  * @param abreviatura
  */
 private Uso_Tallas(String abreviatura) {
  this.abreviatura = abreviatura;
 }
}
