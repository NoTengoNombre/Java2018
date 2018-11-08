/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertbasic;

import java.util.Arrays;

/**
 * @see
 * https://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html#usage-invariants
 * @since 06-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class DataCopy {

 private int[] arrayCopy;
 private int[] array;

 DataCopy() {
  arrayCopy = (int[]) array.clone();
 }

 boolean isConsistent() {
  return Arrays.equals(array, arrayCopy);
 }

 DataCopy copy = null;

}