package com.zc.javaweb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("LoginServlet的init方法");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service方法");
		System.out.println(request);
		String user=request.getParameter("yonghu");
		String password=request.getParameter("mima");
		System.out.println("用户名为:"+user+" 密码为:"+password);
		
		String[] hobbies=request.getParameterValues("hobby");
		for(String i:hobbies){
			System.out.println("->"+i);
		}
		
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()){
			String name=(String) e.nextElement();
			String value=request.getParameter(name);
			System.out.println(name+" "+value);
		}
		HttpServletRequest httpReq=(HttpServletRequest)request;
		String requestURI=httpReq.getRequestURI();
		System.out.println(requestURI);
		
		String method=httpReq.getMethod();
		System.out.println(method);
	}

}
