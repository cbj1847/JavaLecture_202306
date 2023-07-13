package ch06_basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex02_Login
 */
@WebServlet("/ch06/login")
public class Ex02_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() method called.");
		request.setCharacterEncoding("utf-8");		// 한글 처리 시 필수사항
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String[] countries = request.getParameterValues("country");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String html = "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "	<meta charset=\"UTF-8\">"
				+ "	<title>Form 태그를 이용해 서버에 정보 전달</title>"
				+ "</head>"
				+ "<body style=\"margin: 40px\">"
				+ "	<h1>입력 폼</h1>"
				+ "	<hr>"
				+ "<ul>"
				+ "		<li>아이디 : "  + uid + "</li>"
				+ "		<li>패스워드 : " + pwd + "</li>";
				
				
				for (String country: countries)
					html += "<li>" + country + "</li>"
				+ "	</ul>"
				+ "</body>"
				+ "</html>";
		
		out.print(html);

	}

}
