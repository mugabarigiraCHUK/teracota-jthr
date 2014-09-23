package edu.msg.jthr.web.position;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Position;

/**
 * Servlet implementation class EditPositionServlet
 */
@WebServlet("/EditPositionServlet")
public class EditPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPositionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().log("id to edit: " + request.getParameter("position_id"));
		request.getRequestDispatcher("/WEB-INF/jsp/editPosition.jsp").forward(request,response);
		response.sendRedirect("/WEB-INF/jsp/editPosition.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("submit") == null){
			Map<Long, String> m = new HashMap<>();
			m.put(new Long(1), "Department first");
			m.put(new Long(2), "Department second");
			m.put(new Long(3), "Department third");
			m.put(new Long(4), "Department fourth");
			m.put(new Long(5), "Department fifth");
			request.setAttribute("depList", m);
			request.setAttribute("selectedDep", new Long(4));
			
			Map<Long, String> m2 = new HashMap<>();
			m2.put(new Long(1), "Project first");
			m2.put(new Long(2), "Project second");
			m2.put(new Long(3), "Project third");
			m2.put(new Long(4), "Project fourth");
			m2.put(new Long(5), "Project fifth");
			request.setAttribute("projList", m2);
			request.setAttribute("selectedProject", new Long(2));
			
			String id = request.getParameter("position_id");
			getServletContext().log("id to edit (post method): " + id);
			
			//TODO - get position with id from request and put it in session
			Position p = new Position(Long.parseLong(id), "name" + Long.parseLong(id), "nrOfPlaces", "pozitie", "pozitie", "unu@unu.com", "poz");
			request.getSession().setAttribute("positionId", p.getId());
			request.getSession().setAttribute("positionName", p.getName());
			request.getSession().setAttribute("positionNrOfPlaces", p.getNrOfPlaces());
			request.getSession().setAttribute("positionDepartment", p.getDepartment());
			request.getSession().setAttribute("positionProject", p.getProject());
			request.getSession().setAttribute("positionRequirements", p.getRequirements());
			request.getSession().setAttribute("positionResponsibilities", p.getResponsibilities());
			
			//TODO - redirect to editPosition.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/editPosition.jsp").forward(request,response);
			return;
		}
		
		String id = request.getParameter("position_id");
		getServletContext().log("update position with id: " + id);
	}

}