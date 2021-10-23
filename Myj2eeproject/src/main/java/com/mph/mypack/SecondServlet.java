package com.mph.mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig sc;
	ServletContext sconxt;
	public SecondServlet() {
		super();
	}
	
	public void init(ServletConfig config)
    {
    	System.out.println("From init ()");
    	this.sc=config;
    }
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello All");
		out.println("<html>");
		out.println("<head><title>Hello Page</title>");
		out.println("</head>");
		out.println("<body>");
		String user = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		
		
		String un = sc.getInitParameter("username");
		String ps = sc.getInitParameter("password");
		
		out.println("Welcome : " + user);
		
		out.println("Servlet Config value : " + un + "   --  " + ps);
		
		sconxt=sc.getServletContext();
		String cxun = sconxt.getInitParameter("urnm");
		String cxps = sconxt.getInitParameter("pswd");
		out.println("Servlet Context value : " + cxun + "   --  " + cxps);
		
		out.println("<h3>Context path : </h3>" + request.getContextPath());
		out.println("<h3>Character Encoding : </h3>" + request.getCharacterEncoding());
		out.println("<h3>Path Info : </h3>" + request.getPathInfo());
		out.println("<h3>Local Address : </h3>" + request.getLocalAddr());
		out.println("<h3>Query String : </h3>" + request.getQueryString());
		out.println("<h3>Protocol : </h3>" + request.getProtocol());
		out.println("<h3>Servlet path : </h3>" + request.getServletPath());
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
