/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis.basicas.logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import sun.util.logging.PlatformLogger;

/**
 * @see http://www.vogella.com/tutorials/Logging/article.html
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
// this custom formatter formats parts of a log record to a single line
class MyHtmlFormatter extends Formatter {

 @Override
 public String format(LogRecord rec) {
  StringBuffer buf = new StringBuffer(1000);
  buf.append("<tr>\n");

  if (rec.getLevel().intValue() >= Level.WARNING.intValue()) {
   buf.append("\t<td style=\"color:red\">");
   buf.append("<b>");
   buf.append(rec.getLevel());
   buf.append("<\b>");
  } else {
   buf.append("\t<td>");
   buf.append(rec.getLevel());
  }
  buf.append("</td>\n");
  buf.append("\t<td>");
  buf.append(calcDate(rec.getMillis()));
  buf.append("</td>\n");
  buf.append("</tr>\n");
  return buf.toString();
 }

 /**
  *
  * @param millisecs
  * @return
  */
 private String calcDate(long millisecs) {
//  SimpleDateFormat date_format = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
  SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
  Date resultDate = new Date(millisecs);
  return date_format.format(resultDate);
 }

 @Override
 public String getHead(Handler h) {
  return "<!DOCTYPE html>"
          + "\n<html>"
          + "\n<head>"
          + "\n<style>"
          + "\ntable { width: 100% }\n"
          + "th { font:bold 10pt Tahoma; }\n"
          + "td { font:normal 10pt Tahoma; }\n"
          + "h1 {font:normal 11pt Tahoma;}\n"
          + "</style>\n"
          + "</head>\n"
          + "<body>\n"
          + "<h1>" + (new Date()) + "</h1>\n"
          + "<table border=\"0\" cellpadding=\"5\" cellspacing=\"3\">\n"
          + "<tr align=\"left\">\n"
          + "\t<th style=\"width:10%\">Loglevel</th>\n"
          + "\t<th style=\"width:15%\">Time</th>\n"
          + "\t<th style=\"width:75%\">Log Message</th>\n"
          + "</tr>\n";
 }

 // this method is called just after the handler using this
 // formatter is closed
 @Override
 public String getTail(Handler h) {
  return "</table>\n</body>\n</html>";
 }

}
