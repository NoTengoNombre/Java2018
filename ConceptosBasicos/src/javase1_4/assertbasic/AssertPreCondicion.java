/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase1_4.assertbasic;

/**
 *
 * @see
 * https://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html#usage-invariants
 * @since 05-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class AssertPreCondicion {

 private int MAX_REFRESH_RATE = 10000;
 private double interval;

 /**
  *
  * @return
  */
 public double getInterval() {
  return interval;
 }

 /**
  *
  * @param interval
  */
 public void setInterval(double interval) {
  this.interval = interval;
 }

 /**
  * Sets the refresh rate.
  *
  * @param rate refresh rate , in frames per second
  */
 public void setRefreshRate(int rate) {
// Enforce specified precondition in public method
  if (rate <= 0 || rate > MAX_REFRESH_RATE) {
   throw new IllegalArgumentException("Illegal rate : " + rate);
  }
  setRefreshInterval(1000 / rate);
 }

 /**
  * Sets the refresh interval ( el cual debe responder a una legal frame rate )
  *
  * @param interval
  */
 private void setRefreshInterval(double interval) {
//  Confirmar adherencia a precondicion dentro de un metodo no publico
  assert (interval > 0) && (interval <= 1000 / MAX_REFRESH_RATE) : interval;
  this.interval = interval;
 }

}
