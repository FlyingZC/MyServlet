package com.zc.javaweb;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet implements Servlet{
	public void destroy(){
		System.out.println("SecondServlet��destroy����");
	}
	public ServletConfig getServletConfig(){
		System.out.println("SecondServlet��getServletConfig����");
		return null;
	}
	public String getServletInfo(){
		System.out.println("SecondServlet��getServletInfo����");
		return null;
	}
	public void init(ServletConfig servletConfig) throws ServletException{
		System.out.println("SecondServlet��init����");
	}
	public void service(ServletRequest servletRequest,ServletResponse servletResponse)
			throws ServletException,IOException{
		System.out.println("SecondServlet��service����");
	}
	
}
