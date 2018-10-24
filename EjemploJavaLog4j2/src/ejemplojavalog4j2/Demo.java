/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavalog4j2;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @see
 * https://stackoverflow.com/questions/43094299/setting-up-log4j2-in-netbeans-basic-configuration
 * @since 23-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Demo {

 private final static Logger log = LogManager.getLogger(Demo.class);

 public static void main(String[] args) throws IOException {
  log.info("starting...");
  try {
   ((Object) null).toString();
  } catch (Exception e) {
   log.error("error message");
  }
  log.info("some info.");
 }
}
