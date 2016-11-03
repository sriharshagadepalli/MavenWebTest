package net.viralpatel.maven;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1031422249396784970L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.print("<center><h1><b> *** Hello All *** </b></h1></center>");
		out.print("<center><h1><b> **** CAPE Dev Ops Pipeline Demo App **** </b></h1></center>");
		out.flush();
		out.close();
	}
}
