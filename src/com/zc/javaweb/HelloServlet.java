package com.zc.javaweb;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.*;
public class HelloServlet implements Servlet{

	@Override
	public void destroy() {
		
		// TODO Auto-generated method stub
		System.out.println("HelloServlet中的destroy方法");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet中的getServletConfig方法");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet中的getServletInfo方法");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet中init方法");
		String user=servletConfig.getInitParameter("user");
		String password=servletConfig.getInitParameter("password");
		System.out.println(user+password);
		Enumeration<String> names= servletConfig.getInitParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement();
			System.out.println(name);
		}
		
		//ServletContext
		ServletContext servletContext=servletConfig.getServletContext();
		String driver=servletContext.getInitParameter("driver");
		String school=servletContext.getInitParameter("school");
		System.out.println(driver+school);
		Enumeration<String> contextNames=servletContext.getInitParameterNames();
		while(contextNames.hasMoreElements()){
			String contextName=contextNames.nextElement();
			String contextValue=servletContext.getInitParameter(contextName);
			System.out.println(contextName+contextValue);
		}
		
		//获取绝对路径
		String realPath=servletContext.getRealPath("/WEB-INF/web.xml");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet中的service方法");
		
	}
	public HelloServlet()
	{
		System.out.println("HelloServlet中的构造器");
	}

}
