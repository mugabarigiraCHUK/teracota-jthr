package edu.msg.jthr.web.position;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.service.PositionService;

/**
 * Servlet implementation class DeletePositionServlet
 */
@WebServlet("/DeletePositionServlet")
public class DeletePositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB private PositionService positionService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePositionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("position_id");
		
		positionService.deletePosition(positionService.getPositionById(Long.parseLong(id)));
		
		response.sendRedirect(request.getContextPath() + "/position");
	}

}
