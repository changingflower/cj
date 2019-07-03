package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//check type:Java
public class j_07_02_basic_good_1001 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");

		String visible = request.getParameter("visible");
		String hidden = request.getParameter("hidden");

		if (visible != null || hidden != null) {
			out.println("Visible Parameter:");
			out.println( sanitize(visible));
			out.println("<br>Hidden Parameter:");
			out.println( sanitize(hidden));          // Hidden variable sanitized
		} else {
			out.println("<p>");
			out.print("<form action=\"");
			out.print("j_07_02_basic_good_1001\" ");
			out.println("method=POST>");
			out.println("Parameter:");
			out.println("<input type=text size=20 name=visible>");
			out.println("<br>");

			out.println("<input type=hidden name=hidden value=\'a benign value\'>");
			out.println("<input type=submit>");
			out.println("</form>");
		}
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
