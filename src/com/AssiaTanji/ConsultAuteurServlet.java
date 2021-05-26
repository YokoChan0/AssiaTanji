package com.AssiaTanji;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsultAuteurServlet
 */
@WebServlet("/ConsultAuteurServlet")
public class ConsultAuteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ConsultAuteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<head>");	
		out.print("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" >");	
		out.print("</head>");	
		out.print("<body>");	
		out.print("<a href='index.html' class='w-100 btn btn-lg btn-primary' role='button'>Add User</a>");	
        out.print("<h1>User table</h1>");
        String auteur = request.getParameter("auteur");
        
        LivreFonction.consultAuteur(auteur);
        out.print("<table border='1'width= '100%'>");
        out.print("<tr><th>Nom</th><th>prenom</th><th>Login</th><th>Password</th><th>Age</th>");
        
        	Livre l = null;
        	out.print("<tr><td>"+l.getIdLivre()+"</td><td>"+l.getTitre()+"</td><td>"+l.getAuteur()+"</td><td>"+l.getCategorie()+"</td></tr>");

        out.print("</table>");
        out.print("</body>");
        	
	}	

}
