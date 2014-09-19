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
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		HttpSession s = request.getSession();
		if (username.equals(password)) {
			s.setAttribute("username", username);
			s.setAttribute("user_role", "Viewer");
			s.setAttribute("loggedIn", true);
			response.sendRedirect(request.getContextPath() + "/home");
		} else {

			s.setAttribute("loggedIn", false);
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

			dispatcher.forward(request, response);
		}
	}
}
