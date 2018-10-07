package com.rvssoft.cajondesastre.excepciones;

public class RandomThrowableGeneratorTest {

 public static void main(String[] args) {

  RandomThrowableGenerator rtg = new RandomThrowableGenerator();

  try {
   rtg.generate();
  } catch (NullPointerException | ClassCastException e) {
   // las excepciones mas genericas m�s abajo , las especializadas arriba

  } catch (Throwable e) { // las excepciones mas genericas m�s abajo , las especializadas arriba

  }
 }
}
