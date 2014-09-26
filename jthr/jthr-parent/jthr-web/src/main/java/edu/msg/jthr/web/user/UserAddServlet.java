package edu.msg.jthr.web.user;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.service.UserService;

/**
 * Servlet implementation class UserAddServlet
 */
@WebServlet("/UserAddServlet")
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/userAdd.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			User newUser = new User();
			newUser.setFirstName(request.getParameter("firstname"));
			newUser.setLastName(request.getParameter("lastname"));
			newUser.setPhoneNumber(request.getParameter("phoneNumber"));
			newUser.setMobilePhoneNumber(request.getParameter("mobilePhoneNumber"));
			newUser.setEmail(request.getParameter("email"));
			newUser.setFunction(request.getParameter("function"));
			newUser.setDescription(request.getParameter("description"));
			newUser.setUsername(request.getParameter("username"));
			getServletContext().log("Username is: "+request.getParameter("username"));
			newUser.setPassword(request.getParameter("password"));
			
			service.addUser(newUser);
			
	}

}
