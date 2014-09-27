package edu.msg.jthr.web.user;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserService userService;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> list = userService.getAllUsers();
		
		
		request.getSession().setAttribute("list", list);
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context = getServletContext();

		if(request.getParameter("editUser") != null) {
			String userId = request.getParameter("user_id");
			context.log("updateUser , id: "+ userId);

			getServletConfig().getServletContext().getRequestDispatcher("/updateuser").forward(request, response);
			return;
		} else if(request.getParameter("viewUser") != null) {
			String userId = request.getParameter("user_id");
			context.log("viewUser , id: "+ userId);

			getServletConfig().getServletContext().getRequestDispatcher("/viewuser").forward(request, response);
			return;
		} else if(request.getParameter("deleteUser") != null) {
			String userId = request.getParameter("user_id");
			context.log("deleteUser , id: "+ userId);
			
			userService.deleteUser(userService.getUserById(Long.parseLong(userId)));

			response.sendRedirect(request.getContextPath()+ "/user");
			return;

	}
	}

}
