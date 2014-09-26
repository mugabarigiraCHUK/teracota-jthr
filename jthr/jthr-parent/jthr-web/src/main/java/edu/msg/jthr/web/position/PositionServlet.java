package edu.msg.jthr.web.position;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.service.PositionService;

/**
 * Servlet implementation class PositionServlet
 */
@WebServlet("/PositionServlet")
public class PositionServlet extends HttpServlet {
	@EJB private PositionService positionService;
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PositionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("user_id", new Long(1)); // TODO - change this after testing
		
		List<Position> poz = positionService.getAllPositions();
		request.getSession().setAttribute("poz", poz);
		request.getRequestDispatcher("/WEB-INF/jsp/position.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		if (request.getParameter("editPosition") != null) {
			String positionId = request.getParameter("position_id");
			context.log("editPosition, id: " + positionId);
			// Invoke update
				getServletConfig().getServletContext().getRequestDispatcher("/editposition").forward(request, response);
			return;
		} else if (request.getParameter("clonePosition") != null) {
			String positionId = request.getParameter("position_id");
			context.log("clonePosition, id: " + positionId);
			// Invoke clone
			getServletConfig().getServletContext().getRequestDispatcher("/cloneposition").forward(request, response);
			return;
		} else if (request.getParameter("deletePosition") != null) {
			// Invoke delete
			String positionId = request.getParameter("position_id");
			context.log("deletePosition, id: " + positionId);

			getServletConfig().getServletContext().getRequestDispatcher("/deleteposition").forward(request, response);
			return;
		} else if (request.getParameter("viewPosition") != null){
			String positionId = request.getParameter("position_id");
			context.log("viewPosition, id: " + positionId);

			getServletConfig().getServletContext().getRequestDispatcher("/viewposition").forward(request, response);
			return;
		}
	}

}
