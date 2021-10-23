package com.mph.mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig sc;
	
	ServletContext sconxt;
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config)
    {
    	System.out.println("From init ()");
    	this.sc=config;
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Hello All");
		out.println("<html>");
		out.println("<head><title>Hello Page</title>");
		out.println("</head>");
		out.println("<body>");
		String user = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		
		String un = sc.getInitParameter("username");
		String ps = sc.getInitParameter("password");
		
		
		sconxt=sc.getServletContext();
		String cxun = sconxt.getInitParameter("urnm");
		String cxps = sconxt.getInitParameter("pswd");
		
		if (user.equals("Deeps") && pwd.equals("pass")) {
			out.println("Welcome : " + user);
			
			Enumeration parameters = request.getParameterNames();
			while (parameters.hasMoreElements()) {
				String paraNames = (String) parameters.nextElement();
				out.println("<br> Parameter Name : " +  paraNames);
				out.println("<br> Parameter value : " +  request.getParameter(paraNames));	
				
			}
			//out.println("<a href='SecondServlet'>Click for 2nd Servlet</a>");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
			rd.include(request, response);

		}else if(user.equals(un) && pwd.equals(ps)) {
			out.println("Welcome " + user);
			
			
		} 
		else if(user.equals(cxun) && pwd.equals(cxps)) {
			out.println("Welcome " + user);
			
			
			
			
			
		} 
		else {
			out.println("Welcome Guest !!!");
		}

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}