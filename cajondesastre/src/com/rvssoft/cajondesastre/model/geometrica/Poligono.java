package com.rvssoft.cajondesastre.model.geometrica;

/**
 *
 * @author Formacion
 *
 */
public abstract class Poligono implements Figura {

 /**
  * Variable de instancia
  */
 private Punto[] vertices;

 /**
  * Ver que los vertices sea mayor que 3 y no sea null
  *
  * @param vertices array de vertices
  */
 public Poligono(Punto... vertices) {

  if (vertices.length <= 3) {
   throw new IllegalArgumentException("No se puede instanciar un poligono con " + vertices.length);
  }

  this.vertices = vertices;
 }

 public Punto[] getVertices() {
  return vertices;
 }

 @Override
 public void trasladar(double deltaX, double deltaY) {
  for (Punto vertice : vertices) {
   vertice.trasladar(deltaX, deltaY);
  }
 }

 @Override
 public double getPerimetro() {
  double perimetro = 0;
  int nVertices = vertices.length;

  for (int i = 0; i < getVertices().length - 1; i++) {
   perimetro += vertices[i].distancia(vertices[i + 1]);
  }

  perimetro += vertices[nVertices - 1].distancia(vertices[0]);

  return perimetro;
 }

}
