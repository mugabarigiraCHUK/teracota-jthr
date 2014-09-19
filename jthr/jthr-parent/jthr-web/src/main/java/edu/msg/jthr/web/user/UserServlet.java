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

		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("unu", "unu", "1", "1", "unu@unu.com", "BOSS", "mergeee"));
		list.add(new User("doi", "doi", "2", "2", "doi@doi.com", "BOSS2", "mergeee"));
		list.add(new User("trei", "trei", "3", "3", "trei@trei.com", "BOSS3", "mergeee"));
		list.add(new User("ptru", "ptru", "4", "4", "ptru@ptru.com", "BOSS4", "mergeee"));
		list.add(new User("cinci", "cinci", "5", "5", "cinci@cinci.com", "BOSS5", "mergeee"));
		request.getSession().setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/jsp/user.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
