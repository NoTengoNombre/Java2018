/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rvs.ejemplos;

import java.util.Random;

/**
 * @see p4
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Programa {

 private int variableMiembro;
 private static int contar;

 public Programa() {
  this(new Random().nextInt(100) + 1);
  contar++;
  System.out.println("• Numero de veces : " + getContar());
 }

 /**
  *
  * @param variableMiembro
  */
 public Programa(int variableMiembro) {
  this.variableMiembro = variableMiembro;
 }

 public static int getContar() {
  return contar;
 }

 @Override
 public String toString() {
  return "♠ Variable Miembro : " + variableMiembro;
 }

 public static void main(String[] args) {

  System.out.println(new Programa().toString());
  System.out.println(new Programa().toString());
  System.out.println(new Programa().toString());
  System.out.println(new Programa().toString());
 }
}
