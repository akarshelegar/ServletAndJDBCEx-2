package com.techpalle.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.RegistrationServices;
import com.techpalle.jdbc.RegistrationModel;


@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//read the data from browser through servlet
		String n=request.getParameter("tbName");
		String e=request.getParameter("tbEmail");
		String q=request.getParameter("tbQual");
		String p=request.getParameter("tbPwd");
		String s=request.getParameter("ddlState");
		
		RegistrationModel r = new RegistrationModel(n, e, q, p, s );
		
		int affectedrow = RegistrationServices.doRegister(r);
		
		if(affectedrow > 0)
		{
			//response.getWriter().append("<h1 style =\"color:red\">Data is inserted..</h1>");
			//response.sendRedirect("login.html");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else
		{
			//response.getWriter().append("<h1 style =\"color:green\">Data is not inserted..</h1>");
			response.getWriter().append("<h1>Registration failed... please go back and fill the details</h1>");
		}

	}

}
