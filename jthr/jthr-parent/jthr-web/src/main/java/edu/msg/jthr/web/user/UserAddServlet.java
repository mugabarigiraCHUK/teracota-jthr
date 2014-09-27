package edu.msg.jthr.web.user;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Role;
import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.service.RoleService;
import edu.msg.jthr.backend.service.UserService;

/**
 * Servlet implementation class UserAddServlet
 */
@WebServlet("/UserAddServlet")
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private UserService service;
	@EJB
	private RoleService roleService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserAddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<Role> deps = roleService.getAllRoles();
		Map<Long, String> m = new HashMap<>();

		for (Role d : deps) {
			m.put(d.getId(), d.getRoleName());
		}

		request.setAttribute("rolList", m);

		request.getRequestDispatcher("/WEB-INF/jsp/userAdd.jsp").forward(
				request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		User newUser = new User();
		newUser.setFirstName(request.getParameter("firstname"));
		newUser.setLastName(request.getParameter("lastname"));
		newUser.setPhoneNumber(request.getParameter("phoneNumber"));
		newUser.setMobilePhoneNumber(request.getParameter("mobilePhoneNumber"));
		newUser.setEmail(request.getParameter("email"));
		newUser.setFunction(request.getParameter("function"));
		newUser.setDescription(request.getParameter("description"));
		newUser.setUsername(request.getParameter("username"));
		newUser.setPassword(request.getParameter("password"));
		newUser.setUuid(newUser.getUuid());

		String str = request.getParameter("roleResult");
		String[] str2 = str.split(",");

		List<String> rolesSelected = Arrays.asList(str2);
		//request.getServletContext().log("Roles selected : " + rolesSelected);
		List<Role> roles = roleService.getAllRoles();
		//request.getServletContext().log("Roles in DB : " + roles);


		for (String s : rolesSelected) {
			for (Role r : roles) {
				if (s.equals(r.getRoleName())) {
				//	request.getServletContext().log(s + " == " + r.getRoleName());

					newUser.getRoles().add(roleService.getRoleById(r.getId()));
				}
			}
		}

		service.addUser(newUser);
		
		response.sendRedirect(request.getContextPath() + "/user");

	}

}
