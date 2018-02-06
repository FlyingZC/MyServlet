package com.zc.javaweb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestInitParamServlet
 */
public class TestInitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestInitParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=this.getInitParameter("my_name");
		String name2=getServletConfig().getInitParameter("my_name");
		System.out.println("由初始化名字获取初始化值"+name+" "+name2);
		
		Enumeration<String> initShu=getServletConfig().getInitParameterNames();
		while(initShu.hasMoreElements())
		{
			String getName=initShu.nextElement();
			String getValue=getInitParameter(getName);
			System.out.println("初始化参数名："+getName+" "+"初始化参数值"+getValue);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
