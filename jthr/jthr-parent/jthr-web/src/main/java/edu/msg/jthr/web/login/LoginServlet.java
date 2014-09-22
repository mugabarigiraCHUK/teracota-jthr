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

//		Object loginObject = request.getSession().getAttribute("loggedIn");
//		if (loginObject != null && loginObject.equals(false)) {
//			response.getWriter().println("Username or passwrod incorrect");
//		}

		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		HttpSession s = request.getSession();
		if (username.equals(password)) {
			s.setAttribute("username", username); // TODO - put in session user's first and last name
			s.setAttribute("user_role", "Viewer"); // TODO - put in session all user's roles!!!
			s.setAttribute("logged_in", true);
			response.sendRedirect(request.getContextPath() + "/home");
		} else {
			s.setAttribute("invalid_credentials", true);
			//request.setAttribute("invalid_credentials", true);
			response.sendRedirect(request.getContextPath() + "/");
		}
	}
}
