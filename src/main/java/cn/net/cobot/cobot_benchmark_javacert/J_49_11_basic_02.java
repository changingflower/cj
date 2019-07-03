package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class J_49_11_basic_02 extends HttpServlet {
 
  private static String lastAddr = "nobody@nowhere.com";
 
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
 
    String emailAddr = request.getParameter("emailAddr");
 
    if (emailAddr != null) {
      out.println("Email Address:");
      out.println(sanitize(emailAddr));
      out.println("<br>Previous Address:");
      out.println(sanitize(lastAddr));	//not compliant
    };
 
    out.println("<p>");
    out.print("<form action=\"");
    out.print("SampleServlet\" ");
    out.println("method=POST>");
    out.println("Parameter:");
    out.println("<input type=text size=20 name=emailAddr>");
    out.println("<br>");
    out.println("<input type=submit>");
    out.println("</form>");
 
    lastAddr = emailAddr;
  }
 
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
    doGet(request, response);
  }
 
  // Filter the specified message string for characters
  // that are sensitive in HTML.
  public static String sanitize(String message) {return "";
    // ...
  }
}