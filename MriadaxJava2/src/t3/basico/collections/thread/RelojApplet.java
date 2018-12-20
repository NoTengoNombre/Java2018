/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.thread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @see http://www.sc.ehu.es/sbweb/fisica/cursoJava/applets/threads/runnable.htm
 * @since 18-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class RelojApplet extends Applet implements Runnable {

 Thread hilo = null;
 int anchoApplet, altoApplet;
//Doble buffer
 Image imag;
 Graphics gBuffer;

 @Override
 public void init() {
  try {
   jbInit();
  } catch (Exception e) {
  }
 }

 /**
  *
  * @throws Exception
  */
 private void jbInit() throws Exception {
  this.setBackground(Color.white);
  anchoApplet = getSize().width;
  altoApplet = getSize().height;
 }

 /**
  *
  */
 @Override
 public void start() {
  if (hilo == null) {
   hilo = new Thread(this);
   hilo.start();
  }
 }

 /**
  *
  */
 @Override
 public void stop() {
  hilo.stop();
  hilo = null;
 }

 /**
  *
  */
 @Override
 public void run() {
  while (true) {
   try {
    Thread.sleep(100);
   } catch (InterruptedException e) {
   }
   repaint();
  }
 }

 /**
  *
  * @param g
  */
 public void dibujaReloj(Graphics g) {
//fecha
  Calendar cal = Calendar.getInstance();
  Date date = cal.getTime();
  DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
  String fecha = dateFormatter.format(date);
  FontMetrics fm = g.getFontMetrics();
  g.setColor(Color.yellow);
  g.fillRect(0, 0, anchoApplet, 3 * fm.getHeight() / 2);
  g.setColor(Color.black);
  g.drawString(fecha, (anchoApplet - fm.stringWidth(fecha)) / 2, fm.getHeight());

//hora, minutos y segundos
  SimpleDateFormat formatter = new SimpleDateFormat("s", Locale.getDefault());
  int segundos = Integer.parseInt(formatter.format(date));
  formatter.applyPattern("m");
  int minutos = Integer.parseInt(formatter.format(date));
  formatter.applyPattern("h");
  int hora = Integer.parseInt(formatter.format(date));

//el centro del reloj y el radio
  int xCentro = getSize().width / 2;
  int yCentro = 2 * fm.getHeight() + (altoApplet - 2 * fm.getHeight()) / 2;
  int radio = (xCentro > (altoApplet - 2 * fm.getHeight()) / 2) ? (altoApplet - 2 * fm.getHeight()) / 2 : xCentro;

//Dibujar la circunferencia, los números y las marcas
  g.setFont(new Font("TimesRoman", Font.BOLD, 14));
  g.setColor(Color.lightGray);
  g.fillOval(xCentro - radio, yCentro - radio, 2 * radio, 2 * radio);
  g.setColor(Color.black);
  g.drawString("9", xCentro - radio + 3, yCentro - fm.getHeight() / 2 + fm.getAscent());
  g.drawString("3", xCentro + radio - fm.stringWidth("3") - 3, yCentro - fm.getHeight() / 2 + fm.getAscent());
  g.drawString("12", xCentro - fm.stringWidth("12") / 2, yCentro - radio + fm.getHeight() + 3);
  g.drawString("6", xCentro - fm.stringWidth("6") / 2, yCentro + radio - fm.getAscent());
  g.setColor(Color.red);
  for (int i = 0; i < 12; i++) {
   int xHora = xCentro + (int) (Math.cos(i * Math.PI / 6) * (7 * radio / 9));
   int yHora = yCentro + (int) (Math.sin(i * Math.PI / 6) * (7 * radio / 9));
   g.fillOval(xHora - 2, yHora - 2, 4, 4);
  }

//posición de las agujas del reloj
  int xSeg = xCentro + (int) (Math.cos(segundos * Math.PI / 30 - Math.PI / 2) * radio);
  int ySeg = yCentro + (int) (Math.sin(segundos * Math.PI / 30 - Math.PI / 2) * radio);
  int xMin = xCentro + (int) (Math.cos(minutos * Math.PI / 30 - Math.PI / 2) * (8 * radio / 9));
  int yMin = yCentro + (int) (Math.sin(minutos * Math.PI / 30 - Math.PI / 2) * (8 * radio / 9));
  int xHora = xCentro + (int) (Math.cos((hora + (double) minutos / 60) * Math.PI / 6 - Math.PI / 2) * (6 * radio / 9));
  int yHora = yCentro + (int) (Math.sin((hora + (double) minutos / 60) * Math.PI / 6 - Math.PI / 2) * (6 * radio / 9));
//las agujas del reloj
  g.setColor(Color.darkGray);
  g.drawLine(xCentro, yCentro, xSeg, ySeg);
  g.setColor(Color.blue);
  g.drawLine(xCentro, yCentro - 1, xMin, yMin);
  g.drawLine(xCentro - 1, yCentro, xMin, yMin);
  g.drawLine(xCentro, yCentro - 1, xHora, yHora);
  g.drawLine(xCentro - 1, yCentro, xHora, yHora);
 }

 /**
  * 
  * @param g 
  */
 @Override
 public void update(Graphics g) {
  if (gBuffer == null) {
   imag = createImage(anchoApplet, altoApplet);
   gBuffer = imag.getGraphics();
  }
  gBuffer.setColor(getBackground());
  gBuffer.fillRect(0, 0, anchoApplet, altoApplet);
//dibuja el reloj
  dibujaReloj(gBuffer);
//transfiere la imagen al contexto gráfico del canvas
  g.drawImage(imag, 0, 0, null);
 }
}
