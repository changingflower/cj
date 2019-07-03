package cn.net.cobot.cobot_benchmark_javacert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j_13_15_basic_01 {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");

			// ... Write some response text

			out.flush(); // Commits the stream

			// ... More work

		} catch (Exception x) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);	//not compliant
		}
	}
}
