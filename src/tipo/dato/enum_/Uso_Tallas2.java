
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo.dato.enum_;

/**
 * @see @since @version @author Raul Vela Salas
 */
public enum Uso_Tallas2 {

 /**
  *
  */
 S("MINI"), M("MEDIANO"), X("GRANDE");

 /**
  * String
  */
 private String abreviatura2;

 /**
  *
  * @return abreviatura
  */
 public String dame_Abreviatura2() {
  return abreviatura2;
 }

 /**
  *
  * @param abreviatura
  */
 private Uso_Tallas2(String abreviatura2) {
  this.abreviatura2 = abreviatura2;
 }
}
