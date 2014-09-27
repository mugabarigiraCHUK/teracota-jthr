package edu.msg.jthr.web.candidate;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.service.CandidateService;

@WebServlet("/CandidateServlet")
public class CandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CandidateService service;

	public CandidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<Candidate> candidateList = service.getAllCandidates();
		for (Candidate c : candidateList) {
			request.getServletContext().log("candidatiu: " + c.toString());

		}
		request.getSession().setAttribute("candidateList", candidateList);

		request.getRequestDispatcher("/WEB-INF/jsp/candidate.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();

		if (request.getParameter("editCandidate") != null) {
			String id = request.getParameter("candidate_id");
			context.log("editCandidate, id: " + id);
			getServletConfig().getServletContext()
					.getRequestDispatcher("/editcandidate")
					.forward(request, response);
			return;
		} else if (request.getParameter("deleteCandidate") != null) {
			String id = request.getParameter("candidate_id");
			request.getParameter("candidate_id");
			context.log("deleteCandidate, id: " + id);

			getServletConfig().getServletContext()
					.getRequestDispatcher("/deletecandidate")
					.forward(request, response);
			return;
		} else if (request.getParameter("viewCandidate") != null) {
			String id = request.getParameter("candidate_id");
			context.log("viewCandidate, id: " + id);

			getServletConfig().getServletContext()
					.getRequestDispatcher("/viewcandidate")
					.forward(request, response);
			return;
		}
	}
}
