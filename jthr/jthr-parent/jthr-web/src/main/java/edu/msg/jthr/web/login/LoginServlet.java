package edu.msg.jthr.web.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Object loginObject = request.getSession().getAttribute("loggedIn");
		if (loginObject != null && loginObject.equals(false)) {
			response.getWriter().println("Username or passwrod incorrect");
		}

		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext( );
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		context.log("username: " + username + ", password: " + password);
		
		HttpSession s = request.getSession();
		if (username.equals(password)) {
			s.setAttribute("username", username);
			s.setAttribute("user_role", "Viewer");
			s.setAttribute("loggedIn", true);
			
			context.log("OK, redirect to home");
			
			//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/home.jsp"); // login failed
			//dispatcher.forward(request, response);
			response.sendRedirect(request.getContextPath() + "/home");
		} else {
			context.log("NEIN NEIN NEIN!!!! login failed");
			
			s.setAttribute("loggedIn", false);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp"); // login failed
			dispatcher.forward(request, response);
		}
	}
}
