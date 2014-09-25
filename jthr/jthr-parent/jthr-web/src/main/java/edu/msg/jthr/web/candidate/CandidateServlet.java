package edu.msg.jthr.web.candidate;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;

/**
 * Servlet implementation class CandidateServlet
 */
@WebServlet("/CandidateServlet")
public class CandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CandidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
		candidateList.add(new Candidate(Integer.valueOf(1), "candidate",
				"candidate", "candidate", "candidate", "candidate",
				"candidate", "candidate", new ArrayList<String>()));
		request.getSession().setAttribute("candidateList", candidateList);

		request.getRequestDispatcher("/WEB-INF/jsp/candidate.jsp").forward(
				request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		/*
		 * if (request.getParameter("editCandidate") != null) { int id =
		 * Integer.valueOf(request.getParameter("candidate_id"));
		 * context.log("editCandidate, id: " + id); // Invoke update
		 * getServletConfig().getServletContext()
		 * .getRequestDispatcher("/editcandidate") .forward(request, response);
		 * return; } else if (request.getParameter("clonePosition") != null) {
		 * String positionId = request.getParameter("position_id");
		 * context.log("clonePosition, id: " + positionId); // Invoke clone
		 * getServletConfig().getServletContext()
		 * .getRequestDispatcher("/cloneposition") .forward(request, response);
		 * return; } else if (request.getParameter("deletePosition") != null) {
		 * // Invoke delete String positionId =
		 * request.getParameter("position_id");
		 * context.log("deletePosition, id: " + positionId);
		 * 
		 * getServletConfig().getServletContext()
		 * .getRequestDispatcher("/deleteposition") .forward(request, response);
		 * return; } else
		 */if (request.getParameter("viewCandidate") != null) {
			String candidateId = request.getParameter("id");
			context.log("viewCandidate, id: " + candidateId);

			getServletConfig().getServletContext()
					.getRequestDispatcher("/viewcandidate")
					.forward(request, response);
			return;
		}
	}
}
