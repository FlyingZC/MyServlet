package com.zc.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestPrintServlet
 */
public class TestPrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestPrintServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter out=response.getWriter();
    	out.println("<html>");
    	out.println("<body>");
    	out.println("hehe");
    	out.println("</body>");
    	out.println("</html>");
    
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
