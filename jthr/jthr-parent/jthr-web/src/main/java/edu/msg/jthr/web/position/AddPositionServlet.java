package edu.msg.jthr.web.position;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCandidateServlet
 */
@WebServlet("/AddPositionServlet")
public class AddPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPositionServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		context = getServletContext();
		
		Map<Long, String> m = new HashMap<>();
		m.put(new Long(1), "Department first");
		m.put(new Long(2), "Department second");
		m.put(new Long(3), "Department third");
		m.put(new Long(4), "Department fourth");
		m.put(new Long(5), "Department fifth");
		request.setAttribute("depList", m);
		
		Map<Long, String> m2 = new HashMap<>();
		m2.put(new Long(1), "Project first");
		m2.put(new Long(2), "Project second");
		m2.put(new Long(3), "Project third");
		m2.put(new Long(4), "Project fourth");
		m2.put(new Long(5), "Project fifth");
		request.setAttribute("projList", m2);
		
		request.getRequestDispatcher("/WEB-INF/jsp/addPosition.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Position p = new Position();
		p.setName(request.getParameter("positionName"));
		p.setNrOfPlaces(request.getParameter("nrOfPersons"));
		// p.setNrOfPlaces(Integer.parseInt((String)
		// request.getAttribute("nrOfPersons")));
		p.setDepartment(request.getParameter("department"));
		p.setProject(request.getParameter("project"));
		p.setRequirements(request.getParameter("requirements"));
		p.setResponsibilities(request.getParameter("responsibilities"));

		context.log("add position: " + p.toString());

		// TODO - send position to repo

		response.sendRedirect(request.getContextPath() + "/position");
	}

}
