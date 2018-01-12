package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServelt
 */
@WebServlet("/LoginAction22")

public class LoginAction_backup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	
	
       
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

				String id = request.getParameter("id");
				String pwd = request.getParameter("pwd");
				
	
//				if(id.equals("asdf")&& pwd.equals("1234")) {
//					response.sendRedirect("index.html");
//				}else {
//					request.setAttribute("msg","id 또는 비밀번호가 틀립니다.");
//					
//					RequestDispatcher reqDis = request.getRequestDispatcher("/loginForm2.jsp");
//					reqDis.forward(request, response);
//				}
				
				
				PrintWriter out = response.getWriter();
//				LocalTime now = LocalTime.now();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>");
//				out.println("Hello!!");
//				out.println(now);
				out.print("<h1>Hello "+id+".</h1>");
				out.print("<h1>Your password is "+pwd+".</h1>");
				
						
				out.println("</hi>");
				out.println("</body>");
				out.println("</html>");
				
		
				
		}
	
}
	
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public HelloServelt() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//	
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}

