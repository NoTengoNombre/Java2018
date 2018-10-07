package com.rvssoft.cajondesastre.model.geometrica;

/**
 * Crear un constructor especifico para los puntos no necesita variables
 * especificas par alos puntos porque lo coge del padre
 *
 * @author Formacion
 *
 */
public class Triangulo extends Poligono {

 public Triangulo(Punto v1, Punto v2, Punto v3) {
  super(v1, v2, v3);
 }

 @Override
 public double getArea() {

  return 0;
 }

}
