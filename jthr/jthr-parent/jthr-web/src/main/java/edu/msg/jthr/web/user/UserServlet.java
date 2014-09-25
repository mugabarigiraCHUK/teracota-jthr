package edu.msg.jthr.web.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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

		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("unu", "unu", "1", "1", "unu@unu.com", "BOSS", "mergeee"));
		userList.add(new User("doi", "doi", "2", "2", "doi@doi.com", "BOSS2", "mergeee"));
		userList.add(new User("trei", "trei", "3", "3", "trei@trei.com", "BOSS3", "mergeee"));
		userList.add(new User("ptru", "ptru", "4", "4", "ptru@ptru.com", "BOSS4", "mergeee"));
		userList.add(new User("cinci", "cinci", "5", "5", "cinci@cinci.com", "BOSS5", "mergeee"));
		request.getSession().setAttribute("list", userList);
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
