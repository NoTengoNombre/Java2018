package com.prueba.basic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PruebaDate {

	/**
	 * Comprobar que las fechas estan en el ambito
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @return
	 */
	public static Date dameFecha(Date fecha1, Date fecha2) {
		
		
		if (fecha1.compareTo(fecha2) == -1 || (fecha2.compareTo(fecha1) == 1)) {
			System.out.println("Soy fecha 1 : " + fecha1);
			return fecha1;
		} else {
			System.out.println("Soy fecha 2 : " + fecha1);
			return fecha2;
		}
	}

	public static void main(String[] args) {

		String valor1 = "01/08/2011";
		String valor2 = "02/09/2012";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date fecha1 = null;
		Date fecha2 = null;

		try {
			fecha1 = sdf.parse(valor1);
			fecha2 = sdf.parse(valor2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(fecha1);
		System.out.println(fecha2);

		if (fecha2.equals(fecha2)) {
			System.out.println("Equivale : Si");
		} else {
			System.out.println("Equivale : No");
		}

		System.out.println(fecha1);
		System.out.println(fecha2);

		if (fecha1.compareTo(fecha2) <= -1) {
			System.out.println("Mayor : \n (" + fecha1 + ") \n (" + fecha2 + ")");
		} else {
			System.out.println("Equivale : No : " + fecha1 + " " + fecha2);
		}

		System.out.println(dameFecha(fecha1, fecha2));

	}

}
