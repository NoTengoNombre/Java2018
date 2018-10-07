package com.rvssoft.cajondesastre.model.model4;

public class Caña {

 private int codigo;
 private String marca;
 private Tapa tapa;
 private double precio;

 Caña() {

 }

 public Caña(int codigo, String marca, double precio, Tapa tapa) {
  this.codigo = codigo;
  this.marca = marca;
  this.precio = precio;
  this.tapa = tapa;
 }

 public int getCodigo() {
  return codigo;
 }

 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }

 public String getMarca() {
  return marca;
 }

 public void setMarca(String marca) {
  this.marca = marca;
 }

 public Tapa getTapa() {
  return tapa;
 }

 public void setTapa(Tapa tapa) {
  this.tapa = tapa;
 }

 public double getPrecio() {
  return precio;
 }

 public void setPrecio(double precio) {
  this.precio = precio;
 }

 @Override
 public String toString() {
  return "Ca�a [codigo=" + codigo + ", marca=" + marca + ", tapa=" + tapa + ", precio=" + precio + "]";
 }

}
