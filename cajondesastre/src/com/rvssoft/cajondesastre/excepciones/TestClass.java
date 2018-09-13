package com.rvssoft.cajondesastre.excepciones;

public class TestClass {

 public void m1() {
  try {
   m2();
  } catch (Exception e) {
   System.out.println("Algo ha ido mal ");
   System.out.println("Concretamente : " + e.getMessage());
   System.out.println("Continua ejecutandose");
  }
 }

 public void m2() {
  m3();
 }

 public void m3() {
  int a = 1 / 0;
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new TestClass().m1();
 }

}
