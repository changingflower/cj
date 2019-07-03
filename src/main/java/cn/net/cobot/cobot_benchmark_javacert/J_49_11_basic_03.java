package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class J_49_11_basic_03 extends HttpServlet {
	  
	  private static String lastAddr = "nobody@nowhere.com";
	  private static final Object lastAddrLock = new Object();
	  private final Object lock = new Object();
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	  
	    String emailAddr = request.getParameter("emailAddr");
	  
	    if (emailAddr != null) {
	      out.println("Email Address::");
	      out.println(sanitize(emailAddr));
	      synchronized (lock) {
	        out.println("<br>Previous Email Address::");
	        out.println(sanitize(lastAddr));
	      }
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
	  
	    synchronized (lock) {
	      lastAddr = emailAddr;
	    }
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