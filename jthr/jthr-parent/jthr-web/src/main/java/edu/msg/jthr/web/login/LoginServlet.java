package edu.msg.jthr.web.login;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB private LoginService loginService;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = loginService.loginUser(username, password);
		HttpSession s = request.getSession();
		
		if (user != null){
			s.setAttribute("user_id", user.getId());
			s.setAttribute("username", user.getUsername());
			s.setAttribute("user_roles", user.getRoles());
			s.setAttribute("logged_in", true);
			response.sendRedirect(request.getContextPath() + "/home");
		} else {
			s.setAttribute("invalid_credentials", true);
			response.sendRedirect(request.getContextPath() + "/");
		}
	}
}
