package edu.msg.jthr.web.position;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
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
 * Servlet implementation class EditPositionServlet
 */
@WebServlet("/EditPositionServlet")
public class EditPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private PositionService positionService;
	@EJB
	private DepartmentService departmentService;
	@EJB
	private ProjectService projectService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditPositionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().log("id to edit in get: " + request.getParameter("position_id"));
		request.getRequestDispatcher("/WEB-INF/jsp/editPosition.jsp").forward(request, response);
		response.sendRedirect("/WEB-INF/jsp/editPosition.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("position_id");
		getServletContext().log("id to edit (post method): " + id);

		if (request.getParameter("submit") == null) {
			List<Department> deps = departmentService.getAllDepartments();
			Map<Long, String> m = new HashMap<>();

			for (Department d : deps) {
				m.put(d.getId(), d.getDepartName());
			}
			request.setAttribute("depList", m);

			List<Project> projects = projectService.getAllProjects();
			Map<Long, String> m2 = new HashMap<>();

			for (Project p : projects) {
				m2.put(p.getId(), p.getProjectName());
			}
			request.setAttribute("projList", m2);

			
			Position p = positionService.getPositionById(Long.parseLong(id));
			request.setAttribute("selectedDep", p.getDepartment().getId());
			request.setAttribute("selectedProject", p.getProject().getId());
			request.setAttribute("positionId", p.getId());
			request.setAttribute("positionName", p.getName());
			request.setAttribute("positionNrOfPlaces", p.getNrOfPlaces());
			request.setAttribute("positionDepartment", p.getDepartment());
			request.setAttribute("positionProject", p.getProject());
			request.setAttribute("positionRequirements", p.getRequirements());
			request.setAttribute("positionResponsibilities", p.getResponsibilities());
			request.getRequestDispatcher("/WEB-INF/jsp/editPosition.jsp").forward(request, response);
			return;
		}
		Position p = positionService.getPositionById(Long.parseLong(id));
		p.setName(request.getParameter("positionName"));
		p.setNrOfPlaces(Integer.parseInt(request.getParameter("nrOfPersons")));
		p.setDepartment(departmentService.getDepartmentById(Long.parseLong(request.getParameter("department"))));
		p.setProject(projectService.getProjectById(Long.parseLong(request.getParameter("project"))));
		p.setRequirements(request.getParameter("requirements"));
		p.setResponsibilities(request.getParameter("responsibilities"));
		positionService.editPosition(p);

//		request.setAttribute("position_id", id);
		getServletConfig().getServletContext().getRequestDispatcher("/viewposition").forward(request, response);
	}

}
