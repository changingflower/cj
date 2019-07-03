package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class J_49_11_good_1001 extends HttpServlet {
 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
 
    String emailAddr = request.getParameter("emailAddr");
    HttpSession session = request.getSession();
    Object attr = session.getAttribute("lastAddr");
    String lastAddr = (attr == null) ? "null" : attr.toString();
 
    if (emailAddr != null) {
      out.println("Email Address::");
      out.println(sanitize(emailAddr));
      out.println("<br>Previous Email Address::");
      out.println(sanitize(lastAddr));
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
 
    session.setAttribute("lastAddr", emailAddr);
  }
 
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
    doGet(request, response);
  }
 
  // Filter the specified message string for characters
  // that are sensitive in HTML.
  public static String sanitize(String message) {
    // ...
	  return "";
  }
}