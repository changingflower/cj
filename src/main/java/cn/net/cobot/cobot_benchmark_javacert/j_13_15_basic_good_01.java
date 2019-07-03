package cn.net.cobot.cobot_benchmark_javacert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j_13_15_basic_good_01 {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			// Do work that doesn't require the output writer
		} catch (Exception x) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}

		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");

			// ... All work

		} catch (Exception ex) {
			out.println(ex.getMessage());
		} finally {
			out.flush();
		}
	}
}
