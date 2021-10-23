package com.mph.sess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Serv4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Serv4() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession hs= request.getSession(); 
		out.println("Is it a new Session ?" + hs.isNew() + "<br/>");
		out.println("Creation time ? " + hs.getCreationTime() + "<br/>");
		out.println("Session ID : " + hs.getId()+ "<br/>");
		int p1 = Integer.parseInt((String)hs.getAttribute("JavaBook"));
		int p2 = Integer.parseInt((String)hs.getAttribute("RedmiMobile"));
		int p3 = Integer.parseInt((String)hs.getAttribute("ToyCar"));
		int totalprice = p1+p2+p3;
		out.println("Total Price : " + totalprice);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
