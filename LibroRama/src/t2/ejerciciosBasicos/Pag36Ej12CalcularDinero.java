/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 24-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag36Ej12CalcularDinero {

 public static double dinero = (double) (Math.random() * (1 + 1000) + 1);

 public static int billete500;
 public static double billete500resto;
 public static int billete200;
 public static double billete200resto;
 public static int billete100;
 public static double billete100resto;
 public static int billete50;
 public static double billete50resto;
 public static int billete20;
 public static double billete20resto;
 public static int billete10;
 public static double billete10resto;
 public static int billete5;
 public static double billete5resto;
 public static int monedas2;
 public static double monedas2resto;
 public static int monedas1;
 public static double monedas1resto;

 public static double monedas50centi;
 public static double monedas50centiresto;
 public static double monedas20centi;
 public static double monedas20centiresto;
 public static double monedas10centi;
 public static double monedas10centiresto;
 public static double monedas5centi;
 public static double monedas5centiresto;
 public static double monedas2centi;
 public static double monedas2centiresto;
 public static double monedas1centi;
 public static double monedas1centiresto;

 public static void main(String[] args) {

  System.out.println("Dinero total : " + dinero);

  if (dinero <= 1000) {
   billete500 = (int) dinero / 500;
   System.out.println("• Billetes 500 : " + (int) billete500);

   billete500resto = dinero % 500;
   System.out.printf("♦ Resto billete 500 : %.2f\n", billete500resto, " de ", dinero, "\n");
  }

  if (billete500resto <= 500) {
   billete200 = (int) billete500resto / 200;
   System.out.println("• Billetes 200 : " + (int) billete200);

   billete200resto = billete500resto % 200;
   System.out.printf("♦ Resto billete 200 : %.2f\n", billete200resto, " de ", dinero, "\n");
  }

  if (billete200resto < 200) {
   billete100 = (int) billete200resto / 100;
   System.out.println("• Billete 100 : " + (int) billete100);

   billete100resto = billete200resto % 100;
   System.out.printf("♦ Resto billete 100 : %.2f\n", billete100resto, " de ", dinero, "\n");
  }

  if (billete100resto <= 100) {
   billete50 = (int) billete100resto / 50;
   System.out.println("• Billete 50 : " + (int) billete50);

   billete50resto = billete100resto % 50;
   System.out.printf("♦ Resto billete 50 : %.2f\n", billete50resto, " de ", dinero, "\n");
  }

  if (billete50resto <= 50) {
   billete20 = (int) billete50resto / 20;
   System.out.println("• Billete 20 : " + (int) billete20);

   billete20resto = billete50resto % 20;
   System.out.printf("♦ Resto billete 50 : %.2f\n", billete50resto, " de ", dinero, "\n");
  }

  if (billete20resto <= 20) {
   billete10 = (int) billete20resto / 10;
   System.out.println("• Billete 10 : " + (int) billete10);

   billete10resto = billete20resto % 10;
   System.out.printf("♦ Resto billete 10 : %.2f\n", billete10resto, " de ", dinero);
  }

  billete5 = (int) billete10resto / 5;
  System.out.println("• Billete 5 : " + (int) billete5);

  billete5resto = billete10resto % 5;
  System.out.printf("♦ Resto billete 5 : %.2f\n", billete5resto, " de ", dinero);

  monedas2 = (int) billete5resto / 2;
  System.out.println("• Moneda de 2 : " + (int) monedas2);

  monedas2resto = billete5resto % 2;
  System.out.printf("♦ Resto monedas de 2 : %.2f\n", monedas2resto, " de ", dinero);

  monedas1 = (int) monedas2resto / 1;
  System.out.println("• Moneda de 1 : " + (int) monedas1);

  monedas1resto = monedas2resto % 1;
  System.out.printf("♦ Resto monedas de 1 : %.2f\n", monedas1resto, " de ", dinero);

  monedas50centi = monedas1resto / 0.50;
  System.out.println("• Moneda de 50 centimos : " + (int) monedas50centi);

  monedas50centiresto = monedas1resto % 0.50;
  System.out.printf("♦ Resto monedas de 50 centimos : %.2f\n", monedas50centiresto, " de ", dinero);

  monedas20centi = monedas50centiresto / 0.20;
  System.out.println("• Moneda de 20 centimos : " + (int) monedas20centi);

  monedas20centiresto = monedas50centiresto % 0.20;
  System.out.printf("♦ Resto monedas de 20 centimos : %.2f\n", monedas20centiresto, " de ", dinero);

  monedas10centi = monedas20centiresto / 0.10;
  System.out.println("• Moneda de 10 centimos : " + (int) monedas10centi);

  monedas10centiresto = monedas20centiresto % 0.10;
  System.out.printf("♦ Resto monedas de 10 centimos : %.2f\n", monedas10centiresto, " de ", dinero);

  monedas5centi = monedas10centiresto / 0.05;
  System.out.println("• Moneda de 5 centimos : " + (int) monedas5centi);

  monedas5centiresto = monedas10centiresto % 0.05;
  System.out.printf("♦ Resto monedas de 5 centimos : %.2f\n", monedas5centiresto, " de ", dinero);

  monedas2centi = monedas5centiresto / 0.02;
  System.out.println("• Moneda de 2 centimos : " + (int) monedas2centi);

  monedas2centiresto = monedas5centiresto % 0.02;
  System.out.printf("♦ Resto monedas de 2 centimos : %.2f\n", monedas2centiresto, " de ", dinero);

  monedas1centi = monedas2centiresto / 0.01;
  System.out.println("• Moneda de 1 centimos : " + (int) monedas1centi);

  monedas1centiresto = monedas2centiresto % 0.01;
  System.out.printf("♦ Resto monedas de 1 centimos : %.2f\n", monedas1centiresto, " de ", dinero);

  System.out.printf("---- Total de dinero es de ----");
  System.out.printf("\n• Dinero Total : %.2f", dinero);
  System.out.printf("\n• Billetes de 500 - %d", billete500, " \n");
  System.out.printf("\n• Billetes de 200 - %d", billete200, " \n");
  System.out.printf("\n• Billetes de 100 - %d", billete100, " \n");
  System.out.printf("\n• Billetes de 50 - %d", billete50, " \n");
  System.out.printf("\n• Billetes de 20 - %d", billete20, " \n");
  System.out.printf("\n• Billetes de 10 - %d", billete10, " \n");
  System.out.printf("\n• Billetes de 5 - %d", billete5, " \n");
  System.out.printf("\n• Monedas de 2 - %d", monedas2, " \n");
  System.out.printf("\n• Monedas de 1 - %d", monedas1, "\n");
  System.out.printf("\n• Monedas de 50 centimos - %d", (int) monedas50centi, " \n");
  System.out.printf("\n• Monedas de 20 centimos - %d", (int) monedas20centi, " \n");
  System.out.printf("\n• Monedas de 10 centimos - %d", (int) monedas10centi, " \n");
  System.out.printf("\n• Monedas de 5 centimos - %d", (int) monedas5centi, " \n");
  System.out.printf("\n• Monedas de 2 centimos - %d", (int) monedas2centi, " \n");
  System.out.printf("\n• Monedas de 1 centimos - %d\n", (int) monedas1centi, " \n");
 }
}
