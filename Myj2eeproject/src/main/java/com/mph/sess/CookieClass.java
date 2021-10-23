package com.mph.sess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CookieClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CookieClass() {
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
		
		 Cookie firstName = new Cookie("user_name", request.getParameter("uname"));
		 firstName.setMaxAge(60*60*24);	//Sets the maximum age in seconds for this Cookie.
		 response.addCookie( firstName );
		 
		 
		 Cookie cookie = null;
		 Cookie[] cookies = request.getCookies();
		 if( cookies != null ) {
		 for (int i = 0; i < cookies.length; i++) {
	            cookie = cookies[i];
	            out.print("Name : " + cookie.getName( ) + ",  ");
	            out.print("Value: " + cookie.getValue( ) + " <br/>");
	         }
		 }
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
