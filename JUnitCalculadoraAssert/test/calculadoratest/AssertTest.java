/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author MyDevelop
 */
public class AssertTest {

 public AssertTest() {
 }

 @Test
 public void test() {
//Assert.assertEquals("3 es distinto de 4", 3, 4);
//Assert.assertNotEquals(3, 3);
  String s1 = "Hola";// variables con distinta posicion de memoria
  String s2 = "Hola";// variables con distinta posicion de memoria
//  assertEquals(s1, s2);
  assertSame(s1, s2);

  Date date1 = new Date();
  Date date2 = new Date();
  assertEquals(date1, date2); // 
  assertSame(date1, date2);
 }

}
