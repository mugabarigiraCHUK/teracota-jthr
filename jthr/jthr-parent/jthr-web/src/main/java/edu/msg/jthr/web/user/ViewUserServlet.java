package edu.msg.jthr.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.User;

/**
 * Servlet implementation class UserServletView
 */
@WebServlet("/ViewUserServlet")
public class ViewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUserServlet() {
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

		getServletContext().log("View user with id: " + request.getParameter("user_id"));
		String id = request.getParameter("user_id");

		// TODO - get position with id from request and put it in session
		User u = new User(Long.parseLong(id), "firstName", "lastName", "phoneNumber", "mobilePhoneNumber", "email", "jobPozition", "description", "username", "password");
		u.addRole("MERE !!!");
		
		request.setAttribute("userVFirstName", u.getFirstName());
		request.setAttribute("userVLastName", u.getLastName());
		request.setAttribute("userVPhoneNr", u.getPhoneNumber());
		request.setAttribute("userVMobileNr", u.getMobilePhoneNumber());
		request.setAttribute("userVEmail", u.getEmail());
		request.setAttribute("userVJobPoz", u.getJobPozition());
		request.setAttribute("userVDescription", u.getDescription());
		request.setAttribute("userVUsername", u.getUsername());
		request.setAttribute("userVPassword", u.getPassword());
		request.setAttribute("userVRoles", u.getRoles());

		// TODO - redirect to editPosition.jsp
		request.getRequestDispatcher("/WEB-INF/jsp/viewUser.jsp").forward(request, response);
		
	}

}
