package FIrstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator.abc")

public class Calcul extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no1 =	Integer.parseInt(request.getParameter("no1"));
		int no2 =	Integer.parseInt(request.getParameter("no2"));
		int result = no1 + no2;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h2> Result is " + result + "</h2>");
		out.write("</body></html>");

	response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
