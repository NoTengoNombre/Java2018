package com.rvssoft.cajondesastre.model.override;

public class Futbolista extends Deportista {

	public void entrenar() {
		System.out.println("futbolista se levanta a las 11h"
				+ "y hace veinte rondos... ");
	}
	
	public void simularPenalty() {
		System.out.println("Simular penalty");
	}
}
