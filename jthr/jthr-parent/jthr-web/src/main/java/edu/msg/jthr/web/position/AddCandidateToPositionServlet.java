package edu.msg.jthr.web.position;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.service.CandidateService;
import edu.msg.jthr.backend.service.PositionService;

/**
 * Servlet implementation class AddCandidateToPositionServlet
 */
public class AddCandidateToPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB private CandidateService candidateService;
	@EJB private PositionService positionService;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCandidateToPositionServlet() {
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
		String positionId = request.getParameter("position_id");
		getServletContext().log("position id to add candidate to: " + positionId);
		
		if (request.getParameter("addCandidatePosition") != null){
			String candidateId = request.getParameter("candidate_id");
			getServletContext().log("candidate id to be added: " + candidateId);
			
			positionService.addCandidateToPosition(Long.parseLong(candidateId), Long.parseLong(positionId));
		}	

		List<Candidate> candidates = candidateService.getNonCandidates(positionService.getPositionById(Long.parseLong(positionId)));
		request.setAttribute("candidateList", candidates);
		request.setAttribute("position_id", positionId);
		
		request.getRequestDispatcher("/WEB-INF/jsp/addCandidateToPosition.jsp").forward(request, response);
	}

}
