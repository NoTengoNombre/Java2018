package com.rvssoft.cajondesastre.model.override;

public class Ciclista extends Deportista{

	@Override
	public void entrenar() {
		System.out.println("ciclista haciendo 500km");
	}
	
	
}
