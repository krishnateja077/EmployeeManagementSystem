package com.db.employeemanagementsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.service.LoginService;
import com.db.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("passWord");
		System.out.println(userName);
		System.out.println(password);
		PrintWriter out = response.getWriter();
		//requestdispatcher's forward method OR
		//sendredirect method
		RequestDispatcher dispatcher = null;
		LoginService loginService = new LoginServiceImpl();
		LoginBean login = new LoginBean(userName, password);
		if(loginService.authenticate(login)) {
			dispatcher = request.getRequestDispatcher("adminHomePage.html");
			dispatcher.forward(request, response);
		}
		else {
			dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
			out.write("INCORRECT");
//			response.sendRedirect("login.html");
		}
	}

}
