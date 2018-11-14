/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase1_4.assertbasic;

import java.math.BigInteger;
import static java.math.BigInteger.ONE;

/**
 * @see
 * https://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html#usage-invariants
 * @since 06-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class AssertPostCondicion {

 /**
  *
  * @param m
  * @return this-1 mod m.
  * @throws ArithmeticException m <= 0, or this BigInteger has no multiplicative
  * inverse mod m (that is, this BigInteger is not relatively prime to m).
  */
 public BigInteger modInverse(BigInteger m) {
  if (m.signum() <= 0) {
   throw new ArithmeticException("Modulus not positive : " + m);
  }

  BigInteger result = new BigInteger("10");
  BigInteger u = new BigInteger("1000");

  assert u.multiply(result).mod(m).equals(ONE) : this;

  return result;

 }

}
