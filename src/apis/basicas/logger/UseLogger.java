/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis.basicas.logger;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class UseLogger {

 // use the classname for the logger, this way you can refactor
 private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

 public void doSomeThingAndLog() {
  // ... more code
  int[] a = new int[10];
  int x = new Random().nextInt(1000);

  for (int i = 0; i < a.length; i++) {
   a[i] = x;
  }

  int c = 0;
  for (int i : a) {
   System.out.println("\u001B[36m " + ++c + " - Elemenntos : " + i);
  }

  // now we demo the logging
  // set the LogLevel to Severe, only severe Messages will be written
  LOGGER.setLevel(Level.SEVERE);
  LOGGER.severe("Info Log");
  LOGGER.warning("Info Log");
  LOGGER.info("Info Log");
  LOGGER.finest("Really not important");

  // set the LogLevel to Info, severe, warning and info will be written
  // finest is still not written
  LOGGER.setLevel(Level.INFO);
  LOGGER.severe("• Info Log");
  LOGGER.warning("• Info Log");
  LOGGER.info("• Info Log");
  LOGGER.finest("• Really not important");
 }

 public static void main(String[] args) {
  UseLogger tester = new UseLogger();
  try {
   MyLogger.setup();
  } catch (IOException e) {
   throw new RuntimeException("Problems with creating the log files");
  }
  tester.doSomeThingAndLog();
 }
}
