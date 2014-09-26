package edu.msg.jthr.web.candidate;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.service.CandidateService;

@WebServlet("/ViewCandidateServlet")
public class ViewCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CandidateService service;

	public ViewCandidateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("submitComment") != null) {
			return;
		} else if (request.getParameter("editComment") != null) {
			return;
		} else if (request.getParameter("updateComment") != null) {
			return;
		} else if (request.getParameter("deleteComment") != null) {
			return;
		} else {
			
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

			request.getRequestDispatcher("/WEB-INF/jsp/viewCandidate.jsp")
					.forward(request, response);
			return;
		}
	}
}
