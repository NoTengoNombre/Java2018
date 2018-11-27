/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.basico;

/**
 * @see -
 * @since 24-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class PruebaObject {

 public static void main(String[] args) {

  Object objeto;
//  Se puede utilizar una variable 'Object' para REFERENCIAR cualquier TIPO de VARIABLE DE INSTANCIA
// UPs-CASTING - No hace falta 'Casting' Explicito es 'Implicito' para usar el objeto
  objeto = new Acanalado("PVC", true, 30.5f, "metros", 102, "Para Humos");
  System.out.println("Objeto es Acanalado : " + (objeto instanceof Acanalado ? "Si" : "NO"));
  System.out.println("La clase de objeto es : " + objeto.getClass());
// TODO LO QUE SE INVOCAN SON FUNCIONES OBJECT
//  "objeto".FUNCIONES_de_OBJECT();
  System.out.println("\u001B[33m Valor Object : " + objeto.toString());
  System.out.println("\u001B[33m Valor Object : " + objeto.getClass());
  System.out.println("\u001B[33m Valor Object : " + objeto.hashCode());

// DOWN-CASTING - Se tiene que hacer 'Casting' Explicito para poder USAR TODAS LAS VARIABLES Y FUNCIONES de esa 'Variable de INSTANCIA' casteada
  Acanalado tubo = (Acanalado) objeto;
//  tubo.FUNCIONES_OBJECT()_y_TUBO();
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.toString());
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.getClass());
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.hashCode());
  int hashCode1 = objeto.hashCode();
  int hashCode2 = tubo.hashCode();
  System.out.println("¿ Son iguales los OBJETOS ? " + (hashCode1 == hashCode2));

  System.out.println("\u001B[36m Valor Acanalado : " + tubo.getMaterial());
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.getMedida());
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.getCalibre());
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.getNombre());
  System.out.println("\u001B[36m Valor Acanalado : " + tubo.getNumero());

 }
}
