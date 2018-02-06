package com.zc.javaweb;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet implements Servlet{
	public void destroy(){
		System.out.println("SecondServlet的destroy方法");
	}
	public ServletConfig getServletConfig(){
		System.out.println("SecondServlet的getServletConfig方法");
		return null;
	}
	public String getServletInfo(){
		System.out.println("SecondServlet的getServletInfo方法");
		return null;
	}
	public void init(ServletConfig servletConfig) throws ServletException{
		System.out.println("SecondServlet的init方法");
	}
	public void service(ServletRequest servletRequest,ServletResponse servletResponse)
			throws ServletException,IOException{
		System.out.println("SecondServlet的service方法");
	}
	
}
