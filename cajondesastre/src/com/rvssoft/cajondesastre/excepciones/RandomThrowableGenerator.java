package com.rvssoft.cajondesastre.excepciones;

public class RandomThrowableGenerator {

 public void generate() throws Throwable {
  int numero = (int) (Math.random() * 4);

  switch (numero) {
   case 0:
    throw new Throwable();
   case 1:
    throw new RuntimeException();
   case 2:
    throw new Error();
   case 3:
    throw new Exception();
  }
 }

}
