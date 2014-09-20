package edu.msg.jthr.web.position;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PositionServlet
 */
@WebServlet("/PositionServlet")
public class PositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PositionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/position.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		if (request.getParameter("addPosition") != null) {
			request.getRequestDispatcher("/WEB-INF/jsp/addPosition.jsp").forward(request,response);
		} else if (request.getParameter("editPosition") != null) {
			String positionId = (String) request.getSession().getAttribute("position_id");
			context.log("editPosition, id: " + positionId);
		    // Invoke update
		} else if (request.getParameter("clonePosition") != null) {
			String positionId = (String) request.getSession().getAttribute("position_id");
			context.log("clonePosition, id: " + positionId);
		    // Invoke clone
		}else if (request.getParameter("deletePosition") != null) {
		    // Invoke delete
			String positionId = (String) request.getSession().getAttribute("position_id");
			context.log("deletePosition, id: " + positionId);
		}
	}

}
