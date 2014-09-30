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
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserService userService;
	@EJB
	private RoleService roleService;
   
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("submit") == null) {
			
			Long id = Long.valueOf(request.getParameter("user_id"));
			
			List<Role> deps = roleService.getAllRoles();
			Map<Long, String> m = new HashMap<>();

			for (Role d : deps) {
				m.put(d.getId(), d.getRoleName());
			}
			request.setAttribute("rolList2", m);
			
			User u = userService.getUserById(id);
			request.setAttribute("id", u.getId());
			request.setAttribute("userUFirstName", u.getFirstName());
			request.setAttribute("userULastName", u.getLastName());
			request.setAttribute("userUPhoneNr", u.getPhoneNumber());
			request.setAttribute("userUMobileNr", u.getMobilePhoneNumber());
			request.setAttribute("userUEmail", u.getEmail());
			request.setAttribute("userUJobPoz", u.getFunction());
			request.setAttribute("userUDescription", u.getDescription());
			request.setAttribute("userUUsername", u.getUsername());
//			request.setAttribute("userUPassword", u.getPassword());
			request.setAttribute("userURoles", u.getRoles());
			
			request.getRequestDispatcher("/WEB-INF/jsp/editUser.jsp").forward(request, response);
			
		} else {
			
			Long id = Long.valueOf(request.getParameter("user_id"));
			
			User newUser = userService.getUserById(id);
			getServletContext().log("Button !!! User : "+newUser.toString());
			
			newUser.getRoles().clear();
			getServletContext().log("User roles after clear :"+newUser.getRoles());
			
			newUser.setFirstName(request.getParameter("userFirstname"));
			newUser.setLastName(request.getParameter("userLastname"));
			newUser.setPhoneNumber(request.getParameter("userPhoneNumber"));
			newUser.setMobilePhoneNumber(request.getParameter("userMobilePhoneNumber"));
			newUser.setEmail(request.getParameter("userEmail"));
			newUser.setFunction(request.getParameter("function"));
			newUser.setDescription(request.getParameter("userDescription"));
			newUser.setUsername(request.getParameter("userUsername"));
			
			if (!request.getParameter("userPassword").equals("")){
				newUser.setPassword(request.getParameter("userPassword"));
			}			
			
			String str = request.getParameter("roleResult");
			String[] str2 = str.split(",");

			List<String> rolesSelected = Arrays.asList(str2);
			request.getServletContext().log("Roles selected : " + rolesSelected);
			List<Role> roles = roleService.getAllRoles();
			request.getServletContext().log("Roles in DB : " + roles);
			
			for (String s : rolesSelected) {
				for (Role r : roles) {
					if (s.equals(r.getRoleName())) {
						request.getServletContext().log(s + " == " + r.getRoleName());

						newUser.getRoles().add(roleService.getRoleById(r.getId()));
					}
				}
			}
			
			userService.editUser(newUser);
			
			response.sendRedirect(request.getContextPath() + "/user");
		}

	}

}
