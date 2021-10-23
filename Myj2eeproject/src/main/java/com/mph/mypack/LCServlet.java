package com.mph.mypack;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LCServlet() {
        super();
       
    }

    public void init(ServletConfig config)
    {
    	System.out.println("From init ()");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	public void destroy() {
		System.out.println("From Destroy()");
	}

}
