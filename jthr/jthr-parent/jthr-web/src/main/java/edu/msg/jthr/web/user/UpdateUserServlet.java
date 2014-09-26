package edu.msg.jthr.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Role;
import edu.msg.jthr.backend.model.User;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
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

		getServletContext().log("Update user with id: " + request.getParameter("user_id"));
		String id = request.getParameter("user_id");

		// TODO - get position with id from request and put it in session
		User u = new User(Long.parseLong(id), "firstName", "lastName", "phoneNumber", "mobilePhoneNumber", "email", "jobPozition", "description", "username", "password");
		//u.addRole(new Role("MERE_!!!"));
		
		request.setAttribute("userUFirstName", u.getFirstName());
		request.setAttribute("userULastName", u.getLastName());
		request.setAttribute("userUPhoneNr", u.getPhoneNumber());
		request.setAttribute("userUMobileNr", u.getMobilePhoneNumber());
		request.setAttribute("userUEmail", u.getEmail());
		request.setAttribute("userUJobPoz", u.getFunction());
		request.setAttribute("userUDescription", u.getDescription());
		request.setAttribute("userUUsername", u.getUsername());
		request.setAttribute("userUPassword", u.getPassword());
		request.setAttribute("userURoles", u.getRoles());

		// TODO - redirect to editPosition.jsp
		request.getRequestDispatcher("/WEB-INF/jsp/editUser.jsp").forward(request, response);

	}

}
