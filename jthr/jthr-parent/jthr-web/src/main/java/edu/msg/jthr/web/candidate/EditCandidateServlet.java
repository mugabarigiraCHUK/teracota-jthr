package edu.msg.jthr.web.candidate;

import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.service.CandidateService;

/**
 * Servlet implementation class EditCandidateServlet
 */
@WebServlet("/EditCandidateServlet")
public class EditCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CandidateService service;

	public EditCandidateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/editCandidate.jsp").forward(
				request, response);
		response.sendRedirect("/WEB-INF/jsp/editCandidate.jsp");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("submit") == null) {
			Long id = Long.valueOf(request.getParameter("candidate_id"));
			Candidate candidate = service.getCandidateById(id);

			request.setAttribute("lastName", candidate.getLastName());
			request.setAttribute("firstName", candidate.getFirstName());
			request.setAttribute("telephone", candidate.getTelephone());
			request.setAttribute("mobTelephone", candidate.getTelephone());
			request.setAttribute("email", candidate.getEmail());
			request.setAttribute("address", candidate.getAddress());
			request.setAttribute("relocation", candidate.getRelocation());
			request.setAttribute("cv", candidate.getCV());
			request.setAttribute("interviews", candidate.getInterviews());
			request.setAttribute("comments", candidate.getComments());
			request.getRequestDispatcher("/WEB-INF/jsp/editCandidate.jsp")
					.forward(request, response);
			return;
		}

		Long id = Long.valueOf(request.getParameter("candidate_id"));
		Candidate candidate = service.getCandidateById(id);

		candidate.setLastName(request.getParameter("lastName"));
		candidate.setFirstName(request.getParameter("firstName"));
		candidate.setTelephone(request.getParameter("telephone"));
		candidate.setMobTelephone(request.getParameter("mobTelephone"));
		candidate.setEmail(request.getParameter("email"));
		candidate.setAddress(request.getParameter("address"));
		if (request.getParameter("relocation") == null)
			candidate.setRelocation(false);
		else
			candidate.setRelocation(true);
		candidate.setCV(request.getParameter("cv"));
		candidate.setInterviews(new ArrayList<Interview>());
		candidate.setComments(new ArrayList<Comment>());
		service.editCandidate(candidate);

		request.getRequestDispatcher("/WEB-INF/jsp/editCandidate.jsp").forward(
				request, response);
		return;
	}
}
