package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet; // ctrl shift o
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld2")

public class HelloWord2 extends HttpServlet { //ctrl shift o = import

	@Override // do + ctrl space
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

//		out.print("Hello, Servlet.");
//
//		out.print("<br>");
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//			out.print("*");
//			}
//			out.print("</br>");
//		}
		
		
		int sum = 0;
		int i = 0;
		int j = 0;
		for(i=0; i<2; i++) {
			j= (int)(Math.random()*5+1);
			
			out.print("<img src=images/dice"+j+".jpg>");
			
			sum += j;
		}
		
			
			out.print(sum);
		
		
		
		
		
		
//		
//		String[] cube = { 
//		
//		"<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice1.jpg>",
//		"<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice2.jpg>",
//		"<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice3.jpg>",
//		"<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice4.jpg>",
//		"<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice5.jpg>",
//		"<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice6.jpg>",
//		};
		
		


		
		
		
//		for(int z=1; z<7; z++) {
//			out.print("<img src=C:\\\\Users\\\\bit\\\\eclipse-workspace\\\\MyWebSite\\\\WebContent\\\\images\\\\dice"+z+".jpg>");
//		}
//		
//		
//		
//		out.print("<img src=images/dice1.jpg>");
//		out.print("<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice2.jpg>");
//		out.print("<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice3.jpg>");
//		out.print("<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice4.jpg>");
//		out.print("<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice5.jpg>");
//		out.print("<img src=C:\\Users\\bit\\eclipse-workspace\\MyWebSite\\WebContent\\images\\dice6.jpg>");
	
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hello!!");
		//out.println("input type" = "button");
		out.println();
		out.println("</hi>");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}



