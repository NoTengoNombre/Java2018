package com.rvssoft.cajondesastre.model.geometrica;

/**
 * Terminos de Interfaces
 *
 * @author Formacion
 *
 */
public class TestClass {

 public static void main(String[] args) {

  Punto p1 = new Punto(0.0, 10.5);
  Punto p2 = new Punto(0.0, 10.5);
  Punto p3 = new Punto(0.0, 10.5);

  // Estoy manipulando figuras , lo que quiero es transladarla en el espacio , calcular su perimetro
  // Trato todo como figuras , invocandos sus metodos
  // Declaro una variable en terminos de interfaces y la derecha la Implementaci�n
  Figura f1 = new Triangulo(p1, p2, p3);
  Figura f2 = new Circulo(p3, 100.0);

  Figura[] figuras = {f1, f2};

  for (Figura f : figuras) {
   f.trasladar(40, -15.0);
  }

  Circulo c1 = new Circulo(0.0, 0.0, 10.0);

  System.out.println(c1);

  c1.trasladar(40.0, -15.0);

  System.out.println(c1);

  System.out.println("Perimetro : " + c1.getPerimetro());
  System.out.println("Area : " + c1.getArea());

  Punto p = new Punto(10, 30);

 }
}
