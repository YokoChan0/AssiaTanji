package com.AssiaTanji;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingUp
 */
@WebServlet("/SingUp")
public class SingUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if(login.equals("yokoChan") && pass.equals("sarayoko")) {
			RequestDispatcher rd = request.getRequestDispatcher("/welcom.jsp");
        	rd.forward(request,response); 	
		}else {
			 out.print("Votre login ou mot de passe is inccorect!");
			   RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
			   requestDispatcher.include(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
