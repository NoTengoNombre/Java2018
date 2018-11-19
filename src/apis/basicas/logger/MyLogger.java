/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis.basicas.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import java.util.logging.SimpleFormatter;

/**
 * @see http://www.vogella.com/tutorials/Logging/article.html
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MyLogger {

 static private FileHandler fileTxt;
 static private SimpleFormatter formatterTxt;

 static private FileHandler fileHTML;
 static private Formatter formatterHTML;

 static public void setup() throws IOException {

  // get the global logger to configure it
  Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  // suppress the logging output to the console
  Logger rootLogger = Logger.getLogger("");
  Handler[] handlers = rootLogger.getHandlers();
  if (handlers[0] instanceof ConsoleHandler) {
   rootLogger.removeHandler(handlers[0]);
  }

  logger.setLevel(Level.INFO);
  fileTxt = new FileHandler("Logging.txt");
  fileHTML = new FileHandler("Logging.html");

  // create a TXT formatter
  formatterTxt = new SimpleFormatter();
  fileTxt.setFormatter(formatterTxt);
  logger.addHandler(fileTxt);

  // create an HTML formatter
  formatterHTML = new MyHtmlFormatter();
  fileHTML.setFormatter(formatterHTML);
  logger.addHandler(fileHTML);
 }
}
