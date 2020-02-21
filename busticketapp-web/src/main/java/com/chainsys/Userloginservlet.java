package com.chainsys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.busticketapp.dao.impl.LoginDAOImplementation;
import com.chainsys.busticketapp.model.UserRegistration;
import com.chainsys.busticketapp.util.ServiceLogin;
@WebServlet("/Userloginservlet")
public class Userloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServiceLogin com=new ServiceLogin();
		//LoginDAOImplementation com = new LoginDAOImplementation();
		String EmailId = request.getParameter("Email_id");
		//int userId=Integer.parseInt(UserName);
		//boolean result=false;
		//PrintWriter out=response.getWriter();
		String password = request.getParameter("password");
		//boolean result=false;
		
		System.out.println(EmailId);
		System.out.println(password);
		
		
		try {
			UserRegistration user = com.user(EmailId, password);
			if (user != null) {
				System.out.println("Login Success");
				HttpSession session=request.getSession();
				session.setAttribute("User",user);
				response.sendRedirect("homeuser.jsp");
			} else {
				response.sendRedirect("userlogin.jsp?errorMessage=Invalid login");
				//System.out.println("Login failed");
				//response.sendRedirect("userlogin.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
