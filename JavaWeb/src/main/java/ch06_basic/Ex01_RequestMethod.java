package ch06_basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01_RequestMethod
 */
@WebServlet("/reqMethod")
public class Ex01_RequestMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contextPath = request.getContextPath();
		String method = request.getMethod();
		String requestUri = request.getRequestURI();
		String serverName = request.getServerName();
		String servletPath = request.getServletPath();
		String pathInfo = request.getPathInfo();
		
		String data = "contextPath: " + contextPath + "\n";
		data += "method: " + method + "\n";
		data += "requestUri: " + requestUri + "\n";
		data += "serverName: " + serverName + "\n";
		data += "servletPath: " + servletPath + "\n";
		data += "pathInfo: " + pathInfo + "\n";
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String html = "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"UTF-8\">"
				+ "<title>Hello JSP</title>"
				+ "</head>"
				+ "<body>"
				+ "	<h1>HttpServeletRequest의 다양한 메서드</h1>"
				+ "	<hr>"
		        + "</body>"
				+ "</html>";

				String[] liList = data.split("\n");
				html += "	<ul>";
				for (String li: liList)
					html += "		<li>" + li + "</li>";
				html += "	</ul>";
				
				html += "</body>"
						+ "</html>";
				out.print(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
