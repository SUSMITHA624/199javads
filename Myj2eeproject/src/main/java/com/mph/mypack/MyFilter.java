package com.mph.mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class MyFilter implements Filter {

	FilterConfig fc;
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter init()");
		this.fc=fConfig;
		
	}
  
    public MyFilter() {
    	System.out.println("Filter constru()");
    }	
	public void destroy() {
		System.out.println("Filter destroy()");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		System.out.println("In doFIlter()");
		String user = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		
		String un = fc.getInitParameter("fun");
		String ps = fc.getInitParameter("fpw");
		if(user.equals(un) && pwd.equals(ps))
		{
			long start_time = System.currentTimeMillis();
			chain.doFilter(request, response);
			long end_time = System.currentTimeMillis();
			System.out.println("Time taken for the Response : " + (end_time-start_time));
		}
		else
		{
			request = (HttpServletRequest)request;
			out.println("Hey !! You are not authorised ...");
		}
		
	}

	
	

}
