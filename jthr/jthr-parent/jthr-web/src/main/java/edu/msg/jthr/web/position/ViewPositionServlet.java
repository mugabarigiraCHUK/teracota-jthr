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
 * Servlet implementation class ViewPositionServlet
 */
@WebServlet("/ViewPositionServlet")
public class ViewPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewPositionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("submitComment") != null) {
			return;
		} else if (request.getParameter("editComment") != null) {
			return;
		} else if (request.getParameter("updateComment") != null) {
			return;
		} else if (request.getParameter("deleteComment") != null) {
			return;
		} else {
			getServletContext().log("view position with id: " + request.getParameter("position_id"));
			String id = request.getParameter("position_id");

			// TODO - get position with id from request and put it in session
			Position p = new Position(Long.parseLong(id), "name" + Long.parseLong(id), "nrOfPlaces", "department", "project", "reqs", "resps");

			request.setAttribute("positionId", p.getId());
			request.setAttribute("positionName", p.getName());
			request.setAttribute("positionDepartment", p.getDepartment());
			request.setAttribute("positionNrOfPlaces", p.getNrOfPlaces());
			request.setAttribute("positionDepartment", p.getDepartment());
			request.setAttribute("positionProject", p.getProject());
			request.setAttribute("positionRequirements", p.getRequirements());
			request.setAttribute("positionResponsibilities", p.getResponsibilities());

			// TODO - redirect to editPosition.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/viewPosition.jsp").forward(request, response);
			return;
		}
	}

}
