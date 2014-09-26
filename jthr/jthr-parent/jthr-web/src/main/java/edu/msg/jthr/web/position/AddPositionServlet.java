package edu.msg.jthr.web.position;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Department;
import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.model.Project;
import edu.msg.jthr.backend.service.DepartmentService;
import edu.msg.jthr.backend.service.PositionService;
import edu.msg.jthr.backend.service.ProjectService;


/**
 * Servlet implementation class AddCandidateServlet
 */
@WebServlet("/AddPositionServlet")
public class AddPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	@EJB PositionService positionService;
	@EJB DepartmentService departmentService;
	@EJB ProjectService projectService;

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
		
		List<Department> deps = departmentService.getAllDepartments();
		Map<Long, String> m = new HashMap<>();
		
		for (Department d: deps){
			m.put(d.getId(), d.getDepartName());
		}
		request.setAttribute("depList", m);
		
		List<Project> projects = projectService.getAllProjects();
		Map<Long, String> m2 = new HashMap<>();
		
		for (Project p: projects){
			m2.put(p.getId(), p.getProjectName());
		}
		request.setAttribute("projList", m2);
		
		request.getRequestDispatcher("/WEB-INF/jsp/addPosition.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		context = getServletContext();
		
		Position p = new Position();
		p.setName(request.getParameter("positionName"));
		p.setNrOfPlaces(Integer.parseInt(request.getParameter("nrOfPersons")));
		// p.setNrOfPlaces(Integer.parseInt((String)
		// request.getAttribute("nrOfPersons")));
		p.setDepartment(new Department("test"));
		p.setProject(new Project());
		p.setRequirements(request.getParameter("requirements"));
		p.setResponsibilities(request.getParameter("responsibilities"));

		context.log("add position: " + p.toString());

		positionService.addPosition(p);
		// TODO - send position to repo

		response.sendRedirect(request.getContextPath() + "/position");
	}

}
