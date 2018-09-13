package com.rvssoft.cajondesastre.model.model4;

public class TestClass {

 public static void main(String[] args) {
  Tapa t1 = new Tapa(100, "Patatas Bravas", 1.5);
  Caña c1 = new Caña(120, "Estrella Galicia 1/3", 3.0, t1);

  System.out.println(c1);

 }
}
