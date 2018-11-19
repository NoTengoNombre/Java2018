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
public class T1AutoboxingUnboxing {

 public static void main(String[] args) {

  Integer oint = 43;
  System.out.println("Autoboxing Integer : " + oint);
  Float ofloat = 125.8F;
  System.out.println("Autoboxing Float : " + ofloat);
  Boolean oboolean = false;
  System.out.println("Autoboxing Boolean : " + oboolean);

  System.out.println("Unboxing");
  Integer oint2 = 125;
  int i = oint2;
  System.out.println("Conversion : " + i);

  int ii = 125;
  Integer oint3 = ii;

  int j = oint3;

  oint3++;

  oint3 = Integer.valueOf(oint3.intValue() + 1);

  System.out.println("Valores : y" + oint3);

 }
}
