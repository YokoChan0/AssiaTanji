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
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String titre = request.getParameter("titre");
		String auteur = request.getParameter("auteur");
		String cate= request.getParameter("cate");
		
		Livre l = new Livre();
		
		l.setTitre("titre");
		l.setAuteur("auteur");
		l.setCategorie("cate");
				
		int num = LivreFonction.addBook(l);
		
		if(num>0) {
			out.print("<h1> user est bien ajouter (: </h1>");
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/welcom.jsp"); 
			    requestDispatcher.forward(request, response);
			
		}else {
			out.print("<h1> Sorry not seved :( </h1>");
			request.getRequestDispatcher("/AddBook.jsp");     }	
		
	}

}
