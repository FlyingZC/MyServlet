package com.zc.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * (1)创建HttpServlet的子类
 * (2)重写Override父类中的doGet或doPost方法
 * 右击->source->Override/implements methods
 * (3)该类如何去响应客户端用户的请求
 *    3.1完成该类的注册(Tomcat容器知道这个类).由Servlet容器创建.在web.xml中进行配置注册
 *    3.2第一次请求该Servlet时实例化该Servlet(调构造方法)
 *    	<load-on-startup>0:不自动启动
 *    	
 * */
public class FirstServlet extends HttpServlet {

	/**
	 * 
	 */
	
	public FirstServlet()
	{
		System.out.println("--FirstServlet的构造方法--");
	}
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
		System.out.println("--doGet--");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//重定向.必须在提交之前doPost之前
		response.sendRedirect("index.jsp");
		super.doPost(request, response);
		System.out.println("--doPost--");
		
		//MIME输出的文档类型和Character Encoding
		response.setContentType("text/html;charset=utf-8");
		//输出流
		PrintWriter out=response.getWriter();
		out.println("<h1>welome to you</h1>");
		
		//输出缓冲流
		out.flush();
		
	}

}
