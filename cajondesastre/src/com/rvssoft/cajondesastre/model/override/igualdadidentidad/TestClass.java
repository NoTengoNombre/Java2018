package com.rvssoft.cajondesastre.model.override.igualdadidentidad;

public class TestClass {

 public static void main(String[] args) {
  Cliente c1 = new Cliente(100, "Pep�n", "G�lvez", "Ridruejo");
  Cliente c2 = new Cliente(100, "Pepin", "G�lvez", "Ridruejo");

  if (c1 == c2) {
   System.out.println("son iguales");
  } else {
   System.out.println("son distintos");
  }

  // Los objetos no son iguales 
  if (c1.equals(c2)) {
   System.out.println("son iguales");
  } else {
   System.out.println("No son iguales");
  }
 }
}
