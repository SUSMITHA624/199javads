package com.mph.sess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv3
 */
public class Serv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Serv3() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Hello All");
		out.println("<html>");
		out.println("<head><title>Hello Page</title>");
		out.println("</head>");
		out.println("<body>");
		HttpSession hs= request.getSession(); 
		out.println("Is it a new Session ?" + hs.isNew() + "<br/>");
		out.println("Creation time ? " + hs.getCreationTime() + "<br/>");
		out.println("Session ID : " + hs.getId()+ "<br/>");
		hs.setAttribute("ToyCar", "500");
		//hs.setMaxInactiveInterval(15);  // Time based in seconds
		hs.invalidate();	// Event based 
		out.println("<a href='Serv4'>Click for 4th Servlet</a>");
		
		out.println("</body>");
		out.println("</html>");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
