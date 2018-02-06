package com.zc.javaweb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletContextServlet
 */
public class TestServletContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServletContextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext application=getServletConfig().getServletContext();
		String driver=application.getInitParameter("driver");
		Enumeration<String> contextParamNames=application.getInitParameterNames();
		while(contextParamNames.hasMoreElements())
		{
			String contextParamName=contextParamNames.nextElement();
			String contextParamValue=application.getInitParameter(contextParamName);
			System.out.println("web应用的初始化名为:"+contextParamName+" "+"初始化值为"+contextParamValue);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	}

}
