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
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String login = request.getParameter("login");
		String motPass = request.getParameter("motPass");
		
		User u = new User();
		
		u.setNom("nom");
		u.setPrenom("prenom");
		u.setLogin("login");
		u.setmotPass("motPass");
				
		int num = UserFonction.addUser(u);
		
		if(num>0) {
			out.print("<h1> user est bien ajouter (: </h1>");
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html"); 
			    requestDispatcher.forward(request, response);
			
		}else {
			out.print("<h1> Sorry not seved :( </h1>");
			request.getRequestDispatcher("/AddUser.jsp");     }
			
	}	
	

	}
